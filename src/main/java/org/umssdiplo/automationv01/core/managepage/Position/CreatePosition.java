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

    public CreatePosition() {
        CommonEvents.isVisible(title);
    }

    public boolean validFieldName() {
        return CommonEvents.isVisible(fieldName);
    }

    public boolean validFieldLevel() {
        return CommonEvents.isVisible(fieldLevel);
    }

    public boolean validFieldDescription() {
        return CommonEvents.isVisible(fieldDescription);
    }

    public boolean validDropdownParentPosition() {
        return CommonEvents.isVisible(dropdownParentPosition);
    }

    public boolean validButtonBack() { return CommonEvents.isVisible(buttonBack); }

    public Position clickButtonBack() {
        CommonEvents.clickButton(buttonBack);
        return new Position();
    }
}
