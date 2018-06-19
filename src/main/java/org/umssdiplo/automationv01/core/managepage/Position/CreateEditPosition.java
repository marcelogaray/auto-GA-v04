package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class CreateEditPosition extends BasePage {
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

    public void setCreateDataForm(String name, String level, String description) {
        CommonEvents.setInputField(fieldName, name);
        System.out.println("Set Name: " + name + ".\n");
        CommonEvents.setInputField(fieldLevel, level);
        System.out.println("Set Level: " + level + ".\n");
        CommonEvents.setInputField(fieldDescription, description);
        System.out.println("Set Description: " + description + ".\n");
    }

    public void clickDropdownParentPosition() {
        CommonEvents.isVisible(dropDownParent);
        CommonEvents.clickButton(dropDownParent);
        System.out.println("select parent position.\n");
        clickOptionParentPosition();
    }

    public void clickOptionParentPosition() {
        if (optsParentPosition != null) {
            WebElement option = optsParentPosition.get(0);
            CommonEvents.clickButton(option);
            System.out.println("select option parent position.\n");
        } else {
            System.out.println("Not exist a parent position.\n");
        }
    }

    public void clickSavePositions() {
        CommonEvents.clickButton(buttonSavePosition);
        System.out.println("Click on button Save position.\n");
    }

    public void setEditDataForm(String description) {
        CommonEvents.setInputField(fieldDescription, fieldDescription.getText() + ". " + description);
        System.out.println("Set Description: " + description + ".\n");
    }
}