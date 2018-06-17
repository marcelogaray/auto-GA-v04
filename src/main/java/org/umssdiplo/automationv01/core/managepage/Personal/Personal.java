package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;


public class Personal extends BasePage {
    @FindBy(name = "menuPersonal")
    private WebElement menupersonal;

    @FindBy(name = "personal")
    private WebElement submenupersonal;

    @FindBy(css = ".mat-paginator-range-label")
    private WebElement paginator;

    public void mostrarPersonal() {
        CommonEvents.clickButton(menupersonal);
        CommonEvents.clickButton(submenupersonal);
        System.out.println("Nro: " + paginator.getText() +"\n");
    }
}
