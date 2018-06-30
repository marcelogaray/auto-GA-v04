package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListEquipment extends BasePage {

    @FindBy(id = "crearEquipment")
    private WebElement buttonCreateEquipment;

    @FindBy(className = "mat-table")
    private WebElement tableEquipments;

    @FindBy(xpath = "//mat-header-cell[contains(text(),'Nombre')]")
    private WebElement columnListName;

    @FindBy(xpath = "//mat-header-cell[contains(text(),'Acciones')]")
    private WebElement columnListAction;

    @FindBy(xpath = "//mat-cell[2]/a[1]")
    private WebElement buttonViewEquipment;

    public ListEquipment() {
        CommonEvents.isVisible(buttonCreateEquipment);
    }

    public boolean isEquipmentListVisible() {
        return CommonEvents.isVisible(tableEquipments);
    }

    public boolean verifyNameHeaderListEquipmentIsVisible() {
        return CommonEvents.isVisible(columnListName);
    }

    public boolean verifyActionsHeaderListEquipmentIsVisible() {
        return CommonEvents.isVisible(columnListAction);
    }

    public void clickButtonCreateEquipment() {
        CommonEvents.clickButton(buttonCreateEquipment);
    }

    public FormEquipment isFormEquipmentVisible() {
        return new FormEquipment();
    }

    public void clickbuttonViewEquipment() {
        CommonEvents.clickButton(buttonViewEquipment);
    }

    public EquipmentDetail isEquipmentDetailVisible() {
        return new EquipmentDetail();
    }
}
