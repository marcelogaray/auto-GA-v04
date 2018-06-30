package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.Resource;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuProgramSSO extends BasePage {
    @FindBy(id = "smResources")
    private WebElement subMenuResources;

    public Resource clickSubMenuResources() {
        CommonEvents.clickButton(subMenuResources);
        return new Resource();
    }
}
