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
    private WebElement imageReportHeader;

    @FindBy(xpath = ".//mat-card-content/h1")
    private WebElement titleReportHeader;

    public ListInventory() {
        CommonEvents.isVisible(buttonAccept);
    }

    public boolean isInventoryListVisible() {
        return CommonEvents.isVisible(tableInventory);
    }

    public boolean verifyTitleReportHeaderInventoryIsVisible() {
        return CommonEvents.isVisible(titleReportHeader);
    }

    public boolean verifyImageReportHeaderInventoryIsVisible() {
        return CommonEvents.isVisible(imageReportHeader);
    }
}