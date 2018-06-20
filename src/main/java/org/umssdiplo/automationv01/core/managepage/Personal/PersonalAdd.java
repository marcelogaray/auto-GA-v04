package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.EmptyStackException;

public class PersonalAdd extends BasePage {
    @FindBy(name = "menuPersonal")
    private WebElement menupersonal;

    @FindBy(name = "personal")
    private WebElement submenupersonal;

    @FindBy(name = "createPersonal")
    private WebElement createPersonal;

    @FindBy(name = "personalNombre")
    private WebElement personalNombre;

    @FindBy(name = "personalApellido")
    private WebElement personalApellido;

    @FindBy(name = "personalEmail")
    private WebElement personalEmail;

    @FindBy(name = "personalDireccion")
    private WebElement personalDireccion;

    @FindBy(name = "personalTelefono")
    private WebElement personalTelefono;

    @FindBy(name = "seleccionArea")
    private WebElement seleccionArea;

    @FindBy(id = "mat-option-6") // Ampliaciones
    private WebElement personalArea;

    @FindBy(name = "personalEnviar")
    private WebElement personalEnviar;

    @FindBy(css = ".mat-paginator-range-label")
    private WebElement paginator;

    public void agregarPersonal() {
        seleccionar();
        // int numeroActual = getNroPersonal(paginator);
        // System.out.println("NroActual:"+ numeroActual);
        createPersonal.click();

        String nombre = "Jose Andres";
        String apellido = "Savedra Holgin";
        String email = "joseh@gmail.com";
        String direccion = "Av. Circunvalacion #359";
        String telefono = "404404040";

        CommonEvents.setInputField(personalNombre,nombre);
        CommonEvents.setInputField(personalApellido,apellido);
        CommonEvents.setInputField(personalEmail,email);
        CommonEvents.setInputField(personalDireccion,direccion);
        CommonEvents.setInputField(personalTelefono,telefono);
        seleccionArea.click();
        personalArea.click();
        personalEnviar.click();

    }

    public void seleccionar(){
        CommonEvents.clickButton(menupersonal);
        CommonEvents.clickButton(submenupersonal);
    }

    public int getNroPersonal(WebElement paginator){
        int res =-1;
        String[] lres = paginator.getText().split("of");
        String considencias;
        considencias = lres[lres.length-1];
        considencias = considencias.replaceAll("\\s","");
        res = Integer.parseInt(considencias);
        return res;
    }
}
