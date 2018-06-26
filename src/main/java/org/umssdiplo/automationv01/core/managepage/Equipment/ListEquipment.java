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

    @FindBy(xpath = "/html/body/ssi-root/ssi-equipment/div/div[3]/div/div/mat-table/mat-row[1]/mat-cell[2]/a[1]")
    private WebElement viewEquipmentBtn;

    public ListEquipment() {
        CommonEvents.isVisible(btnCrearEquipment);
    }

    public boolean isEquipmentListVisible() {
        return CommonEvents.isVisible(tableEquipments);
    }

    public void clickEquipmentViewBtn() {
        CommonEvents.clickButton(viewEquipmentBtn);
    }

    public ViewEquipment loadDetailEquipment() {
        return new ViewEquipment();
    }
}
