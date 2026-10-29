package com.sodales.bourns_24hr.pages;
import org.openqa.selenium.*;
import com.sodales.webautomationexecution.Locators;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Step;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class B_A_D_E_Dff_B_C_Ac_Login {

    WebElement input_idSIButton9;

    Locators locator;

    WebDriver driver;

    public B_A_D_E_Dff_B_C_Ac_Login(WebDriver driver, Locators locator) {
        this.locator = locator;
        this.driver = driver;
    }

    @Step("Double click on the webelement input_idSIButton9")
    public void input_idSIButton9_click() {
        driver.findElement(locator.getLocator("input_idSIButton9")).click();
    }
}
