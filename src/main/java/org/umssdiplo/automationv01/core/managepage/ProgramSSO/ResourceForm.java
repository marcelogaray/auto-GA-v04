package org.umssdiplo.automationv01.core.managepage.ProgramSSO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ResourceForm extends BasePage {
    @FindBy(className = "txtCost")
    private WebElement inputFieldCost;

    @FindBy(className = "txtDetail")
    private WebElement inputFieldDetail;

    @FindBy(className = "btnGuardar")
    private WebElement buttonSave;

    @FindBy(id = "titleFormCreate")
    private WebElement titleCreate;

    @FindBy(id = "btnBack")
    private WebElement buttonBack;

    @FindBy(id = "btnCancel")
    private WebElement buttonCancel;

    public void fillResourceForm(String cost, String detail){
        CommonEvents.setInputField(inputFieldCost, cost);
        CommonEvents.setInputField(inputFieldDetail, detail);
    }

    public Resource clickButtonSave(){
        CommonEvents.clickButton(buttonSave);
        return new Resource();
    }

    public boolean validateTitleIsVisible(String title){
        return CommonEvents.isVisible(titleCreate) && titleCreate.getText().equalsIgnoreCase(title);
    }

    public boolean validateInputFieldCostIsVisible(){
        return CommonEvents.isVisible(inputFieldCost);
    }

    public boolean validateInputFieldDetailIsVisible(){
        return CommonEvents.isVisible(inputFieldDetail);
    }

    public Resource clickButtonBack(){
        CommonEvents.clickButton(buttonBack);
        return new Resource();
    }

    public Resource clickButtonCancel(){
        CommonEvents.clickButton(buttonCancel);
        return new Resource();
    }
}
