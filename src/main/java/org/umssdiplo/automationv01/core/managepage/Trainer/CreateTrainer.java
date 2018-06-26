package org.umssdiplo.automationv01.core.managepage.Trainer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreateTrainer extends BasePage {

    @FindBy(id = "btnAtras")
    private WebElement btnAtras;

    @FindBy(id = "btnReporte")
    private WebElement btnReport;

    @FindBy(id = "trainerTitle")
    private WebElement titleCreateTrainer;


    public ListTrainer clickAtrasButton() {
        CommonEvents.clickButton(btnAtras);
        return new ListTrainer();
    }

    public String getTrainerTitleCreateMode() {
        return CommonEvents.getTextContent(titleCreateTrainer);

    }
}

