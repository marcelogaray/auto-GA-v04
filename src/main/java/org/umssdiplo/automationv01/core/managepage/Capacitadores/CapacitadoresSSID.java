package org.umssdiplo.automationv01.core.managepage.Capacitadores;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class CapacitadoresSSID extends BasePage {
    @FindBy(xpath = "/html/body/ssi-root/ssi-trainers/div/div[3]/div/mat-table/mat-row[1]/mat-cell[6]/button[2]")
    private WebElement modifyButton;

    @FindBy(xpath = "//*[@id=\'mat-input-2\']")
    private WebElement nameTextField;

    @FindBy(xpath = "//*[@id=\'form\']/button")
    private WebElement guardarButton;

    public void clickOnModifyButton() {
        CommonEvents.clickButton(modifyButton);
    }

    public void setNombre() {
        CommonEvents.setInputField(nameTextField, "Juan Perez test");
    }

    public void clickOnGuardarButton() {
        CommonEvents.clickButton(guardarButton);
    }
}

