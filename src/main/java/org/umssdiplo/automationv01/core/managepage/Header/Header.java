package org.umssdiplo.automationv01.core.managepage.Header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Header extends BasePage {

    @FindBy(id = "menuPersonal")
    private WebElement personalMenu;

    public Header() {
        CommonEvents.isVisible(personalMenu);
    }

    public MenuPersonal selectPersonalMenu() {
        CommonEvents.clickButton(personalMenu);
        return new MenuPersonal();
    }
}