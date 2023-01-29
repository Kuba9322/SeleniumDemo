package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPO extends BasePO {

    private static final String TOGGLE_CLASS_NAME = "rct-collapse";

    @FindBy(className = "rct-icon")
    private WebElement firstToggleClosed;

    @FindBy(xpath = "//*[@id=\"tree-node-home\"]/..")
    private WebElement checkBoxHome;

    @FindBy(xpath = "//*[@id=\"tree-node-react\"]/..")
    private WebElement checkBoxReact;

    @FindBy(xpath = "//*[@id=\"tree-node-home\"]/../..")
    private WebElement checkBoxHomeRow;

    @FindBy(xpath = "//*[@id=\"tree-node-documents\"]/../..")
    private WebElement checkBoxDocumentsRow;

    @FindBy(xpath = "//*[@id=\"tree-node-workspace\"]/../..")
    private WebElement checkBoxWorkSpaceRow;

    @FindBy(id = "result")
    WebElement result;

    @Step("Click on Check Box Home")
    public CheckBoxPO clickOnCheckBoxHome() {
        WaitForElement.waitUntilElementIsClickable(checkBoxHome);
        checkBoxHome.click();
        log().info("Clicked on CheckBox Home");
        return new CheckBoxPO();
    }

    @Step("Click on Check Box React")
    public CheckBoxPO clickOnCheckBoxReact() {
        WaitForElement.waitUntilElementIsClickable(checkBoxReact);
        checkBoxReact.click();
        log().info("Clicked on CheckBox React");
        return new CheckBoxPO();
    }

    @Step("Click on Home toggle")
    public CheckBoxPO expandHomeToggle() {
        expandToggle(checkBoxHomeRow);
        log().info("Clicked on Home toggle");
        return new CheckBoxPO();
    }

    @Step("Click on Documents toggle")
    public CheckBoxPO expandDocumentsToggle() {
        expandToggle(checkBoxDocumentsRow);
        log().info("Clicked on Documents toggle");
        return new CheckBoxPO();
    }

    @Step("Click on WorkSpace toggle")
    public CheckBoxPO expandDWorkSpaceToggle() {
        expandToggle(checkBoxWorkSpaceRow);
        log().info("Clicked on WorkSpace toggle");
        return new CheckBoxPO();
    }

    private void expandToggle(WebElement row) {
        WebElement toggle = row.findElement(By.className(TOGGLE_CLASS_NAME));
        WaitForElement.waitUntilElementIsClickable(toggle);
        toggle.click();
    }
}
