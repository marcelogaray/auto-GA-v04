package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(id = "incident-lnk")
    private WebElement incidentLink;

    @FindBy(xpath = "//h1[contains(text(), 'Sistema de seguridad industrial - Grupo D')]")
    private WebElement homePageTitle;

    public void clickIncident() {
        CommonEvents.clickButton(incidentLink);
    }

    public boolean homePageIsVisiable() {
        return CommonEvents.isVisible(homePageTitle);
    }
}
