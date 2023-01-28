package examples.tests.functional.elements;

import examples.page.objects.MainPO;
import examples.page.objects.TextBoxFieldContainerPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasToString;

public class TestBoxTest extends TestBase {

    private String fullName;

    private String email;

    private String currentAddress;

    private String permanentAddress;

    @BeforeClass
    private void initData() {
        fullName = getDataProvider().name().fullName();
        email = getDataProvider().internet().emailAddress();
        currentAddress = getDataProvider().address().fullAddress();
        permanentAddress = getDataProvider().address().fullAddress();
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Text box test")
    public void textBoxFunctionalTest() {

        MainPO mainPO = new MainPO();
        TextBoxFieldContainerPO testBoxPage = mainPO.clickOnElementsButton()
                .clickOnTextBoxTab()
                .fillFullNameInput(fullName)
                .fillUserEmailInput(email)
                .fillCurrentAddressInputInput(currentAddress)
                .fillPermanentAddressInput(permanentAddress);

        String outputText = testBoxPage.clickSubmitButton()
                .getOutputText();

        List<String> hamcrestMatchers = Arrays.asList(
                "collections", "beans", "text", "number");
        assertThat(hamcrestMatchers,
                contains("collections", "beans", "text", "number"));


        assertThat(outputText, hasToString("Name:" + fullName +
                "\nEmail:" + email +
                "\nCurrent Address :" + currentAddress +
                "\nPermananet Address :" + permanentAddress));

    }

}
