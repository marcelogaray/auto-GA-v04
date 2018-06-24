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
    private WebElement btnSaveUser;

    @FindBy(id = "username-form")
    private WebElement usernameInputField;

    @FindBy(id = "password-form")
    private WebElement passwordInputField;

    @FindBy(id = "userActive-form-input")
    private WebElement userActiveInput;

    public FormUser() {
        CommonEvents.isVisible(btnSaveUser);
    }

    public void createNewUserFromTable(DataTable userTable) {
        List<User> users = new ArrayList<>();
        users = userTable.asList(User.class);
        createNewUser(users.get(0));
    }

    private void createNewUser(User user) {
        setDataUsernameInputField(user.getUsername());
        setDataPasswordInputField(user.getPassword());
        clickSaveUserButton();
    }

    private void setDataUsernameInputField(String username) {
        CommonEvents.setInputField(usernameInputField, username);
    }

    private void setDataPasswordInputField(String password) {
        CommonEvents.setInputField(passwordInputField, password);
    }

    private void clickUserActiveCheck(boolean userActive) {
        if (userActive) {
            CommonEvents.clickButton(userActiveInput);
        }
    }

    private void clickSaveUserButton() {
        CommonEvents.clickButton(btnSaveUser);
    }
}
