package com.sodales.bourns_24hr.pages;
import org.openqa.selenium.*;
import com.sodales.webautomationexecution.Locators;
import org.openqa.selenium.interactions.Actions; 
 import io.qameta.allure.Step;
 import java.util.List;
import org.openqa.selenium.support.ui.Select;
public class Correctiveaction_Plant_App_Display {

    WebElement bdi___mbox_btn_6_BDI_content;

    WebElement div16_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement bdi___mbox_btn_5_BDI_content;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement span___button19_content;

    WebElement circle5_sap;

    WebElement circle1_sap;

    WebElement div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0;

    Locators locator;

    WebDriver driver;

    public Correctiveaction_Plant_App_Display(WebDriver driver, Locators locator) {
        this.locator = locator;
        this.driver = driver;
    }

    public void clickOnElement(WebElement ele) {
        Actions actions = new Actions(driver);
        try {
            actions.moveToElement(ele).click().build().perform();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
            ele.click();
        }
    }

    @Step("Click on the webelement div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0")
    public void div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0_Action_click() {
        div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0 = driver.findElement(locator.getLocator("div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0"));
        clickOnElement(div_application_CorrectiveAction_Plant_App_Display_component___worklist__table_rowsel0);
    }

    @Step("Click on the webelement circle1_sap")
    public void circle1_sap_Action_click() {
        circle1_sap = driver.findElement(locator.getLocator("circle1_sap"));
        clickOnElement(circle1_sap);
    }

    @Step("Click on the webelement circle5_sap")
    public void circle5_sap_Action_click() {
        circle5_sap = driver.findElement(locator.getLocator("circle5_sap"));
        clickOnElement(circle5_sap);
    }

    @Step("Click on the webelement span___button19_content")
    public String span___button19_content_getText() {
        return driver.findElement(locator.getLocator("span___button19_content")).getText().trim();
    }

    @Step("Click on the webelement span___button19_content")
    public void span___button19_content_Action_click() {
        span___button19_content = driver.findElement(locator.getLocator("span___button19_content"));
        clickOnElement(span___button19_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_3_BDI_content")
    public String bdi___mbox_btn_3_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_3_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_3_BDI_content")
    public void bdi___mbox_btn_3_BDI_content_Action_click() {
        bdi___mbox_btn_3_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_3_BDI_content"));
        clickOnElement(bdi___mbox_btn_3_BDI_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_5_BDI_content")
    public String bdi___mbox_btn_5_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_5_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_5_BDI_content")
    public void bdi___mbox_btn_5_BDI_content_Action_click() {
        bdi___mbox_btn_5_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_5_BDI_content"));
        clickOnElement(bdi___mbox_btn_5_BDI_content);
    }

    @Step("Click on the webelement span_meAreaHeaderButton")
    public String span_meAreaHeaderButton_getText() {
        return driver.findElement(locator.getLocator("span_meAreaHeaderButton")).getText().trim();
    }

    @Step("Click on the webelement span_meAreaHeaderButton")
    public void span_meAreaHeaderButton_Action_click() {
        span_meAreaHeaderButton = driver.findElement(locator.getLocator("span_meAreaHeaderButton"));
        clickOnElement(span_meAreaHeaderButton);
    }

    @Step("Click on the webelement div16_Sign_Out")
    public String div16_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div16_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div16_Sign_Out")
    public void div16_Sign_Out_Action_click() {
        div16_Sign_Out = driver.findElement(locator.getLocator("div16_Sign_Out"));
        clickOnElement(div16_Sign_Out);
    }

    @Step("Click on the webelement bdi___mbox_btn_6_BDI_content")
    public String bdi___mbox_btn_6_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_6_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_6_BDI_content")
    public void bdi___mbox_btn_6_BDI_content_Action_click() {
        bdi___mbox_btn_6_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_6_BDI_content"));
        clickOnElement(bdi___mbox_btn_6_BDI_content);
    }
}
