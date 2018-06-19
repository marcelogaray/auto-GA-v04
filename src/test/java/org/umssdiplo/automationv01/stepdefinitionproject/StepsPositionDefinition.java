package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsPositionDefinition {
    Position position;

    @Given("^load necesary objects position$")
    public void loadNecesaryObjectsPosition() throws Throwable {
        position = LoadPage.positionPage();
    }

    @And("^select 'Estructura organizacional' menu option$")
    public void selectEstructuraOrganizacionalMenuOption() throws Throwable {
        position.clickOrganizationalStructure();
    }

    @And("^select 'Cargos de la empresa' menu option$")
    public void selectCargosDeLaEmpresaMenuOption() throws Throwable {
        position.clickPositions();
    }

    @And("^load list positions page is loaded$")
    public void positionsPageIsLoaded() throws Throwable {
        position.validatePagePosition();
    }

    @And("^validate table list of positions$")
    public void validateTableListOfPositions() throws Throwable {
        position.listPositions();
    }

    @And("^validate exist paginator of list positions$")
    public void validateExistPaginatorOfListPositions() throws Throwable {
        position.validPaginator();
    }
}
