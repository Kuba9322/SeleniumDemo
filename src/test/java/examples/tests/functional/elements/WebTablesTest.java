package examples.tests.functional.elements;

import examples.page.objects.MainPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class WebTablesTest extends TestBase {

    private static final String AGE = "25";

    private static final String SALARY = "9800";

    private static final String DEPARTMENT = "Insurance";

    private String firstName;

    private String lastName;

    private String email;

    @BeforeClass
    private void initData() {
        firstName = getDataProvider().name().firstName();
        lastName = getDataProvider().name().firstName();
        email = getDataProvider().internet().emailAddress();
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Text box test")
    public void textBoxFunctionalTest() {

        MainPO mainPO = new MainPO();
        List<String> tableRows = mainPO.clickOnElementsButton()
                .clickOnWebTablesTab()
                .clickAddButton()
                .fillFirstNameInput(firstName)
                .fillLastNameInput(lastName)
                .fillEmailInput(email)
                .fillAgeInput(AGE)
                .fillESalaryInput(SALARY)
                .fillEDepartmentInput(DEPARTMENT)
                .clickSubmitButton()
                .getTableRows();

        boolean isContain = doesTableContainsTestData(tableRows);
        assertThat(isContain, is(true));
    }

    private boolean doesTableContainsTestData(List<String> tableRows) {
        boolean isContain = false;
        for (String tableRow : tableRows) {
            isContain = tableRow.contains(firstName) &&
                    tableRow.contains(lastName) &&
                    tableRow.contains(email) &&
                    tableRow.contains(AGE) &&
                    tableRow.contains(SALARY) &&
                    tableRow.contains(DEPARTMENT);
            if (isContain){
                break;
            }
        }
        return isContain;
    }


}
