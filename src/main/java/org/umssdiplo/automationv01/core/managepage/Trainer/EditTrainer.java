package org.umssdiplo.automationv01.core.managepage.Trainer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EditTrainer extends BasePage {

    @FindBy(id = "btnAtras")
    private WebElement buttonBack;

    @FindBy(id = "trainerTitle")
    private WebElement titleCreateTrainer;

    @FindBy(id = "Nombre")
    private WebElement nameTrainer;

    @FindBy(id = "btnGuardar")
    private WebElement buttonSave;

    public ListTrainer clickOnBackButton() {
        CommonEvents.clickButton(buttonBack);
        return new ListTrainer();
    }

    public String getTrainerTitleEditMode() {
        return CommonEvents.getTextContent(titleCreateTrainer);
    }

    public void setTrainerName(String trainerName) {

        CommonEvents.setInputField(nameTrainer, trainerName);
    }

    public ListTrainer clickOnSaveButton() {

        CommonEvents.clickButton(buttonSave);
        return new ListTrainer();
    }
}