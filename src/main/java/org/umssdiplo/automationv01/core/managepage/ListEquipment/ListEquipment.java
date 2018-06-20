package org.umssdiplo.automationv01.core.managepage.ListEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListEquipment extends BasePage {
    @FindBy(id = "crearEquipment")
    WebElement createEquipmentBtn;

    public boolean listEquipmetsPresent(){
        return CommonEvents.isPresent(createEquipmentBtn);
    }
}
