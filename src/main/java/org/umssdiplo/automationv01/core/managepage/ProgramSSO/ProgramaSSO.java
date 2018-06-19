package org.umssdiplo.automationv01.core.managepage.ProgramSSO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class ProgramaSSO extends BasePage {
    @FindBy(xpath = "/html/body/ssi-root/ssi-home/div/ssi-header/div/mat-toolbar/div/button[6]")
    private WebElement menuProgramSSO;

    @FindBy(className = "btnRecursos")
    private WebElement subMenuResources;

    @FindBy(xpath = "/html/body/ssi-root/ssi-resources/div/div[2]/button[1]")
    private WebElement buttonNewResources;

    @FindBy(className = "txtCost")
    private WebElement costInputField;

    @FindBy(className = "txtDetail")
    private WebElement detailInputField;

    @FindBy(className = "btnGuardar")
    private WebElement saveBtn;

    @FindBy(xpath = "//mat-header-cell[text()='Costo']")
    private WebElement costHeader;

    @FindBy(xpath = "//mat-header-cell[text()='Detalle']")
    private WebElement detailHeader;

    @FindBy(xpath = "//mat-header-cell[text()='Accion']")
    private WebElement actionHeader;


    public void clickMenuProgramSSO() {
        CommonEvents.clickButton(menuProgramSSO);
    }

    public void clickSubMenuResources(){
        CommonEvents.clickButton(subMenuResources);
    }

    public void clickNewResources(){
        CommonEvents.clickButton(buttonNewResources);
    }

    public void fillingFormResoureces(){
        String cost = PropertyAccessor.getInstance().getResourceCost();
        String detail = PropertyAccessor.getInstance().getResourceDetail();
        CommonEvents.setInputField(costInputField, cost);
        CommonEvents.setInputField(detailInputField, detail);
        CommonEvents.clickButton(saveBtn);
    }

    public Boolean visibilityCostHeader()
    {
        return CommonEvents.isVisible(costHeader);
    }

    public Boolean visibilityDetailHeader()
    {
        return CommonEvents.isVisible(detailHeader);
    }

    public Boolean visibilityActionHeader()
    {
        return CommonEvents.isVisible(actionHeader);
    }
}
