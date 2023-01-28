package examples.page.objects;

import examples.driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
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

    public void navigateBack(){
        root.navigate().back();
        log().info("Go to the previous page");
    }

}