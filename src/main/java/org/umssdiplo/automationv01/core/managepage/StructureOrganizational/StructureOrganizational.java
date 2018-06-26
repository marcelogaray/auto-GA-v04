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

    public boolean validButtonDepartments() {
        return CommonEvents.isVisible(buttonDepartments);
    }

    public boolean validButtonPositions() {
        return CommonEvents.isVisible(buttonPositions);
    }

    public boolean validButtonAreas() {
        return CommonEvents.isVisible(buttonAreas);
    }

    public boolean validTreeDepartments() { return CommonEvents.isVisible(treeDepartments); }

    public boolean validTreePositions() {
        return CommonEvents.isVisible(treePositions);
    }

    public boolean validTreeAreas() { return CommonEvents.isVisible(treeAreas); }
}