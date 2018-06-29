package org.umssdiplo.automationv01.core.managepage.Personnel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PersonnelSearch extends BasePage {

    @FindBy(name = "buscarPersonal")
    private WebElement inputFindPersonnel;

    @FindBy(css = ".mat-paginator-range-label")
    private WebElement paginator;

    public PersonnelSearch(){
        CommonEvents.isVisible(inputFindPersonnel);
        CommonEvents.isVisible(paginator);
    }

    public boolean validateInputFindPersonIsVisible(){
        return CommonEvents.isVisible(inputFindPersonnel);
    }

    public void setTextFindPerson(String person){
        CommonEvents.setInputField(inputFindPersonnel, person);
    }

    public int validatePersonnelFound(int x){
        int found = -1;
        String paginatorText = paginator.getText();
        String[] values = paginatorText.split("of");
        String tableSearchSize = values[values.length-1];
        tableSearchSize = tableSearchSize.replaceAll("\\s","");
        found = Integer.parseInt(tableSearchSize);
        return found;
    }
}
