package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListInventory extends BasePage{

    @FindBy(className = "mat-button mat-primary")
    private WebElement buttonAccept;

    @FindBy(className = "mat-table")
    private WebElement tableInventory;

    @FindBy(xpath = ".//mat-card-header")
    private WebElement headerImageReport;

    @FindBy(xpath = ".//h1[contains(text(),'REPORTE DE ESTADO DE EQUIPAMIENTOS DE H.S.I')]")
    private WebElement titleReport;

    public ListInventory() {
        CommonEvents.isVisible(buttonAccept);
    }

    public boolean isInventoryListVisible() {
        return CommonEvents.isVisible(tableInventory);
    }

    public boolean verifyTitleReportHeaderInventoryIsVisible() {
        return CommonEvents.isVisible(titleReport);
    }

    public boolean verifyImageReportHeaderInventoryIsVisible() {
        return CommonEvents.isVisible(headerImageReport);
    }
}