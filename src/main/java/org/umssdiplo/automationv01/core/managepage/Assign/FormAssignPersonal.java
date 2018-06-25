package org.umssdiplo.automationv01.core.managepage.Assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormAssignPersonal extends BasePage {

    @FindBy(xpath = "/h1[contains(text(),'Asignacion de Equipo al Personal')]")
    private WebElement titleEquipamentPersonal;

    @FindBy(id = "mat-input-6")
    private WebElement inputSearchAssignPersonal;

    public FormAssignPersonal() {
        CommonEvents.isVisible(titleEquipamentPersonal);
    }

    public boolean isFormAssignPersonalVisible() {
        return CommonEvents.isVisible(inputSearchAssignPersonal);
    }
}
