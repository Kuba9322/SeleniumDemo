package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonPO extends BasePO {

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickButton;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement clickMeButton;

    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    private WebElement clickMeMessage;

    @Step("Click on Double Click Button")
    public ButtonPO clickOnDoubleClickButton() {
        WaitForElement.waitUntilElementIsDisplayed(doubleClickButton);
        new Actions(root).doubleClick(doubleClickButton).perform();
        log().info("Clicked on Double Click Button");
        return new ButtonPO();
    }

    @Step("Click on Right Click Button")
    public ButtonPO clickOnRightClickButton() {
        WaitForElement.waitUntilElementIsDisplayed(rightClickButton);
        new Actions(root).contextClick(rightClickButton).perform();
        log().info("Clicked on Right Click Button");
        return new ButtonPO();
    }

    @Step("Click on Click Me Button")
    public ButtonPO clickOnClickMeButton() {
        WaitForElement.waitUntilElementIsDisplayed(clickMeButton);
        clickMeButton.click();
        log().info("Clicked on Click Me Button");
        return new ButtonPO();
    }

    public boolean isDoubleClickMessageDisplayed() {
        try {
            WaitForElement.waitUntilElementIsVisible(doubleClickMessage);
        }catch (TimeoutException e){
            return false;
        }
        return doubleClickMessage.isDisplayed();
    }

    public boolean isRightClickMessageDisplayed() {
        try {
            WaitForElement.waitUntilElementIsVisible(rightClickMessage);
        }catch (TimeoutException e){
            return false;
        }
        return rightClickMessage.isDisplayed();
    }

    public boolean isClickMeMessageDisplayed() {
        try {
            WaitForElement.waitUntilElementIsVisible(clickMeMessage);
        }catch (TimeoutException e){
            return false;
        }
        return clickMeMessage.isDisplayed();
    }

    public String getDoubleClickMessageText() {
        WaitForElement.waitUntilElementIsVisible(doubleClickMessage);
        return doubleClickMessage.getText();
    }

    public String getRightClickMessageText() {
        WaitForElement.waitUntilElementIsVisible(rightClickMessage);
        return rightClickMessage.getText();
    }

    public String getClickMeMessageText() {
        WaitForElement.waitUntilElementIsVisible(clickMeMessage);
        return clickMeMessage.getText();
    }





}
