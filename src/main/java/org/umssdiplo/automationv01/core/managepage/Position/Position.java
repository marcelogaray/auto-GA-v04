package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Position extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuOrganizationalStructure;

    @FindBy(id = "smPositions")
    private WebElement menuPosition;

    @FindBy(xpath = "//h1[contains(text(), 'Cargos de la empresa')]")
    private WebElement page;

    @FindBy(name = "tblPositions")
    private WebElement table;

    @FindBy(xpath = "//mat-paginator")
    private WebElement paginator;

    @FindBy(id = "btnCreatePosition")
    private WebElement buttonCreatePosition;

    @FindBy(name = "fieldName")
    private WebElement fieldName;

    @FindBy(name = "fieldLevel")
    private WebElement fieldLevel;

    @FindBy(name = "fieldDescription")
    private WebElement fieldDescription;

    @FindBy(xpath = "//mat-select")
    private WebElement dropDownParent;

    @FindBy(xpath = "//mat-option")
    private List<WebElement> optsParentPosition;

    @FindBy(id = "buttonSavePosition")
    private WebElement buttonSavePosition;

    public void clickOrganizationalStructure() {
        CommonEvents.clickButton(menuOrganizationalStructure);
        System.out.println("Select the option structure organizational in menu.\n");
    }

    public void clickPositions() {
        CommonEvents.clickButton(menuPosition);
        System.out.println("Select the option Positions in sub menu.\n");
    }

    public void validatePagePosition() {
        CommonEvents.isVisible(page);
        System.out.println("The page of Organizational structure - Position is Displayed.\n");
    }

    public void listPositions() {
        CommonEvents.isVisible(table);
        System.out.println("The table of list Positions is Displayed.\n");
    }

    public void validPaginator() {
        CommonEvents.isPresent(paginator);
        System.out.println("The list positions have paginator.\n");
    }

    public void clickCreatePositions() {
        //CommonEvents.isVisible(buttonCreatePosition);
        CommonEvents.clickButton(buttonCreatePosition);
        System.out.println("Click on button create Position.\n");
    }

    public void setCreateDataForm(String name, String level, String description) {
        CommonEvents.setInputField(fieldName, name);
        System.out.println("Set Name: " + name + ".\n");
        CommonEvents.setInputField(fieldLevel, level);
        System.out.println("Set Level: " + level + ".\n");
        CommonEvents.setInputField(fieldDescription, description);
        System.out.println("Set Description: " + description + ".\n");
    }

    public void clickDropdownParentPosition(){
        CommonEvents.isVisible(dropDownParent);
        CommonEvents.clickButton(dropDownParent);
        System.out.println("select parent position.\n");
        clickOptionParentPosition();
    }

    public void clickOptionParentPosition(){
        if(optsParentPosition != null){
            WebElement option = optsParentPosition.get(0);
            CommonEvents.clickButton(option);
            System.out.println("select option parent position.\n");
        } else {
            System.out.println("Not exist a parent position.\n");
        }
    }

    public void clickSavePositions() {
        //CommonEvents.isVisible(buttonSavePosition);
        CommonEvents.clickButton(buttonSavePosition);
        System.out.println("Click on button Save position.\n");
    }
}
