package org.umssdiplo.automationv01.core.managepage.ListEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListEquipment extends BasePage {

    @FindBy(xpath = "/html/body/ssi-root/ssi-home/div/ssi-header/div/mat-toolbar/div/button[5]")
    private WebElement equipMenu;

    @FindBy(xpath = "//*[@id=\"cdk-overlay-0\"]/div/div/button[1]")
    private WebElement equiSubMenu;

    public void listEquipment() {
        CommonEvents.clickButton(equipMenu);
        CommonEvents.clickButton(equiSubMenu);
    }
}
