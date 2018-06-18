package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.users.EditUser;
import org.umssdiplo.automationv01.core.managepage.users.ListUser;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static ListUser listUserPage() {
        return new ListUser();
    }

    public static EditUser getEditUserPage() {
        return new EditUser();
    }
}
