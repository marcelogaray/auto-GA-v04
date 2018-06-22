package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Incident.IncidentPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Menu extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuStructure;

    @FindBy(id = "menuPersonal")
    private WebElement menuPersonal;

    @FindBy(id= "incident-lnk")
    private WebElement menuIncident;

    @FindBy(id = "menuEquipament")
    private WebElement nemuEquipament;

    public Menu() {
        CommonEvents.isVisible(menuPersonal);
    }

    public SubMenuOrganizationalStructure clickMenuOrganizationalStructure() {
        CommonEvents.clickButton(menuStructure);
        return new SubMenuOrganizationalStructure();
    }

    public SubMenuPersonal selectPersonalSubMenu() {
        CommonEvents.clickButton(menuPersonal);
        return new SubMenuPersonal();
    }

    public IncidentPage clickMenuIncident() {
        CommonEvents.clickButton(menuIncident);
        return new IncidentPage();
    }
    public SubMenuEquipment selectEquipmentMenu() {
        CommonEvents.clickButton(nemuEquipament);
        return new SubMenuEquipment();
    }

    public SubMenuPersonalContract selectPersonalSubMenuContract() {
        CommonEvents.clickButton(menuPersonal);
        return new SubMenuPersonalContract();
    }
}