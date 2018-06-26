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

    @FindBy(xpath = "/html/body/ssi-root/ssi-equipment/div/div[3]/div/div/mat-table/mat-header-row/mat-header-cell[1]")
    private WebElement listNameRow;

    @FindBy(xpath = "/html/body/ssi-root/ssi-equipment/div/div[3]/div/div/mat-table/mat-header-row/mat-header-cell[2]")
    private WebElement listActionsRow;

    public ListEquipment() {
        CommonEvents.isVisible(btnCrearEquipment);
    }

    public boolean isEquipmentListVisible() {
        return CommonEvents.isVisible(tableEquipments);
    }

    public boolean checkHeaderListEquipment() {
        return CommonEvents.isVisible(listNameRow)&& CommonEvents.isVisible(listActionsRow);
    }
}
