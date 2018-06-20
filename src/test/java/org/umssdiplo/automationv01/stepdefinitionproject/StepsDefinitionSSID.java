package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.RegisterEquipment.RegisterEquipment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private RegisterEquipment registerEquipment;

    @Given("^'SSID' page is loaded$")
    public void ssidPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on SSID 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^register equipment on 'Equipaments/create' page$")
    public void registerEquipment() throws Throwable {
        System.out.println("==========================================");
        System.out.println("Testing SSID RF07-TC-002 CREATE EQUIPMENT");
        System.out.println("==========================================");
        this.registerEquipment = new RegisterEquipment();
        registerEquipment.registerEquipment();
    }


}
