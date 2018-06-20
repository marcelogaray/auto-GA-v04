package org.umssdiplo.automationv01.stepdefinitionproject.Personal;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Personal.PersonalAdd;

public class PersonalAddStepDefinitions {
    private PersonalAdd personalAdd;

    @Then("^agregar personal$")
    public void agregarPersonal() throws Throwable {
        personalAdd =  new PersonalAdd();
        personalAdd.agregarPersonal();
    }
}
