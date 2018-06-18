package org.umssdiplo.automationv01.core.managepage.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ListUser extends BasePage{

    @FindBy(name = "menuPersonal")
    private WebElement menuPersonal;

    @FindBy(name = "users")
    private WebElement subMenuUser;

    @FindBy(xpath = "/html/body/ssi-root/ssi-users/div/div/div[4]/mat-table/mat-row[2]/mat-cell[4]/button[2]")
    private WebElement editButton;

    public void listUsers() {
        System.out.println("================= List Users ===================");
        CommonEvents.clickButton(menuPersonal);
        CommonEvents.clickButton(subMenuUser);
        System.out.println("================= End List Users ===================");
    }

    public void clickEditUser(){
        System.out.println("================= Click Edit Button ===================");
        CommonEvents.clickButton(editButton);
        System.out.println("================= Button clicked ===================");
    }
}
