package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Position extends BasePage {
    @FindBy(xpath = "//mat-paginator")
    private WebElement paginator;

    public Position(){
        CommonEvents.isVisible(paginator);
    }
}
