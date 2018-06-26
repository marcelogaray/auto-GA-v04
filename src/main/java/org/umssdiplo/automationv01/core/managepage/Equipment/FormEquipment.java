package org.umssdiplo.automationv01.core.managepage.Equipment;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;

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


    public void createNewEquipmentDataTable(DataTable equipmentTable) {
        List<Equipment> equipments = new ArrayList<>();
        equipments = equipmentTable.asList(Equipment.class);
        fillNewEquipment(equipments.get(0));
    }

    private void fillNewEquipment(Equipment equipment) {
        setDataEquipmentNameInputField(equipment.getEquipmentName());
        setDataEquipmentTypeOption(equipment.getEquipmentType());
        setDataEquipmentDescArea(equipment.getEquipmentDesc());
        setDataEquipmentImageFile(equipment.getEquipmentImage());
        saveEquipmentButton();
    }

    private void setDataEquipmentNameInputField(String nameEquipment) {
        CommonEvents.setInputField(equipmentName, nameEquipment);
    }

    private void setDataEquipmentTypeOption(String typeEquipment) {
        CommonEvents.clickButton(equipmentType);
        if(typeEquipment.equalsIgnoreCase("equipo")) {
            CommonEvents.clickButton(equipmentSelectType);
        }

    }

    private void setDataEquipmentDescArea(String descEquipment) {
        CommonEvents.setInputField(equipmentDesc, descEquipment);
    }

    private void setDataEquipmentImageFile(String imageEquipment) {
        CommonEvents.setInputField(equipmentImage, imageEquipment);
    }

    private void saveEquipmentButton() {
        CommonEvents.clickButton(newEquipmentBtn);
    }
}
