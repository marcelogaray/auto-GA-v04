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

    public FormEquipment() {
        CommonEvents.isVisible(newEquipmentBtn);
    }

   public boolean checkFieldsForm() {
       return checkFieldName() && checkFieldType() && checkFieldDesc()&&checkFieldImage();
   }

    private boolean checkFieldName() {
       return CommonEvents.isVisible(equipmentName);
    }

    private boolean checkFieldType() {
       return CommonEvents.isVisible(equipmentType);
    }

    private boolean checkFieldDesc() {
       return CommonEvents.isVisible(equipmentDesc);
    }

    private boolean checkFieldImage() {
       return CommonEvents.isVisible(equipmentImage);
    }

}
