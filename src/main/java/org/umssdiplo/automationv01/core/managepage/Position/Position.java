package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Position extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Cargos de la empresa')]")
    private WebElement title;

    public Position(){
        CommonEvents.isVisible(title);
    }
}
