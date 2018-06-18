package org.umssdiplo.automationv01.stepdefinitionproject.Home;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Home.Home;

public class HomeStepDefinitions {
    Home home = new Home();

    @Given("^Click on 'Incident' link$")
    public void clickOnIncidentLink() throws Throwable {
        home.clickIncident();
    }
}
