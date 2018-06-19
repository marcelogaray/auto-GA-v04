package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Position.CreateEditPosition;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsPositionDefinition {
    Position position;
    CreateEditPosition createEditPosition;

    @Given("^load necesary objects position$")
    public void loadNecesaryObjectsPosition() throws Throwable {
        position = LoadPage.positionPage();
    }

    @Given("^load necesary objects create position$")
    public void loadNecesaryObjectsCreatePosition() throws Throwable {
        createEditPosition = LoadPage.createPositionPage();
    }

    @And("^select 'Estructura organizacional' menu option$")
    public void selectEstructuraOrganizacionalMenuOption() throws Throwable {
        position.clickOrganizationalStructure();
    }

    @And("^select 'Cargos de la empresa' menu option$")
    public void selectCargosDeLaEmpresaMenuOption() throws Throwable {
        position.clickPositions();
    }

    @And("^validate list positions page is loaded$")
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

    @And("^select 'Crear nuevo cargo' button$")
    public void selectCrearNuevoCargoButton() throws Throwable {
        position.clickCreatePositions();
    }

    @And("^fill data to create a new position in form$")
    public void fillDataToCreateANewPositionInForm() throws Throwable {
        createEditPosition.setCreateDataForm("Cargo prueba", "2", "Test position automation creation");
    }

    @And("^click on button save position$")
    public void clickOnButtonSavePosition() throws Throwable {
        createEditPosition.clickSavePositions();
    }

    @And("^review load position page after save position created$")
    public void reviewLoadPositionPageAfterSavePositionCreated() throws Throwable {
        position.validatePagePosition();
    }

    @And("^select a parent position option$")
    public void selectAParentPositionOption() throws Throwable {
        createEditPosition.clickDropdownParentPosition();
    }

    @And("^select 'Edit' button of first position in the list$")
    public void selectEditButtonOfFirstPositionInTheList() throws Throwable {
        position.clickEditButton(0);
    }

    @And("^edit description data of position in form$")
    public void editDescriptionDataOfPositionInForm() throws Throwable {
        createEditPosition.setEditDataForm("<<edited>>");
    }
}
