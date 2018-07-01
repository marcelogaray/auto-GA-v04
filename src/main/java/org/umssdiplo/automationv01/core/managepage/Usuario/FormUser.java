package org.umssdiplo.automationv01.core.managepage.Usuario;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;

public class FormUser extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Guardar')]")
    private WebElement buttonSaveUser;

    @FindBy(id = "username-form")
    private WebElement inputFieldUsername;

    @FindBy(id = "password-form")
    private WebElement inputFieldPassword;

    @FindBy(id = "userActive-form-input")
    private WebElement inputUserActive;

    public FormUser() {
        CommonEvents.isVisible(buttonSaveUser);
    }

    public void createNewUserFromTable(DataTable userTable) {
        List<User> users = new ArrayList<>();
        users = userTable.asList(User.class);
        setDataUsernameInputField(users.get(0).getUsername());
        setDataPasswordInputField(users.get(0).getPassword());
    }

    private void setDataUsernameInputField(String username) {
        CommonEvents.setInputField(inputFieldUsername, username);
    }

    private void setDataPasswordInputField(String password) {
        CommonEvents.setInputField(inputFieldPassword, password);
    }

    private void clickCheckUserActive(boolean userActive) {
        if (userActive) {
            CommonEvents.clickButton(inputUserActive);
        }
    }

    public void clickButtonSaveUser() {
        CommonEvents.clickButton(buttonSaveUser);
    }
}
