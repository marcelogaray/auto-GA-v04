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
    @Given("^'SSI-D' pagina de inicio de sesion es cargada$")
    public void ssiDPaginaDeInicioDeSesionEsCargada() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema$")
    public void ingresarLosCredencialesValidosEnLaPaginaLoginParaIngresarAlSistema() throws Throwable {
        home = login.setCredentials();
    }

    //SSID HOME
    @And("^click menu Equipment en  pagina 'Home'$")
    public void selectMenuEquipment() throws Throwable {
        home.clickEquipment();
    }

    @And("^click subMenu Equipment en  pagina 'Home'")
    public void selectSubMenuEquipment() throws Throwable {
        listEquipment = home.clickSubEquipment();
    }

    //SSID LIST EQUIPMENTS
    @Then(" pagina 'Equipment List' cargada corectamente")
    public void listEquipmentPresent() throws Throwable {
        boolean result = listEquipment.listEquipmetsPresent();
        Assert.assertTrue(result);
    }
}