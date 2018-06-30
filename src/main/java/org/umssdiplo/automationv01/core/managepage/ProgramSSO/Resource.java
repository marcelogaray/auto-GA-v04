package org.umssdiplo.automationv01.core.managepage.ProgramSSO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Resource extends BasePage {
    @FindBy(xpath = "//mat-header-cell[text()='Costo']")
    private WebElement headerCost;

    @FindBy(xpath = "//mat-header-cell[text()='Detalle']")
    private WebElement headerDetail;

    @FindBy(xpath = "//mat-header-cell[text()='Accion']")
    private WebElement headerAction;

    @FindBy(id = "btnAddResource")
    private WebElement buttonAddResource;

    @FindBy(id = "titleResource")
    private WebElement titleResource;

    @FindBy(id = "resourceList")
    private WebElement listResource;

    public Resource(){
        CommonEvents.isVisible(titleResource);
    }

    public boolean validateHeaderCostIsVisible() {
        return CommonEvents.isVisible(headerCost);
    }

    public boolean validateHeaderDetailIsVisible() {
        return CommonEvents.isVisible(headerDetail);
    }

    public boolean validateHeaderActionIsVisible() {
        return CommonEvents.isVisible(headerAction);
    }

    public ResourceForm clickButtonAddResource(){
        CommonEvents.clickButton(buttonAddResource);
        return new ResourceForm();
    }

    public boolean validateListResourceIsVisible(){
        return CommonEvents.isVisible(listResource);
    }
}
