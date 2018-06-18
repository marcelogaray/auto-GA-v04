package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Position extends BasePage {
    @FindBy(xpath = "//mat-toolbar/div/button[7]")
    private WebElement menuOrganizationalStructure;

    @FindBy(xpath = "//button[@class='mat-menu-item'][3]")
    private WebElement menuPosition;

    public void goPositionPage() {
        CommonEvents.clickButton(menuOrganizationalStructure);
        CommonEvents.clickButton(menuPosition);
        System.out.println("The page of Organizational Structure by Positions is displayed");
    }
}
