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
    private WebElement codeInput;

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
    private WebElement descriptionTextArea;

    @FindBy(xpath = "//*[@id=\"form\"]/mat-card-actions/button[2]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(@class, 'toast-message')][contains(text(), 'El incidente se guardo satisfactoriamente')]")
    private WebElement toastMessage;

    public CreateIncidentPage() {
        CommonEvents.isVisible(saveButton);
    }

    public boolean isTitleVisible() {
        return CommonEvents.isVisible(title);
    }

    public void setIncidentForm(List<Map<String, String>> data) {
        fillSeverityRadioBtn(data.get(0).get("Severity"));
        fillCodeInput(data.get(0).get("Code"));
        fillSelectIncidentType(data.get(0).get("IncidentType"));
        fillSelectState(data.get(0).get("State"));
        fillSelectArea(data.get(0).get("Area"));
        fillReportedBy(data.get(0).get("ReportedBy"));
        fillCheckReincident(data.get(0).get("Reincident"));
        fillCheckTreatment(data.get(0).get("Treatment"));
        fillDescription(data.get(0).get("Description"));
    }

    public void fillSeverityRadioBtn(String selectedRadioSeverity) {
        WebElement radioSelected = CommonEvents.findWebElement( radioGroupSeverity, selectedRadioSeverity);
        CommonEvents.clickButton(radioSelected);
    }

    public void fillCodeInput(String code) {
        CommonEvents.setInputField(codeInput, code);
    }

    public void fillSelectIncidentType(String incidentTypeSelected) {
        CommonEvents.clickButton(selectIncidentType);
        WebElement optionSelected = CommonEvents.findWebElement( selectIncidentTypeOptions, incidentTypeSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void fillSelectState(String stateSelected) {
        CommonEvents.clickButton(selectState);
        WebElement optionSelected = CommonEvents.findWebElement( selectStateOptions, stateSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void fillSelectArea(String areaSelected) {
        CommonEvents.clickButton(selectArea);
        WebElement optionSelected = CommonEvents.findWebElement( selectAreaOptions, areaSelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void fillReportedBy(String reportedBySelected) {
        CommonEvents.clickButton(selectReportedBy);
        WebElement optionSelected = CommonEvents.findWebElement(selectedReportedByOptions, reportedBySelected);
        CommonEvents.clickButton(optionSelected);
    }

    public void fillCheckReincident(String reincident) {
        if(Boolean.parseBoolean(reincident))
            CommonEvents.clickButton(checkReincident);
    }

    public void fillCheckTreatment(String treatment) {
        if(Boolean.parseBoolean(treatment))
            CommonEvents.clickButton(checkTreatment);
    }

    public void fillDescription(String description) {
        CommonEvents.setInputField(descriptionTextArea, description);
    }

    public void clickSaveButton() {
        CommonEvents.clickButton(saveButton);
    }

    public Boolean isVisibleToastMessage() {
        return CommonEvents.isVisible(toastMessage);
    }
}
