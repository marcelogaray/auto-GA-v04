package org.umssdiplo.automationv01.core.managepage.Contract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListContract extends BasePage {

    @FindBy(id = "ContractTable")
    private WebElement pageContract;

    @FindBy(id = "btnAgregarContrato")
    private WebElement buttonAddContract;

    @FindBy(id = "editarContract")
    private WebElement buttonEditContract;

    @FindBy(id = "eliminarContract")
    private WebElement buttonDeleteContract;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-next mat-icon-button']")
    private WebElement buttonNextListcontract;

    @FindBy(xpath = "//button[@class='mat-paginator-navigation-previous mat-icon-button']")
    private WebElement buttonBackListcontract;

    @FindBy(id = "btnAtras")
    private WebElement buttonBackList;

    @FindBy(id = "titleCreateContract")
    private WebElement titleContract;

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

    public FormContract selectBtnDeleteContract() {
        CommonEvents.clickButton(buttonDeleteContract);
        return new FormContract();
    }

    public boolean selectNextListcontract(){
        CommonEvents.clickButton(buttonNextListcontract);
        return CommonEvents.isVisible(buttonNextListcontract);
    }

    public boolean selectBackListcontract(){
        CommonEvents.clickButton(buttonBackListcontract);
        return CommonEvents.isVisible(buttonBackListcontract);
    }

    public void selectBtnBackContarct(){
        CommonEvents.clickButton(buttonBackList);
    }

    public String getTitle() {return CommonEvents.getTextContent(titleContract); }
}