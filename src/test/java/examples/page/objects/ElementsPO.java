package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPO extends BasePO {

    @FindBy(xpath = "//li/span[contains(text(),'Text Box')]")
    private WebElement textBoxButton;

    @FindBy(xpath = "//li/span[contains(text(),'Check Box')]")
    private WebElement checkBoxButton;

    @FindBy(xpath = "//li/span[contains(text(),'Radio Button')]")
    private WebElement radioButton;

    @FindBy(xpath = "//li/span[contains(text(),'Web Tables')]")
    private WebElement webTablesButton;

    @FindBy(xpath = "//li/span[contains(text(),'Buttons')]")
    private WebElement buttons;

    @FindBy(xpath = "//li/span[contains(text(),'Links')]")
    private WebElement linksButton;

    @FindBy(xpath = "//li/span[contains(text(),'Broken Links - Images')]")
    private WebElement brokenLinksImages;

    @FindBy(xpath = "//li/span[contains(text(),'Upload and Download')]")
    private WebElement uploadAndDownload;

    @FindBy(xpath = "//li/span[contains(text(),'Dynamic Properties')]")
    private WebElement dynamicProperties;

    @Step("Click on Text Box tab")
    public TextBoxFieldContainerPO clickOnTextBoxTab() {
        WaitForElement.waitUntilElementIsClickable(textBoxButton);
        textBoxButton.click();
        log().info("Clicked on Text Box Tab");
        return new TextBoxFieldContainerPO();
    }

    @Step("Click on Check Box tab")
    public CheckBoxPO clickOnCheckBoxTab() {
        WaitForElement.waitUntilElementIsClickable(checkBoxButton);
        checkBoxButton.click();
        log().info("Clicked on Check Box Tab");
        return new CheckBoxPO();
    }

    @Step("Click on Radio Button tab")
    public RadioButtonPO clickOnRadioButtonTab() {
        WaitForElement.waitUntilElementIsClickable(radioButton);
        radioButton.click();
        log().info("Clicked on Radio Button Tab");
        return new RadioButtonPO();
    }

    @Step("Click on Web Tables tab")
    public WebTablesPO clickOnWebTablesTab() {
        WaitForElement.waitUntilElementIsClickable(webTablesButton);
        webTablesButton.click();
        log().info("Clicked on Web Tables Tab");
        return new WebTablesPO();
    }

    @Step("Click on Button tab")
    public ButtonPO clickOnButtonTab() {
        WaitForElement.waitUntilElementIsClickable(buttons);
        buttons.click();
        log().info("Clicked on Button Tab");
        return new ButtonPO();
    }

}
