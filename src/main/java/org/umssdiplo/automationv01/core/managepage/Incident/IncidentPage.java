package org.umssdiplo.automationv01.core.managepage.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IncidentPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Incidentes')]")
    private WebElement titleIncident;

    @FindBy(css = ".mat-table .mat-header-row")
    private WebElement headerTable;

    @FindBy(id = "add-new-incident-btn")
    private WebElement buttonAddNewIncident;

    public IncidentPage() {
        CommonEvents.isVisible(titleIncident);
    }

    public boolean isTableVisible() {
        return CommonEvents.isVisible(headerTable);
    }

    public CreateIncidentPage clickOnAddNewIncidentBtn() {
        CommonEvents.clickButton(buttonAddNewIncident);
        return new CreateIncidentPage();
    }
}
