package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import java.util.List;
import java.util.Map;

public class FormContract extends BasePage {

    @FindBy(id = "mat-input-3")
    private WebElement inputCodeContract;

    @FindBy(id = "mat-select-1")
    private WebElement inputCityContract;

    @FindBy(id = "mat-option-5")
    private WebElement selectCityContract;

    @FindBy(id = "mat-input-4")
    private WebElement inputDescriptionContract;

    @FindBy(id = "mat-select-2")
    private WebElement inputTypeContract;

    @FindBy(id = "mat-option-14")
    private WebElement selectTypeContract;

    @FindBy(id = "mat-input-6")
    private WebElement inputDateContract;

    @FindBy(id = "mat-input-5")
    private WebElement inputSalaryContract;

    @FindBy(id = "btnEnviarContract")
    private WebElement buttonSendContract;

    @FindBy(id = "mat-input-4")
    private WebElement inputCodeEditContract;

    @FindBy(id = "mat-input-5")
    private WebElement inputDescriptionEditContract;

    @FindBy(id = "mat-input-6")
    private WebElement inputSalaryEditContract;

    @FindBy(id = "mat-input-7")
    private WebElement inputDateEditContract;

    @FindBy(id = "btnEnviarEdit")
    private WebElement buttonSendEdit;

    @FindBy(id = "find-contract")
    private WebElement fillContract;

    public FormContract() {}

    public void newContractRegistration(List<Map<String, String>> data){
        CommonEvents.setInputField(inputCodeContract, data.get(0).get("contractCodes"));
        CommonEvents.setInputField(inputDescriptionContract, data.get(0).get("contractDescriptions"));
        CommonEvents.setInputField(inputSalaryContract, data.get(0).get("contractSalarys"));
        CommonEvents.setInputField(inputDateContract, data.get(0).get("contractDates"));
        selectTypeContract();
        selectCityContract();
    }

    public void editContractRegistration(List<Map<String, String>> data){
        CommonEvents.setInputField(inputCodeEditContract, data.get(0).get("contractCodesEdit"));
        CommonEvents.setInputField(inputDescriptionEditContract, data.get(0).get("contractDescriptionsEdit"));
        CommonEvents.setInputField(inputSalaryEditContract, data.get(0).get("contractSalarysEdit"));
        CommonEvents.setInputField(inputDateEditContract, data.get(0).get("contractDatesEdit"));
        selectTypeContract();
        selectCityContract();
    }

    public void findContractList(List<Map<String, String>> data) {
        CommonEvents.setInputField(fillContract, data.get(0).get("contractCode"));
    }

    public void selectCityContract(){
        CommonEvents.clickButton(inputCityContract);
        selectCityContract.click();
    }

    public void selectTypeContract(){
        CommonEvents.clickButton(inputTypeContract);
        selectTypeContract.click();
    }

    public boolean btnSendForm(){
        CommonEvents.clickButton(buttonSendContract);
        return  CommonEvents.isVisible(buttonSendContract);
    }

    public boolean btnSendFormEdit(){
        CommonEvents.clickButton(buttonSendEdit);
        return CommonEvents.isVisible(buttonSendEdit);
    }
}
