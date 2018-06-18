package org.umssdiplo.automationv01.core.managepage.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Incident extends BasePage {

    @FindBy(id = "add-new-incident-btn")
    private WebElement addNewIncidentButton;

    @FindBy(id = "incidents-report-btn")
    private WebElement incidentReportBtn;

    public void clickCreateIncident() {
        CommonEvents.clickButton(addNewIncidentButton);
    }
}
