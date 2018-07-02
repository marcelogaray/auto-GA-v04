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

    @FindBy(className = "mat-paginator-navigation-next")
    private WebElement buttonNextListcontract;

    @FindBy(className = "mat-paginator-navigation-previous")
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

    public void selectNextListcontract() {
        CommonEvents.clickButton(buttonNextListcontract);
    }

    public void selectBackListcontract() {
        CommonEvents.clickButton(buttonBackListcontract);
    }

    public void selectBtnBackContarct() {
        CommonEvents.clickButton(buttonBackList);
    }

    public String getTitle() {
        return CommonEvents.getTextContent(titleContract);
    }
}