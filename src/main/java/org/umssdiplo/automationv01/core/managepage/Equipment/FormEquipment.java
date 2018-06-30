package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormEquipment extends BasePage {

    @FindBy(id = "newEquipment")
    private WebElement buttonNewEquipment;

    @FindBy(id = "nombreEquipment")
    private WebElement inputEquipmentName;

    @FindBy(id= "typeEquipment")
    private WebElement selectEquipmentType;

    @FindBy(id="descEquipment")
    private WebElement textAreaEquipmentDesc;

    @FindBy(id="imageEquipment")
    private WebElement fileEquipmentImage;

    public FormEquipment() {
        CommonEvents.isVisible(buttonNewEquipment);
    }

    public boolean verifyInputNameFormIsVisible() {
        return CommonEvents.isVisible(inputEquipmentName);
    }

    public boolean verifySelectTypeFormIsVisible() {
        return CommonEvents.isVisible(selectEquipmentType);
    }

    public boolean verifyInputDescriptionFormIsVisible() {
        return CommonEvents.isVisible(textAreaEquipmentDesc);
    }

    public boolean verifyInputImageFormIsVisible() {
        return CommonEvents.isVisible(fileEquipmentImage);
    }



}
