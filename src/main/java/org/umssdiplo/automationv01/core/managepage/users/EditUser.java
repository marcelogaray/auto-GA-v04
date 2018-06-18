package org.umssdiplo.automationv01.core.managepage.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class EditUser extends BasePage{

    @FindBy(id = "username-form")
    private WebElement usernameInputField;

    @FindBy(id = "password-form")
    private WebElement passwordInputField;

    @FindBy(id = "userActive-form")
    private WebElement userActiveField;

    @FindBy(id = "save-user-form")
    private WebElement saveUserBtn;

    public void fillFormUserData(){
        System.out.println("================= Save User Form ===================");
        CommonEvents.setInputField(usernameInputField, PropertyAccessor.getInstance().getUserNameTest());
        CommonEvents.setInputField(passwordInputField, PropertyAccessor.getInstance().getPasswordNameTest());
        CommonEvents.clickButton(userActiveField);
        CommonEvents.clickButton(saveUserBtn);
        System.out.println("================= User Form Filled ===================");
    }
}
