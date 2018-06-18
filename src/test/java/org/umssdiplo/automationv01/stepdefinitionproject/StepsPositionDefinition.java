package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Position.CreatePosition;
import org.umssdiplo.automationv01.core.managepage.Position.EditPosition;
import org.umssdiplo.automationv01.core.managepage.Position.ListPosition;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsPositionDefinition {
    Position position;
    ListPosition listPosition;
    CreatePosition createPosition;
    EditPosition editPosition;

    @Given("^load list positions page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        listPosition = LoadPage.listPositions();
        listPosition.listPositions();
    }

    @When("^select 'Estructura organizacional/Cardos de la empresa' menu option$")
    public void selectEstructuraOrganizacionalCardosDeLaEmpresaMenuOption() throws Throwable {
        position = LoadPage.positionPage();
        position.goPositionPage();
    }
}
