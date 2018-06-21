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

    public Boolean visibilityCostHeader() {
        return CommonEvents.isVisible(costHeader);
    }

    public Boolean visibilityDetailHeader() {
        return CommonEvents.isVisible(detailHeader);
    }

    public Boolean visibilityActionHeader() {
        return CommonEvents.isVisible(actionHeader);
    }
}
