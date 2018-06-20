package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsPositionDefinition {
    Position position;

    @Given("^'SSI-D' pagina Home fue cargada despues de inicio de sesion$")
    public void ssiDPaginaHomeFueCargadaDespuesDeInicioDeSesion() throws Throwable {
        position = LoadPage.positionPage();
    }

    @And("^Se selecciona la opcion del menu 'Estructura organizacional'$")
    public void seSeleccionaLaOpcionDelMenuEstructuraOrganizacional() throws Throwable {
        position.clickOrganizationalStructure();
    }

    @And("^Seleccionar la opcion del sub menu 'Cargos del personal'$")
    public void seleccionarLaOpcionDelSubMenuCargosDelPersonal() throws Throwable {
        position.clickPositions();
    }

    @And("^Verificar que se haya cargado la pagina Cargos de la empresa$")
    public void verificarQueSeHayaCargadoLaPaginaCargosDeLaEmpresa() throws Throwable {
        position.validatePagePosition();
    }

    @Then("^Validar que exista el listado con los cargos registrados en la base de datos$")
    public void validarQueExistaElListadoConLosCargosRegistradosEnLaBaseDeDatos() throws Throwable {
        position.listPositions();
    }

    @And("^Verificar que el listado contenga paginador de contenido$")
    public void verificarQueElListadoContengaPaginadorDeContenido() throws Throwable {
        position.validPaginator();
    }
}
