package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPO extends BasePO{

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

    @Step("Click on Text Box button")
    public TextBoxFieldContainerPO clickOnTextBoxButton(){
        WaitForElement.waitUntilElementIsClickable(textBoxButton);
        textBoxButton.click();
        log().info("Clicked on TextBoxButton");
        return new TextBoxFieldContainerPO();
    }

}
