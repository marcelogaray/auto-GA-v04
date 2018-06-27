package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class AgregarPersonal extends BasePage {

    @FindBy(id="personalNombre")
    private WebElement personalNombre;

    @FindBy(id="personalApellido")
    private WebElement personalApellido;

    @FindBy(id="personalEmail")
    private WebElement personalEmail;

    @FindBy(xpath = "//*[@placeholder='Direccion']")
    private WebElement personalDireccion;

    @FindBy(id="personalTelefono")
    private WebElement personalTelefono;

    @FindBy(xpath = "//*[@placeholder='Seleccionar el area']")
    private WebElement personalArea;

    @FindBy(xpath = "//span[@class='mat-option-text'][contains(text(),'Instalaciones hídricas')]/..")
    private WebElement areas;

    @FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(text(),'Enviar')]")
    private WebElement personalEnviar;

    public AgregarPersonal(){
        CommonEvents.isVisible(personalNombre);
    }

    public void setNombre(String nombre){
        CommonEvents.setInputField(personalNombre, nombre);
    }

    public void setApellido(String apellido){
        CommonEvents.setInputField(personalApellido, apellido);
    }

    public void setEmail(String email){
        CommonEvents.setInputField(personalEmail, email);
    }

    public void setDireccion(String direccion){
        CommonEvents.setInputField(personalDireccion, direccion);
    }

    public void setTelefono(String telefono){
        CommonEvents.setInputField(personalTelefono, telefono);
    }

    public void setArea(String area){
        if(CommonEvents.isVisible(personalArea)){
            CommonEvents.clickButton(personalArea);
            CommonEvents.clickButton(areas);
        }
    }

    public String enviar(){
        String res = "";
        if(CommonEvents.isVisible(personalEnviar)) {
            CommonEvents.clickButton(personalEnviar);
            res = "Agregado";
        }
        return res;
    }
}
