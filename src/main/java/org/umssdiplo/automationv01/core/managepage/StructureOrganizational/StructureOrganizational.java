package org.umssdiplo.automationv01.core.managepage.StructureOrganizational;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class StructureOrganizational extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Estructura organizacional')]")
    private WebElement title;

    @FindBy(id = "btnDepartments")
    private WebElement buttonDepartments;

    @FindBy(id = "btnPositions")
    private WebElement buttonPositions;

    @FindBy(id = "btnAreas")
    private WebElement buttonAreas;

    @FindBy(name = "divDepartments")
    private WebElement treeDepartments;

    @FindBy(name = "divPositions")
    private WebElement treePositions;

    @FindBy(name = "divAreas")
    private WebElement treeAreas;

    public StructureOrganizational() {
        CommonEvents.isVisible(title);
    }

    public boolean validateDepartmentsButtonIsVisible() {
        return CommonEvents.isVisible(buttonDepartments);
    }

    public boolean validatePositionsButtonIsVisible() {
        return CommonEvents.isVisible(buttonPositions);
    }

    public boolean validateAreasButtonIsVisible() {
        return CommonEvents.isVisible(buttonAreas);
    }

    public boolean validateDepartmentsTreeIsVisible() { return CommonEvents.isVisible(treeDepartments); }

    public boolean validatePositionsTreeIsVisible() {
        return CommonEvents.isVisible(treePositions);
    }

    public boolean validateAreasTreeIsVisible() { return CommonEvents.isVisible(treeAreas); }
}