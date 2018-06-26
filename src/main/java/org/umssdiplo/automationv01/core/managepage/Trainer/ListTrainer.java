package org.umssdiplo.automationv01.core.managepage.Trainer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Equipment.ListEquipment;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListTrainer extends BasePage {

    @FindBy(id = "btnCreate")
    private WebElement btnCreateTrainer;

    @FindBy(className = "mat-table")
    private WebElement tableTrainers;

    @FindBy(id = "btnDelete")
    private WebElement btnDeleteTrainer;

    @FindBy(id = "btnUpdate")
    private WebElement btnUpdateTrainer;

    public CreateTrainer clickCreateTrainerButton() {
        CommonEvents.clickButton(btnCreateTrainer);
        return new CreateTrainer();
    }

    public boolean isTrainerListVisible() {
        return CommonEvents.isVisible(tableTrainers);

    }

    public EditTrainer clickUpdateTrainerButton() {
        CommonEvents.clickButton(btnUpdateTrainer);
        return new EditTrainer();
    }
}
