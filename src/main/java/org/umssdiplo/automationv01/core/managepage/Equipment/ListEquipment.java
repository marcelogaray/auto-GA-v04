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

    @FindBy(xpath = "//mat-cell[2]/a[1]")
    private WebElement buttonViewEquipment;

    public ListEquipment() {
        CommonEvents.isVisible(buttonCreateEquipment);
    }

    public boolean isEquipmentListVisible() {
        return CommonEvents.isVisible(tableEquipments);
    }

    public void clickbuttonViewEquipment() {
        CommonEvents.clickButton(buttonViewEquipment);
    }

    public EquipmentDetail isEquipmentDetailVisible() {
        return new EquipmentDetail();
    }
}
