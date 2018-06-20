package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(className = "mat-button-wrapper")
    private WebElement loginBtn;

    public Home setCredentials() {
        setUser();
        setPassword();
        clickBtnLogin();
        return new Home();
    }

    private void setUser() {
        String username = PropertyAccessor.getInstance().getUser();
        CommonEvents.setInputField(usernameInputField, username);
    }

    private void setPassword() {
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(passwordInputField, password);
    }

    private void clickBtnLogin() {
        CommonEvents.clickButton(loginBtn);
    }
}
