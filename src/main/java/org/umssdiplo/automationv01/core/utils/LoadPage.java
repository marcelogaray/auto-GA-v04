package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.ProgramSSO.ProgramaSSO;
import org.umssdiplo.automationv01.core.managepage.Util;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static ProgramaSSO programaSSO(){
        return new ProgramaSSO();
    }
    public static Util util(){
        return new Util();
    }
}
