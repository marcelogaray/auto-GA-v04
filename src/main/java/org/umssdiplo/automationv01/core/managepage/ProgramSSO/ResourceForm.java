package org.umssdiplo.automationv01.core.managepage.ProgramSSO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ResourceForm extends BasePage {
    @FindBy(className = "txtCost")
    private WebElement costInputField;

    @FindBy(className = "txtDetail")
    private WebElement detailInputField;

    @FindBy(className = "btnGuardar")
    private WebElement saveBtn;

    public Resource fillResourceForm(String cost, String detail){
        CommonEvents.setInputField(costInputField, cost);
        CommonEvents.setInputField(detailInputField, detail);
        CommonEvents.clickButton(saveBtn);
        return new Resource();
    }
}
