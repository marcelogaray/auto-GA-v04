package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListInventory;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuEquipment extends BasePage {

    @FindBy(id = "smEquipament")
    private WebElement subMenuEquipment;

    @FindBy(id = "smInventory")
    private WebElement subMenuInventory;

    public SubMenuEquipment() {
        CommonEvents.isVisible(subMenuEquipment);
    }

    public ListEquipment selectSubMenuEquipment() {
        CommonEvents.clickButton(subMenuEquipment);
        return new ListEquipment();
    }

    public ListInventory selectSubMenuInventory() {
        CommonEvents.clickButton(subMenuInventory);
        return new ListInventory();
    }
}
