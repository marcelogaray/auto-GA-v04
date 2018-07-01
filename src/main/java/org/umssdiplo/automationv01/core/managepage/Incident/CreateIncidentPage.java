package org.umssdiplo.automationv01.core.managepage.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class CreateIncidentPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Crear Incidente')]")
    private WebElement title;

    @FindBy(xpath = "//mat-radio-group/mat-radio-button/label")
    private List<WebElement> radioGroupSeverity;

    @FindBy(name = "code")
    private WebElement inputFieldCode;

    @FindBy(id = "mat-select-0")
    private WebElement selectIncidentType;

    @FindAll({
            @FindBy( id = "mat-option-0"),
            @FindBy(id = "mat-option-1"),
            @FindBy(id = "mat-option-2")
    })
    private List<WebElement> selectIncidentTypeOptions;

    @FindBy(id = "mat-select-1")
    private WebElement selectState;

    @FindAll({
            @FindBy(id = "mat-option-3"),
            @FindBy(id = "mat-option-4"),
            @FindBy(id = "mat-option-5"),
            @FindBy(id = "mat-option-6")
    })
    private List<WebElement> selectStateOptions;

    @FindBy(id = "mat-select-2")
    private WebElement selectArea;

    @FindAll({
            @FindBy(id = "mat-option-7"),
            @FindBy(id = "mat-option-8"),
            @FindBy(id = "mat-option-9"),
            @FindBy(id = "mat-option-10"),
            @FindBy(id = "mat-option-11"),
            @FindBy(id = "mat-option-12"),
            @FindBy(id = "mat-option-13"),
            @FindBy(id = "mat-option-14"),
            @FindBy(id = "mat-option-15"),

    })
    private List<WebElement> selectAreaOptions;

    @FindBy(id = "mat-select-3")
    private WebElement selectReportedBy;

    @FindAll({
            @FindBy(id = "mat-option-16"),
            @FindBy(id = "mat-option-17")
    })
    private List<WebElement> selectedReportedByOptions;

    @FindBy(css = "#mat-checkbox-1 label")
    private WebElement checkReincident;

    @FindBy(css = "#mat-checkbox-2 label")
    private WebElement checkTreatment;

    @FindBy(id = "mat-input-3")
    private WebElement textAreaDescription;

    @FindBy(xpath = "//mat-card-actions/button[2]")
    private WebElement buttonSave;

    @FindBy(xpath = "//mat-card-actions/button[1]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[contains(@class, 'toast-message')][contains(text(), 'El incidente se guardo satisfactoriamente')]")
    private WebElement toastMessage;

    public CreateIncidentPage() {
        CommonEvents.isVisible(title);
    }

    public boolean isTitleVisible() {
        return CommonEvents.isVisible(title);
    }

    public void setFormIncident(List<Map<String, String>> data) {
        checkRadioButtonSeverity(data.get(0).get("Severity"));
        fillInputCode(data.get(0).get("Code"));
        selectOptionIncidentType(data.get(0).get("IncidentType"));
        selectOptionState(data.get(0).get("State"));
        selectOptionArea(data.get(0).get("Area"));
        selectOptionReportedBy(data.get(0).get("ReportedBy"));
        checkReincident(data.get(0).get("Reincident"));
        checkTreatment(data.get(0).get("Treatment"));
        fillDescription(data.get(0).get("Description"));
    }

    public void checkRadioButtonSeverity(String selectedRadioSeverity) {
        WebElement radioSelected = CommonEvents.findWebElement( radioGroupSeverity, selectedRadioSeverity);
        CommonEvents.clickButton(radioSelected);
    }

    public void fillInputCode(String code) {
        CommonEvents.setInputField(inputFieldCode, code);
    }

    public void selectOptionIncidentType(String incidentTypeSelected) {
        CommonEvents.clickButton(selectIncidentType);
        WebElement optionSelected = CommonEvents.findWebElement( selectIncidentTypeOptions, incidentTypeSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void selectOptionState(String stateSelected) {
        CommonEvents.clickButton(selectState);
        WebElement optionSelected = CommonEvents.findWebElement( selectStateOptions, stateSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void selectOptionArea(String areaSelected) {
        CommonEvents.clickButton(selectArea);
        WebElement optionSelected = CommonEvents.findWebElement( selectAreaOptions, areaSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void selectOptionReportedBy(String reportedBySelected) {
        CommonEvents.clickButton(selectReportedBy);
        WebElement optionSelected = CommonEvents.findWebElement(selectedReportedByOptions, reportedBySelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void checkReincident(String reincident) {
        if(Boolean.parseBoolean(reincident))
            CommonEvents.clickButton(checkReincident);
    }

    public void checkTreatment(String treatment) {
        if(Boolean.parseBoolean(treatment))
            CommonEvents.clickButton(checkTreatment);
    }

    public void fillDescription(String description) {
        CommonEvents.setInputField(textAreaDescription, description);
    }

    public IncidentPage clickSaveButton() {
        CommonEvents.clickButton(buttonSave);
        return new IncidentPage();
    }

    public Boolean isButtonEnabled() {
        return CommonEvents.isEnabled(buttonSave);
    }

    public IncidentPage clickOnCancelButton() {
        CommonEvents.clickButton(cancelButton);
        return new IncidentPage();
    }
}
