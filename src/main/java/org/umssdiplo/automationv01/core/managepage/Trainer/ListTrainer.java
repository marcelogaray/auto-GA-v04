package org.umssdiplo.automationv01.core.managepage.Trainer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class ListTrainer extends BasePage {

    @FindBy(id = "btnCreate")
    private WebElement buttonCreateTrainer;

    @FindBy(className = "mat-table")
    private WebElement tableTrainers;

    @FindBy(id = "btnDelete")
    private WebElement buttonDeleteTrainer;

    @FindBy(id = "btnUpdate")
    private WebElement buttonUpdateTrainer;

    public CreateTrainer clickOnCreateTrainerButton() {
        CommonEvents.clickButton(buttonCreateTrainer);
        return new CreateTrainer();
    }

    public boolean verifyIfTrainerListIsVisible() {
        return CommonEvents.isVisible(tableTrainers);
    }

    public boolean verifyIfCreateTrainerButtonIsVisible() {
        return CommonEvents.isVisible(buttonCreateTrainer);
    }

    public EditTrainer clickOnUpdateTrainerButton() {
        CommonEvents.clickButton(buttonUpdateTrainer);
        return new EditTrainer();
    }

    public boolean verifyIfCreateTrainerButtonIsVisibleAfterEditingTrainer() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnCreate")));
        return CommonEvents.isVisible(buttonCreateTrainer);
    }
}