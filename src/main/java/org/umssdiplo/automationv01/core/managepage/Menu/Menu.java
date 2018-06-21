package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Menu extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuStructure;

    @FindBy(id = "menuProgramSSO")
    private WebElement menuProgramaSSO;

    public Menu() {
        CommonEvents.isVisible(menuStructure);
    }

    public SubMenuOrganizationalStructure clickMenuOrganizationalStructure() {
        CommonEvents.clickButton(menuStructure);
        return new SubMenuOrganizationalStructure();
    }

    public SubMenuProgramSSO clickMenuProgramSSO(){
        CommonEvents.clickButton(menuProgramaSSO);
        return new SubMenuProgramSSO();
    }
}