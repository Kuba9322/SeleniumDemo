package examples.tests.smokes;

import examples.page.objects.MainPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("Check moving from main pages")
    public void mainPageSmokeTest() {

        MainPO mainPage = new MainPO();
        mainPage.clickOnElementsButton().navigateBack();
        mainPage.clickOnAlertsButton().navigateBack();
        mainPage.clickOnWidgetsButton().navigateBack();
        mainPage.clickOnFormsButton();

        log().info("Basic navigation on main page works correctly - test passed");
    }
}

