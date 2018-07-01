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

    @FindBy(xpath = "//mat-cell[@class='mat-cell cdk-column-UserName mat-column-UserName ng-star-inserted']")
    private WebElement tableCellColumnUserName;

    @FindBy(id = "mat-input-2")
    private WebElement textSearchField;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-next mat-icon-button']")
    private WebElement btnNextPagination;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-previous mat-icon-button']")
    private WebElement btnPreviusPagination;

    public ListUser() {
        CommonEvents.isVisible(btnAgregarUsuario);
    }

    public boolean  isUserListVisible() {
        return CommonEvents.isVisible(tableCellColumnUserName);
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

    public void clickOnNextButton() {
        CommonEvents.clickButton(btnNextPagination);
    }

    public void clickOnPreviusButton() {
        CommonEvents.clickButton(btnPreviusPagination);
    }
}