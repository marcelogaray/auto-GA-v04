package org.umssdiplo.automationv01.core.managepage;

import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Util extends BasePage {

    public void stopWebDriver(){
        CommonEvents.stopServer();
        System.out.println("\n The WebDriver are stoped");
    }
}