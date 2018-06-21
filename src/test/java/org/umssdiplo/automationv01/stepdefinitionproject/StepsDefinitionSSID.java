package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Header.Header;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private Header header;

    @Given("^'SSI-D' pagina de inicio de sesion es cargada$")
    public void ssiDPaginaDeInicioDeSesionEsCargada() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema$")
    public void ingresarLosCredencialesValidosEnLaPaginaLoginParaIngresarAlSistema() throws Throwable {
        header = login.setCredentials();
    }

    @Given("^seleccionar el menu de persona$")
    public void seleccionarElMenuDePersona() throws Throwable {
        header.selectPersonalMenu();
    }

    @When("^Seleccionar SubMenu Users$")
    public void seleccionarSubMenuUsers() throws Throwable {
        header.selectSubMenuUsuario();
    }
}