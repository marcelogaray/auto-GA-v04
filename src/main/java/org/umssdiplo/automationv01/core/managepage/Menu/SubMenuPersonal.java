package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(xpath = "//button[@id='users']")
    private WebElement usuarioSubMenu;

    @FindBy(xpath = "//button[@id='personal']")
    private WebElement personalSubMenu;

    public SubMenuPersonal() {
        CommonEvents.isVisible(usuarioSubMenu);
    }

    public ListUser selectSubMenuUsuario() {
        CommonEvents.clickButton(usuarioSubMenu);
        return new ListUser();
    }

    public void seleccionarSubMenuPersonal(){
        CommonEvents.clickButton(personalSubMenu);
    }
}
