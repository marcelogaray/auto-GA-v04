package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import org.umssdiplo.automationv01.core.managepage.Util;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsUtils {
    private Util util;

    @And("^stop web driver$")
    public void stopWebDriver() {
        util = LoadPage.util();
        util.stopWebDriver();
    }
}