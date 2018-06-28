package org.umssdiplo.automationv01.core.managepage.Personal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FindPersonal extends BasePage {

    @FindBy(name = "buscarPersonal")
    private WebElement inputFindPerson;

    @FindBy(css = ".mat-paginator-range-label")
    private WebElement paginator;

    public FindPersonal(){
        CommonEvents.isVisible(inputFindPerson);
        CommonEvents.isVisible(paginator);
    }

    public boolean validateInputFindPersonIsVisible(){
        return CommonEvents.isVisible(inputFindPerson);
    }

    public void setTextFindPerson(String personal){
        CommonEvents.setInputField(inputFindPerson, personal);
    }

    public int validatePersonFound(int x){
        int encontrado = -1;
        String paginadorTexto = paginator.getText();
        String[] listaDeValores = paginadorTexto.split("of");
        String tamTable = listaDeValores[listaDeValores.length-1];
        tamTable = tamTable.replaceAll("\\s","");
        encontrado = Integer.parseInt(tamTable);
        return encontrado;
    }
}
