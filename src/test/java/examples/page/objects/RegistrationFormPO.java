package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationFormPO extends BasePO{

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement userEmailInput;

    @FindBy(id = "age")
    private WebElement ageInput;

    @FindBy(id = "salary")
    private WebElement salaryInput;

    @FindBy(id = "department")
    private WebElement departmentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @Step("Fill First Name input")
    public RegistrationFormPO fillFirstNameInput(String firstName) {
        WaitForElement.waitUntilElementIsVisible(firstNameInput);
        firstNameInput.sendKeys(firstName);
        log().info("Input First Name is filled");
        return new RegistrationFormPO();
    }

    @Step("Fill Last Name input")
    public RegistrationFormPO fillLastNameInput(String lastName) {
        WaitForElement.waitUntilElementIsVisible(lastNameInput);
        lastNameInput.sendKeys(lastName);
        log().info("Input Last Name is filled");
        return new RegistrationFormPO();
    }

    @Step("Fill Email input")
    public RegistrationFormPO fillEmailInput(String email) {
        WaitForElement.waitUntilElementIsVisible(userEmailInput);
        userEmailInput.sendKeys(email);
        log().info("Input First Name is filled");
        return new RegistrationFormPO();
    }

    @Step("Fill Age input")
    public RegistrationFormPO fillAgeInput(String age) {
        WaitForElement.waitUntilElementIsVisible(ageInput);
        ageInput.sendKeys(age);
        log().info("Input Age is filled");
        return new RegistrationFormPO();
    }

    @Step("Fill Salary input")
    public RegistrationFormPO fillESalaryInput(String salary) {
        WaitForElement.waitUntilElementIsVisible(salaryInput);
        salaryInput.sendKeys(salary);
        log().info("Input First Name is filled");
        return new RegistrationFormPO();
    }

    @Step("Fill Department input")
    public RegistrationFormPO fillEDepartmentInput(String department) {
        WaitForElement.waitUntilElementIsVisible(departmentInput);
        departmentInput.sendKeys(department);
        log().info("Input Department is filled");
        return new RegistrationFormPO();
    }

    @Step("Click on Submit Button tab")
    public WebTablesPO clickSubmitButton(){
        WaitForElement.waitUntilElementIsClickable(submitButton);
        submitButton.click();
        log().info("Clicked on Submit Button");
        return new WebTablesPO();
    }



}
