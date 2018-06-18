package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.users.EditUser;
import org.umssdiplo.automationv01.core.managepage.users.ListUser;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class UserStepDef {

    private ListUser listUser;
    private EditUser editUser;

    @Given("^set my list page is loaded$")
    public void setMyListPageIsLoaded() throws Throwable {
        listUser = LoadPage.listUserPage();
    }

    @When("^select users menu$")
    public void seleccionarMenuPersonal() throws Throwable {
        listUser.listUsers();
    }

    @Given("^click on edit button$")
    public void clickOnEditButton() throws Throwable {
        listUser.clickEditUser();
    }

    @And("^set my new user data$")
    public void setMyNewUserData() throws Throwable {
        editUser = LoadPage.getEditUserPage();
        editUser.fillFormUserData();
    }
}
