package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Header.Header;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(id = "mat-input-0")
    private WebElement usernameInputField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordInputField;

    @FindBy(id = "btnAccept")
    private WebElement loginBtn;

    public Header setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        setDataUsernameInputField(username);
        setDataPasswordInputField(password);
        clickLoginAcceptButton();
        return new Header();
    }

    private void setDataUsernameInputField(String username) {
        CommonEvents.setInputField(usernameInputField, username);
    }

    private void setDataPasswordInputField(String password) {
        CommonEvents.setInputField(passwordInputField, password);
    }

    private void clickLoginAcceptButton() {
        CommonEvents.clickButton(loginBtn);
    }
}