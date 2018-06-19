package org.umssdiplo.automationv01.core.managepage.MainPageSSID;

import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.Capacitadores.CapacitadoresSSID;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class MainPageSSID extends BasePage {

    @FindBy(xpath = "/html/body/ssi-root/ssi-home/div/ssi-header/div/mat-toolbar/div/button[5]")
    private WebElement programSsoButton;

    @FindBy(xpath = "//*[@id=\'cdk-overlay-0\']/div/div/button[1]")
    private WebElement capacitadoresButton;

    public CapacitadoresSSID goToCapacitadores() {
        CapacitadoresSSID capacitadoresSSID = new CapacitadoresSSID();

        CommonEvents.clickButton(programSsoButton);
        CommonEvents.clickButton(capacitadoresButton);
        return capacitadoresSSID;
    }
}

