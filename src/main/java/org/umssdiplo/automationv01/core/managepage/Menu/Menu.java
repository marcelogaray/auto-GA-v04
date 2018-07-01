package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;

public class Menu extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuStructure;

    @FindBy(id = "menuPersonal")
    private WebElement menuPersonal;

    @FindBy(id = "incident-lnk")
    private WebElement menuIncident;

    @FindBy(id = "menuEquipament")
    private WebElement menuEquipament;

    @FindBy(id = "menuProgramSSO")
    private WebElement menuProgramaSSO;

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

    public SubMenuProgramSSO clickMenuProgramSSO() {
        CommonEvents.clickButton(menuProgramaSSO);
        return new SubMenuProgramSSO();
    }

    public IncidentPage clickMenuIncident() {
        CommonEvents.clickButton(menuIncident);
        return new IncidentPage();
    }

    public SubMenuEquipment selectEquipmentMenu() {
        CommonEvents.clickButton(menuEquipament);
        return new SubMenuEquipment();
    }

    public SubMenuPersonalContract selectSubMenuPersonalContract() {
        CommonEvents.clickButton(menuPersonal);
        return new SubMenuPersonalContract();
    }
}