package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.Usuario;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MenuPersonal extends BasePage {

    @FindBy(id = "users")
    private WebElement usuarioSubMenu;

    public MenuPersonal() {
        CommonEvents.isVisible(usuarioSubMenu);
    }

    public Usuario selectSubMenuUsuario() {
        CommonEvents.clickButton(usuarioSubMenu);
        return new Usuario();
    }
}
