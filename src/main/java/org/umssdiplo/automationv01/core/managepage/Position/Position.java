package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Position extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Cargos de la empresa')]")
    private WebElement title;

    @FindBy(name = "tblPositions")
    private WebElement table;

    @FindBy(xpath = "//div[contains(text(),'Items per page:')]")
    private WebElement paginator;

    @FindBy(name = "colName")
    private WebElement headerListName;

    @FindBy(name = "colLevel")
    private WebElement headerListLevel;

    @FindBy(name = "colParent")
    private WebElement headerListParent;

    @FindBy(name = "colActions")
    private WebElement headerListActions;

    @FindBy(id = "btnCreatePosition")
    private WebElement buttonCreatePosition;

    public Position() {
        CommonEvents.isVisible(title);
    }

    public boolean validListPositionsIsVisible() {
        return CommonEvents.isVisible(table);
    }

    public boolean validPaginatorIsVisible() {
        return CommonEvents.isVisible(paginator);
    }

    public boolean validHeaderNamePositionListIsVisible() {
        return CommonEvents.isVisible(headerListName);
    }

    public boolean validHeaderLevelPositionListIsVisible() {
        return CommonEvents.isVisible(headerListLevel);
    }

    public boolean validHeaderDependencyPositionListIsVisible() {
        return CommonEvents.isVisible(headerListParent);
    }

    public boolean validHeaderActionsPositionListIsVisible() {
        return CommonEvents.isVisible(headerListActions);
    }

    public CreatePosition clickButtonCreatePosition() {
        CommonEvents.clickButton(buttonCreatePosition);
        return new CreatePosition();
    }

    public boolean validLoadPagePositionsIsVisible() {
        return CommonEvents.isVisible(title);
    }
}
