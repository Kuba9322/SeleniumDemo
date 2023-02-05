package examples.tests.functional.elements;

import examples.page.objects.ButtonPO;
import examples.page.objects.MainPO;
import examples.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ButtonsTest extends TestBase {

    private final static String DOUBLE_CLICK_EXPECTED_MESSAGE = "You have done a double click";

    private final static String RIGHT_CLICK_EXPECTED_MESSAGE = "You have done a right click";

    private final static String CLICK_ME_EXPECTED_MESSAGE = "You have done a dynamic click";

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Double click button test")
    public void messageAfterClickDoubleClickButtonShouldAppear() {

        MainPO mainPO = new MainPO();
        ButtonPO buttonPO = mainPO.clickOnElementsButton()
                .clickOnButtonTab()
                .clickOnDoubleClickButton();

        assertThat(buttonPO.isRightClickMessageDisplayed(), is(false));
        assertThat(buttonPO.isDoubleClickMessageDisplayed(), is(true));
        assertThat(buttonPO.isClickMeMessageDisplayed(), is(false));
        assertThat(buttonPO.getDoubleClickMessageText(), is(DOUBLE_CLICK_EXPECTED_MESSAGE));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Right click button test")
    public void messageAfterClickRightClickButtonShouldAppear() {

        MainPO mainPO = new MainPO();
        ButtonPO buttonPO = mainPO.clickOnElementsButton()
                .clickOnButtonTab()
                .clickOnRightClickButton();

        assertThat(buttonPO.isRightClickMessageDisplayed(), is(true));
        assertThat(buttonPO.isDoubleClickMessageDisplayed(), is(false));
        assertThat(buttonPO.isClickMeMessageDisplayed(), is(false));
        assertThat(buttonPO.getRightClickMessageText(), is(RIGHT_CLICK_EXPECTED_MESSAGE));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Click Me click button test")
    public void messageAfterClickClickMeButtonShouldAppear() {

        MainPO mainPO = new MainPO();
        ButtonPO buttonPO = mainPO.clickOnElementsButton()
                .clickOnButtonTab()
                .clickOnClickMeButton();

        assertThat(buttonPO.isRightClickMessageDisplayed(), is(false));
        assertThat(buttonPO.isDoubleClickMessageDisplayed(), is(false));
        assertThat(buttonPO.isClickMeMessageDisplayed(), is(true));
        assertThat(buttonPO.getClickMeMessageText(), is(CLICK_ME_EXPECTED_MESSAGE));
    }
}
