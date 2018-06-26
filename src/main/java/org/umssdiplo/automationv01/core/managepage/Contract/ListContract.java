package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListContract extends BasePage {

    @FindBy(id = "ContractTable")
    private WebElement paginElement;

    @FindBy(id = "btnAgregarContrato")
    private WebElement btnAgregarContrato;

    @FindBy(id = "editarContract")
    private WebElement btnEditar;

    @FindBy(id = "eliminarContract")
    private WebElement btnEliminar;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-next mat-icon-button']")
    private WebElement btnSig;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-previous mat-icon-button']")
    private WebElement btnAnt;

    public ListContract() {
        CommonEvents.isVisible(btnAgregarContrato);
    }

    public boolean isContractListVisible() {
        return CommonEvents.isVisible(paginElement);
    }

    public FormContract seleccionarBoton() {
        CommonEvents.clickButton(btnAgregarContrato);
        return new FormContract();
    }
    public FormContract btnEditar() {
        CommonEvents.clickButton(btnEditar);
        return new FormContract();
    }

    public FormContract btnEliminar() {
        CommonEvents.clickButton(btnEliminar);
        return new FormContract();
    }

    public void seleccionSiguiente(){
        CommonEvents.clickButton(btnSig);
    }

    public void seleccionAnterior(){
        CommonEvents.clickButton(btnAnt);
    }

}