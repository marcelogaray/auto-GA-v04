package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonStepdef {
    private Login login;
    private Home home;

//    @Given("^Ingresamos al Sistema$")
//    public void loginPageIsLoaded() throws Throwable {
//        login = LoadPage.loginPage();
//    }
//
//    @And("^Insertamos las credenciales en el formulario de inicio de sesion$")
//    public void setMyCredentialsOnLoginPage() throws Throwable {
//        home = login.setCredentials();
//    }
//
//    @Given("^Estoy autenticado a la pagina de inicio$")
//    public void homePageIsLoaded() throws Throwable {
//        Assert.assertEquals(home.homePageIsVisiable(), true);
//    }
}
