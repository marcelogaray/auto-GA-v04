package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListContract extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Agregar Nuevo Usuario')]")
    private WebElement btnAgregarUsuario;

    @FindBy(xpath = "//div/div[contains(text(),'Items per page:')]")
    private WebElement paginElement;

    @FindBy(xpath = "/html/body/ssi-root/ssi-contract/div/div/div[2]/button")
    private WebElement btnAgregarContrato;

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
}