package org.umssdiplo.automationv01.stepdefinitionproject.Login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class LoginStepDefinitions {
    private Login login;

    @Given("^Ingresamos al Sistema$")
    public void loginPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^Insertamos las credenciales en el formulario de inicio de sesion$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }
}
