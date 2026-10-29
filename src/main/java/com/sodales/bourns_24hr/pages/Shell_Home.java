package com.sodales.bourns_24hr.pages;
import org.openqa.selenium.*;

import com.sodales.webautomationexecution.DriverWait;
import com.sodales.webautomationexecution.Locators;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Step;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Shell_Home {

    WebElement span___tile6_title_inner;

    WebElement div___item0_anchorNavigationBar_3_inner;

    WebElement bdi___mbox_btn_6_BDI_content;

    WebElement div93_24_Hour_Safe;

    WebElement div___item0_anchorNavigationBar_1_inner;

    WebElement span21__;

    WebElement a_application_ReviewIncident_Safety_App_Display_component___notFound__link;

    WebElement div___content11;

    WebElement div92_24_Hour_Safe;

    WebElement div___item10_anchorNavigationBar_2_inner;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement div16_Sign_Out;

    WebElement span___tile3_title_inner;

    WebElement div128_Review_Incid;

    WebElement bdi___mbox_btn_12_BDI_content;

    WebElement div32_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement span___tile5_title_inner;

    WebElement span___tile2_title_inner;

    WebElement div___item0_anchorNavigationBar_2_inner;

    Locators locator;

    WebDriver driver;

    public Shell_Home(WebDriver driver, Locators locator) {
        this.locator = locator;
        this.driver = driver;
    }

    @Step("Click on the webelement div___item0_anchorNavigationBar_2_inner")
    public String div___item0_anchorNavigationBar_2_inner_getText() {
    	 DriverWait wait = new DriverWait(driver, locator);
         wait.waitForPageLoad(driver);
         wait.waitUntilElementWithLocatorIsVisible("a___link3___clone956", 30);
        return driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_2_inner")).getText().trim();
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

    @Step("Click on the webelement div___item0_anchorNavigationBar_2_inner")
    public void div___item0_anchorNavigationBar_2_inner_Action_click() {
        div___item0_anchorNavigationBar_2_inner = driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_2_inner"));
        clickOnElement(div___item0_anchorNavigationBar_2_inner);
    }

    @Step("Click on the webelement span___tile2_title_inner")
    public String span___tile2_title_inner_getText() {
        return driver.findElement(locator.getLocator("span___tile2_title_inner")).getText().trim();
    }

    @Step("Click on the webelement span___tile2_title_inner")
    public void span___tile2_title_inner_Action_click() {
        span___tile2_title_inner = driver.findElement(locator.getLocator("span___tile2_title_inner"));
        clickOnElement(span___tile2_title_inner);
    }

    @Step("Click on the webelement span___tile5_title_inner")
    public String span___tile5_title_inner_getText() {
        return driver.findElement(locator.getLocator("span___tile5_title_inner")).getText().trim();
    }

    @Step("Click on the webelement span___tile5_title_inner")
    public void span___tile5_title_inner_Action_click() {
        span___tile5_title_inner = driver.findElement(locator.getLocator("span___tile5_title_inner"));
        clickOnElement(span___tile5_title_inner);
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

    @Step("Click on the webelement div32_Sign_Out")
    public String div32_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div32_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div32_Sign_Out")
    public void div32_Sign_Out_Action_click() {
        div32_Sign_Out = driver.findElement(locator.getLocator("div32_Sign_Out"));
        clickOnElement(div32_Sign_Out);
    }

    @Step("Click on the webelement bdi___mbox_btn_12_BDI_content")
    public String bdi___mbox_btn_12_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_12_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_12_BDI_content")
    public void bdi___mbox_btn_12_BDI_content_Action_click() {
        bdi___mbox_btn_12_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_12_BDI_content"));
        clickOnElement(bdi___mbox_btn_12_BDI_content);
    }

    @Step("Click on the webelement div128_Review_Incid")
    public String div128_Review_Incid_getText() {
        return driver.findElement(locator.getLocator("div128_Review_Incid")).getText().trim();
    }

    @Step("Click on the webelement div128_Review_Incid")
    public void div128_Review_Incid_Action_click() {
        div128_Review_Incid = driver.findElement(locator.getLocator("div128_Review_Incid"));
        clickOnElement(div128_Review_Incid);
    }

    @Step("Click on the webelement span___tile3_title_inner")
    public String span___tile3_title_inner_getText() {
        return driver.findElement(locator.getLocator("span___tile3_title_inner")).getText().trim();
    }

    @Step("Click on the webelement span___tile3_title_inner")
    public void span___tile3_title_inner_Action_click() {
        span___tile3_title_inner = driver.findElement(locator.getLocator("span___tile3_title_inner"));
        clickOnElement(span___tile3_title_inner);
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

    @Step("Click on the webelement bdi___mbox_btn_3_BDI_content")
    public String bdi___mbox_btn_3_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_3_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_3_BDI_content")
    public void bdi___mbox_btn_3_BDI_content_Action_click() {
        bdi___mbox_btn_3_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_3_BDI_content"));
        clickOnElement(bdi___mbox_btn_3_BDI_content);
    }

    @Step("Click on the webelement div___item10_anchorNavigationBar_2_inner")
    public String div___item10_anchorNavigationBar_2_inner_getText() {
        return driver.findElement(locator.getLocator("div___item10_anchorNavigationBar_2_inner")).getText().trim();
    }

    @Step("Click on the webelement div___item10_anchorNavigationBar_2_inner")
    public void div___item10_anchorNavigationBar_2_inner_Action_click() {
        div___item10_anchorNavigationBar_2_inner = driver.findElement(locator.getLocator("div___item10_anchorNavigationBar_2_inner"));
        clickOnElement(div___item10_anchorNavigationBar_2_inner);
    }

    @Step("Click on the webelement div92_24_Hour_Safe")
    public String div92_24_Hour_Safe_getText() {
        return driver.findElement(locator.getLocator("div92_24_Hour_Safe")).getText().trim();
    }

    @Step("Click on the webelement div92_24_Hour_Safe")
    public void div92_24_Hour_Safe_Action_click() {
        div92_24_Hour_Safe = driver.findElement(locator.getLocator("div92_24_Hour_Safe"));
        clickOnElement(div92_24_Hour_Safe);
    }

    @Step("Click on the webelement div___content11")
    public void div___content11_Action_click() {
        div___content11 = driver.findElement(locator.getLocator("div___content11"));
        clickOnElement(div___content11);
    }

    @Step("Click on the webelement a_application_ReviewIncident_Safety_App_Display_component___notFound__link")
    public String a_application_ReviewIncident_Safety_App_Display_component___notFound__link_getText() {
        return driver.findElement(locator.getLocator("a_application_ReviewIncident_Safety_App_Display_component___notFound__link")).getText().trim();
    }

    @Step("Click on the webelement a_application_ReviewIncident_Safety_App_Display_component___notFound__link")
    public void a_application_ReviewIncident_Safety_App_Display_component___notFound__link_Action_click() {
        a_application_ReviewIncident_Safety_App_Display_component___notFound__link = driver.findElement(locator.getLocator("a_application_ReviewIncident_Safety_App_Display_component___notFound__link"));
        clickOnElement(a_application_ReviewIncident_Safety_App_Display_component___notFound__link);
    }

    @Step("Click on the webelement span21__")
    public String span21___getText() {
        return driver.findElement(locator.getLocator("span21__")).getText().trim();
    }

    @Step("Click on the webelement span21__")
    public void span21___Action_click() {
        span21__ = driver.findElement(locator.getLocator("span21__"));
        clickOnElement(span21__);
    }

    @Step("Click on the webelement div___item0_anchorNavigationBar_1_inner")
    public String div___item0_anchorNavigationBar_1_inner_getText() {
        return driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_1_inner")).getText().trim();
    }

    @Step("Click on the webelement div___item0_anchorNavigationBar_1_inner")
    public void div___item0_anchorNavigationBar_1_inner_Action_click() {
        div___item0_anchorNavigationBar_1_inner = driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_1_inner"));
        clickOnElement(div___item0_anchorNavigationBar_1_inner);
    }

    @Step("Click on the webelement div93_24_Hour_Safe")
    public String div93_24_Hour_Safe_getText() {
        return driver.findElement(locator.getLocator("div93_24_Hour_Safe")).getText().trim();
    }

    @Step("Click on the webelement div93_24_Hour_Safe")
    public void div93_24_Hour_Safe_Action_click() {
        div93_24_Hour_Safe = driver.findElement(locator.getLocator("div93_24_Hour_Safe"));
        clickOnElement(div93_24_Hour_Safe);
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

    @Step("Click on the webelement div___item0_anchorNavigationBar_3_inner")
    public String div___item0_anchorNavigationBar_3_inner_getText() {
        return driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_3_inner")).getText().trim();
    }

    @Step("Click on the webelement div___item0_anchorNavigationBar_3_inner")
    public void div___item0_anchorNavigationBar_3_inner_Action_click() {
        div___item0_anchorNavigationBar_3_inner = driver.findElement(locator.getLocator("div___item0_anchorNavigationBar_3_inner"));
        clickOnElement(div___item0_anchorNavigationBar_3_inner);
    }

    @Step("Click on the webelement span___tile6_title_inner")
    public String span___tile6_title_inner_getText() {
        return driver.findElement(locator.getLocator("span___tile6_title_inner")).getText().trim();
    }

    @Step("Click on the webelement span___tile6_title_inner")
    public void span___tile6_title_inner_Action_click() {
        span___tile6_title_inner = driver.findElement(locator.getLocator("span___tile6_title_inner"));
        clickOnElement(span___tile6_title_inner);
    }
}
