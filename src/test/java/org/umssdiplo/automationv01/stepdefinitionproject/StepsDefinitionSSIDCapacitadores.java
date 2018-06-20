package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.LoginSSID;
import org.umssdiplo.automationv01.core.managepage.MainPageSSID.MainPageSSID;
import org.umssdiplo.automationv01.core.utils.LoadPageSSID;
import org.umssdiplo.automationv01.core.managepage.Capacitadores.CapacitadoresSSID;

public class StepsDefinitionSSIDCapacitadores {
    private LoginSSID loginSSID;
    private CapacitadoresSSID capacitadoresSSID;
    private MainPageSSID mainPageSSID;

    @Given("^'SSI-D' page is loaded$")
    public void ssidPageIsLoaded() throws Throwable {
        loginSSID = LoadPageSSID.loginPage();
    }

    @And("^set my credentials on 'Login' SSID page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        mainPageSSID = loginSSID.setCredentials();
    }

    @And("^Go to Capacitadores$")
    public void validateMainPage() throws Throwable {
        capacitadoresSSID = mainPageSSID.goToCapacitadores();
    }

    @And("^click on Modificar button$")
    public void goToCapacitadores() throws Throwable {
        capacitadoresSSID.clickOnModifyButton();
    }

    @And("^set nombre$")
    public void setNombre() throws Throwable {
        capacitadoresSSID.setNombre();
    }

    @And("^click on guardar button$")
    public void saveChanges() throws Throwable {
        capacitadoresSSID.clickOnGuardarButton();
    }
}
