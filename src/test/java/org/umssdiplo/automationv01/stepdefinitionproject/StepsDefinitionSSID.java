package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.ListEquipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private ListEquipment listEquipment;

    @Given("^'SSID' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on SSID 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^list equipment on 'Home' page$")
    public void selectMenuEquipment() throws Throwable {
        System.out.println("=========================================");
        System.out.println("Testing SSID RF07-TC-035 LIST EQUIPMENTS");
        System.out.println("=========================================");
        this.listEquipment = new ListEquipment();
        listEquipment.listEquipment();
    }


}
