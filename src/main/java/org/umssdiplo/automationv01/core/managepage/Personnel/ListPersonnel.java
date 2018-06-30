package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListPersonnel extends BasePage {

    @FindBy(css = ".mat-header-row.ng-star-inserted")
    private WebElement tableListPersonnel;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Nombre')]")
    private WebElement tableListPersonnelName;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Apellido')]")
    private WebElement tableListPersonnelLastName;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Email')]")
    private WebElement tableListPersonnelEmail;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Direccion')]")
    private WebElement tableListPersonnelAddress;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Telefono')]")
    private WebElement tableListPersonnelPhone;

    @FindBy(xpath = "//button[@class='mat-sort-header-button'][contains(text(),'Accion')]")
    private WebElement tableListPersonnelAction;

    public ListPersonnel() {
        CommonEvents.isVisible(tableListPersonnel);
    }

    public boolean validateListPersonnel() {
        return CommonEvents.isVisible(tableListPersonnel);
    }

    public boolean validateName() {
        return CommonEvents.isVisible(tableListPersonnelName);
    }

    public boolean validateLastName() {
        return CommonEvents.isVisible(tableListPersonnelLastName);
    }

    public boolean validateEmail() {
        return CommonEvents.isVisible(tableListPersonnelEmail);
    }

    public boolean validateAddress() {
        return CommonEvents.isVisible(tableListPersonnelAddress);
    }

    public boolean validatePhone() {
        return CommonEvents.isVisible(tableListPersonnelPhone);
    }

    public boolean validateAction() {
        return CommonEvents.isVisible(tableListPersonnelAction);
    }
}
