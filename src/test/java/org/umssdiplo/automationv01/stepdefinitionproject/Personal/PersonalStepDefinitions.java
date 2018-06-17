package org.umssdiplo.automationv01.stepdefinitionproject.Personal;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Personal.Personal;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PersonalStepDefinitions {
    private Login login;
    private Personal personal;

    @Given("^'lpersonal' page is loaded$")
    public void lpersonalPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'lpersonal' page$")
    public void setMyCredentialsOnLpersonalPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^mostrar personal$")
    public void mostrarPersonal() throws Throwable {
        personal=new Personal();
        personal.mostrarPersonal();
    }
}
