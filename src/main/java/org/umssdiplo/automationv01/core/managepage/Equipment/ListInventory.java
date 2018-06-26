package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListInventory extends BasePage{

    @FindBy(className = "mat-button mat-primary")
    private WebElement aceptarBtn;

    @FindBy(className = "mat-table")
    private WebElement tableInventory;

    @FindBy(xpath = "/html/body/ssi-root/ssi-inventory/div/div[2]/div/mat-card/mat-card-header")
    WebElement headerReportImage;

    @FindBy(xpath = "/html/body/ssi-root/ssi-inventory/div/div[2]/div/mat-card/mat-card-content/h1")
    WebElement headerReportTitle;

    public ListInventory() {
        CommonEvents.isVisible(aceptarBtn);
    }

    public boolean isInventoryListVisible() {
        return CommonEvents.isVisible(tableInventory);
    }

    public boolean checkHeaderReportInventory() {
        return CommonEvents.isVisible(headerReportImage) && CommonEvents.isVisible(headerReportTitle);
    }
}