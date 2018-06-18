package org.umssdiplo.automationv01.core.managepage.Position;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListPosition {
    @FindBy(xpath = "//mat-row")
    private List<WebElement> rows;

    public void listPositions(){
        if(rows != null && rows.size() > 0)
        {
            System.out.println("Exist positions registered and displayed on the list");
        }
        else
        {
            System.out.println("Not exist positions registered.");
        }
    }
}
