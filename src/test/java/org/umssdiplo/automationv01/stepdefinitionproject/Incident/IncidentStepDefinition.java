package org.umssdiplo.automationv01.stepdefinitionproject.Incident;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Incident.CreateIncident;
import org.umssdiplo.automationv01.core.managepage.Incident.Incident;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class IncidentStepDefinition {
    private Incident incident;
    private CreateIncident createIncident;

    @Given("^Incident Page is loaded$")
    public void incidentPageIsLoaded() throws Throwable {
        incident = LoadPage.incidentPage();
    }

    @Given("^Click on 'Add new Incident' button$")
    public void clickOnAddNewIncidentButton() throws Throwable {
        incident.clickCreateIncident();
    }

    @And("^List of incidents is loaded$")
    public void listOfIncidentsIsLoaded() throws Throwable {
        incident.verifyIfTableExists();
    }

    @And("^CreateIncidentPage is loaded$")
    public void createincidentpageIsLoaded() throws Throwable {
        createIncident = LoadPage.createIncidentPage();
    }

    @And("^set Incidents form for create$")
    public void setIncidentsFormForCreate() throws Throwable {
        createIncident.setForm();
    }


}
