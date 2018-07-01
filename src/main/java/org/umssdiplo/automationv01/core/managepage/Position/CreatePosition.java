package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreatePosition extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Crear nuevo Cargo')]")
    private WebElement title;

    @FindBy(name = "fieldName")
    private WebElement fieldName;

    @FindBy(name = "fieldLevel")
    private WebElement fieldLevel;

    @FindBy(name = "fieldDescription")
    private WebElement fieldDescription;

    @FindBy(id = "selParentPosition")
    private WebElement dropdownParentPosition;

    @FindBy(id = "btnPositions")
    private WebElement buttonBack;

    @FindBy(id = "buttonSavePosition")
    private WebElement buttonSend;

    public CreatePosition() {
        CommonEvents.isVisible(title);
    }

    public boolean validFieldNameIsVisible() {
        return CommonEvents.isVisible(fieldName);
    }

    public boolean validFieldLevelIsVisible() {
        return CommonEvents.isVisible(fieldLevel);
    }

    public boolean validFieldDescriptionIsVisible() {
        return CommonEvents.isVisible(fieldDescription);
    }

    public boolean validDropdownParentPositionIsVisible() {
        return CommonEvents.isVisible(dropdownParentPosition);
    }

    public boolean validateButtonBackIsVisible() { return CommonEvents.isVisible(buttonBack); }

    public Position clickButtonBack() {
        CommonEvents.clickButton(buttonBack);
        return new Position();
    }

    public boolean validateButtonSendIsEnabled() { return CommonEvents.isEnabled(buttonSend); }

    public boolean validateButtonSendIsVisible() { return CommonEvents.isVisible(buttonBack); }

    public boolean validateFormCreatePositionIsEmpty() {
        boolean result = true;

        if (!CommonEvents.isInputEmpty(fieldName)) {
            result = false;
        }

        if (!CommonEvents.isInputEmpty(fieldLevel)) {
            result = false;
        }

        if (!CommonEvents.isInputEmpty(fieldDescription)) {
            result = false;
        }

        return result;
    }
}