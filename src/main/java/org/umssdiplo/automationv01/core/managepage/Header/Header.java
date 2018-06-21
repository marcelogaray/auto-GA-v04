package org.umssdiplo.automationv01.core.managepage.Header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Header extends BasePage {

    @FindBy(id = "menuPersonal")
    private WebElement personalMenu;

    @FindBy(id = "users")
    private WebElement usuarioSubMenu;

    public Header() {
        CommonEvents.isVisible(personalMenu);
    }

    public void selectPersonalMenu() {
        if(CommonEvents.isVisible(personalMenu)){
            CommonEvents.clickButton(personalMenu);
        }else{
            System.out.println("No existe el menu personal");
        }

    }

    public void selectSubMenuUsuario() {
        CommonEvents.clickButton(usuarioSubMenu);
    }

}
