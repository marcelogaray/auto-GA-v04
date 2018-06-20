package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.ListEquipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private Home home;
    private ListEquipment listEquipment;

    //SSID LOGIN
    @Given("^'SSID' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on SSID 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        home = login.setCredentials();
    }

    //SSID HOME

    @And("^click menu Equipment in 'Home' page$")
    public void selectMenuEquipment() throws Throwable {
        home.clickEquipment();
    }

    @And("^click subMenu Equipment in 'Home' page")
    public void selectSubMenuEquipment() throws Throwable {
        listEquipment = home.clickSubEquipment();
    }

    //SSID LIST EQUIPMENTS

    @Then("'Equipment List' page loads DONE")
    public void listEquipmentPresent() throws Throwable{
        boolean result = listEquipment.listEquipmetsPresent();
        Assert.assertTrue(result);
    }
}
