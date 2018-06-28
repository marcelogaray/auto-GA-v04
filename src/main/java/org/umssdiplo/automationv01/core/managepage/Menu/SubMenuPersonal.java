package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(id = "users")
    private WebElement subMenuUser;

    @FindBy(id = "personal")
    private WebElement subMenuPersonnel;

    public SubMenuPersonal() {
        CommonEvents.isVisible(subMenuUser);
    }

    public ListUser selectSubMenuUsuario() {
        CommonEvents.clickButton(subMenuUser);
        return new ListUser();
    }

    public PersonnelSearch selectSubMenuPersonnel() {
        CommonEvents.clickButton(subMenuPersonnel);
        return new PersonnelSearch();
    }
}
