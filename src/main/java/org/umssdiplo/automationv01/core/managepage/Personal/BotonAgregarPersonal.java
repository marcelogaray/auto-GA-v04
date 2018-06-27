package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.managepage.Personal.AgregarPersonal;

public class BotonAgregarPersonal extends BasePage {
    @FindBy(id="agregarPersonal")
    private WebElement agregarPersonal;

    public BotonAgregarPersonal(){
        CommonEvents.isVisible(agregarPersonal);
    }

    public AgregarPersonal clickAgregarPersonal(){
        CommonEvents.clickButton(agregarPersonal);
        return new AgregarPersonal();
    }
}
