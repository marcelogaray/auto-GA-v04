package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.Assign.FormAssignPersonal;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(id = "users")
    private WebElement subMenuUser;

    @FindBy(id = "personal")
    private WebElement subMenuPersonnel;

    @FindBy(xpath = "//button[@id='smAssign']")
    private WebElement smAssignSubMenu;

    public SubMenuPersonal() {
        CommonEvents.isVisible(subMenuUser);
    }

    public ListUser selectSubMenuUser() {
        CommonEvents.clickButton(subMenuUser);
        return new ListUser();
    }

    public FormAssignPersonal selectSubMenuAssignPersonal() {
        CommonEvents.clickButton(smAssignSubMenu);
        return new FormAssignPersonal();
    }

    public PersonnelSearch selectSubMenuPersonnel() {
        CommonEvents.clickButton(subMenuPersonnel);
        return new PersonnelSearch();
    }
}
