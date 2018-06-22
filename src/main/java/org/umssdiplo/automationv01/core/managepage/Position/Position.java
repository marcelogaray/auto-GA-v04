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

    public Position() {
        CommonEvents.isVisible(title);
    }

    public boolean validListPositions() {
        return CommonEvents.isVisible(table);
    }

    public boolean validPaginator() {
        return CommonEvents.isVisible(paginator);
    }
}
