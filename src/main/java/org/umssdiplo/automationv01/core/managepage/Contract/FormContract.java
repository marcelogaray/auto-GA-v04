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
    private WebElement inputFindContract;

    @FindBy(id = "form")
    private WebElement formContract;

    public FormContract(){
        CommonEvents.isVisible(formContract);
    }

    public void newContractRegistration(List<Map<String, String>> data){
        setInputDataCode(data.get(0).get("contractCodes"));
        setInputDataDescription(data.get(0).get("contractDescriptions"));
        setInputDataSalary(data.get(0).get("contractSalarys"));
        setInputDataDate(data.get(0).get("contractDates"));
        selectTypeContract();
        selectCityContract();
    }

    private void setInputDataCode(String data){
        CommonEvents.setInputField(inputCodeContract, data);
    }

    private void setInputDataDescription(String data){
        CommonEvents.setInputField(inputDescriptionContract, data);
    }

    private void setInputDataSalary(String data){
        CommonEvents.setInputField(inputSalaryContract, data);
    }

    private void setInputDataDate(String data){
        CommonEvents.setInputField(inputDateContract, data);
    }

    public void editContractRegistration(List<Map<String, String>> data){
        setInputDataCodeEdit(data.get(0).get("contractCodesEdit"));
        setInputDataDescriptionEdit(data.get(0).get("contractDescriptionsEdit"));
        setInputDataSalaryEdit(data.get(0).get("contractSalarysEdit"));
        setInputDataDateEdit(data.get(0).get("contractDatesEdit"));
        selectTypeContract();
        selectCityContract();
    }

    private void setInputDataCodeEdit(String data){
        CommonEvents.setInputField(inputCodeEditContract, data);
    }

    private void setInputDataDescriptionEdit(String data){
        CommonEvents.setInputField(inputDescriptionEditContract, data);
    }

    private void setInputDataSalaryEdit(String data){
        CommonEvents.setInputField(inputSalaryEditContract, data);
    }

    private void setInputDataDateEdit(String data){
        CommonEvents.setInputField(inputDateEditContract, data);
    }

    public void findContractList(List<Map<String, String>> data) {
        CommonEvents.setInputField(inputFindContract, data.get(0).get("contractCode"));
    }

    public void selectCityContract(){
        CommonEvents.clickButton(inputCityContract);
        selectCityContract.click();
    }

    public void selectTypeContract(){
        CommonEvents.clickButton(inputTypeContract);
        selectTypeContract.click();
    }

    public boolean clickButtonSendForm(){
        CommonEvents.clickButton(buttonSendContract);
        return CommonEvents.isVisible(buttonSendContract);
    }

    public boolean clickButtonSendFormEdit(){
        CommonEvents.clickButton(buttonSendEdit);
        return CommonEvents.isVisible(buttonSendEdit);
    }
}
