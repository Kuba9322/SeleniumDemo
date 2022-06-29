package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxFieldContainerPO extends BasePO {

    @FindBy(id = "userName")
    WebElement fullNameInput;

    @FindBy(id = "userEmail")
    WebElement emailInput;

    @FindBy(id = "currentAddress")
    WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddressInput;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(id = "output")
    WebElement output;

    @Step("Fill Full Name input")
    public TextBoxFieldContainerPO fillFullNameInput(String fullName){
        WaitForElement.waitUntilElementIsVisible(fullNameInput);
        fullNameInput.sendKeys(fullName);
        log().info("Send keys to Full Element input");
        return this;
    }

    @Step("Fill User Email input")
    public TextBoxFieldContainerPO fillUserEmailInput(String email){
        WaitForElement.waitUntilElementIsVisible(emailInput);
        emailInput.sendKeys(email);
        log().info("Send keys to User Email input");
        return this;
    }

    @Step("Fill Current Address input")
    public TextBoxFieldContainerPO fillCurrentAddressInputInput(String currentAddress){
        WaitForElement.waitUntilElementIsVisible(currentAddressInput);
        currentAddressInput.sendKeys(currentAddress);
        log().info("Send keys to Current AddressInput input");
        return this;
    }

    @Step("Fill  Permanent Address input")
    public TextBoxFieldContainerPO fillPermanentAddressInput(String permanentAddress){
        WaitForElement.waitUntilElementIsVisible(permanentAddressInput);
        permanentAddressInput.sendKeys(permanentAddress);
        log().info("Send keys to Full Element input");
        return this;
    }

    @Step("Click submit button")
    public TextBoxFieldContainerPO clickSubmitButton() {
        WaitForElement.waitUntilElementIsClickable(submitButton);
        submitButton.click();
        log().info("Submit button clicked");
        return this;
    }

    @Step("Get output text")
    public String getOutputText(){
        WaitForElement.waitUntilElementIsClickable(output);
        return output.getText();
    }
}
