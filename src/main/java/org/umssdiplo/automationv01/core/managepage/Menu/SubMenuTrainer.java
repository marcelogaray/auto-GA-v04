package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Trainer.ListTrainer;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuTrainer extends BasePage {
    @FindBy(id = "smTrainers")
    private WebElement subMenuTrainer;

    public SubMenuTrainer() {
        CommonEvents.isVisible(subMenuTrainer);
    }

    public ListTrainer selectSubMenuTrainer() {
        CommonEvents.clickButton(subMenuTrainer);
        return new ListTrainer();
    }
}