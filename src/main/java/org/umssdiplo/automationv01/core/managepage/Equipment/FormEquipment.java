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
    private WebElement buttonNewEquipment;

    @FindBy(id = "nombreEquipment")
    private WebElement inputEquipmentName;

    @FindBy(id= "typeEquipment")
    private WebElement selectEquipmentType;

    @FindBy(id="mat-option-1")
    private WebElement optionEquipmentType;

    @FindBy(id="descEquipment")
    private WebElement textAreaEquipmentDesc;

    @FindBy(id="imageEquipment")
    private WebElement fileEquipmentImage;

    public FormEquipment() {
        CommonEvents.isVisible(buttonNewEquipment);
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
        CommonEvents.setInputField(inputEquipmentName, nameEquipment);
    }

    private void setDataEquipmentTypeOption(String typeEquipment) {
        CommonEvents.clickButton(selectEquipmentType);
        if(typeEquipment.equalsIgnoreCase("equipo")) {
            CommonEvents.clickButton(optionEquipmentType);
        }

    }

    private void setDataEquipmentDescArea(String descEquipment) {
        CommonEvents.setInputField(textAreaEquipmentDesc, descEquipment);
    }

    private void setDataEquipmentImageFile(String imageEquipment) {
        CommonEvents.setInputField(fileEquipmentImage, imageEquipment);
    }

    private void saveEquipmentButton() {
        CommonEvents.clickButton(buttonNewEquipment);
    }
}
