package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Position extends BasePage {
    @FindBy(name = "menuStructure")
    private WebElement menuOrganizationalStructure;

    @FindBy(name = "smPositions")
    private WebElement menuPosition;

    @FindBy(xpath = "//h1[contains(text(), 'Cargos de la empresa')]")
    private WebElement page;

    @FindBy(name = "tblPositions")
    private WebElement table;

    @FindBy(xpath = "//mat-paginator")
    private WebElement paginator;

    public void clickOrganizationalStructure() {
        CommonEvents.clickButton(menuOrganizationalStructure);
        System.out.println("Select the option structure organizational in menu.\n");
    }

    public void clickPositions() throws InterruptedException {
        CommonEvents.clickButton(menuPosition);
        System.out.println("Select the option Positions in sub menu.\n");
    }

    public void validatePagePosition() {
        CommonEvents.isVisible(page);
        System.out.println("The page of Organizational structure - Position is Displayed.");
    }

    public void listPositions() {
        CommonEvents.isVisible(table);
        System.out.println("The table of list Positions is Displayed.");
    }

    public void validPaginator() {
        CommonEvents.isPresent(paginator);
        System.out.println("The list positions have paginator");
    }
}
