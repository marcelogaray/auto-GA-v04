package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormTitleNewPersonnel extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Nuevo Personal')]")
    private WebElement textTitleFormTitleNewPersonnel;

    public FormTitleNewPersonnel() {
        CommonEvents.isVisible(textTitleFormTitleNewPersonnel);
    }

    public boolean validateTitleNewPersonnelIsVisible(){
        return CommonEvents.isVisible(textTitleFormTitleNewPersonnel);
    }
}
