package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.ProgramaSSO;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinationSSI_GyD_Resources {
    private Login login;
    private ProgramaSSO programaSSO;

    @Given("^'SSI G & D' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page 'SSI G & D'$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Then("^click menu 'Programa SSO'$")
    public void clickMenuProgramSSO() throws Throwable {
        programaSSO = LoadPage.programaSSO();
        programaSSO.clickMenuProgramSSO();
    }

    @And("^click sub menu 'Recursos'$")
    public void clickSubMenuResources() throws Throwable {
        programaSSO.clickSubMenuResources();
    }

    @And("^click 'Agregar nuevo recurso'$")
    public void clickNewResources(){
        programaSSO.clickNewResources();
    }

    @And("^filling inputs resources form$")
    public void fillingFormResoureces() {
        programaSSO.fillingFormResoureces();
    }
}
