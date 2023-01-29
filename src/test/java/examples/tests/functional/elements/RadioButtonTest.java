package examples.tests.functional.elements;

import examples.page.objects.MainPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

public class RadioButtonTest extends TestBase {

    private static final String EXPECTED_START_OF_THE_MESSAGE = "You have selected :";

    private static final String EXPECTED_INFO_FOR_CHECKED_YES_RADIO = "Yes";

    private static final String EXPECTED_INFO_FOR_CHECKED_IMPRESSIVE_RADIO = "Yes";

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Check answer \"Yes\"")
    public void infoThatTheAnswerWasYesShouldAppear() {
        MainPO mainPO = new MainPO();
        String resultTextInformation = mainPO.clickOnElementsButton()
                .clickOnRadioButtonTab()
                .clickOnYesRadioButton()
                .getResultText();

        assertThat(resultTextInformation, hasToString(EXPECTED_START_OF_THE_MESSAGE +
                EXPECTED_INFO_FOR_CHECKED_YES_RADIO));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Check answer \"Impressive\"")
    public void infoThatTheAnswerWasImpressiveShouldAppear() {
        MainPO mainPO = new MainPO();
        String resultTextInformation = mainPO.clickOnElementsButton()
                .clickOnRadioButtonTab()
                .clickOnImpressiveRadioButton()
                .getResultText();

        assertThat(resultTextInformation, hasToString(EXPECTED_START_OF_THE_MESSAGE +
                EXPECTED_INFO_FOR_CHECKED_IMPRESSIVE_RADIO));
    }
}
