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

public class Reviewincident_Safety_App_Display {

    WebElement a___link3___clone956;

    WebElement bdi___button83_BDI_content;

    WebElement bdi___button76_BDI_content;

    WebElement div214_Sign_Out;

    WebElement span___mbox_btn_2_content;

    WebElement span53_2;

    WebElement div171_Near_Miss;

    WebElement div44_BAG__Bourns_;

    WebElement input__idForBournsC_inner;

    WebElement bdi___mbox_btn_8_BDI_content;

    WebElement bdi___mbox_btn_6_BDI_content;

    WebElement bdi___button79_BDI_content;

    WebElement a___link6___clone1320;

    WebElement bdi___mbox_btn_5_BDI_content;

    WebElement bdi___button126_BDI_content;

    WebElement a___link3___clone770;

    WebElement div268_Sign_Out;

    WebElement div337_Home;

    WebElement span279_Review_Incid;

    WebElement bdi___mbox_btn_11_BDI_content;

    WebElement bdi___mbox_btn_9_BDI_content;

    WebElement bdi___button14_BDI_content;

    WebElement a___link1___clone294;

    WebElement a___link1___clone297;

    WebElement a___link1___clone539;

    WebElement bdi___mbox_btn_15_BDI_content;

    WebElement div207_Sign_Out;

    WebElement bdi___mbox_btn_14_BDI_content;

    WebElement bdi___mbox_btn_12_BDI_content;

    WebElement bdi___button26_BDI_content;

    WebElement a___link1___clone472;

    WebElement a___link1___clone458;

    WebElement button___mbox_btn_25;

    WebElement div403_Sign_Out;

    WebElement button___mbox_btn_24;

    WebElement button___mbox_btn_22;

    WebElement span___button41_content;

    WebElement a___link5___clone1168;

    WebElement span22__;

    WebElement img_shell_header_icon;

    WebElement bdi___mbox_btn_18_BDI_content;

    WebElement div736_Sign_Out;

    WebElement span___mbox_btn_17_inner;

    WebElement button___mbox_btn_15;

    WebElement bdi___button29_BDI_content;

    WebElement a___link1___clone251;

    WebElement a___link1___clone405;

    WebElement div18_BAG_Accident;

    WebElement span___input14_vhi;

    WebElement span___mbox_btn_3_content;

    WebElement span___button6_inner;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight;

    WebElement a___link1___clone240;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2;

    WebElement span___text51___clone278;

    WebElement div___list0_2_logoutBtn_content;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb;

    WebElement div451_Closed;

    WebElement span___text51___clone238;

    WebElement div16_Sign_Out;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4;

    WebElement span___text51___clone318;

    WebElement div153_Sign_Out;

    WebElement bdi___mbox_btn_2_BDI_content;

    WebElement input___picker1_inner;

    WebElement div168_Incident;

    WebElement div47_BAG__Bourns_;

    WebElement span___mbox_btn_2_inner;

    WebElement span___mbox_btn_0_content;

    WebElement bdi___button8_BDI_content;

    WebElement span59_5;

    WebElement span___picker1_icon;

    WebElement div165_Incident;

    WebElement span__idForCategoryC_arrow;

    WebElement div47_BAG;

    WebElement span__idForBournsC_arrow;

    WebElement bdi___button7_BDI_content;

    WebElement bdi___mbox_btn_0_BDI_content;

    WebElement div15_Sign_Out;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1;

    WebElement bdi___button6_BDI_content;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement div140_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement bdi___bar0_btnClear_BDI_content;

    WebElement div141_BAG_Accident;

    WebElement div_idSearchCtrlNo_search;

    WebElement input_idSearchCtrlNo_I;

    WebElement span___input6_vhi;

    WebElement a___link1___clone280;

    WebElement bdi___bar0_btnGo_BDI_content;

    WebElement div12_BAG__Bourns_;

    WebElement span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow;

    WebElement a___link1___clone220;

    WebElement span___bar0_btnGo_inner;

    WebElement div18_BAG__Bourns_;

    WebElement span___input10_vhi;

    Locators locator;

    WebDriver driver;

    public Reviewincident_Safety_App_Display(WebDriver driver, Locators locator) {
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

    @Step("Click on the webelement span___input10_vhi")
    public void span___input10_vhi_Action_click() {
        span___input10_vhi = driver.findElement(locator.getLocator("span___input10_vhi"));
        clickOnElement(span___input10_vhi);
    }

    @Step("Click on the webelement div18_BAG__Bourns_")
    public String div18_BAG__Bourns__getText() {
        return driver.findElement(locator.getLocator("div18_BAG__Bourns_")).getText().trim();
    }

    @Step("Click on the webelement div18_BAG__Bourns_")
    public void div18_BAG__Bourns__Action_click() {
        div18_BAG__Bourns_ = driver.findElement(locator.getLocator("div18_BAG__Bourns_"));
        clickOnElement(div18_BAG__Bourns_);
    }

    @Step("Click on the webelement span___bar0_btnGo_inner")
    public String span___bar0_btnGo_inner_getText() {
        return driver.findElement(locator.getLocator("span___bar0_btnGo_inner")).getText().trim();
    }

    @Step("Click on the webelement span___bar0_btnGo_inner")
    public void span___bar0_btnGo_inner_Action_click() {
        span___bar0_btnGo_inner = driver.findElement(locator.getLocator("span___bar0_btnGo_inner"));
        clickOnElement(span___bar0_btnGo_inner);
    }

    @Step("Click on the webelement a___link1___clone220")
    public String a___link1___clone220_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone220")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone220")
    public void a___link1___clone220_Action_click() {
        a___link1___clone220 = driver.findElement(locator.getLocator("a___link1___clone220"));
        clickOnElement(a___link1___clone220);
    }

    @Step("Click on the webelement span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow")
    public void span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow_Action_click() {
        span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow = driver.findElement(locator.getLocator("span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow"));
        clickOnElement(span_application_ReviewIncident_Safety_App_Display_component___worklist__idBournsFacilitys_arrow);
    }

    @Step("Click on the webelement div12_BAG__Bourns_")
    public String div12_BAG__Bourns__getText() {
        return driver.findElement(locator.getLocator("div12_BAG__Bourns_")).getText().trim();
    }

    @Step("Click on the webelement div12_BAG__Bourns_")
    public void div12_BAG__Bourns__Action_click() {
        div12_BAG__Bourns_ = driver.findElement(locator.getLocator("div12_BAG__Bourns_"));
        clickOnElement(div12_BAG__Bourns_);
    }

    @Step("Click on the webelement bdi___bar0_btnGo_BDI_content")
    public String bdi___bar0_btnGo_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___bar0_btnGo_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___bar0_btnGo_BDI_content")
    public void bdi___bar0_btnGo_BDI_content_Action_click() {
        bdi___bar0_btnGo_BDI_content = driver.findElement(locator.getLocator("bdi___bar0_btnGo_BDI_content"));
        clickOnElement(bdi___bar0_btnGo_BDI_content);
    }

    @Step("Capture the runtime value of the webelement a___link1___clone280 into the variable incidentId")
    public String a___link1___clone280_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("a___link1___clone280"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element a___link1___clone280. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement a___link1___clone280")
    public String a___link1___clone280_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone280")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone280")
    public void a___link1___clone280_Action_click() {
        a___link1___clone280 = driver.findElement(locator.getLocator("a___link1___clone280"));
        clickOnElement(a___link1___clone280);
    }

    @Step("Click on the webelement span___input6_vhi")
    public void span___input6_vhi_Action_click() {
        span___input6_vhi = driver.findElement(locator.getLocator("span___input6_vhi"));
        clickOnElement(span___input6_vhi);
    }

    @Step("Send the value BAG-Accident-037 to the webelement input_idSearchCtrlNo_I")
    public void input_idSearchCtrlNo_I_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_idSearchCtrlNo_I")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input_idSearchCtrlNo_I")).sendKeys(val);
    }

    public String input_idSearchCtrlNo_I_GetAttribute() {
        return driver.findElement(locator.getLocator("input_idSearchCtrlNo_I")).getAttribute("value");
    }

    @Step("Click on the webelement div_idSearchCtrlNo_search")
    public void div_idSearchCtrlNo_search_Action_click() {
        div_idSearchCtrlNo_search = driver.findElement(locator.getLocator("div_idSearchCtrlNo_search"));
        clickOnElement(div_idSearchCtrlNo_search);
    }

    @Step("Capture the runtime value of the webelement div141_BAG_Accident into the variable incidentId")
    public String div141_BAG_Accident_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("div141_BAG_Accident"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element div141_BAG_Accident. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement div141_BAG_Accident")
    public String div141_BAG_Accident_getText() {
        return driver.findElement(locator.getLocator("div141_BAG_Accident")).getText().trim();
    }

    @Step("Click on the webelement div141_BAG_Accident")
    public void div141_BAG_Accident_Action_click() {
        div141_BAG_Accident = driver.findElement(locator.getLocator("div141_BAG_Accident"));
        clickOnElement(div141_BAG_Accident);
    }

    @Step("Click on the webelement bdi___bar0_btnClear_BDI_content")
    public String bdi___bar0_btnClear_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___bar0_btnClear_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___bar0_btnClear_BDI_content")
    public void bdi___bar0_btnClear_BDI_content_Action_click() {
        bdi___bar0_btnClear_BDI_content = driver.findElement(locator.getLocator("bdi___bar0_btnClear_BDI_content"));
        clickOnElement(bdi___bar0_btnClear_BDI_content);
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

    @Step("Click on the webelement div140_Sign_Out")
    public String div140_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div140_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div140_Sign_Out")
    public void div140_Sign_Out_Action_click() {
        div140_Sign_Out = driver.findElement(locator.getLocator("div140_Sign_Out"));
        clickOnElement(div140_Sign_Out);
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

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0 = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0);
    }

    @Step("Click on the webelement bdi___button6_BDI_content")
    public String bdi___button6_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button6_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button6_BDI_content")
    public void bdi___button6_BDI_content_Action_click() {
        bdi___button6_BDI_content = driver.findElement(locator.getLocator("bdi___button6_BDI_content"));
        clickOnElement(bdi___button6_BDI_content);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1 = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel1);
    }

    @Step("Click on the webelement div15_Sign_Out")
    public String div15_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div15_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div15_Sign_Out")
    public void div15_Sign_Out_Action_click() {
        div15_Sign_Out = driver.findElement(locator.getLocator("div15_Sign_Out"));
        clickOnElement(div15_Sign_Out);
    }

    @Step("Click on the webelement bdi___mbox_btn_0_BDI_content")
    public String bdi___mbox_btn_0_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_0_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_0_BDI_content")
    public void bdi___mbox_btn_0_BDI_content_Action_click() {
        bdi___mbox_btn_0_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_0_BDI_content"));
        clickOnElement(bdi___mbox_btn_0_BDI_content);
    }

    @Step("Click on the webelement bdi___button7_BDI_content")
    public String bdi___button7_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button7_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button7_BDI_content")
    public void bdi___button7_BDI_content_Action_click() {
        bdi___button7_BDI_content = driver.findElement(locator.getLocator("bdi___button7_BDI_content"));
        clickOnElement(bdi___button7_BDI_content);
    }

    @Step("Click on the webelement span__idForBournsC_arrow")
    public void span__idForBournsC_arrow_Action_click() {
        span__idForBournsC_arrow = driver.findElement(locator.getLocator("span__idForBournsC_arrow"));
        clickOnElement(span__idForBournsC_arrow);
    }

    @Step("Click on the webelement div47_BAG")
    public String div47_BAG_getText() {
        return driver.findElement(locator.getLocator("div47_BAG")).getText().trim();
    }

    @Step("Click on the webelement div47_BAG")
    public void div47_BAG_Action_click() {
        div47_BAG = driver.findElement(locator.getLocator("div47_BAG"));
        clickOnElement(div47_BAG);
    }

    @Step("Click on the webelement span__idForCategoryC_arrow")
    public void span__idForCategoryC_arrow_Action_click() {
        span__idForCategoryC_arrow = driver.findElement(locator.getLocator("span__idForCategoryC_arrow"));
        clickOnElement(span__idForCategoryC_arrow);
    }

    @Step("Click on the webelement div165_Incident")
    public String div165_Incident_getText() {
        return driver.findElement(locator.getLocator("div165_Incident")).getText().trim();
    }

    @Step("Click on the webelement div165_Incident")
    public void div165_Incident_Action_click() {
        div165_Incident = driver.findElement(locator.getLocator("div165_Incident"));
        clickOnElement(div165_Incident);
    }

    @Step("Click on the webelement span___picker1_icon")
    public void span___picker1_icon_Action_click() {
        span___picker1_icon = driver.findElement(locator.getLocator("span___picker1_icon"));
        clickOnElement(span___picker1_icon);
    }

    @Step("Click on the webelement span59_5")
    public String span59_5_getText() {
        return driver.findElement(locator.getLocator("span59_5")).getText().trim();
    }

    @Step("Click on the webelement span59_5")
    public void span59_5_Action_click() {
        span59_5 = driver.findElement(locator.getLocator("//div[@id='__picker12-cal--Month0-20260901']"));
        clickOnElement(span59_5);
    }

    @Step("Click on the webelement bdi___button8_BDI_content")
    public String bdi___button8_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button8_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button8_BDI_content")
    public void bdi___button8_BDI_content_Action_click() {
        bdi___button8_BDI_content = driver.findElement(locator.getLocator("bdi___button8_BDI_content"));
        clickOnElement(bdi___button8_BDI_content);
    }

    @Step("Click on the webelement span___mbox_btn_0_content")
    public String span___mbox_btn_0_content_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_0_content")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_0_content")
    public void span___mbox_btn_0_content_Action_click() {
        span___mbox_btn_0_content = driver.findElement(locator.getLocator("span___mbox_btn_0_content"));
        clickOnElement(span___mbox_btn_0_content);
    }

    @Step("Click on the webelement span___mbox_btn_2_inner")
    public String span___mbox_btn_2_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_2_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_2_inner")
    public void span___mbox_btn_2_inner_Action_click() {
        span___mbox_btn_2_inner = driver.findElement(locator.getLocator("span___mbox_btn_2_inner"));
        clickOnElement(span___mbox_btn_2_inner);
    }

    @Step("Click on the webelement div47_BAG__Bourns_")
    public String div47_BAG__Bourns__getText() {
        return driver.findElement(locator.getLocator("div47_BAG__Bourns_")).getText().trim();
    }

    @Step("Click on the webelement div47_BAG__Bourns_")
    public void div47_BAG__Bourns__Action_click() {
        div47_BAG__Bourns_ = driver.findElement(locator.getLocator("div47_BAG__Bourns_"));
        clickOnElement(div47_BAG__Bourns_);
    }

    @Step("Click on the webelement div168_Incident")
    public String div168_Incident_getText() {
        return driver.findElement(locator.getLocator("div168_Incident")).getText().trim();
    }

    @Step("Click on the webelement div168_Incident")
    public void div168_Incident_Action_click() {
        div168_Incident = driver.findElement(locator.getLocator("div168_Incident"));
        clickOnElement(div168_Incident);
    }

    @Step("Double click on the webelement input___picker1_inner")
    public void input___picker1_inner_click() {
        driver.findElement(locator.getLocator("input___picker1_inner")).click();
    }

    @Step("Send the value 01/09/2026 to the webelement input___picker1_inner")
    public void input___picker1_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker1_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker1_inner")).sendKeys(val);
    }

    public String input___picker1_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker1_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___mbox_btn_2_BDI_content")
    public String bdi___mbox_btn_2_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_2_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_2_BDI_content")
    public void bdi___mbox_btn_2_BDI_content_Action_click() {
        bdi___mbox_btn_2_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_2_BDI_content"));
        clickOnElement(bdi___mbox_btn_2_BDI_content);
    }

    @Step("Click on the webelement div153_Sign_Out")
    public String div153_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div153_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div153_Sign_Out")
    public void div153_Sign_Out_Action_click() {
        div153_Sign_Out = driver.findElement(locator.getLocator("div153_Sign_Out"));
        clickOnElement(div153_Sign_Out);
    }

    @Step("Click on the webelement span___text51___clone318")
    public String span___text51___clone318_getText() {
        return driver.findElement(locator.getLocator("span___text51___clone318")).getText().trim();
    }

    @Step("Click on the webelement span___text51___clone318")
    public void span___text51___clone318_Action_click() {
        span___text51___clone318 = driver.findElement(locator.getLocator("span___text51___clone318"));
        clickOnElement(span___text51___clone318);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4 = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel4);
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

    @Step("Click on the webelement span___text51___clone238")
    public String span___text51___clone238_getText() {
        return driver.findElement(locator.getLocator("span___text51___clone238")).getText().trim();
    }

    @Step("Click on the webelement span___text51___clone238")
    public void span___text51___clone238_Action_click() {
        span___text51___clone238 = driver.findElement(locator.getLocator("span___text51___clone238"));
        clickOnElement(span___text51___clone238);
    }

    @Step("Click on the webelement div451_Closed")
    public String div451_Closed_getText() {
        return driver.findElement(locator.getLocator("div451_Closed")).getText().trim();
    }

    @Step("Click on the webelement div451_Closed")
    public void div451_Closed_Action_click() {
        div451_Closed = driver.findElement(locator.getLocator("div451_Closed"));
        clickOnElement(div451_Closed);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_hsb);
    }

    @Step("Click on the webelement div___list0_2_logoutBtn_content")
    public String div___list0_2_logoutBtn_content_getText() {
        return driver.findElement(locator.getLocator("div___list0_2_logoutBtn_content")).getText().trim();
    }

    @Step("Click on the webelement div___list0_2_logoutBtn_content")
    public void div___list0_2_logoutBtn_content_Action_click() {
        div___list0_2_logoutBtn_content = driver.findElement(locator.getLocator("div___list0_2_logoutBtn_content"));
        clickOnElement(div___list0_2_logoutBtn_content);
    }

    @Step("Click on the webelement span___text51___clone278")
    public String span___text51___clone278_getText() {
        return driver.findElement(locator.getLocator("span___text51___clone278")).getText().trim();
    }

    @Step("Click on the webelement span___text51___clone278")
    public void span___text51___clone278_Action_click() {
        span___text51___clone278 = driver.findElement(locator.getLocator("span___text51___clone278"));
        clickOnElement(span___text51___clone278);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2 = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel2);
    }

    @Step("Click on the webelement a___link1___clone240")
    public String a___link1___clone240_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone240")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone240")
    public void a___link1___clone240_Action_click() {
        a___link1___clone240 = driver.findElement(locator.getLocator("a___link1___clone240"));
        clickOnElement(a___link1___clone240);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row1_highlight);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight")
    public void div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rows_row0_highlight);
    }

    @Step("Click on the webelement span___button6_inner")
    public String span___button6_inner_getText() {
        return driver.findElement(locator.getLocator("span___button6_inner")).getText().trim();
    }

    @Step("Click on the webelement span___button6_inner")
    public void span___button6_inner_Action_click() {
        span___button6_inner = driver.findElement(locator.getLocator("span___button6_inner"));
        clickOnElement(span___button6_inner);
    }

    @Step("Click on the webelement span___mbox_btn_3_content")
    public String span___mbox_btn_3_content_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_3_content")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_3_content")
    public void span___mbox_btn_3_content_Action_click() {
        span___mbox_btn_3_content = driver.findElement(locator.getLocator("span___mbox_btn_3_content"));
        clickOnElement(span___mbox_btn_3_content);
    }

    @Step("Click on the webelement span___input14_vhi")
    public void span___input14_vhi_Action_click() {
        span___input14_vhi = driver.findElement(locator.getLocator("span___input14_vhi"));
        clickOnElement(span___input14_vhi);
    }

    @Step("Click on the webelement div18_BAG_Accident")
    public String div18_BAG_Accident_getText() {
        return driver.findElement(locator.getLocator("div18_BAG_Accident")).getText().trim();
    }

    @Step("Click on the webelement div18_BAG_Accident")
    public void div18_BAG_Accident_Action_click() {
        div18_BAG_Accident = driver.findElement(locator.getLocator("div18_BAG_Accident"));
        clickOnElement(div18_BAG_Accident);
    }

    @Step("Click on the webelement a___link1___clone405")
    public String a___link1___clone405_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone405")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone405")
    public void a___link1___clone405_Action_click() {
        a___link1___clone405 = driver.findElement(locator.getLocator("a___link1___clone405"));
        clickOnElement(a___link1___clone405);
    }

    @Step("Click on the webelement a___link1___clone251")
    public String a___link1___clone251_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone251")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone251")
    public void a___link1___clone251_Action_click() {
        a___link1___clone251 = driver.findElement(locator.getLocator("a___link1___clone251"));
        clickOnElement(a___link1___clone251);
    }

    @Step("Click on the webelement bdi___button29_BDI_content")
    public String bdi___button29_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button29_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button29_BDI_content")
    public void bdi___button29_BDI_content_Action_click() {
        bdi___button29_BDI_content = driver.findElement(locator.getLocator("bdi___button29_BDI_content"));
        clickOnElement(bdi___button29_BDI_content);
    }

    @Step("Click on the webelement button___mbox_btn_15")
    public String button___mbox_btn_15_getText() {
        return driver.findElement(locator.getLocator("button___mbox_btn_15")).getText().trim();
    }

    @Step("Double click on the webelement button___mbox_btn_15")
    public void button___mbox_btn_15_click() {
        driver.findElement(locator.getLocator("button___mbox_btn_15")).click();
    }

    @Step("Click on the webelement span___mbox_btn_17_inner")
    public String span___mbox_btn_17_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_17_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_17_inner")
    public void span___mbox_btn_17_inner_Action_click() {
        span___mbox_btn_17_inner = driver.findElement(locator.getLocator("span___mbox_btn_17_inner"));
        clickOnElement(span___mbox_btn_17_inner);
    }

    @Step("Click on the webelement div736_Sign_Out")
    public String div736_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div736_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div736_Sign_Out")
    public void div736_Sign_Out_Action_click() {
        div736_Sign_Out = driver.findElement(locator.getLocator("div736_Sign_Out"));
        clickOnElement(div736_Sign_Out);
    }

    @Step("Click on the webelement bdi___mbox_btn_18_BDI_content")
    public String bdi___mbox_btn_18_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_18_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_18_BDI_content")
    public void bdi___mbox_btn_18_BDI_content_Action_click() {
        bdi___mbox_btn_18_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_18_BDI_content"));
        clickOnElement(bdi___mbox_btn_18_BDI_content);
    }

    @Step("Click on the webelement img_shell_header_icon")
    public void img_shell_header_icon_Action_click() {
        img_shell_header_icon = driver.findElement(locator.getLocator("img_shell_header_icon"));
        clickOnElement(img_shell_header_icon);
    }

    @Step("Click on the webelement span22__")
    public String span22___getText() {
        return driver.findElement(locator.getLocator("span22__")).getText().trim();
    }

    @Step("Click on the webelement span22__")
    public void span22___Action_click() {
        span22__ = driver.findElement(locator.getLocator("span22__"));
        clickOnElement(span22__);
    }

    @Step("Click on the webelement a___link5___clone1168")
    public String a___link5___clone1168_getText() {
        return driver.findElement(locator.getLocator("a___link5___clone1168")).getText().trim();
    }

    @Step("Click on the webelement a___link5___clone1168")
    public void a___link5___clone1168_Action_click() {
        a___link5___clone1168 = driver.findElement(locator.getLocator("a___link5___clone1168"));
        clickOnElement(a___link5___clone1168);
    }

    @Step("Click on the webelement span___button41_content")
    public String span___button41_content_getText() {
        return driver.findElement(locator.getLocator("span___button41_content")).getText().trim();
    }

    @Step("Click on the webelement span___button41_content")
    public void span___button41_content_Action_click() {
        span___button41_content = driver.findElement(locator.getLocator("span___button41_content"));
        clickOnElement(span___button41_content);
    }

    @Step("Click on the webelement button___mbox_btn_22")
    public String button___mbox_btn_22_getText() {
        return driver.findElement(locator.getLocator("button___mbox_btn_22")).getText().trim();
    }

    @Step("Double click on the webelement button___mbox_btn_22")
    public void button___mbox_btn_22_click() {
        driver.findElement(locator.getLocator("button___mbox_btn_22")).click();
    }

    @Step("Click on the webelement button___mbox_btn_24")
    public String button___mbox_btn_24_getText() {
        return driver.findElement(locator.getLocator("button___mbox_btn_24")).getText().trim();
    }

    @Step("Double click on the webelement button___mbox_btn_24")
    public void button___mbox_btn_24_click() {
        driver.findElement(locator.getLocator("button___mbox_btn_24")).click();
    }

    @Step("Click on the webelement div403_Sign_Out")
    public String div403_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div403_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div403_Sign_Out")
    public void div403_Sign_Out_Action_click() {
        div403_Sign_Out = driver.findElement(locator.getLocator("div403_Sign_Out"));
        clickOnElement(div403_Sign_Out);
    }

    @Step("Click on the webelement button___mbox_btn_25")
    public String button___mbox_btn_25_getText() {
        return driver.findElement(locator.getLocator("button___mbox_btn_25")).getText().trim();
    }

    @Step("Double click on the webelement button___mbox_btn_25")
    public void button___mbox_btn_25_click() {
        driver.findElement(locator.getLocator("button___mbox_btn_25")).click();
    }

    @Step("Click on the webelement a___link1___clone458")
    public String a___link1___clone458_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone458")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone458")
    public void a___link1___clone458_Action_click() {
        a___link1___clone458 = driver.findElement(locator.getLocator("a___link1___clone458"));
        clickOnElement(a___link1___clone458);
    }

    @Step("Click on the webelement a___link1___clone472")
    public String a___link1___clone472_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone472")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone472")
    public void a___link1___clone472_Action_click() {
        a___link1___clone472 = driver.findElement(locator.getLocator("a___link1___clone472"));
        clickOnElement(a___link1___clone472);
    }

    @Step("Click on the webelement bdi___button26_BDI_content")
    public String bdi___button26_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button26_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button26_BDI_content")
    public void bdi___button26_BDI_content_Action_click() {
        bdi___button26_BDI_content = driver.findElement(locator.getLocator("bdi___button26_BDI_content"));
        clickOnElement(bdi___button26_BDI_content);
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

    @Step("Click on the webelement bdi___mbox_btn_14_BDI_content")
    public String bdi___mbox_btn_14_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_14_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_14_BDI_content")
    public void bdi___mbox_btn_14_BDI_content_Action_click() {
        bdi___mbox_btn_14_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_14_BDI_content"));
        clickOnElement(bdi___mbox_btn_14_BDI_content);
    }

    @Step("Click on the webelement div207_Sign_Out")
    public String div207_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div207_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div207_Sign_Out")
    public void div207_Sign_Out_Action_click() {
        div207_Sign_Out = driver.findElement(locator.getLocator("div207_Sign_Out"));
        clickOnElement(div207_Sign_Out);
    }

    @Step("Click on the webelement bdi___mbox_btn_15_BDI_content")
    public String bdi___mbox_btn_15_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_15_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_15_BDI_content")
    public void bdi___mbox_btn_15_BDI_content_Action_click() {
        bdi___mbox_btn_15_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_15_BDI_content"));
        clickOnElement(bdi___mbox_btn_15_BDI_content);
    }

    @Step("Click on the webelement a___link1___clone539")
    public String a___link1___clone539_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone539")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone539")
    public void a___link1___clone539_Action_click() {
        a___link1___clone539 = driver.findElement(locator.getLocator("a___link1___clone539"));
        clickOnElement(a___link1___clone539);
    }

    @Step("Click on the webelement a___link1___clone297")
    public String a___link1___clone297_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone297")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone297")
    public void a___link1___clone297_Action_click() {
        a___link1___clone297 = driver.findElement(locator.getLocator("a___link1___clone297"));
        clickOnElement(a___link1___clone297);
    }

    @Step("Click on the webelement a___link1___clone294")
    public String a___link1___clone294_getText() {
        return driver.findElement(locator.getLocator("a___link1___clone294")).getText().trim();
    }

    @Step("Click on the webelement a___link1___clone294")
    public void a___link1___clone294_Action_click() {
        a___link1___clone294 = driver.findElement(locator.getLocator("a___link1___clone294"));
        clickOnElement(a___link1___clone294);
    }

    @Step("Click on the webelement bdi___button14_BDI_content")
    public String bdi___button14_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button14_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button14_BDI_content")
    public void bdi___button14_BDI_content_Action_click() {
        bdi___button14_BDI_content = driver.findElement(locator.getLocator("bdi___button14_BDI_content"));
        clickOnElement(bdi___button14_BDI_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_9_BDI_content")
    public String bdi___mbox_btn_9_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_9_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_9_BDI_content")
    public void bdi___mbox_btn_9_BDI_content_Action_click() {
        bdi___mbox_btn_9_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_9_BDI_content"));
        clickOnElement(bdi___mbox_btn_9_BDI_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_11_BDI_content")
    public String bdi___mbox_btn_11_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_11_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_11_BDI_content")
    public void bdi___mbox_btn_11_BDI_content_Action_click() {
        bdi___mbox_btn_11_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_11_BDI_content"));
        clickOnElement(bdi___mbox_btn_11_BDI_content);
    }

    @Step("Capture the runtime value of the webelement a___link1___clone240 into the variable incidentId")
    public String a___link1___clone240_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("a___link1___clone240"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element a___link1___clone240. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement span279_Review_Incid")
    public String span279_Review_Incid_getText() {
        return driver.findElement(locator.getLocator("span279_Review_Incid")).getText().trim();
    }

    @Step("Click on the webelement span279_Review_Incid")
    public void span279_Review_Incid_Action_click() {
        span279_Review_Incid = driver.findElement(locator.getLocator("span279_Review_Incid"));
        clickOnElement(span279_Review_Incid);
    }

    @Step("Click on the webelement div337_Home")
    public String div337_Home_getText() {
        return driver.findElement(locator.getLocator("div337_Home")).getText().trim();
    }

    @Step("Click on the webelement div337_Home")
    public void div337_Home_Action_click() {
        div337_Home = driver.findElement(locator.getLocator("div337_Home"));
        clickOnElement(div337_Home);
    }

    @Step("Click on the webelement div268_Sign_Out")
    public String div268_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div268_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div268_Sign_Out")
    public void div268_Sign_Out_Action_click() {
        div268_Sign_Out = driver.findElement(locator.getLocator("div268_Sign_Out"));
        clickOnElement(div268_Sign_Out);
    }

    @Step("Capture the runtime value of the webelement a___link1___clone220 into the variable incidentId")
    public String a___link1___clone220_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("a___link1___clone220"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element a___link1___clone220. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement a___link3___clone770")
    public String a___link3___clone770_getText() {
        return driver.findElement(locator.getLocator("a___link3___clone770")).getText().trim();
    }

    @Step("Click on the webelement a___link3___clone770")
    public void a___link3___clone770_Action_click() {
        a___link3___clone770 = driver.findElement(locator.getLocator("a___link3___clone770"));
        clickOnElement(a___link3___clone770);
    }

    @Step("Click on the webelement bdi___button126_BDI_content")
    public String bdi___button126_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button126_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button126_BDI_content")
    public void bdi___button126_BDI_content_Action_click() {
        bdi___button126_BDI_content = driver.findElement(locator.getLocator("bdi___button126_BDI_content"));
        clickOnElement(bdi___button126_BDI_content);
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

    @Step("Click on the webelement a___link6___clone1320")
    public String a___link6___clone1320_getText() {
        return driver.findElement(locator.getLocator("a___link6___clone1320")).getText().trim();
    }

    @Step("Click on the webelement a___link6___clone1320")
    public void a___link6___clone1320_Action_click() {
        a___link6___clone1320 = driver.findElement(locator.getLocator("a___link6___clone1320"));
        clickOnElement(a___link6___clone1320);
    }

    @Step("Capture the runtime value of the webelement div18_BAG_Accident into the variable incidentId")
    public String div18_BAG_Accident_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("div18_BAG_Accident"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element div18_BAG_Accident. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement bdi___button79_BDI_content")
    public String bdi___button79_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button79_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button79_BDI_content")
    public void bdi___button79_BDI_content_Action_click() {
        bdi___button79_BDI_content = driver.findElement(locator.getLocator("bdi___button79_BDI_content"));
        clickOnElement(bdi___button79_BDI_content);
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

    @Step("Click on the webelement bdi___mbox_btn_8_BDI_content")
    public String bdi___mbox_btn_8_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_8_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_8_BDI_content")
    public void bdi___mbox_btn_8_BDI_content_Action_click() {
        bdi___mbox_btn_8_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_8_BDI_content"));
        clickOnElement(bdi___mbox_btn_8_BDI_content);
    }

    @Step("Send the value BAG (Bourns AG) to the webelement input__idForBournsC_inner")
    public void input__idForBournsC_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input__idForBournsC_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input__idForBournsC_inner")).sendKeys(val);
    }

    public String input__idForBournsC_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input__idForBournsC_inner")).getAttribute("value");
    }

    @Step("Click on the webelement div44_BAG__Bourns_")
    public String div44_BAG__Bourns__getText() {
        return driver.findElement(locator.getLocator("div44_BAG__Bourns_")).getText().trim();
    }

    @Step("Click on the webelement div44_BAG__Bourns_")
    public void div44_BAG__Bourns__Action_click() {
        div44_BAG__Bourns_ = driver.findElement(locator.getLocator("div44_BAG__Bourns_"));
        clickOnElement(div44_BAG__Bourns_);
    }

    @Step("Click on the webelement div171_Near_Miss")
    public String div171_Near_Miss_getText() {
        return driver.findElement(locator.getLocator("div171_Near_Miss")).getText().trim();
    }

    @Step("Click on the webelement div171_Near_Miss")
    public void div171_Near_Miss_Action_click() {
        div171_Near_Miss = driver.findElement(locator.getLocator("div171_Near_Miss"));
        clickOnElement(div171_Near_Miss);
    }

    @Step("Click on the webelement span53_2")
    public String span53_2_getText() {
        return driver.findElement(locator.getLocator("span53_2")).getText().trim();
    }

    @Step("Click on the webelement span53_2")
    public void span53_2_Action_click() {
        span53_2 = driver.findElement(locator.getLocator("span53_2"));
        clickOnElement(span53_2);
    }

    @Step("Click on the webelement span___mbox_btn_2_content")
    public String span___mbox_btn_2_content_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_2_content")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_2_content")
    public void span___mbox_btn_2_content_Action_click() {
        span___mbox_btn_2_content = driver.findElement(locator.getLocator("span___mbox_btn_2_content"));
        clickOnElement(span___mbox_btn_2_content);
    }

    @Step("Click on the webelement div214_Sign_Out")
    public String div214_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div214_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div214_Sign_Out")
    public void div214_Sign_Out_Action_click() {
        div214_Sign_Out = driver.findElement(locator.getLocator("div214_Sign_Out"));
        clickOnElement(div214_Sign_Out);
    }

    @Step("Click on the webelement bdi___button76_BDI_content")
    public String bdi___button76_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button76_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button76_BDI_content")
    public void bdi___button76_BDI_content_Action_click() {
        bdi___button76_BDI_content = driver.findElement(locator.getLocator("bdi___button76_BDI_content"));
        clickOnElement(bdi___button76_BDI_content);
    }

    @Step("Capture the runtime value of the webelement a___link1___clone294 into the variable incidentId")
    public String a___link1___clone294_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("a___link1___clone294"));
            if (!found.isEmpty()) {
                String raw = found.get(0).getText();
                if (raw == null || raw.trim().isEmpty()) {
                    raw = found.get(0).getAttribute("value");
                }
                lastSeenText = raw == null ? "" : raw.trim();
                capturedValue = RuntimeContext.extract(lastSeenText, capturePattern);
                if (!capturedValue.isEmpty()) {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        if (capturedValue.isEmpty()) {
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId' from the element a___link1___clone294. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement bdi___button83_BDI_content")
    public String bdi___button83_BDI_content_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("bdi___button83_BDI_content", 30);
        return driver.findElement(locator.getLocator("bdi___button83_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button83_BDI_content")
    public void bdi___button83_BDI_content_Action_click() {
        bdi___button83_BDI_content = driver.findElement(locator.getLocator("bdi___button83_BDI_content"));
        clickOnElement(bdi___button83_BDI_content);
    }

    @Step("Click on the webelement a___link3___clone956")
    public String a___link3___clone956_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("a___link3___clone956", 30);
        return driver.findElement(locator.getLocator("a___link3___clone956")).getText().trim();
    }

    @Step("Click on the webelement a___link3___clone956")
    public void a___link3___clone956_Action_click() {
        a___link3___clone956 = driver.findElement(locator.getLocator("a___link3___clone956"));
        clickOnElement(a___link3___clone956);
    }
}
