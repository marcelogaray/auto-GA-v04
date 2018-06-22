package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Position extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Cargos de la empresa')]")
    private WebElement title;

    @FindBy(name = "tblPositions")
    private WebElement table;

    @FindBy(xpath = "//mat-row")
    private List<WebElement> rowsPosition;

    @FindBy(xpath = "//div/div[contains(text(),'Items per page:')]")
    private WebElement paginator;

    public Position() {
        CommonEvents.isVisible(title);
    }

    public Boolean validListPositions() {
        validateRowsPositionsRegistered();
        return CommonEvents.isVisible(table);
    }

    private void validateRowsPositionsRegistered() {
        if (rowsPosition != null && rowsPosition.size() > 0) {
            System.out.println("Existen cargos registrados que se ven en el listado correctamente.");
        } else {
            System.out.println("No existen cargos registrados.");
        }
    }

    public Boolean validPaginator() {
        return CommonEvents.isVisible(paginator);
    }
}
