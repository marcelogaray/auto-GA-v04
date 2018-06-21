package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Menu extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuStructure;

    @FindBy(id = "menuPersonal")
    private WebElement menuPersonal;

    public Menu() {
        CommonEvents.isVisible(menuPersonal);
        CommonEvents.isVisible(menuStructure);
    }

    public SubMenuOrganizationalStructure clickMenuOrganizationalStructure() {
        CommonEvents.clickButton(menuStructure);
        return new SubMenuOrganizationalStructure();
    }

    public SubMenuPersonal selectPersonalSubMenu() {
        CommonEvents.clickButton(menuPersonal);
        return new SubMenuPersonal();
    }
}