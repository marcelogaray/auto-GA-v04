package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Menu.Menu;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Sistema de seguridad industrial')]")
    private WebElement title;

    @FindBy(xpath = "//button/span[contains(text(),'Inicio')]")
    private WebElement mainMenu;

    public Home() {
        CommonEvents.isVisible(title);
    }

    public Menu getHomeMenu() {
        return new Menu();
    }
}