package org.umssdiplo.automationv01.core.managepage.ProgramSSO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Resource extends BasePage {
    @FindBy(xpath = "//mat-header-cell[text()='Costo']")
    private WebElement costHeader;

    @FindBy(xpath = "//mat-header-cell[text()='Detalle']")
    private WebElement detailHeader;

    @FindBy(xpath = "//mat-header-cell[text()='Accion']")
    private WebElement actionHeader;

    @FindBy(id = "btnAddResource")
    private WebElement addResourceButton;

    @FindBy(id = "titleResource")
    private WebElement titleResource;

    @FindBy(id = "resourceList")
    private WebElement resourceList;

    public Resource(){
        CommonEvents.isVisible(titleResource);
    }

    public boolean visibilityCostHeader() {
        return CommonEvents.isVisible(costHeader);
    }

    public boolean visibilityDetailHeader() {
        return CommonEvents.isVisible(detailHeader);
    }

    public boolean visibilityActionHeader() {
        return CommonEvents.isVisible(actionHeader);
    }

    public ResourceForm clickAddResourceButton(){
        CommonEvents.clickButton(addResourceButton);
        return new ResourceForm();
    }

    public boolean isVisibleListResource(){
        return CommonEvents.isVisible(resourceList);
    }
}
