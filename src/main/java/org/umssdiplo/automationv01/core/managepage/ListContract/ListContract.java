package org.umssdiplo.automationv01.core.managepage.ListContract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListContract extends BasePage {

    @FindBy(xpath = "/html/body/ssi-root/ssi-home/div/ssi-header/div/mat-toolbar/div/button[3]")
    private WebElement equipMenu;

    @FindBy(xpath = "//*[@id=\"cdk-overlay-0\"]/div/div/button[3]")
    private WebElement equiSubMenu;

    public void listContract() {
        CommonEvents.clickButton(equipMenu);
        CommonEvents.clickButton(equiSubMenu);
    }
}
