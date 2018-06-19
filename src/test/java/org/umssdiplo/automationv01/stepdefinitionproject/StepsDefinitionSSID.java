package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.ListContract.ListContract;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private ListContract listContract;

    @Given("^'SSID' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on SSID 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^list contract on 'Home' page$")
    public void selectMenuContract() throws Throwable {
        System.out.println("=========================================");
        System.out.println("Testing SSID  LIST CONTRACTS");
        System.out.println("=========================================");
        this.listContract = new ListContract();
        listContract.listContract();
    }


}
