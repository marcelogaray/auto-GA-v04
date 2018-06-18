package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.EmptyStackException;

public class PersonalFind extends BasePage {
    @FindBy(name = "menuPersonal")
    private WebElement menupersonal;

    @FindBy(name = "personal")
    private WebElement submenupersonal;

    @FindBy(name = "buscarPersonal")
    private WebElement buscarPersonal;

    @FindBy(css = ".mat-paginator-range-label")
    private WebElement paginator;

    public void buscarPersonalEmail() {
        System.out.println("Buscar email\n");
        CommonEvents.clickButton(menupersonal);
        CommonEvents.clickButton(submenupersonal);
        String email = "franzelunico@gmail.com";
        CommonEvents.setInputField(buscarPersonal,email);
        CommonEvents.pressEnterKey(buscarPersonal);

        String[] lres = paginator.getText().split("of");
        String considencias;
        considencias = lres[lres.length-1].replaceAll("\\s","");

        int encontrado = Integer.parseInt(considencias);
        if (encontrado <= 0){
            throw new EmptyStackException();
        }
    }
}
