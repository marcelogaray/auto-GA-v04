package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
<<<<<<< HEAD
    @FindBy(name = "username")
=======
    @FindBy(id = "mat-input-0")
>>>>>>> b8e41f7bec092f4c81283a51858f98bddeb0ffcb
    private WebElement usernameInputField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordInputField;

<<<<<<< HEAD
    @FindBy(className = "mat-button-wrapper")
=======
    @FindBy(id = "btnAccept")
>>>>>>> b8e41f7bec092f4c81283a51858f98bddeb0ffcb
    private WebElement loginBtn;

    public Home setCredentials() {
        setUser();
        setPassword();
        clickBtnLogin();
        return new Home();
    }

    private void setUser() {
        String username = PropertyAccessor.getInstance().getUser();
<<<<<<< HEAD
        CommonEvents.setInputField(usernameInputField, username);
    }

    private void setPassword() {
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(passwordInputField, password);
    }

    private void clickBtnLogin() {
=======
        String password = PropertyAccessor.getInstance().getPassword();
        setDataUsernameInputField(username);
        setDataPasswordInputField(password);
        clickLoginAcceptButton();
    }

    private void setDataUsernameInputField(String username) {
        CommonEvents.setInputField(usernameInputField, username);
    }

    private void setDataPasswordInputField(String password) {
        CommonEvents.setInputField(passwordInputField, password);
    }

    private void clickLoginAcceptButton() {
>>>>>>> b8e41f7bec092f4c81283a51858f98bddeb0ffcb
        CommonEvents.clickButton(loginBtn);
    }
}