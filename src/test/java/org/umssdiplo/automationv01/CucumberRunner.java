package org.umssdiplo.automationv01;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.umssdiplo.automationv01.core.managepage.Util;

@CucumberOptions(
        features = {"src/test/resources/features"},
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests{
    @AfterTest
    public void closeWebDriver(){
        Util util = new Util();
        util.stopWebDriver();
    }
}
