package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPO extends BasePO{

    @FindBy(xpath = "//div/h5[contains(text(),'Element')]")
    private WebElement elements;

    @FindBy(xpath = "//div/h5[contains(text(),'Forms')]")
    private WebElement forms;

    @FindBy(xpath = "//div/h5[contains(text(),'Alerts, Frame & Windows')]")
    private WebElement alertsFrameAndWindows;

    @FindBy(xpath = "//div/h5[contains(text(),'Widgets')]")
    private WebElement widgets;

    @FindBy(xpath = "//div/h5[contains(text(),'Interactions')]")
    private WebElement interactions;

    @Step("Click on Enter Store link")
    public void clickOnElementsButton() {
        WaitForElement.waitUntilElementIsClickable(elements);
        elements.click();
        log().info("Clicked on Element link");
    }

    @Step("Click on Enter Store link")
    public void clickOnFormsButton() {
        forms.click();
        log().info("Clicked on Forms link");
    }

    @Step("Click on Enter Store link")
    public void clickOnAlertsButton() {
        alertsFrameAndWindows.click();
        log().info("Clicked on Alerts Frames And Windows link");
    }

    @Step("Click on Enter Store link")
    public void clickOnWidgetsButton() {
        widgets.click();
        log().info("Clicked on Widgets link");
    }

    @Step("Click on Enter Store link")
    public void clickOnInteractionsButton() {
        interactions.click();
        log().info("Clicked on Interactions link");
    }


}
