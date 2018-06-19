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

    @FindBy(id = "btnCreatePosition")
    private WebElement buttonCreatePosition;

    @FindBy(xpath = "//a[contains(@class, 'linkEdit')]")
    private List<WebElement> linksEditPosition;

    public void clickOrganizationalStructure() {
        CommonEvents.clickButton(menuOrganizationalStructure);
        System.out.println("Select the option structure organizational in menu.\n");
    }

    public void clickPositions() {
        CommonEvents.clickButton(menuPosition);
        System.out.println("Select the option Positions in sub menu.\n");
    }

    public void validatePagePosition() {
        CommonEvents.isVisible(page);
        System.out.println("The page of Organizational structure - Position is Displayed.\n");
    }

    public void listPositions() {
        CommonEvents.isVisible(table);
        System.out.println("The table of list Positions is Displayed.\n");
    }

    public void validPaginator() {
        CommonEvents.isPresent(paginator);
        System.out.println("The list positions have paginator.\n");
    }

    public void clickCreatePositions() {
        CommonEvents.clickButton(buttonCreatePosition);
        System.out.println("Click on button create Position.\n");
    }

    public void clickEditButton(int positionElement) {
        if(linksEditPosition != null){
            WebElement btnEdit = linksEditPosition.get(positionElement);
            CommonEvents.clickButton(btnEdit);
            System.out.println("Click on button Edit of position " + positionElement + ".\n");
        } else {
            System.out.println("Not exist position items in the list.\n");
        }
    }
}
