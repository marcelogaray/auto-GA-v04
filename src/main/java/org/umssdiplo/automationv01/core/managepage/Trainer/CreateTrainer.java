package org.umssdiplo.automationv01.core.managepage.Trainer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreateTrainer extends BasePage {

    @FindBy(id = "btnAtras")
    private WebElement buttonBack;

    @FindBy(id = "trainerTitle")
    private WebElement titleCreateTrainer;

    public ListTrainer clickBackButton() {
        CommonEvents.clickButton(buttonBack);
        return new ListTrainer();
    }

    public String getTrainerTitleCreateMode() {
        return CommonEvents.getTextContent(titleCreateTrainer);
    }
}