package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.managepage.Personal.FindPersonal;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(id = "users")
    private WebElement subMenuUsuario;

    @FindBy(id = "personal")
    private WebElement subMenuPersonal;

    public SubMenuPersonal() {
        CommonEvents.isVisible(subMenuUsuario);
    }

    public ListUser selectSubMenuUsuario() {
        CommonEvents.clickButton(subMenuUsuario);
        return new ListUser();
    }

    public FindPersonal selectSubMenuPersonal() {
        CommonEvents.clickButton(subMenuPersonal);
        return new FindPersonal();
    }
}
