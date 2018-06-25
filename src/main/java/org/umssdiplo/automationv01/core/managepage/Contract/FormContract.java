package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class FormContract extends BasePage {

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement contractCode;

    @FindBy(xpath = "//*[@id=\"mat-select-1\"]/div/div[1]/span")
    private WebElement contractCity;

    @FindBy(id = "mat-option-5")
    private WebElement seleccionCity;

    @FindBy(id = "mat-input-4")
    private WebElement contractDescription;

    @FindBy(xpath = "//*[@id=\"mat-select-2\"]/div/div[1]/span")
    private WebElement contractType;

    @FindBy(id = "mat-option-14")
    private WebElement seleccionType;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement contractDate;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement contractSalary;

    @FindBy(xpath = "//*[@id=\"form\"]/button")
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
