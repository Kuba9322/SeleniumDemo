package examples.tests;

import examples.configuration.ConfigurationProperties;
import examples.configuration.PropertiesLoader;
import examples.driver.BrowserType;
import examples.driver.manager.DriverManager;
import examples.driver.manager.DriverUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Properties;

import static examples.navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

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

}
