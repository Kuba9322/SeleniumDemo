package examples.tests.functional.elements;

import examples.page.objects.MainPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

public class CheckBoxTest extends TestBase {

    private static final String EXPECTED_START_OF_THE_MESSAGE = "You have selected : %s";

    private static final String EXPECTED_MESSAGE_FOR_ALL_CHECKED = "home desktop notes commands documents workspace " +
            "react angular veu office public private classified general downloads wordFile excelFile";

    private static final String EXPECTED_MESSAGE_FOR_REACT_CHECKED = "react";

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Check parent check-box HOME")
    public void allCheckBoxesShouldBeChecked() {

        MainPO mainPO = new MainPO();
        String resultTextInformation = mainPO.clickOnElementsButton()
                .clickOnCheckBoxTab()
                .clickOnCheckBoxHome()
                .getResultText();

        assertThat(resultTextInformation.replace("\n", " "), hasToString(String.format(EXPECTED_START_OF_THE_MESSAGE,
                EXPECTED_MESSAGE_FOR_ALL_CHECKED)));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Check check-box \"React\"")
    public void checkBoxReactShouldBeChecked() {

        MainPO mainPO = new MainPO();
        String resultTextInformation = mainPO.clickOnElementsButton()
                .clickOnCheckBoxTab()
                .expandHomeToggle()
                .expandDocumentsToggle()
                .expandDWorkSpaceToggle()
                .clickOnCheckBoxReact()
                .getResultText();

        assertThat(resultTextInformation.replace("\n", " "), hasToString(String.format(EXPECTED_START_OF_THE_MESSAGE,
                EXPECTED_MESSAGE_FOR_REACT_CHECKED)));
    }
}
