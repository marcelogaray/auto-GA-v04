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
    private WebElement buttonAddUser;

    @FindBy(className = "mat-column-UserName")
    private WebElement tableCellColumnUserName;

    @FindBy(xpath = "//mat-table[@class='mat-table']")
    private WebElement tableListUser;

    @FindBy(id = "mat-input-2")
    private WebElement textFieldSearch;

    @FindBy(className = "mat-paginator-navigation-next")
    private WebElement buttonNextPagination;

    @FindBy(className = "mat-paginator-navigation-previous")
    private WebElement buttonPreviousPagination;

    public ListUser() {
        CommonEvents.isVisible(buttonAddUser);
    }

    public boolean isUserListVisible() {
        return CommonEvents.isVisible(tableCellColumnUserName);
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

    public void fillFieldSearchWithData(DataTable searchUserTable) {
        List<User> users = new ArrayList<>();
        users = searchUserTable.asList(User.class);
        for (User user : users) {
            fillFieldSearch(user);
        }
    }

    private void fillFieldSearch(User user) {
        CommonEvents.setInputField(textFieldSearch, user.getUsername());
    }

    public void clickButtonNext() {
        CommonEvents.clickButton(buttonNextPagination);
    }

    public void clickButtonPrevious() {
        CommonEvents.clickButton(buttonPreviousPagination);
    }
}