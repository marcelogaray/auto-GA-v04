package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.ListEquipment.ListEquipment;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage{
    @FindBy(id = "menuEquipament")
    private WebElement equipMenu;

    @FindBy(id = "smEquipament")
    private WebElement equiSubMenu;

    public void clickEquipment(){
        CommonEvents.clickButton(equipMenu);
    }

    public ListEquipment clickSubEquipment()
    {
        CommonEvents.clickButton(equiSubMenu);
        return new ListEquipment();
    }
}
