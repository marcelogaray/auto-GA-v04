package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListContract extends BasePage {

    @FindBy(id = "ContractTable")
    private WebElement pageContract;

    @FindBy(id = "btnAgregarContrato")
    private WebElement btnAddContract;

    @FindBy(id = "editarContract")
    private WebElement btnEditContract;

    @FindBy(id = "eliminarContract")
    private WebElement btnDeleteContract;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-next mat-icon-button']")
    private WebElement btnNextListcontract;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-previous mat-icon-button']")
    private WebElement btnBackListcontract;

    @FindBy(id = "btnAtras")
    private WebElement btnBackList;

    @FindBy(id = "titleCreateContract")
    private WebElement titleContract;

    public ListContract() {
        CommonEvents.isVisible(btnAddContract);
    }

    public boolean validateContractList() {
        return CommonEvents.isVisible(pageContract);
    }

    public FormContract selectBtnAddContract() {
        CommonEvents.clickButton(btnAddContract);
        return new FormContract();
    }
    public FormContract selectBtnEditContract() {
        CommonEvents.clickButton(btnEditContract);
        return new FormContract();
    }

    public FormContract selectBtnDeleteContract() {
        CommonEvents.clickButton(btnDeleteContract);
        return new FormContract();
    }

    public void selectNextListcontract(){
        CommonEvents.clickButton(btnNextListcontract);
    }

    public void selectBackListcontract(){
        CommonEvents.clickButton(btnBackListcontract);
    }

    public void selectBtnBackContarct(){
        CommonEvents.clickButton(btnBackList);
    }

    public String getTitle(){
        return CommonEvents.getTextContent(titleContract);
    }
}