package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreatePosition {
    @FindBy(xpath = "//button[@*='/positions/create']")
    private WebElement buttonCreate;

    @FindBy(name = "name")
    private WebElement fieldName;

    @FindBy(name = "level")
    private WebElement fieldLevel;

    @FindBy(name = "description")
    private WebElement fieldDescription;

    @FindBy(name = "position")
    private WebElement parentPosition;

    @FindBy(xpath = "//button[@*='submit']")
    private WebElement buttonSend;

    public void createPosition() {
        CommonEvents.clickButton(buttonCreate);
        System.out.println("<< fill fields >>");
        CommonEvents.setInputField(fieldName,"Sub gerente");
        CommonEvents.setInputField(fieldLevel,"1");
        CommonEvents.setInputField(fieldDescription,"Cargo de subgerencia, apoyo del gerente general");

        //seleccionar combo position
        //CommonEvents.setInputField(fieldDescription,"Cargo de subgerencia, apoyo del gerente general");

        CommonEvents.clickButton(buttonSend);
        System.out.println("The position has created!");
    }
}