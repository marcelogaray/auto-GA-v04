package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Menu extends BasePage {
    @FindBy(id = "menuHome")
    private WebElement menuHome;

    @FindBy(id = "menuAudit")
    private WebElement menuAudit;

    @FindBy(id = "menuPersonal")
    private WebElement menuPersonal;

    @FindBy(id = "personal")
    private WebElement subMenuPersonal;

    @FindBy(id = "smAssign")
    private WebElement subMenuAssign;

    @FindBy(id = "smContract")
    private WebElement subMenuContract;

    @FindBy(id = "users")
    private WebElement subMenuUsers;

    @FindBy(id = "menuIncidents")
    private WebElement menuIncidents;

    @FindBy(id = "menuEquipament")
    private WebElement menuEquipament;

    @FindBy(id = "smEquipament")
    private WebElement subMenuEquipament;

    @FindBy(id = "smInventory")
    private WebElement subMenuInventory;

    @FindBy(id = "smKardex")
    private WebElement subMenuKardex;

    @FindBy(id = "menuProgramSSO")
    private WebElement menuProgramSSO;

    @FindBy(id = "smTrainers")
    private WebElement subMenuTrainers;

    @FindBy(id = "smPrograms")
    private WebElement subMenuPrograms;

    @FindBy(id = "smActivities")
    private WebElement subMenuActivities;

    @FindBy(id = "smResources")
    private WebElement subMenuResources;

    @FindBy(id = "menuStructure")
    private WebElement menuStructure;

    @FindBy(id = "smOrganizationalStructure")
    private WebElement subMenuOrganizationalStructure;

    @FindBy(id = "smDepartments")
    private WebElement subMenuDepartments;

    @FindBy(id = "smPositions")
    private WebElement subMenuPositions;

    @FindBy(id = "smAreas")
    private WebElement subMenuAreas;

    @FindBy(id = "smFunctions")
    private WebElement subMenuFunctions;

    @FindBy(id = "smRequirements")
    private WebElement subMenuRequirements;

    @FindBy(id = "menuReports")
    private WebElement menuReports;

    @FindBy(id = "smRepETL")
    private WebElement subMenuReporteETL;

    @FindBy(id = "smRepPositions")
    private WebElement subMenuReportPositions;

    @FindBy(id = "smRepManualFunctions")
    private WebElement subMenuRepManualFunctions;

    @FindBy(id = "smRepPersonal")
    private WebElement subMenuRepPersonal;

    @FindBy(id = "smRepAccidents")
    private WebElement subMenuRepAccidents;

    @FindBy(id = "smRepIPERC")
    private WebElement subMenuRepIPERC;

    @FindBy(id = "smRepProgramSSO")
    private WebElement subMenuRepProgramSSO;

    @FindBy(id = "smRepResources")
    private WebElement subMenuRepResources;

    @FindBy(id = "smRepEquipments")
    private WebElement subMenuRepEquipments;

    @FindBy(id = "smRepIntentory")
    private WebElement subMenuRepInventory;

    public void clickMenuHome() {
        CommonEvents.clickButton(menuHome);
    }

    public void clickMenuAudit() {
        CommonEvents.clickButton(menuAudit);
    }

    public void clickMenuPersonal() {
        CommonEvents.clickButton(menuPersonal);
    }

    public void clickSubMenuPersonal() {
        CommonEvents.clickButton(subMenuPersonal);
    }

    public void clickSubMenuAssignment() {
        CommonEvents.clickButton(subMenuAssign);
    }

    public void clickSubMenuContract() {
        CommonEvents.clickButton(subMenuContract);
    }

    public void clickSubMenu() {
        CommonEvents.clickButton(subMenuUsers);
    }

    public void clickMenuIncidents() {
        CommonEvents.clickButton(menuIncidents);
    }

    public void clickMenuEquipament() {
        CommonEvents.clickButton(menuEquipament);
    }

    public void clickSubMenuEquipament() {
        CommonEvents.clickButton(subMenuEquipament);
    }

    public void clickSubMenuInventory() {
        CommonEvents.clickButton(subMenuInventory);
    }

    public void clickSubMenuKardex() {
        CommonEvents.clickButton(subMenuKardex);
    }

    public void clickMenuProgramSSO() {
        CommonEvents.clickButton(menuProgramSSO);
    }

    public void clickSubMenuTrainers() {
        CommonEvents.clickButton(subMenuTrainers);
    }

    public void clickSubMenuPrograms() {
        CommonEvents.clickButton(subMenuPrograms);
    }

    public void clickSubMenuActivities() {
        CommonEvents.clickButton(subMenuActivities);
    }

    public void clickSubMenuResources() {
        CommonEvents.clickButton(subMenuResources);
    }

    public void clickMenuOrganizationalStructure() {
        CommonEvents.clickButton(menuStructure);
    }

    public void clickSubMenuOrganizationalStructure() {
        CommonEvents.clickButton(subMenuOrganizationalStructure);
    }

    public void clickSubMenuDepartments() {
        CommonEvents.clickButton(subMenuDepartments);
    }

    public void clickSubMenuPositions() {
        CommonEvents.clickButton(subMenuPositions);
    }

    public void clickSubMenuAreas() {
        CommonEvents.clickButton(subMenuAreas);
    }

    public void clickSubMenuFunctions() {
        CommonEvents.clickButton(subMenuFunctions);
    }

    public void clickSubMenuRequirements() {
        CommonEvents.clickButton(subMenuRequirements);
    }

    public void clickMenuReports() {
        CommonEvents.clickButton(menuReports);
    }

    public void clickSubMenuReportETL() {
        CommonEvents.clickButton(subMenuReporteETL);
    }

    public void clickSubMenuReportPosition() {
        CommonEvents.clickButton(subMenuReportPositions);
    }

    public void clickSubMenuReportManualFunctions() {
        CommonEvents.clickButton(subMenuRepManualFunctions);
    }

    public void clickSubMenuReportPersonal() {
        CommonEvents.clickButton(subMenuRepPersonal);
    }

    public void clickSubMenuReportAccident() {
        CommonEvents.clickButton(subMenuRepAccidents);
    }

    public void clickSubMenuReportIPERC() {
        CommonEvents.clickButton(subMenuRepIPERC);
    }

    public void clickSubMenuReportProgramSSO() {
        CommonEvents.clickButton(subMenuRepProgramSSO);
    }

    public void clickSubMenuReportResources() {
        CommonEvents.clickButton(subMenuRepResources);
    }

    public void clickSubMenuReportEquipament() {
        CommonEvents.clickButton(subMenuRepEquipments);
    }

    public void clickSubMenuReportInventory() {
        CommonEvents.clickButton(subMenuRepInventory);
    }
}