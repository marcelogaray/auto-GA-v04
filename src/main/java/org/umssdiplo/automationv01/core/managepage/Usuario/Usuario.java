package org.umssdiplo.automationv01.core.managepage.Usuario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Usuario extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Agregar Nuevo Usuario')]")
    private WebElement btnAgregarUsuari;

    public Usuario() {
        CommonEvents.isVisible(btnAgregarUsuari);
    }
}