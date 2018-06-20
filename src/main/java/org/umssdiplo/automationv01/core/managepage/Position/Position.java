package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Position extends BasePage {
    @FindBy(id = "menuStructure")
    private WebElement menuOrganizationalStructure;

    @FindBy(id = "smPositions")
    private WebElement menuPosition;

    @FindBy(xpath = "//h1[contains(text(), 'Cargos de la empresa')]")
    private WebElement page;

    @FindBy(name = "tblPositions")
    private WebElement table;

    @FindBy(xpath = "//mat-paginator")
    private WebElement paginator;

    @FindBy(xpath = "//mat-row")
    private List<WebElement> rowsPosition;

    public void clickOrganizationalStructure() {
        CommonEvents.isVisible(menuOrganizationalStructure);
        CommonEvents.clickButton(menuOrganizationalStructure);
    }

    public void clickPositions() throws InterruptedException {
        CommonEvents.isVisible(menuPosition);
        CommonEvents.clickButton(menuPosition);
    }

    public void validatePagePosition() {
        CommonEvents.isVisible(page);
    }

    public void listPositions() {
        CommonEvents.isPresent(table);
        validateRowsPositionsRegistered();
    }

    private void validateRowsPositionsRegistered() {
        if (rowsPosition != null && rowsPosition.size() > 0) {
            System.out.println("Existen cargos registrados que se ven en el listado correctamente.");
        } else {
            System.out.println("No existen cargos registrados.");
        }
    }

    public void validPaginator() {
        CommonEvents.isPresent(paginator);
    }
}
