package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Assign.FormAssignPersonal;
import org.umssdiplo.automationv01.core.managepage.Contract.ListContract;
import org.umssdiplo.automationv01.core.managepage.Equipment.FormEquipment;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Equipment.EquipmentDetail;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListInventory;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Incident.CreateIncidentPage;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.*;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.managepage.Personnel.ButtonAddPersonnel;
import org.umssdiplo.automationv01.core.managepage.Personnel.FormTitleNewPersonnel;
import org.umssdiplo.automationv01.core.managepage.Position.CreatePosition;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.Resource;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.ResourceForm;
import org.umssdiplo.automationv01.core.managepage.StructureOrganizational.StructureOrganizational;
import org.umssdiplo.automationv01.core.managepage.Trainer.CreateTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.EditTrainer;
import org.umssdiplo.automationv01.core.managepage.Trainer.ListTrainer;
import org.umssdiplo.automationv01.core.managepage.Usuario.FormUser;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.managepage.Personnel.AddPersonnel;
import org.umssdiplo.automationv01.core.managepage.Personnel.ButtonAddPersonnel;
import org.umssdiplo.automationv01.core.utils.ErrorMessage;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.managepage.Contract.FormContract;

import java.util.List;
import java.util.Map;

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
    private ListInventory listInventory;
    private FormEquipment formEquipment;
    private Position position;
    private SubMenuOrganizationalStructure subMenuOrganizationalStructure;
    private CreateIncidentPage createIncidentPage;
    private StructureOrganizational structureOrganizational;
    private CreatePosition createPosition;
    private ResourceForm resourceForm;
    private FormUser formUser;
    private FormAssignPersonal formAssignPersonal;
    private SubMenuPersonalContract menuPersonalContract;
    private ListContract listContract;
    private EquipmentDetail equipmentDetail;
    private FormContract formContract;
    private ListTrainer listTrainer;
    private SubMenuTrainer subMenuTrainer;
    private CreateTrainer createTrainer;
    private EditTrainer editTrainer;
    private AddPersonnel addPersonnel;
    private FormTitleNewPersonnel formTitleNewPersonnel;

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

    @Then("^validar si el titulo 'Crear Recurso' es visible en la pagina de 'Agregar Recursos'$")
    public void validarSiElTituloCrearRecursoEsVisibleEnLaPaginaDeAgregarRecursos() throws Throwable {
        Assert.assertTrue(resourceForm.validateTitleIsVisible("Crear Recurso"), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Titulo 'Crear Recurso' "));
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

    @And("^presionar en la opcion 'Incidentes' del 'Menu Principal'$")
    public void presionarEnLaOpcionIncidentesDelMenuPrincipal() throws Throwable {
        incidentPage = menu.clickMenuIncident();
    }

    @Then("^verificar que la 'tabla de incidentes' este visible en la pagina 'Incidentes'$")
    public void verificarQueLaTablaDeIncidentesSeMuestreCorrectamente() throws Throwable {
        Assert.assertTrue(incidentPage.isTableVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Incident title"));
    }

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

    @And("^click en el boton 'Agregar nuevo Incidente' de la pagina 'incidentes'$")
    public void hacemosClickEnElBotonAgregarNuevoIncidente() throws Throwable {
        createIncidentPage = incidentPage.clickOnButtonAddNewIncident();
    }

    @When("^insertamos información valida en el formulario de 'Creacion de Incidentes'$")
    public void insertamosInformacionValidaEnElFormularioDeCreacionDeIncidentes(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String. class);
        createIncidentPage.setFormIncident(data);
    }

    @And("^click en el boton 'guardar' en el 'formulario creación de incidentes'$")
    public void hacemosClicEnElBotonDeGuardar() throws Throwable {
        createIncidentPage.clickSaveButton();
    }

    @And("^verificamos que el titulo de 'Creacion de Incidentes' se muestre correctamente$")
    public void verificamosQueElTituloDeCreacionDeIncidentesSeMuestreCorrectamente() throws Throwable {
        Assert.assertTrue(createIncidentPage.isTitleVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Titulo 'Crear Incidente'"));
    }

    @When("^llenamos el campo 'code' y el campo 'description' con valores vacios$")
    public void llenamosLosDatosRequeridosDelFormularioDeCreacionDeIncidentes() throws Throwable {
        createIncidentPage.fillInputCode("");
        createIncidentPage.fillDescription("");
    }

    @Then("^verificar que el boton 'guardar' no se deshabilita$")
    public void verificarQueElBotonDeGuardadoNoSeDeshabilita() throws Throwable {
        Assert.assertFalse(createIncidentPage.isButtonEnabled(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_DISABLED, "is enabled"));
    }

    @When("^hacemos 'click' en el boton 'cancelar'$")
    public void hacemosClickEnElBotonCancelar() throws Throwable {
        incidentPage = createIncidentPage.clickOnCancelButton();
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

    @And("^activar campo requerido 'Nombre' sin ingresar informacion en 'Formulario de creación de Equipamiento'$")
    public void activarCamposNombreEnRegistroEquipamiento() throws Throwable {
        formEquipment.setInputFieldName();
    }

    @And("^activar campo requerido 'Descripcion' sin ingresar informacion en 'Formulario de creación de Equipamiento'$")
    public void activarCampoDescripcionEnRegistroEquipamiento() throws Throwable {
        formEquipment.setTextDescription();
    }

    @Then("^verificar mensaje de 'campo requerido' en 'Formulario de creación de Equipamiento' con el campo 'Nombre' vacio$")
    public void verificarMensajeNombreRequeridoEnRegistroequipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifyHintMessageInputNameIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipment title"));
    }

    @And("^verificar mensaje de 'campo requerido' en 'Formulario de creación de Equipamiento' con el campo 'Descripcion' vacio$")
    public void verificarMensajeDescripcionRequeridoEnRegistroequipamiento() throws Throwable {
        Assert.assertTrue(formEquipment.verifyHintMessageInputDescriptionIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Equipment title"));
    }

    @And("^click en el boton 'Ver' de 'Lista de Equipamientos'$")
    public void clickBtnVer() throws  Throwable {
        equipmentDetail = listEquipment.clickbuttonViewEquipment();
    }

    @Then("^verificar titulo de 'Nombre' en el 'Detalle de Equipamiento' este visible$")
    public void verificarNombreEnDetalleEquipamiento() throws Throwable {
        Assert.assertTrue(equipmentDetail.verifyEquipmentNameIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "EquipmentDetail Title"));
    }

    @And("^verificar titulo de 'Tipo' en el 'Detalle de Equipamiento' este visible$")
    public void verificarTipoEnDetalleEquipamiento() throws Throwable {
        Assert.assertTrue(equipmentDetail.verifyEquipmentTypeIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "EquipmentDetail Title"));
    }

    @And("^verificar contenido de 'Imagen' en el 'Detalle de Equipamiento' este visible$")
    public void verificarImagenEnDetalleEquipamiento() throws Throwable {
        Assert.assertTrue(equipmentDetail.verifyEquipmentImageIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "EquipmentDetail Title"));
    }

    @And("^seleccionar submenu 'Inventory' en menu 'Equipamiento'$")
    public void seleccionarSubMenuInventory() throws Throwable {
        listInventory = menuEquipamiento.selectSubMenuInventory();
    }

    @Then("^verificar que 'Reporte de Inventario' este visible$")
    public void verificarInformacionReporteInventarios() throws Throwable {
        Assert.assertTrue(listInventory.isInventoryListVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Inventory title"));
    }

    @Then("^verificar 'Titulo' del 'Reporte de Inventario' este visible$")
    public void verificarTituloCabeceraReporteInventario() throws Throwable {
        Assert.assertTrue(listInventory.verifyTitleReportHeaderInventoryIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Inventory title"));
    }

    @And("^verificar 'Imagen' del 'Reporte de Inventario' este visible$")
    public void verificarImagenCabeceraReporteInventario() throws Throwable {
        Assert.assertTrue(listInventory.verifyImageReportHeaderInventoryIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Inventory title"));
    }
    //END Equipment

    @And("^seleccionar submenu 'Personal' en menu 'Personal'$")
    public void seleccionarSubMenuPersonal() throws Throwable {
        Assert.assertTrue(menuPersonal.selectSubMenuPersonnel(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Personnel Submenu"));
        personnelSearch = menuPersonal.getPersonnelSearch();
        Assert.assertTrue(personnelSearch.validateInputFindPersonIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Personnel search"));
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

    @Then("^validar que la 'Lista de Contratos' este visible en la pagina 'Contratos'$")
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
        listUser.clickButtonPrevious();
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

    @Then("^verificar que la pagina 'incidentes' es cargada correctamente$")
    public void verificarQueLaPaginaIncidentesEsCargadaCorrectamente() throws Throwable {
        Assert.assertTrue(incidentPage.isTitleVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Incident"));
    }

    @And("^visualizacion de la 'Lista de Contratos' en la pagina 'Contratos'$")
    public void validarContratos() throws Throwable {
        Assert.assertTrue(listContract.validateContractList(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract List"));
    }

    @And("^seleccionar boton 'Agregar Nuevo Contrato' del 'Area de contratos'$")
    public void seleccionarAgregarContrato() throws Throwable {
        formContract = listContract.selectBtnAddContract();
    }

    @And("^llenar 'formulario de Contrato Nuevo'$")
    public void llenarformulariodeContratoNuevo(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        formContract.newContractRegistration(data);
    }

    @And("^seleccionar Boton 'Enviar' para grabar los datos del formulario$")
    public void SeleccionarBotonformulario() throws Throwable {
        formContract.clickButtonSendForm();
    }

    @And("^click en el boton 'Editar' del primer item lista contratos$")
    public void seleccionarEditar() throws Throwable {
        formContract = listContract.selectBtnEditContract();
    }

    @And("^modificar datos del 'formulario de Contrato a Editar'$")
    public void llenarformulariodeContratoEdit(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        formContract.editContractRegistration(data);
    }

    @And("^click en el boton 'Enviar' para grabar los datos editados del formulario$")
    public void SeleccionarBotonformularioEditar() throws Throwable {
        formContract.clickButtonSendFormEdit();
    }

    @And("^insertar la siguiente informacion para realizar el filtro en la 'lista de contrato'$")
    public void llenarfiltroBusqueda(DataTable tables) throws Throwable {
        List<Map<String, String>> data = tables.asMaps(String.class, String.class);
        listContract.findContractList(data);
    }

    @Then("^validar que la 'lista de contratos' se haya filtrado correctamente$")
    public void listaFiltrada() throws Throwable {
        Assert.assertTrue(listContract.validateContractList(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract List Fill"));
    }

    @Then("^verificar 'Lista de Contratos' con item editado$")
    public void listaContratoEditado() throws Throwable {
        Assert.assertTrue(listContract.validateContractList(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract List Edit"));
    }

    @And("^click en el boton 'Eliminar' del primer item lista contratos$")
    public void seleccionarEliminar() throws Throwable {
        listContract.selectBtnDeleteContract();
    }

    @Then("^validar que la 'Lista de Contratos' este visible sin el item eliminado$")
    public void listaContratoActualizado() throws Throwable {
        Assert.assertTrue(listContract.validateContractList(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract List Delete"));
    }

    @When("^click en el boton siguiente de la lista de 'Contratos'$")
    public  void seleccionarSiguienteListaContrato(){
        listContract.selectNextListcontract();
    }

    @And("^click en el boton de anterior de la lista de 'Contratos'$")
    public void seleccionAnteriorListaContrato(){
        listContract.selectBackListcontract();
    }

    @And("^click en el boton 'Atras' del formulario 'creacion de contratos'$")
    public void seleccionBtnAtrasContract(){
        listContract.selectBtnBackContarct();
    }

    @Then("^validar que el título del formulario de creación contratos sea 'Nuevo Contrato'$")
    public void validarTitulo() throws Throwable {
        Assert.assertTrue(formContract.getTitle().equals("Nuevo Contrato"),String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Contract Title") );
    }

    @And("^presionar en el Boton de 'Guardar' para guardar la informacion$")
    public void presionarEnElBotonDeGuardarParaGuardarLaInformacion() throws Throwable {
        formUser.clickButtonSaveUser();
    }

    @And("^presionar en la opcion 'ProgramSSO' del 'Menu Principal'$")
    public void presionarEnLaOpcionProgramSSODelMenuPrincipal() throws Throwable {
        subMenuTrainer = menu.clickMenuProgramSSOTrainer();
    }

    @And("^presionar en la opcion 'Capacitadores' del sub menu 'ProgramSSO'$")
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

    @Then("^verificar que la lista de capacitadores sea mostrada en la pagina 'Capacitadores'$")
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

    @And("^editar (.*) de Capacitador$")
    public void editarNombreDeCapacitador(String nombre) throws Throwable {
        editTrainer.setTrainerName(nombre);
    }

    @And("^presionar el boton  'guardar' Capacitador$")
    public void guardarNombreEditadoDeCapacitador() throws Throwable {
        listTrainer = editTrainer.clickOnSaveButton();
    }

    @And("^verificar si el boton crear capacitador es visible$")
    public void verificarSiElBotonCrearCapacitadorEsVisible() throws Throwable {
        Assert.assertTrue(listTrainer.verifyIfCreateTrainerButtonIsVisibleAfterEditingTrainer(), "Create trainer button is not visible") ;
    }

    @And("^click en el submenu 'Personal'$")
    public void clickEnElSubmenuPersonal() throws Throwable {
        Assert.assertTrue(menuPersonal.selectSubMenuPersonnel());
        buttonAddPersonnel = menuPersonal.getButtonAddPersonnel();
    }

    @Given("^click en el boton 'Agregar nuevo personal'$")
    public void clickEnElBotonAgregarNuevoPersonal() throws Throwable {
        Assert.assertTrue(buttonAddPersonnel.validateButtonAddPersonnelIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Personnel add"));
        addPersonnel = buttonAddPersonnel.clickOnButtonAddPersonnel();
    }

    @When("^llenar el campo nombre (.*)$")
    public void llenarElCampoNombre(String name) throws Throwable {
        addPersonnel.setInputFieldName(name);
    }

    @When("^llenar el campo apellido (.*)$")
    public void llenarElCampoApellido(String lastName) throws Throwable {
        addPersonnel.setInputFieldLastName(lastName);
    }

    @When("^llenar el campo email (.*)$")
    public void llenarElCampoEmail(String email) throws Throwable {
        addPersonnel.setInputFieldEmail(email);
    }

    @When("^llenar el campo direccion (.*)$")
    public void llenarElCampoDireccion(String address) throws Throwable {
        addPersonnel.setInputFieldAddress(address);
    }

    @When("^llenar el campo telefono (.*)$")
    public void llenarElCampoTelefono(String phone) throws Throwable {
        addPersonnel.setInputFieldPhone(phone);
    }

    @When("^seleccionar el 'Area' de instalaciones hidricas$")
    public void seleccionarElAreaDeInstalacionesHidricas() throws Throwable {
        addPersonnel.setOptionArea();
    }

    @Then("^click en 'Enviar' el nuevo personal$")
    public void clickEnEnviarElNuevoPersonal() throws Throwable {
        Assert.assertTrue(addPersonnel.clickOnButtonSendPersonnel(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_ENABLED, "Agregar Personal"));
        Assert.assertTrue(buttonAddPersonnel.validateButtonAddPersonnel(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Personnel add"));
    }

    @Then("^verificar el titulo del formulario de creacion 'Nuevo Personal'$")
    public void verificarElTituloDelFormularioDeCreacionNuevoPersonal() throws Throwable {
        formTitleNewPersonnel = new FormTitleNewPersonnel();
        Assert.assertTrue(formTitleNewPersonnel.validateTitleNewPersonnelIsVisible(), String.format(ErrorMessage.ERROR_MESSAGE_ELEMENT_VISIBLE, "Personnel title"));
    }
}