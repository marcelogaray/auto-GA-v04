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
}