package examples.page.objects;

import examples.driver.manager.DriverManager;
import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {

    public WebDriver root = DriverManager.getWebDriver();

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    public BasePO() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    protected Logger log() {
        return logger;
    }

    private WebElement result;

    public void navigateBack(){
        root.navigate().back();
        log().info("Go to the previous page");
    }

    @Step("Get result text")
    public String getResultText(){
        WaitForElement.waitUntilElementIsVisible(result);
        return result.getText();
    }

}