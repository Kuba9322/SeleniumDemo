package examples.tests;

import com.github.javafaker.Faker;
import examples.configuration.ConfigurationProperties;
import examples.configuration.PropertiesLoader;
import examples.driver.BrowserType;
import examples.driver.manager.DriverManager;
import examples.driver.manager.DriverUtils;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

import java.util.Properties;

import static examples.navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    private Faker dataProvider = new Faker();

    @Step("Loading configuration from configuration.properties")
    @BeforeClass
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
    }

    @Step("Setting up browser to: {browserType} and navigating to Home Page")
    @Parameters("browser")
    @BeforeMethod
    public void beforeTest(@Optional BrowserType browserType) {
        DriverManager.setWebDriver(browserType);
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @Step("Disposing browser")
    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

    protected Logger log() {
        return logger;
    }

    protected Faker getDataProvider() {
        return dataProvider;
    }

}
