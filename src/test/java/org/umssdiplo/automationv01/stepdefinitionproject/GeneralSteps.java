package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class GeneralSteps {
    private Home home;
    private Login login;

    @Given("^de asd $")
    public void asd() throws Throwable{

    }

    @Given("^Ingresamos al Sistema$")
    public void ingresamosAlSistema() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^Insertamos las credenciales en el formulario de inicio de sesion$")
    public void insertamosLasCredencialesEnElFormularioDeInicioDeSesion() throws Throwable {
        home = login.setCredentials();
    }

    @Given("^Estoy autenticado a la pagina de inicio$")
    public void estoyAutenticadoALaPaginaDeInicio() throws Throwable {
        home.homePageIsVisiable();
//        Assert.assertEquals(home.homePageIsVisiable(), true);
    }

}
