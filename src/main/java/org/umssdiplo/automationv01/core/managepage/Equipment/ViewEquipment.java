package org.umssdiplo.automationv01.core.managepage.Equipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ViewEquipment extends BasePage{

    @FindBy(className = "mat-card-content")
    private WebElement contentView;

    @FindBy(className = "mat-card-image")
    private WebElement imageView;

    @FindBy(className = "mat-card-title-group")
    private WebElement titleView;

    @FindBy(className = "mat-button")
    private WebElement backBtn;

    public ViewEquipment() {
        CommonEvents.isVisible(backBtn);
    }

    public boolean checkEquipmentView() {
        return checkContentView() && checkImageView() && checkTitleView();
    }

    private boolean checkContentView() {
        return CommonEvents.isVisible(contentView);
    }

    private boolean checkImageView() {
        return CommonEvents.isVisible(imageView);
    }

    private boolean checkTitleView() {
        return CommonEvents.isVisible(titleView);
    }
}
