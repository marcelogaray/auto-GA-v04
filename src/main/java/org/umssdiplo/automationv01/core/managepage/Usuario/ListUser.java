package org.umssdiplo.automationv01.core.managepage.Usuario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListUser extends BasePage {

    @FindBy(xpath = "//button/span[contains(text(),'Agregar Nuevo Usuario')]")
    private WebElement btnAgregarUsuario;

    @FindBy(xpath = "//div/div[contains(text(),'Items per page:')]")
    private WebElement paginElement;

    public ListUser() {
        CommonEvents.isVisible(btnAgregarUsuario);
    }

    public boolean isUserListVisible() {
        return CommonEvents.isVisible(paginElement);
    }
}