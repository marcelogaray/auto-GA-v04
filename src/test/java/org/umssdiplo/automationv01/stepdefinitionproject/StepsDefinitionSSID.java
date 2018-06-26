package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.Menu;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuEquipment;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuOrganizationalStructure;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuPersonal;
import org.umssdiplo.automationv01.core.managepage.Menu.*;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.Trainer.CreateTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.EditTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.ListTrainer;
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
    private SubMenuTrainer subMenuTrainer;
    private ListTrainer listTrainer;
    private CreateTrainer createTrainer;
    private EditTrainer editTrainer;

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
    @When("^seleccionar la opcion 'Estructura organizacional' en el menu principal$")
    public void seleccionarLaOpcionEstructuraOrganizacionalEnElMenuPrincipal() throws Throwable {
        subMenuOrganizationalStructure = menu.clickMenuOrganizationalStructure();
    }

    @And("^seleccionar la opcion 'Cargos del personal' en el sub menu de estructura organizacional$")
    public void seleccionarLaOpcionCargosDelPersonalEnElSubMenuDeEstructuraOrganizacional() throws Throwable {
        position = subMenuOrganizationalStructure.clickSubMenuPositions();
    }

    @Then("^validar que se cargue el listado de cargos en la pagina 'Cargos de la empresa'$")
    public void validarQueSeCargueElListadoDeCargosEnLaPaginaCargosDeLaEmpresa() throws Throwable {
        Assert.assertTrue(position.validListPositions(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Positions list"));
    }

    @And("^validar que 'Paginador' se muestra debajo de la tabla 'Lista de Cargo'$")
    public void validarQuePaginadorSeMuestraDebajoDeLaTablaListaDeCargo() throws Throwable {
        Assert.assertTrue(position.validPaginator(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Positions paginator list"));
    }
    //End Positions

    @And("^Presionar en la opcion 'Incidentes' del 'Menu Principal'$")
    public void presionarEnLaOpcionIncidentesDelMenuPrincipal() throws Throwable {
        incidentPage = menu.clickMenuIncident();
    }

    @Then("^Verificar que la tabla de incidentes se muestre correctamente$")
    public void verificarQueLaTablaDeIncidentesSeMuestreCorrectamente() throws Throwable {
        Assert.assertTrue(incidentPage.isTableVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Incident title"));
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
        Assert.assertTrue(listEquipment.isEquipmentListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }

    @And("^Presionar en la opcion 'ProgramSSO' del 'Menu Principal'$")
    public void presionarEnLaOpcionProgramSSODelMenuPrincipal() throws Throwable {
        subMenuTrainer = menu.clickMenuProgramSSO();

    }

    @And("^Presionar en la opcion 'Capacitadores' del 'SubMenu'$")
    public void presionarEnLaOpcionCapacitadoresDelSubMenu() throws Throwable {
        listTrainer = subMenuTrainer.selectSubMenuTrainer();
    }

    @And("^Click en el boton 'Crear Nuevo Capacitador'$")
    public void clickEnElBotonCrearNuevoCapacitador() throws Throwable {
        createTrainer = listTrainer.clickCreateTrainerButton();
    }

    @Then("^Validar que el título del formulario de creación de Capacitadores sea 'Crear capacitador'$")
    public void validarTituloCapacadoresModoCreacion() throws Throwable {
        Assert.assertTrue(createTrainer.getTrainerTitleCreateMode().equals("Crear capacitador"),String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Capacitador title") );

    }

    @And("^Click en el boton 'Atras' del modo creacion de Capacitador$")
    public void clickEnElBotonAtrasDelModoCreacionCapacitador() throws Throwable {
        listTrainer = createTrainer.clickAtrasButton();
    }

    @Then("^Verificar que la lista de capacitadores sea mostrada$")
    public void verificarListaDeCapacitadores() throws Throwable {
        Assert.assertTrue(listTrainer.isTrainerListVisible(),String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Trainers list"));

    }

    @And("^Click en el boton 'Editar' de Capacitador$")
    public void clickEnElBotonEditarDelCapacitador() throws Throwable {
        editTrainer = listTrainer.clickUpdateTrainerButton();
    }

    @Then("^Validar que el título del formulario de edicion de Capacitadores sea 'Modificar capacitador'$")
    public void validarTituloCapacadoresModoEdicion() throws Throwable {
        Assert.assertTrue(editTrainer.getTrainerTitleEditMode().equals("Modificar capacitador"),"Capacitador title is not the correct") ;

    }


}