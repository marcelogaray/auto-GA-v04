package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuOrganizationalStructure extends BasePage {
    @FindBy(id = "smPositions")
    private WebElement subMenuPositions;

    public SubMenuOrganizationalStructure(){
        CommonEvents.isVisible(subMenuPositions);
    }

    public Position clickSubMenuPositions() {
        CommonEvents.clickButton(subMenuPositions);
        return new Position();
    }
}
