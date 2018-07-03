package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import java.util.List;
import java.util.Map;

public class ListContract extends BasePage {

    @FindBy(id = "ContractTable")
    private WebElement pageContract;

    @FindBy(id = "btnAgregarContrato")
    private WebElement buttonAddContract;

    @FindBy(id = "editarContract")
    private WebElement buttonEditContract;

    @FindBy(id = "eliminarContract")
    private WebElement buttonDeleteContract;

    @FindBy(className = "mat-paginator-navigation-next")
    private WebElement buttonNextListcontract;

    @FindBy(className = "mat-paginator-navigation-previous")
    private WebElement buttonBackListcontract;

    @FindBy(id = "btnAtras")
    private WebElement buttonBackList;

    @FindBy(id = "find-contract")
    private WebElement inputFindContract;

    @FindBy(id = "find-contract")
    private WebElement inputFindContract;

    public ListContract() {
        CommonEvents.isVisible(buttonAddContract);
    }

    public boolean validateContractList() {
        return CommonEvents.isVisible(pageContract);
    }

    public FormContract selectBtnAddContract() {
        CommonEvents.clickButton(buttonAddContract);
        return new FormContract();
    }

    public FormContract selectBtnEditContract() {
        CommonEvents.clickButton(buttonEditContract);
        return new FormContract();
    }

    public boolean selectBtnDeleteContract() {
        CommonEvents.clickButton(buttonDeleteContract);
        return CommonEvents.isVisible(buttonDeleteContract);
    }

    public void selectNextListcontract() {
        CommonEvents.clickButton(buttonNextListcontract);
    }

    public void selectBackListcontract() {
        CommonEvents.clickButton(buttonBackListcontract);
    }

    public void selectBtnBackContarct() {
        CommonEvents.clickButton(buttonBackList);
    }

    public void findContractList(List<Map<String, String>> data) {
        CommonEvents.setInputField(inputFindContract, data.get(0).get("contractCode"));
    }

    public void findContractList(List<Map<String, String>> data) {
        CommonEvents.setInputField(inputFindContract, data.get(0).get("contractCode"));
    }
}