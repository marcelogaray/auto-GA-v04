package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.Menu;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuOrganizationalStructure;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuEquipment;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuPersonal;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.ErrorMessage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private Home home;
    private Menu menu;
    private SubMenuPersonal menuPersonal;
    private ListUser listUser;
    private IncidentPage incidentPage;
    private SubMenuEquipment menuEquipamiento;
    private ListEquipment listEquipment;
    private Position position;
    private SubMenuOrganizationalStructure subMenuOrganizationalStructure;
    private IncidentPage incidentPage;

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

    @Given("^'Menu principal' estee cargado$")
    public void seleccionarElMenuDePersona() throws Throwable {
        menu = home.getHomeMenu();
    }

    @And("^seleccionar menu 'Personal' en la pagina 'Menu Principal'$")
    public void menuPersonalEsteeSeleccionado() throws Throwable {
        menuPersonal = menu.selectPersonalSubMenu();
    }

    @And("^Seleccionar submenu 'Usuario' en menu 'Personal'$")
    public void seleccionarSubMenuUsuario() throws Throwable {
        listUser = menuPersonal.selectSubMenuUsuario();
    }

    @Then("^Validar que la 'Lista de Usuarios' este visible$")
    public void validarListaDeUsuarios() throws Throwable {
        boolean result = listUser.isUserListVisible();
    }

    //Position RF02-TC-071: Verify list of Positions load correctly
    @And("^Seleccionar la opcion 'Estructura organizacional' en el menu principal$")
    public void seSeleccionaLaOpcionDelMenuEstructuraOrganizacional() throws Throwable {
        subMenuOrganizationalStructure = menu.clickMenuOrganizationalStructure();
    }

    @And("^Seleccionar la opcion 'Cargos del personal' en el sub menu de estructura organizacional$")
    public void seleccionarLaOpcionDelSubMenuCargosDelPersonal() throws Throwable {
        position = subMenuOrganizationalStructure.clickSubMenuPositions();
    }

    @Then("^Validar que exista el listado con los cargos registrados en la base de datos$")
    public void validarQueExistaElListadoConLosCargosRegistradosEnLaBaseDeDatos() throws Throwable {
        Assert.assertTrue(position.validListPositions(), "No se encuentra la lista de cargos");
    }

    @And("^Verificar que el listado contenga paginador de contenido$")
    public void verificarQueElListadoContengaPaginadorDeContenido() throws Throwable {
        Assert.assertTrue(position.validPaginator(), "No se encuentra el paginador");

    }

    @And("^Presionar en la opcion 'Incidentes' del 'Menu Principal'$")
    public void presionarEnLaOpcionIncidentesDelMenuPrincipal() throws Throwable {
        incidentPage = menu.clickMenuIncident();
    }

    @Then("^Verificar que la tabla de incidentes se muestre correctamente$")
    public void verificarQueLaTablaDeIncidentesSeMuestreCorrectamente() throws Throwable {
        Assert.assertTrue(incidentPage.isTableVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Incident"));
    }

    @And("^seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'$")
    public void menuEquipamientoEstaSeleccionado() throws Throwable {
        menuEquipamiento = menu.selectEquipmentMenu();
    }

    @And("^Seleccionar submenu 'Equipamiento' en menu 'Equipamiento'$")
    public void seleccionarSubMenuEquipamiento() throws Throwable {
        listEquipment = menuEquipamiento.selectSubMenuEquipment();
    }

    @Then("^Verificar que la 'Lista de Equipamientos' este visible$")
    public void validarListaDeEquipamientos() throws Throwable {
        Assert.assertTrue(listEquipment.isEquipmentListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments"));
    }

}