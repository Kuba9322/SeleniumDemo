package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPO extends BasePO{

    @FindBy(id = "yesRadio")
    private WebElement yesRadio;

    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadio;

    @FindBy(id = "noRadio")
    private WebElement noRadio;

    @FindBy(className = "mt-3")
    private WebElement result;

    JavascriptExecutor JSExecutor = (JavascriptExecutor) root;

    @Step("Click on Yes Radio Button")
    public RadioButtonPO clickOnYesRadioButton() {
        selectRadioButton(yesRadio);
        log().info("Clicked on Yes Radio Button");
        return new RadioButtonPO();
    }

    @Step("Click on Impressive Radio Button")
    public RadioButtonPO clickOnImpressiveRadioButton() {
        selectRadioButton(impressiveRadio);
        log().info("Clicked on Impressive Radio Button");
        return new RadioButtonPO();
    }

    private void selectRadioButton(WebElement radioButton) {
        WaitForElement.waitUntilElementIsDisplayed(radioButton);
        JSExecutor.executeScript("arguments[0].click();", radioButton);
    }

}
