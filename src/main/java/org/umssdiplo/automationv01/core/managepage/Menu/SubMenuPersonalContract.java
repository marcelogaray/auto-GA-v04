package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Contract.ListContract;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonalContract extends BasePage {

    @FindBy(id = "smContract")
    private WebElement subMenuContract;

    public SubMenuPersonalContract() {
        CommonEvents.isVisible(subMenuContract);
    }

    public ListContract selectSubMenuContract() {
        CommonEvents.clickButton(subMenuContract);
        return new ListContract();
    }
}
