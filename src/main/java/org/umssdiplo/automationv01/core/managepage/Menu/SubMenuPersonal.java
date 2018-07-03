package org.umssdiplo.automationv01.core.managepage.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.Assign.FormAssignPersonal;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Personnel.PersonnelSearch;
import org.umssdiplo.automationv01.core.managepage.Personnel.ListPersonnel;
import org.umssdiplo.automationv01.core.managepage.Usuario.ListUser;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SubMenuPersonal extends BasePage {

    @FindBy(id = "users")
    private WebElement subMenuUser;

    @FindBy(id = "personal")
    private WebElement subMenuPersonnel;

    @FindBy(id = "smAssign")
    private WebElement subMenuSmAssign;

    public SubMenuPersonal() {
        CommonEvents.isVisible(subMenuUser);
    }

    public ListUser selectSubMenuUser() {
        CommonEvents.clickButton(subMenuUser);
        return new ListUser();
    }

    public boolean selectSubMenuPersonnel() {
        boolean res = CommonEvents.isVisible(subMenuPersonnel);
        if (res) {
            CommonEvents.clickButton(subMenuPersonnel);
        }
        return res;
    }

    public FormAssignPersonal selectSubMenuAssignPersonal() {
        CommonEvents.clickButton(subMenuSmAssign);
        return new FormAssignPersonal();
    }

    public PersonnelSearch getPersonnelSearch() {
        return new PersonnelSearch();
    }

    public ListPersonnel getListPersonnel() {
        return new ListPersonnel();
    }
}
