package org.umssdiplo.automationv01.core.managepage.Usuario;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;

public class ListUser extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Agregar Nuevo Usuario')]")
    private WebElement btnAgregarUsuario;

    @FindBy(xpath = "//div/div[contains(text(),'Items per page:')]")
    private WebElement paginElement;

    @FindBy(id = "mat-input-2")
    private WebElement textSearchField;

    public ListUser() {
        CommonEvents.isVisible(btnAgregarUsuario);
    }

    public boolean isUserListVisible() {
        return CommonEvents.isVisible(paginElement);
    }

    public void clickAddNewUser() {
        CommonEvents.clickButton(btnAgregarUsuario);
    }

    public FormUser isFormUserVisible() {
        return new FormUser();
    }

    public void fillSeachFildWithData(DataTable searchUserTable) {
        List<User> users = new ArrayList<>();
        users = searchUserTable.asList(User.class);
        for (User user: users) {
            fillSearchField(user);
        }
    }

    private void fillSearchField(User user) {
        CommonEvents.setInputField(textSearchField, user.getUsername());
    }
}