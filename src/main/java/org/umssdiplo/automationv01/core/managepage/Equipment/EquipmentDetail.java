package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EquipmentDetail extends BasePage{

    @FindBy(xpath = ".//mat-card-title/h3")
    private WebElement labelNameEquipment;

    @FindBy(xpath = ".//mat-card-title/h4")
    private WebElement labelTypeEquipment;

    @FindBy(className = "mat-card-image")
    private WebElement imageEquipment;

    @FindBy(className = "mat-button")
    private WebElement buttonBack;

    public EquipmentDetail() {
        CommonEvents.isVisible(buttonBack);
    }

    public boolean verifyEquipmentNameIsVisible() {
        return CommonEvents.isVisible(labelNameEquipment);
    }

    public boolean verifyEquipmentTypeIsVisible() {
        return CommonEvents.isVisible(labelTypeEquipment);
    }

    public boolean verifyEquipmentImageIsVisible() {
        return CommonEvents.isVisible(imageEquipment);
    }
}
