package org.umssdiplo.automationv01.core.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.util.List;

public class CommonEvents {

    final static Logger logger = Logger.getLogger(CommonEvents.class);

    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is enabled.
     *
     * @param webElement is the web element.
     * @return true if web element is enabled or false if it isn't enabled.
     */
    public static boolean isEnabled(WebElement webElement) {
        try {
            ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            logger.error("Element do not exits!");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            logger.error("Element do not exits!");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            logger.error("Element do not exists!");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    /**
     * This method return the text value of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text value of the WebElement.
     */
    public static String getTextValue(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getAttribute("value");
    }

    /**
     * This method return the boolean value of a WebElement.
     *
     * @param webElement is the WebElement to valid the text is empty.
     * @return the boolean value if text is empty of the WebElement.
     */
    public static boolean isInputEmpty(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));

        if (CommonEvents.getTextValue(webElement) != null && !CommonEvents.getTextValue(webElement).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
