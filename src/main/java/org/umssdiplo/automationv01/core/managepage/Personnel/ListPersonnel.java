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

    public boolean validateListPersonnelIsVisible() {
        return CommonEvents.isVisible(tableListPersonnel);
    }

    public boolean validateNameIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelName);
    }

    public boolean validateLastNameIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelLastName);
    }

    public boolean validateEmailIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelEmail);
    }

    public boolean validateAddressIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelAddress);
    }

    public boolean validatePhoneIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelPhone);
    }

    public boolean validateActionIsVisible() {
        return CommonEvents.isVisible(tableListPersonnelAction);
    }
}
