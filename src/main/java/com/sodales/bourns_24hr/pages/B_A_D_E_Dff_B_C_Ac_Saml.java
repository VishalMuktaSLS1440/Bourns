package com.sodales.bourns_24hr.pages;
import org.openqa.selenium.*;
import com.sodales.webautomationexecution.Locators;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Step;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class B_A_D_E_Dff_B_C_Ac_Saml {

    WebElement input_idSIButton9;

    WebElement input_i0118;

    WebElement input_i0116;

    Locators locator;

    WebDriver driver;

    public B_A_D_E_Dff_B_C_Ac_Saml(WebDriver driver, Locators locator) {
        this.locator = locator;
        this.driver = driver;
    }

    @Step("Double click on the webelement input_i0116")
    public void input_i0116_click() {
        driver.findElement(locator.getLocator("input_i0116")).click();
    }

    @Step("Send the value user2@sodalessolutions.com to the webelement input_i0116")
    public void input_i0116_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_i0116")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input_i0116")).sendKeys(val);
    }

    public String input_i0116_GetAttribute() {
        return driver.findElement(locator.getLocator("input_i0116")).getAttribute("value");
    }

    @Step("Send the value cmFu=EjMzA0clxWYk92UZG9t to the webelement input_i0118")
    public void input_i0118_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_i0118")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input_i0118")).sendKeys(val);
    }

    public String input_i0118_GetAttribute() {
        return driver.findElement(locator.getLocator("input_i0118")).getAttribute("value");
    }

    @Step("Double click on the webelement input_idSIButton9")
    public void input_idSIButton9_click() {
        driver.findElement(locator.getLocator("input_idSIButton9")).click();
    }

    @Step("Double click on the webelement input_i0118")
    public void input_i0118_click() {
        driver.findElement(locator.getLocator("input_i0118")).click();
    }
}
