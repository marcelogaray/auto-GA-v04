package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.managepage.Personnel.AddPersonnel;

public class ButtonAddPersonnel extends BasePage {

    @FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(text(),'Agregar nuevo personal')]")
    private WebElement buttonAddPersonnel;

    public ButtonAddPersonnel(){
        CommonEvents.isVisible(buttonAddPersonnel);
    }

    public boolean validateButtonAddPersonnelIsVisible(){
        return CommonEvents.isVisible(buttonAddPersonnel);
    }

    public AddPersonnel clickOnButtonAddPersonnel(){
        CommonEvents.clickButton(buttonAddPersonnel);
        return new AddPersonnel();
    }
}
