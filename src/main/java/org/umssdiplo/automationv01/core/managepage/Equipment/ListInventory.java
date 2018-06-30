package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class ListInventory extends BasePage{

    @FindBy(className = "mat-button mat-primary")
    private WebElement buttonAccept;

    @FindBy(className = "mat-table")
    private WebElement tableInventory;

    public ListInventory() {
        CommonEvents.isVisible(buttonAccept);
    }

    public boolean isInventoryListVisible() {
        return CommonEvents.isVisible(tableInventory);
    }
}