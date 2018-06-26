package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import java.util.List;
import java.util.Map;

public class FormContract extends BasePage {

    @FindBy(id = "mat-input-3")
    private WebElement contractCode;

    @FindBy(id = "mat-select-1")
    private WebElement contractCity;

    @FindBy(id = "mat-option-5")
    private WebElement seleccionCity;

    @FindBy(id = "mat-input-4")
    private WebElement contractDescription;

    @FindBy(id = "mat-select-2")
    private WebElement contractType;

    @FindBy(id = "mat-option-14")
    private WebElement seleccionType;

    @FindBy(id = "mat-input-6")
    private WebElement contractDate;

    @FindBy(id = "mat-input-5")
    private WebElement contractSalary;

    @FindBy(id = "btnEnviarContract")
    private WebElement enviar;

    public void registerContract(List<Map<String, String>> data){
        CommonEvents.setInputField(contractCode, data.get(0).get("contractCodes"));
        CommonEvents.setInputField(contractDescription, data.get(0).get("contractDescriptions"));
        CommonEvents.setInputField(contractSalary, data.get(0).get("contractSalarys"));
        CommonEvents.setInputField(contractDate, data.get(0).get("contractDates"));
        seleccionarTypeContract();
        seleccionCityContract();
    }

    public void seleccionCityContract(){
        CommonEvents.clickButton(contractCity);
        seleccionCity.click();
    }

    public void seleccionarTypeContract(){
        CommonEvents.clickButton(contractType);
        seleccionType.click();
    }

    public void enviarFormulario(){
        CommonEvents.clickButton(enviar);
    }
}
