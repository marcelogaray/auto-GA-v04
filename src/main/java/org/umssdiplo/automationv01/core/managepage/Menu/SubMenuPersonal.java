package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(xpath = "//button[@id='users']")
    private WebElement usuarioSubMenu;

    public SubMenuPersonal() {
        CommonEvents.isVisible(usuarioSubMenu);
    }

    public ListUser selectSubMenuUsuario() {
        CommonEvents.clickButton(usuarioSubMenu);
        return new ListUser();
    }
}
