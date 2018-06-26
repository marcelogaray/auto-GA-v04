package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Position.Position;
import org.umssdiplo.automationv01.core.managepage.StructureOrganizational.StructureOrganizational;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuOrganizationalStructure extends BasePage {
    @FindBy(id = "smPositions")
    private WebElement subMenuPositions;

    @FindBy(id = "smOrganizationalStructure")
    private WebElement subMenuOrganizationalStructure;

    public SubMenuOrganizationalStructure() {
        CommonEvents.isVisible(subMenuPositions);
        CommonEvents.isVisible(subMenuOrganizationalStructure);
    }

    public Position clickSubMenuPositions() {
        CommonEvents.clickButton(subMenuPositions);
        return new Position();
    }

    public StructureOrganizational clickOrganizationalStrucureSubMenu() {
        CommonEvents.clickButton(subMenuOrganizationalStructure);
        return new StructureOrganizational();
    }
}
