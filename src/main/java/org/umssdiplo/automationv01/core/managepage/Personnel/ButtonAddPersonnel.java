package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.managepage.Personnel.AddPersonnel;

public class ButtonAddPersonnel extends BasePage {

    @FindBy(id="agregarPersonal")
    private WebElement buttonAddPersonnel;

    public ButtonAddPersonnel(){
        CommonEvents.isVisible(buttonAddPersonnel);
    }

    public boolean validateButtonAddPersonnel(){
        return CommonEvents.isVisible(buttonAddPersonnel);
    }

    public AddPersonnel clickAgregarPersonal(){
        CommonEvents.clickButton(buttonAddPersonnel);
        return new AddPersonnel();
    }
}
