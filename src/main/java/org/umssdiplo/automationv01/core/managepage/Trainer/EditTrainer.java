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
    private WebElement butttonSave;

    public ListTrainer clickOnBackButton() {
        CommonEvents.clickButton(buttonBack);
        return new ListTrainer();
    }

    public String getTrainerTitleEditMode() {
        return CommonEvents.getTextContent(titleCreateTrainer);
    }

    public void setTrainerName() {

        CommonEvents.setInputField(nameTrainer, "Automated test");
    }

    public ListTrainer clickOnSaveButton() {

        CommonEvents.clickButton(butttonSave);
        return new ListTrainer();
    }
}

