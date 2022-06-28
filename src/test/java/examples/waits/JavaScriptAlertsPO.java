package examples.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPO {
    private WebDriver driver;

    By jSAlert = By.xpath("//ul/li/button[@onclick=\"jsAlert()\"]");

    By jSConfirm = By.xpath("//ul/li/button[@onclick=\"jsConfirm()\"]");

    By jSPrompt = By.xpath("//ul/li/button[@onclick=\"jsPrompt()\"]");

    public JavaScriptAlertsPO(WebDriver driver) {
        this.driver = driver;
    }

    public JavaScriptAlertsPO clickForJSConfirm() {
        driver.findElement(jSAlert).click();
        return this;
    }

    public JavaScriptAlertsPO clickForJSAlert() {
        driver.findElement(jSConfirm).click();
        return this;
    }

    public JavaScriptAlertsPO clickForJSPrompt() {
        driver.findElement(jSPrompt).click();
        return this;
    }

    public JavaScriptAlertsPO acceptJSAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    public JavaScriptAlertsPO confirmJSAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    public JavaScriptAlertsPO confirmJSPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        return acceptJSAlert();
    }

}
