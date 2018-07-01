package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Assign.FormAssignPersonal;
import org.umssdiplo.automationv01.core.managepage.Contract.ListContract;
import org.umssdiplo.automationv01.core.managepage.Equipment.FormEquipment;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.*;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.managepage.Position.CreatePosition;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.Resource;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.ResourceForm;
import org.umssdiplo.automationv01.core.managepage.StructureOrganizational.StructureOrganizational;
import org.umssdiplo.automationv01.core.managepage.Usuario.FormUser;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.ErrorMessage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

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
    private FormEquipment formEquipment;
    private Position position;
    private SubMenuOrganizationalStructure subMenuOrganizationalStructure;
    private StructureOrganizational structureOrganizational;
    private CreatePosition createPosition;
    private ResourceForm resourceForm;
    private FormUser formUser;
    private FormAssignPersonal formAssignPersonal;
    private SubMenuPersonalContract menuPersonalContract;
    private ListContract listContract;

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

    @Then("^validar que la 'Lista de Usuarios' este visible en la pagina 'usuarios'$")
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

    @And("^presionar en el Boton de 'Guardar' para guardar la informacion$")
    public void presionarEnElBotonDeGuardarParaGuardarLaInformacion() throws Throwable {
        formUser.clickButtonSaveUser();
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

    @And("^seleccionar la opcion 'Cargos del personal' en el sub menu de 'Estructura organizacional'$")
    public void seleccionarLaOpcionCargosDelPersonalEnElSubMenuDeEstructuraOrganizacional() throws Throwable {
        position = subMenuOrganizationalStructure.clickSubMenuPositions();
    }

    @Then("^validar que se cargue el listado de cargos en la pagina 'Cargos de la empresa'$")
    public void validarQueSeCargueElListadoDeCargosEnLaPaginaCargosDeLaEmpresa() throws Throwable {
        Assert.assertTrue(position.validListPositionsIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Positions list"));
    }

    @And("^validar que 'Paginador' se muestra debajo de la tabla 'Lista de Cargo'$")
    public void validarQuePaginadorSeMuestraDebajoDeLaTablaListaDeCargo() throws Throwable {
        Assert.assertTrue(position.validPaginatorIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Positions paginator list"));
    }
    //End Positions

    //BEGIN Equipment
    @And("^seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'$")
    public void menuEquipamientoEstaSeleccionado() throws Throwable {
        menuEquipamiento = menu.selectEquipmentMenu();
    }

    @And("^seleccionar submenu 'Equipamiento' en menu 'Equipamiento'$")
    public void seleccionarSubMenuEquipamiento() throws Throwable {
        listEquipment = menuEquipamiento.selectSubMenuEquipment();
    }

    @Then("^verificar que la 'Lista de Equipamientos' este visible$")
    public void validarListaDeEquipamientos() throws Throwable {
        Assert.assertTrue(listEquipment.isEquipmentListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }

    @Then("^verificar cabecera 'Nombre' de la pagina 'Lista de Equipamientos' esten cargados$")
    public void verificarCabeceraNombreListaEquipamientos() throws Throwable {
        Assert.assertTrue(listEquipment.verifyNameHeaderListEquipmentIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equiment title"));
    }

    @And("^verificar cabecera 'Acciones' de la pagina 'Lista de Equipamientos' esten cargados$")
    public void verificarCabeceraAccionListaEquipamientos() throws Throwable {
        Assert.assertTrue(listEquipment.verifyActionsHeaderListEquipmentIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equiment title"));
    }

    @And("^hacer Click en el boton 'Crear nuevo Equipamiento'$")
    public void hacerClickBotonCrearEquipamiento() throws Throwable {
        listEquipment.clickButtonCreateEquipment();
    }

    @When("^formulario de 'Registro de nuevo Equipamiento' esta cargado$")
    public void formularioRegistroNuevoEquipaminetoCargado() throws Throwable {
        formEquipment = listEquipment.isFormEquipmentVisible();
    }

    @Then("^verificar el campo 'Nombre' del 'Formulario de creación de Equipamiento' este visible$")
    public void validarComponenteNombreFormularioRegistroEquipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifyInputNameFormIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }

    @And("^verificar el selector de 'Tipo' del 'Formulario de creación de Equipamiento' este visible$")
    public void validarComponenteTipoFormularioRegistroEquipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifySelectTypeFormIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }

    @And("^verificar campo de 'Descripcion' del 'Formulario de creación de Equipamiento' este visible$")
    public void validarComponenteDescripcionFormularioRegistroEquipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifyInputDescriptionFormIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }

    @And("^verificar la opcion de carga de 'Imagen' del 'Formulario de creación de Equipamiento' este visible$")
    public void validarComponenteImagenFormularioRegistroEquipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifyInputImageFormIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipments title"));
    }
    //END Equipment

    @And("^seleccionar submenu 'Personal' en menu 'Personal'$")
    public void seleccionarSubMenuPersonal() throws Throwable {
        personnelSearch = menuPersonal.selectSubMenuPersonnel();
        Assert.assertTrue(personnelSearch.validateInputFindPersonIsVisible());
    }

    @When("^ingresar (.*) en 'Buscar Personal'$")
    public void ingresarEnBuscarPersonal(String personal) {
        personnelSearch.setTextFindPerson(personal);
    }

    @Then("^el resultado de 'Buscar Personal' deberia ser (\\d+)$")
    public void elResultadoDeBuscarPersonalDeberiaSer(int resultado) {
        int encontrado = personnelSearch.validatePersonnelFound(resultado);
        Assert.assertEquals(encontrado, resultado);
    }

    @And("^seleccionar submenu 'Asignacion' en menu 'Personal'$")
    public void seleccionarSubmenuAsignacionEnMenuPersonal() throws Throwable {
        formAssignPersonal = menuPersonal.selectSubMenuAssignPersonal();
    }

    @Then("^verificar que el 'Formulario de Asignacion Personal' es visible$")
    public void verificarQueElFormularioDeAsignacionPersonalEsVisible() throws Throwable {
        Assert.assertTrue(formAssignPersonal.isFormAssignPersonalVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Form Assign Equipament Personal"));
    }

    @Given("^menu principal este cargado en pagina de inicio$")
    public void seleccionarPaginaInicio() throws Throwable {
        menu = home.getHomeMenu();
    }

    @And("^seleccionar la opcion 'Personal' en la pagina 'menu principal'$")
    public void menuPersonalSeleccionado() throws Throwable {
        menuPersonalContract = menu.selectSubMenuPersonalContract();
    }

    //Structure organizational
    @And("^seleccionar la opcion 'Estructura organizacional' en el sub menu de 'Estructura organizacional'$")
    public void seleccionarLaOpcionEstructuraOrganizacionalEnElSubMenuDeEstructuraOrganizacional() throws Throwable {
        structureOrganizational = subMenuOrganizationalStructure.clickSubMenuOrganizationalStrucure();
    }

    @Then("^verificar que el boton 'Departamentos' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElBotonDepartamentosEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validateDepartmentsButtonIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Departments button "));
    }

    @And("^verificar que el boton 'Cargos laborales' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElBotonCargosLaboralesEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validatePositionsButtonIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Cargos button "));
    }

    @And("^verificar que el boton 'Areas de trabajo' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElBotonAreasDeTrabajoEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validateAreasButtonIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Areas button "));
    }

    @And("^verificar que el arbol 'Departamentos' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElArbolDepartamentosEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validateDepartmentsTreeIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Departments tree "));
    }

    @And("^verificar que el arbol 'Cargos laborales' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElArbolCargosLaboralesEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validatePositionsTreeIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Cargos tree "));
    }

    @And("^verificar que el arbol 'Areas de trabajo' este cargado en la pagina 'Estructura organizacional'$")
    public void verificarQueElArbolAreasDeTrabajoEsteCargadoEnLaPaginaEstructuraOrganizacional() throws Throwable {
        Assert.assertTrue(structureOrganizational.validateAreasTreeIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Areas tree "));
    }

    //Verify header positions list
    @Then("^verificar que se cargue el listado de cargos en la pagina 'Cargos de la empresa'$")
    public void verificarQueSeCargueElListadoDeCargosEnLaPaginaCargosDeLaEmpresa() throws Throwable {
        Assert.assertTrue(position.validListPositionsIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Positions table list"));
    }

    @And("^seleccionar el submenu 'Contratos' del menu 'Personal'$")
    public void seleccionarContratos() throws Throwable {
        listContract = menuPersonalContract.selectSubMenuContract();
    }

    @Then("^validar que la 'Lista de Contratos' este visible$")
    public void validarListaDeContratos() throws Throwable {
        Assert.assertTrue(listContract.validateContractList(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract List"));
    }

    @And("^insertar los siguientes datos en el cuadro de texto 'Buscar Usuario' en la pagina 'Lista de Usuarios'$")
    public void completarCampoBuscarUsuarioConLosSiguientesDatos(DataTable searchUserTable) throws Throwable {
        listUser.fillFieldSearchWithData(searchUserTable);
    }

    @Then("^verificar que el resultado coincida con el dato buscado$")
    public void verificarQueElResultadoCoincidaConElDatoBuscado() throws Throwable {
        Assert.assertTrue(listUser.isUserListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "List Users"));
    }

    @When("^seleccionar en boton 'next' del paginador de la 'lista de usuarios'$")
    public void seleccionarEnBotonNextDeLaLista() throws Throwable {
        listUser.clickButtonNext();
    }

    @And("^seleccionar en boton de 'previus' del paginador de la 'lista de usuarios'$")
    public void seleccionarEnBotonDePreviusDeLaLista() throws Throwable {
        listUser.clickButtonPrevius();
    }

    @And("^verificar que se cargue la cabecera 'Nombre cargo' en la tabla de 'lista de cargos'$")
    public void verificarQueSeCargueLaCabeceraNombreCargoEnLaTablaDeListaDeCargos() throws Throwable {
        Assert.assertTrue(position.validHeaderNamePositionListIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Header 'Nombre' position list"));
    }

    @And("^verificar que se cargue la cabecera 'Nivel' en la tabla de 'lista de cargos'$")
    public void verificarQueSeCargueLaCabeceraNivelEnLaTablaDeListaDeCargos() throws Throwable {
        Assert.assertTrue(position.validHeaderLevelPositionListIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Header 'Nivel' position list"));
    }

    @And("^verificar que se cargue la cabecera 'Depende de' en la tabla de 'lista de cargos'$")
    public void verificarQueSeCargueLaCabeceraDependeDeEnLaTablaDeListaDeCargos() throws Throwable {
        Assert.assertTrue(position.validHeaderDependencyPositionListIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Header 'Depende de' position list"));
    }

    @And("^verificar que se cargue la cabecera 'Acciones' en la tabla de 'lista de cargos'$")
    public void verificarQueSeCargueLaCabeceraAccionesEnLaTablaDeListaDeCargos() throws Throwable {
        Assert.assertTrue(position.validHeaderActionsPositionListIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Header 'Acciones' position list"));
    }

    //Valid form Create position
    @And("^seleccionar el boton 'Crear nuevo cargo' en la pagina 'Cargos de la empresa'$")
    public void seleccionarElBotonCrearNuevoCargoEnLaPaginaCargosDeLaEmpresa() throws Throwable {
        createPosition = position.clickButtonCreatePosition();
    }

    @Then("^verificar que exista el campo 'Nombre' en el formulario de 'crear cargo'$")
    public void verificarQueExistaElCampoNombreEnElFormularioDeCrearCargo() throws Throwable {
        Assert.assertTrue(createPosition.validFieldNameIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Field 'Nombre' "));
    }

    @And("^verificar que exista el campo 'Nivel' en el formulario de 'crear cargo'$")
    public void verificarQueExistaElCampoNivelEnElFormularioDeCrearCargo() throws Throwable {
        Assert.assertTrue(createPosition.validFieldLevelIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Field 'Nivel' "));
    }

    @And("^verificar que exista el campo 'Descripcion' en el formulario de 'crear cargo'$")
    public void verificarQueExistaElCampoDescripcionEnElFormularioDeCrearCargo() throws Throwable {
        Assert.assertTrue(createPosition.validFieldDescriptionIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Field 'Descripcion' "));
    }

    @And("^verificar que exista la lista desplegable 'Cargo padre' en el formulario de 'crear cargo'$")
    public void verificarQueExistaLaListaDesplegableCargoPadreEnElFormularioDeCrearCargo() throws Throwable {
        Assert.assertTrue(createPosition.validDropdownParentPositionIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Dropdown 'Cargo padre' "));
    }
    //end Valid form Create position

    // Valid Back button in create position
    @Then("^verificar que exista el boton 'Atras' en la pagina 'Crear nuevo cargo'$")
    public void verificarQueExistaElBotonAtrasEnLaPaginaCrearNuevoCargo() throws Throwable {
        Assert.assertTrue(createPosition.validateButtonBackIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Button 'Atras' "));
    }

    @And("^presionar el boton 'Atras' en la pagina 'Crear nuevo cargo'$")
    public void presionarElBotonAtrasEnLaPaginaCrearNuevoCargo() throws Throwable {
        position = createPosition.clickButtonBack();
    }

    @And("^verificar que se cargue la pagina 'Cargos de la empresa'$")
    public void verificarQueSeCargueLaPaginaCargosDeLaEmpresa() throws Throwable {
        Assert.assertTrue(position.validLoadPagePositionsIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Page 'Cargos de la empresa' "));
    }
    // End Valid Back button in create position

    // Valid send button disabled when go in to create new position
    @Then("^verificar que el formulario de creacion de cargo este vacio$")
    public void verificarQueElFormularioDeCreacionDeCargoEsteVacio() throws Throwable {
        Assert.assertTrue(createPosition.validateFormCreatePositionIsEmpty(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_EMPTY, "Create position form "));
    }

    @And("^verificar que exista el boton 'Enviar' en la pagina 'Crear nuevo cargo'$")
    public void verificarQueExistaElBotonEnviarEnLaPaginaCrearNuevoCargo() throws Throwable {
        Assert.assertTrue(createPosition.validateButtonSendIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Button 'Enviar' "));
    }

    @And("^verificar que el boton 'Enviar' este deshabilitado en la pagina 'Crear nuevo cargo'$")
    public void verificarQueElBotonEnviarEsteDeshabilitadoEnLaPaginaCrearNuevoCargo() throws Throwable {
        Assert.assertFalse(createPosition.validateButtonSendIsEnabled(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_ENABLED, "Button 'Enviar' "));
    }
}
