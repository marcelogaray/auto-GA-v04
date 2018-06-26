package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormEquipment extends BasePage {

    @FindBy(id = "newEquipment")
    private WebElement newEquipmentBtn;

    @FindBy(id = "nombreEquipment")
    private WebElement equipmentName;

    @FindBy(id= "typeEquipment")
    private WebElement equipmentType;

    @FindBy(id="mat-option-1")
    private WebElement equipmentSelectType;

    @FindBy(id="descEquipment")
    private WebElement equipmentDesc;

    @FindBy(id="imageEquipment")
    private WebElement equipmentImage;

    @FindBy(xpath = "//*[@id=\"form\"]/p[4]/button")
    private WebElement createBtn;

    //Message component required
    @FindBy(id="mat-hint-0")
    private WebElement requiredName;

    @FindBy(id="mat-hint-1")
    private WebElement requiredType;

    @FindBy(id="mat-hint-2")
    private WebElement requiredDesc;

    public FormEquipment() {
        CommonEvents.isVisible(newEquipmentBtn);
    }

    public void activeCheckRequiredField() {
        CommonEvents.clickButton(equipmentName);
        CommonEvents.clickButton(equipmentDesc);
        CommonEvents.clickButton(createBtn);
    }

    public boolean checkRequiredsForm() {
       return checkRequiredName() && checkRequiredDesc();
    }

    private boolean checkRequiredName() {
       return CommonEvents.isVisible(requiredName);
    }

    private boolean checkRequiredType() {
       return CommonEvents.isVisible(requiredType);
    }

    private boolean checkRequiredDesc() {
       return CommonEvents.isVisible(requiredDesc);
    }
}
