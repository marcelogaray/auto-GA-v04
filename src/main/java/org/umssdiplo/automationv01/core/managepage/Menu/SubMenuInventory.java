package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListInventory;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuInventory extends BasePage {
    @FindBy(id = "smInventory")
    private WebElement inventorySubMenu;

    public SubMenuInventory() {
        CommonEvents.isVisible(inventorySubMenu);
    }

    public ListInventory selectSubMenuInventory() {
        CommonEvents.clickButton(inventorySubMenu);
        return new ListInventory();
    }
}
