package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Menu.Menu;
import org.umssdiplo.automationv01.core.managepage.Menu.SubMenuProgramSSO;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.Resource;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSSID {
    private Login login;
    private Home home;
    private Menu menu;
    private SubMenuProgramSSO subMenuProgramSSO;
    private Resource resource;

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

    @Given("^Menu principal este cargado$")
    public void menuEstaCargado() throws Throwable {
        menu = home.menuIsVisible();
    }

    //ProgramSSO - Resources
    @And("^menu 'Programa SSO' este seleccionado$")
    public void clickMenuProgramSSO() throws Throwable {
         subMenuProgramSSO = menu.clickMenuProgramSSO();
    }

    @And("^seleccionar sub menu 'Recursos'")
    public void clickSubMenuResources() throws Throwable {
        resource = subMenuProgramSSO.clickSubMenuResources();
    }

    @And("^validar si columna 'Costo' es visible$")
    public Boolean visibilityCostHeader(){
        return resource.visibilityCostHeader();
    }

    @And("^validar si columna 'Detalle' es visible$")
    public Boolean visibilityDetailHeader(){
        return resource.visibilityDetailHeader();
    }

    @And("^validar si columna 'Accion' is visible$")
    public Boolean visibilityActionHeader(){
        return resource.visibilityActionHeader();
    }
}