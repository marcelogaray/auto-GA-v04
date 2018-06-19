package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.MainPageSSID.MainPageSSID;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class LoginSSID extends BasePage {
    @FindBy(xpath = "//*[@id=\'mat-input-0\']")
    private WebElement usernameInputField;

    @FindBy(xpath = "//*[@id=\'mat-input-1\']")
    private WebElement passwordInputField;

    @FindBy(xpath = "/html/body/ssi-root/ssi-login/div/div/form/div[4]/mat-card-actions/button")
    private WebElement loginBtn;

    public MainPageSSID setCredentials() {
        String username = PropertyAccessor.getInstance().getUser2();
        String password = PropertyAccessor.getInstance().getPassword2();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
        return new MainPageSSID();
    }
}
