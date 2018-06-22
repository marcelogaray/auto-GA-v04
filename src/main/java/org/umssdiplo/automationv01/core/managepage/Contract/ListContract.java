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

    public ListContract() {
        CommonEvents.isVisible(btnAgregarUsuario);
    }

    public boolean isContractListVisible() {
        return CommonEvents.isVisible(paginElement);
    }
}