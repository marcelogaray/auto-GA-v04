package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.EditEquipment.EditEquipment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private EditEquipment editEquipment;

    @Given("^'SSID' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on SSID 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^edit equipment on 'Equipaments/update/id' page$")
    public void registerEquipment() throws Throwable {
        System.out.println("========================================");
        System.out.println("Testing SSID RF07-TC-016 EDIT EQUIPMENT");
        System.out.println("========================================");
        this.editEquipment = new EditEquipment();
        editEquipment.editEquipment();
    }


}
