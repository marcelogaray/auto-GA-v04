package org.umssdiplo.automationv01.stepdefinitionproject.Incident;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Incident.Incident;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class IncidentStepDefinition {
    Incident incident = new Incident();

    @Given("^Click on 'Add new Incident' button$")
    public void clickOnAddNewIncidentButton() throws Throwable {
        incident.clickCreateIncident();
    }

    @And("^set Incidents form for create$")
    public void setIncidentsFormForCreate() throws Throwable {

    }
}
