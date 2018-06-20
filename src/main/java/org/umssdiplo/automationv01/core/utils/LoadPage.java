package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Position.CreatePosition;
import org.umssdiplo.automationv01.core.managepage.Position.EditPosition;
import org.umssdiplo.automationv01.core.managepage.Position.ListPosition;
import org.umssdiplo.automationv01.core.managepage.Position.Position;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static Position positionPage() {
        return new Position();
    }

    public static ListPosition listPositions() {
        return new ListPosition();
    }

    public static CreatePosition createPositionPage() {
        return new CreatePosition();
    }

    public static EditPosition editPositionPage() {
        return new EditPosition();
    }
}
