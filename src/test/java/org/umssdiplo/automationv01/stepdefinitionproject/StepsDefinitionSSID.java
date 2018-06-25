package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
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
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.ErrorMessage;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.managepage.Contract.ListContract;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuPersonalContract;
import org.umssdiplo.automationv01.core.managepage.Contract.FormContract;

import java.util.List;
import java.util.Map;

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
    private SubMenuPersonalContract menuPersonalContract;
    private ListContract listContract;
    private FormContract formContract;

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

    @Given("^Menu principal este cargado en pagina de Inicio$")
    public void seleccionarPaginaInicio() throws Throwable {
        menu = home.getHomeMenu();
    }

    @And("^seleccionar menu 'Personal' para contract en la pagina 'Menu Principal'$")
    public void menuPersonalSeleccionado() throws Throwable {
        menuPersonalContract = menu.selectPersonalSubMenuContract();
    }

    @And("^Seleccionar submenu 'Contratos' en menu 'Personal'$")
    public void seleccionarContratos() throws Throwable {
        listContract = menuPersonalContract.selectSubMenuContract();
    }

    @Then("^Validar que la 'Lista de Contratos' este visible$")
    public void validarListaDeContratos() throws Throwable {
        boolean result = listContract.isContractListVisible();
    }

    @Given("^Pagina de inicio cargada correctamente$")
    public void seleccionarInicio() throws Throwable {
        menu = home.getHomeMenu();
    }

    @And("^Ingresar a menu 'Personal' en la pagina del 'Menu Principal'$")
    public void menuPersonal() throws Throwable {
        menuPersonalContract = menu.selectPersonalSubMenuContract();
    }

    @And("^Ingresar al submenu 'Contratos' en menu 'Personal'$")
    public void seleccionarContratosCrear() throws Throwable {
        listContract = menuPersonalContract.selectSubMenuContract();
    }

    @And("^Mostrar 'Lista de Contratos'$")
    public void validarContratos() throws Throwable {
        boolean result = listContract.isContractListVisible();
    }

    @And("^Seleccionar boton Agregar Nuevo Contrato del Area de contratos$")
    public void seleccionarAgregarContrato() throws Throwable {
        formContract = listContract.seleccionarBoton();
    }

    @And("^Llenar 'formulario de Contrato Nuevo'$")
    public void LlenarformulariodeContratoNuevo(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        formContract.registerContract(data);
    }

    @And("^Seleccionar Boton 'Enviar' para grabar los datos del formulario$")
    public void SeleccionarBotonformulario() throws Throwable {
        formContract.enviarFormulario();
    }


}