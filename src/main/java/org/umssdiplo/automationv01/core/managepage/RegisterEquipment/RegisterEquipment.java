package org.umssdiplo.automationv01.core.managepage.RegisterEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class RegisterEquipment extends BasePage {

    @FindBy(id = "menuEquipament")
    private WebElement equipMenu;

    @FindBy(id = "smEquipament")
    private WebElement equiSubMenu;

    @FindBy(id = "crearEquipment")
    private WebElement crearEquipment;

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

    @FindBy(id="newEquipment")
    private WebElement createBtn;

    public void registerEquipment() {
        String equiName = PropertyAccessor.getInstance().getEquiName();
        String equiDesc = PropertyAccessor.getInstance().getEquiDesc();
        String equiImage = PropertyAccessor.getInstance().getEquiImage();
        CommonEvents.clickButton(equipMenu);
        CommonEvents.clickButton(equiSubMenu);
        CommonEvents.clickButton(crearEquipment);
        CommonEvents.setInputField(equipmentName, equiName);
        CommonEvents.clickButton(equipmentType);
        CommonEvents.clickButton(equipmentSelectType);
        CommonEvents.setInputField(equipmentDesc, equiDesc);
        CommonEvents.clickButton(equipmentImage);
        equipmentImage.sendKeys(equiImage);
        CommonEvents.clickButton(createBtn);
    }
}
