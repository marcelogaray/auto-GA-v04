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
import org.umssdiplo.automationv01.core.managepage.Menu.*;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.Resource;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.ResourceForm;
import org.umssdiplo.automationv01.core.managepage.Usuario.FormUser;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.utils.ErrorMessage;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.managepage.Trainer.CreateTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.EditTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.ListTrainer;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuTrainer;

public class StepsDefinitionSSID {
    private Login login;
    private Home home;
    private Menu menu;
    private SubMenuPersonal menuPersonal;
    private ListUser listUser;
    private SubMenuProgramSSO subMenuProgramSSO;
    private Resource resource;
    private IncidentPage incidentPage;
    private PersonnelSearch personnelSearch;
    private SubMenuEquipment menuEquipamiento;
    private ListEquipment listEquipment;
    private Position position;
    private SubMenuOrganizationalStructure subMenuOrganizationalStructure;
    private ResourceForm resourceForm;
    private FormUser formUser;
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

    @And("^seleccionar submenu 'Usuario' en menu 'Personal'$")
    public void seleccionarSubMenuUsuario() throws Throwable {
        listUser = menuPersonal.selectSubMenuUser();
    }

    @Then("^validar que la 'Lista de Usuarios' este visible$")
    public void validarListaDeUsuarios() throws Throwable {
        Assert.assertTrue(listUser.isUserListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Usuario"));
    }

    @And("^hacer clic en el boton 'Agregar Nuevo Usuario'$")
    public void hacerClicEnElBotonAgregarNuevoUsuario() throws Throwable {
        listUser.clickButtonAddNewUser();
    }

    @When("^formulario de 'Registro Nuevo Usuario' este cargado$")
    public void formularioDeRegistroNuevoUsuarioEsteeCargado() throws Throwable {
        formUser = listUser.isFormUserVisible();
    }

    @And("^registrar usuarios con username, password con los siguiente datos$")
    public void registrarUsuariosConUsernamePasswordYQueEsteenEnEstadoActivado(DataTable usersTable) throws Throwable {
        formUser.createNewUserFromTable(usersTable);
    }

    @And("^Presionar en la opcion 'Incidentes' del 'Menu Principal'$")
    public void presionarEnLaOpcionIncidentesDelMenuPrincipal() throws Throwable {
        incidentPage = menu.clickMenuIncident();
    }

    @Then("^Verificar que la tabla de incidentes se muestre correctamente$")
    public void verificarQueLaTablaDeIncidentesSeMuestreCorrectamente() throws Throwable {
        Assert.assertTrue(incidentPage.isTableVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Incident"));
    }

    //ProgramSSO - Resources
    @And("^seleccionar la opcion 'Programa SSO' del menu principal de la pagina 'Home'$")
    public void clickMenuProgramSSO() throws Throwable {
        subMenuProgramSSO = menu.clickMenuProgramSSO();
    }

    @And("^seleccionar la opcion 'Recursos' en el sub menu de 'Programa SSO'")
    public void clickSubMenuResources() throws Throwable {
        resource = subMenuProgramSSO.clickSubMenuResources();
    }

    @Then("^validar si columna 'Costo' es visible en la pagina 'Recursos'$")
    public void visibilityCostHeader() throws Throwable {
        Assert.assertTrue(resource.validateHeaderCostIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "columna 'Costo'"));
    }

    @And("^validar si columna 'Detalle' es visible en la pagina 'Recursos'$")
    public void visibilityDetailHeader() throws Throwable {
        Assert.assertTrue(resource.validateHeaderDetailIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "columna 'Detalle'"));
    }

    @And("^validar si columna 'Accion' es visible en la pagina 'Recursos'$")
    public void visibilityActionHeader() throws Throwable {
        Assert.assertTrue(resource.validateHeaderActionIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "columna 'Accion'"));
    }

    @And("^click en el boton 'Agregrar nuevo recurso' de la pagina 'Recursos'$")
    public void clickAddNewResource() throws Throwable {
        resourceForm = resource.clickButtonAddResource();
    }

    @And("^llenar el formulario con valores validos de la pagiga 'Agregar Recursos' costo = \"(.*)\" y detalle = \"(.*)\"$")
    public void fillResourcesForm(String cost, String detail) throws Throwable {
        resourceForm.fillResourceForm(cost, detail);
    }

    @And("^click en el boton 'Guardar' de la pagina 'Agregar Recursos'$")
    public void saveResourceForm() throws Throwable {
        resource = resourceForm.clickButtonSave();
    }

    @Then("^validar que la lista de la pagina 'Recursos' este visible$")
    public void validateListOfResources() throws Throwable {
        Assert.assertTrue(resource.validateListResourceIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "list resources"));
    }

    @Then("^validar si el titulo 'Crear Recurso' de la pagina de 'Agregar Recursos'$")
    public void ValidateTitleRecourceForm() throws Throwable {
        Assert.assertTrue(resourceForm.validateTitleIsVisible("Crear Recurso"), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "title form resources"));
    }

    @Then("^validar que el inputField 'Costo' este visible$")
    public void validarTextFieldCost() throws Throwable {
        Assert.assertTrue(resourceForm.validateInputFieldCostIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Cost input field"));
    }

    @And("^validar que el inputField 'Detalle' este visible$")
    public void validarTextFieldDetail() throws Throwable {
        Assert.assertTrue(resourceForm.validateInputFieldDetailIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Cost input field"));
    }

    @And("^click en el boton 'Atras' de la pagina 'Agregar Recursos'$")
    public void clickBackButtonAddResources() throws Throwable {
        resource = resourceForm.clickButtonBack();
    }

    @And("^click en el boton 'Cancelar' de la pagina 'Agregar Recursos'$")
    public void clickCancelButtonAddResources() throws Throwable {
        resource = resourceForm.clickButtonCancel();
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

    @And("^seleccionar submenu 'Personal' en menu 'Personal'$")
    public void seleccionarSubMenuPersonal() throws Throwable {
        personnelSearch = menuPersonal.selectSubMenuPersonnel();
        Assert.assertTrue(personnelSearch.validateInputFindPersonIsVisible());
    }

    @When("^ingresar (.*) en 'Buscar Personal'$")
    public void ingresarEnBuscarPersonal(String personal){
        personnelSearch.setTextFindPerson(personal);
    }

    @Then("^el resultado de 'Buscar Personal' deberia ser (\\d+)$")
    public void elResultadoDeBuscarPersonalDeberiaSer(int resultado){
        int encontrado = personnelSearch.validatePersonnelFound(resultado);
        Assert.assertEquals(encontrado, resultado);
    }

    @And("^presionar en el Boton de 'Guardar' para guardar la informacion$")
    public void presionarEnElBotonDeGuardarParaGuardarLaInformacion() throws Throwable {
        formUser.clickButtonSaveUser();
    }

    @And("^presionar en la opcion 'ProgramSSO' del 'Menu Principal'$")
    public void presionarEnLaOpcionProgramSSODelMenuPrincipal() throws Throwable {
        subMenuTrainer = menu.clickMenuProgramSSOTrainer();

    }

    @And("^presionar en la opcion 'Capacitadores' del 'SubMenu'$")
    public void presionarEnLaOpcionCapacitadoresDelSubMenu() throws Throwable {
        listTrainer = subMenuTrainer.selectSubMenuTrainer();
    }

    @And("^presionar el boton 'Crear Nuevo Capacitador'$")
    public void clickEnElBotonCrearNuevoCapacitador() throws Throwable {
        createTrainer = listTrainer.clickOnCreateTrainerButton();
    }

    @Then("^validar que el título del formulario de creación de Capacitadores sea 'Crear capacitador'$")
    public void validarTituloDeCapacitadoresEnModoCreacion() throws Throwable {
        Assert.assertTrue(createTrainer.getTrainerTitleCreateMode().equals("Crear capacitador"),String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Capacitador title") );

    }

    @And("^presionar el boton 'Atras' del modo creacion de Capacitador$")
    public void clickEnElBotonAtrasDelModoCreacionCapacitador() throws Throwable {
        listTrainer = createTrainer.clickBackButton();
    }

    @Then("^verificar que la lista de capacitadores sea mostrada$")
    public void verificarListaDeCapacitadores() throws Throwable {
        Assert.assertTrue(listTrainer.verifyIfTrainerListIsVisible(),String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Trainers list"));

    }

    @And("^presionar el boton 'Editar' de Capacitador$")
    public void clickEnElBotonEditarDelCapacitador() throws Throwable {
        editTrainer = listTrainer.clickOnUpdateTrainerButton();
    }

    @Then("^validar que el título del formulario de edicion de Capacitadores sea 'Modificar capacitador'$")
    public void validarTituloCapacitadoresEnModoEdicion() throws Throwable {
        Assert.assertTrue(editTrainer.getTrainerTitleEditMode().equals("Modificar capacitador"),"Trainer title is not the correct") ;

    }

    @And("^presionar el boton 'Atras' del modo edicion de Capacitador$")
    public void clickEnElBotonAtrasDeCapacitador() throws Throwable {
        listTrainer = editTrainer.clickOnBackButton();
    }

    @And("^editar nombre de Capacitador$")
    public void editarNombreDeCapacitador() throws Throwable {
        editTrainer.setTrainerName();
    }

    @And("^presionar el boton  'guardar' Capacitador$")
    public void guardarNombreEditadoDeCapacitador() throws Throwable {
        listTrainer = editTrainer.clickOnSaveButton();
    }

    @And("^verififcar si el boton crear capacitador es visible$")
    public void verificarSiElBotonCrearCapacitadorEsVisible() throws Throwable {
        Assert.assertTrue(listTrainer.verifyIfCreateTrainerButtonIsVisibleAfterEditingTrainer(), "Create trainer button is not visible") ;
    }
}
