package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuEquipment extends BasePage {

    @FindBy(id = "smEquipament")
    private WebElement equipmentSubMenu;

    public SubMenuEquipment() {
        CommonEvents.isVisible(equipmentSubMenu);
    }

    public ListEquipment selectSubMenuEquipment() {
        CommonEvents.clickButton(equipmentSubMenu);
        return new ListEquipment();
    }
}
