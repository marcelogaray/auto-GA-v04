package org.umssdiplo.automationv01.core.managepage.EditEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class EditEquipment extends BasePage {

    @FindBy(xpath = "/html/body/ssi-root/ssi-home/div/ssi-header/div/mat-toolbar/div/button[5]")
    private WebElement equipMenu;

    @FindBy(xpath = "//*[@id=\"cdk-overlay-0\"]/div/div/button[1]")
    private WebElement equiSubMenu;

    @FindBy(xpath = "/html/body/ssi-root/ssi-equipment/div/div[3]/div/div/mat-table/mat-row[1]/mat-cell[2]/a[2]")
    private WebElement editEquipment;

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    private WebElement equipmentName;

    @FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]/span")
    private WebElement equipmentType;

    @FindBy(xpath = "//*[@id=\"mat-option-1\"]/span")
    private WebElement equipmentSelectType;

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement equipmentDesc;

    @FindBy(xpath = "//*[@id=\"image\"]")
    private WebElement equipmentImage;

    @FindBy(xpath = "//*[@id=\"form\"]/button")
    private WebElement editBtn;

    public void editEquipment() {
        String equiName = PropertyAccessor.getInstance().getEquiName();
        String equiDesc = PropertyAccessor.getInstance().getEquiDesc();
        CommonEvents.clickButton(equipMenu);
        CommonEvents.clickButton(equiSubMenu);
        CommonEvents.clickButton(editEquipment);
        CommonEvents.setInputField(equipmentName, equiName);
        CommonEvents.clickButton(equipmentType);
        CommonEvents.clickButton(equipmentSelectType);
        CommonEvents.setInputField(equipmentDesc, equiDesc);
        CommonEvents.clickButton(editBtn);
    }
}
