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
    public ElementsPO clickOnElementsButton() {
        WaitForElement.waitUntilElementIsClickable(elements);
        elements.click();
        log().info("Clicked on Element link");
        return new ElementsPO();
    }

    @Step("Click on Enter Store link")
    public ElementsPO clickOnFormsButton() {
        forms.click();
        log().info("Clicked on Forms link");
        return new ElementsPO();
    }

    @Step("Click on Enter Store link")
    public ElementsPO clickOnAlertsButton() {
        alertsFrameAndWindows.click();
        log().info("Clicked on Alerts Frames And Windows link");
        return new ElementsPO();
    }

    @Step("Click on Enter Store link")
    public ElementsPO clickOnWidgetsButton() {
        widgets.click();
        log().info("Clicked on Widgets link");
        return new ElementsPO();
    }

    @Step("Click on Enter Store link")
    public ElementsPO clickOnInteractionsButton() {
        interactions.click();
        log().info("Clicked on Interactions link");
        return new ElementsPO();
    }


}
