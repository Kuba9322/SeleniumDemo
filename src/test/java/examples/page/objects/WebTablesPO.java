package examples.page.objects;

import examples.waits.WaitForElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebTablesPO extends BasePO{

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(className = "rt-tr-group")
    private List<WebElement> tableContentRows;

    @Step("Click on Add Button")
    public RegistrationFormPO clickAddButton(){
        WaitForElement.waitUntilElementIsClickable(addButton);
        addButton.click();
        log().info("Clicked on CAdd Button");
        return new RegistrationFormPO();
    }

    @Step("Get Table Rows")
    public List<String> getTableRows(){
        WaitForElement.waitUntilElementIsClickable(tableContentRows.get(0));
        ArrayList<String> rows = new ArrayList<>();
        for (WebElement tableContentRow : tableContentRows) {
            rows.add(tableContentRow.getText());
        }
        return rows;
    }





}
