package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.Menu;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuPersonal;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private Home home;
    private Menu menu;
    private SubMenuPersonal menuPersonal;
    private ListUser listUser;

    private void loadPageObjects() {
        login = LoadPage.loginPage();
    }

    @Given("^'SSI-D' pagina de inicio de sesion es cargada$")
    public void ssiDPaginaDeInicioDeSesionEsCargada() throws Throwable {
        loadPageObjects();
    }

    @And("^Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema$")
    public void ingresarLosCredencialesValidosEnLaPaginaLoginParaIngresarAlSistema() throws Throwable {
        home = login.setCredentials();
    }

    @Given("^Menu principal estee cargado$")
    public void seleccionarElMenuDePersona() throws Throwable {
        menu = home.getHomeMenu();
    }

    @And("^Menu 'Personal' estee seleccionado$")
    public void menuPersonalEsteeSeleccionado() throws Throwable {
        menuPersonal = menu.selectPersonalSubMenu();
    }

    @And("^Seleccionar SubMenu 'Usuario'$")
    public void seleccionarSubMenuUsuario() throws Throwable {
        listUser = menuPersonal.selectSubMenuUsuario();
    }

    @Then("^Validar 'Lista de Usuarios'$")
    public void validarListaDeUsuarios() throws Throwable {
        boolean result = listUser.verifyListUser();
    }
}