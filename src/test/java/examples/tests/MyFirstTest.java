package examples.tests;

import examples.page.objects.MainPO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class MyFirstTest extends TestBase {

    @Test
    public void test() {
        MainPO mainPage = new MainPO();
        mainPage.clickOnElementsButton();
        mainPage.navigateBack();
        mainPage.clickOnAlertsButton();
        mainPage.navigateBack();
        mainPage.clickOnWidgetsButton();
        mainPage.navigateBack();
        mainPage.clickOnFormsButton();
    }

}

