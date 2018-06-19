package org.umssdiplo.automationv01.core.managepage.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreateIncident extends BasePage {

    @FindBy(css = "#mat-radio-2 > label")
    private WebElement radioHighBtn;



    public void setForm() {
        CommonEvents.clickButton(radioHighBtn);
    }
}
