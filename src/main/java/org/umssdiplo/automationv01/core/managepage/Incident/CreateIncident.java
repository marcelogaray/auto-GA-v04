package org.umssdiplo.automationv01.core.managepage.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class CreateIncident extends BasePage {

    @FindBy(name = "radio")
    private WebElement radioBtn;

    public void setForm() {

    }
}
