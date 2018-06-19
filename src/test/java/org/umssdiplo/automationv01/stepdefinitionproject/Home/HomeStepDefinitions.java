package org.umssdiplo.automationv01.stepdefinitionproject.Home;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class HomeStepDefinitions {
    private Home home;

    @Given("^'Home' Page is loaded$")
    public void homePageIsLoaded() throws Throwable {
        home = LoadPage.homePage();
    }

    @Given("^Click on 'Incident' link$")
    public void clickOnIncidentLink() throws Throwable {
        home.clickIncident();
    }
}
