package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListEquipment extends BasePage {

    @FindBy(id = "crearEquipment")
    private WebElement btnCrearEquipment;

    @FindBy(className = "mat-table")
    private WebElement tableEquipments;

    public ListEquipment() {
        CommonEvents.isVisible(btnCrearEquipment);
    }

    public boolean isEquipmentListVisible() {
        return CommonEvents.isVisible(tableEquipments);
    }

    public void createNewEquipment() {
        CommonEvents.clickButton(btnCrearEquipment);
    }

    public FormEquipment isFormEquipmentVisible() {
        return new FormEquipment();
    }
}
