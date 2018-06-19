$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Login feature review the behavior in thie feature"
    }
  ],
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Home page is displayed once set credential in login page",
  "description": "",
  "id": "login;home-page-is-displayed-once-set-credential-in-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "\u0027PHP travel\u0027 page is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "set my credentials on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.phpTravelPageIsLoaded()"
});
formatter.result({
  "duration": 11108756700,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.setMyCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 15308625100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d67.0.3396.87)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-SQGED5O\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\CBATMP~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.87, webStorageEnabled: true}\nSession ID: 6ec6665bc7befe873af40cda470440e6\n*** Element info: {Using\u003dname, value\u003demail}\r\n\tat sun.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:395)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.toString(Unknown Source)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.toString(ExpectedConditions.java:306)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:267)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.setInputField(CommonEvents.java:21)\r\n\tat org.umssdiplo.automationv01.core.managepage.Login.Login.setCredentials(Login.java:22)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.setMyCredentialsOnLoginPage(StepsDefinitionPHPtravel.java:19)\r\n\tat ✽.And set my credentials on \u0027Login\u0027 page(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.uri("redirectFileStepDefintions.feature");
formatter.feature({
  "line": 1,
  "name": "RedirectNewFile",
  "description": "",
  "id": "redirectnewfile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing new path",
  "description": "",
  "id": "redirectnewfile;testing-new-path",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Tesitng path to generate filed",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepdef.tesitngPathToGenerateFiled()"
});
formatter.result({
  "duration": 431201,
  "status": "passed"
});
formatter.uri("userFeatureFiles.feature");
formatter.feature({
  "line": 1,
  "name": "testing",
  "description": "",
  "id": "testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "first scenario",
  "description": "",
  "id": "testing;first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@bvt"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "first introduction to cucumber with java",
  "keyword": "Given "
});
formatter.match({
  "location": "GeneralSteps.firstIntroductionToCucumberWithJava()"
});
formatter.result({
  "duration": 143900,
  "status": "passed"
});
});