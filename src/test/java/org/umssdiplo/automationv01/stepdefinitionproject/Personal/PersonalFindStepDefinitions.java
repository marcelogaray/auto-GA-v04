package org.umssdiplo.automationv01.stepdefinitionproject.Personal;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Personal.PersonalFind;

public class PersonalFindStepDefinitions {
    private PersonalFind personalFind;

    @Given("^buscar personal$")
    public void buscarPersonal() throws Throwable {
        personalFind = new PersonalFind();
        personalFind.buscarPersonalEmail();
    }
}
