package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class AddPersonnel extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Nombre']")
    private WebElement inputNamePersonnel;

    @FindBy(xpath = "//input[@placeholder='Apellido']")
    private WebElement inputLastNamePersonnel;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement inputEmailPersonnel;

    @FindBy(xpath = "//*[@placeholder='Direccion']")
    private WebElement inputAddressPersonnel;

    @FindBy(xpath = "//*[@placeholder='Telefono']")
    private WebElement inputPhonePersonnel;

    @FindBy(xpath = "//*[@placeholder='Seleccionar el area']")
    private WebElement optionAreaPersonnel;

    @FindBy(xpath = "//span[@class='mat-option-text'][contains(text(),'Instalaciones hídricas')]/..")
    private WebElement selectAreaPersonnel;

    @FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(text(),'Enviar')]")
    private WebElement buttonSendPersonnel;

    public AddPersonnel() {
        CommonEvents.isVisible(inputNamePersonnel);
    }

    public void setInputFieldName(String name) {
        CommonEvents.setInputField(inputNamePersonnel, name);
    }

    public void setInputFieldLastName(String lastName) {
        CommonEvents.setInputField(inputLastNamePersonnel, lastName);
    }

    public void setInputFieldEmail(String email) {
        CommonEvents.setInputField(inputEmailPersonnel, email);
    }

    public void setInputFieldAddress(String address) {
        CommonEvents.setInputField(inputAddressPersonnel, address);
    }

    public void setInputFieldPhone(String phone) {
        CommonEvents.setInputField(inputPhonePersonnel, phone);
    }

    public void setOptionArea() {
            CommonEvents.clickButton(optionAreaPersonnel);
            CommonEvents.clickButton(selectAreaPersonnel);
    }

    public boolean clickOnButtonSendPersonnel() {
        boolean res = CommonEvents.isVisible(buttonSendPersonnel);
        if(res) {
            CommonEvents.clickButton(buttonSendPersonnel);
        }
        return res;
    }
}
