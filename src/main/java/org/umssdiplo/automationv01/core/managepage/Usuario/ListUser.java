package org.umssdiplo.automationv01.core.managepage.Usuario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListUser extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Agregar Nuevo Usuario')]")
    private WebElement buttonAddUser;

    @FindBy(xpath = "//div/div[contains(text(),'Items per page:')]")
    private WebElement paginElement;

    @FindBy(xpath = "//mat-table[@class='mat-table']")
    private WebElement tableListUser;

    public ListUser() {
        CommonEvents.isVisible(buttonAddUser);
    }

    public boolean isUserListVisible() {
        return CommonEvents.isVisible(tableListUser);
    }

    public void clickButtonAddNewUser() {
        CommonEvents.clickButton(buttonAddUser);
    }

    public FormUser isFormUserVisible() {
        return new FormUser();
    }

    public void clickAddNewUser() {
        CommonEvents.clickButton(buttonAddUser);
    }
}