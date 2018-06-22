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

    @FindBy(id = "incident-lnk")
    private WebElement menuIncident;

    @FindBy(id = "menuProgramSSO")
    private WebElement menuProgramaSSO;

    @FindBy(id= "incident-lnk")
    private WebElement menuIncident;


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

    public SubMenuProgramSSO clickProgramSSOMenu(){
        CommonEvents.clickButton(menuProgramaSSO);
        return new SubMenuProgramSSO();

    public IncidentPage clickMenuIncident() {
        CommonEvents.clickButton(menuIncident);
        return new IncidentPage();
    }

    public SubMenuProgramSSO clickProgramSSOMenu(){
        CommonEvents.clickButton(menuProgramaSSO);
        return new SubMenuProgramSSO();
    }
}