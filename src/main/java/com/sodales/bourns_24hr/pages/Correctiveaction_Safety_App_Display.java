package com.sodales.bourns_24hr.pages;
import org.openqa.selenium.*;
import com.sodales.webautomationexecution.Locators;
import org.openqa.selenium.interactions.Actions; 
 import io.qameta.allure.Step;
 import java.util.List;
import org.openqa.selenium.support.ui.Select;
public class Correctiveaction_Safety_App_Display {

    WebElement span___text46___clone115;

    WebElement circle1_sap;

    WebElement bdi___button9_BDI_content;

    WebElement span43_22;

    WebElement section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont;

    WebElement img_shell_header_icon;

    WebElement span31_10;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement div241_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement bdi___mbox_btn_2_BDI_content;

    WebElement bdi___mbox_btn_0_BDI_content;

    WebElement bdi___button10_BDI_content;

    WebElement bdi___button13_BDI_content;

    WebElement input_fileUploader_fu;

    WebElement bdi_fileUploader_fu_button_BDI_content;

    WebElement span___button6___clone22_img;

    WebElement span51_18;

    WebElement span___picker1___clone16_icon;

    WebElement div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb;

    WebElement div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0;

    WebElement div___layout1;

    WebElement span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow;

    WebElement div10_BAB;

    WebElement span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow;

    Locators locator;

    WebDriver driver;

    public Correctiveaction_Safety_App_Display(WebDriver driver, Locators locator) {
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

    @Step("Click on the webelement span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow")
    public void span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow_Action_click() {
        span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow = driver.findElement(locator.getLocator("span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow"));
        clickOnElement(span_application_CorrectiveAction_Safety_App_Display_component___worklist__bournfaciliyt_arrow);
    }

    @Step("Click on the webelement div10_BAB")
    public String div10_BAB_getText() {
        return driver.findElement(locator.getLocator("div10_BAB")).getText().trim();
    }

    @Step("Click on the webelement div10_BAB")
    public void div10_BAB_Action_click() {
        div10_BAB = driver.findElement(locator.getLocator("div10_BAB"));
        clickOnElement(div10_BAB);
    }

    @Step("Click on the webelement span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow")
    public void span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow_Action_click() {
        span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow = driver.findElement(locator.getLocator("span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow"));
        clickOnElement(span_application_CorrectiveAction_Safety_App_Display_component___worklist__caType_arrow);
    }

    @Step("Click on the webelement div___layout1")
    public String div___layout1_getText() {
        return driver.findElement(locator.getLocator("div___layout1")).getText().trim();
    }

    @Step("Click on the webelement div___layout1")
    public void div___layout1_Action_click() {
        div___layout1 = driver.findElement(locator.getLocator("div___layout1"));
        clickOnElement(div___layout1);
    }

    @Step("Click on the webelement div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0")
    public void div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0_Action_click() {
        div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0 = driver.findElement(locator.getLocator("div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0"));
        clickOnElement(div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_rowsel0);
    }

    @Step("Click on the webelement div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb")
    public void div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb_Action_click() {
        div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb = driver.findElement(locator.getLocator("div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb"));
        clickOnElement(div_application_CorrectiveAction_Safety_App_Display_component___worklist__table_hsb);
    }

    @Step("Click on the webelement span___picker1___clone16_icon")
    public void span___picker1___clone16_icon_Action_click() {
        //span___picker1___clone16_icon = driver.findElement(locator.getLocator("span___picker1___clone16_icon"));
        //clickOnElement(span___picker1___clone16_icon);
        driver.findElement(locator.getLocator("span___picker1___clone16_icon")).click();
    }

    @Step("Scroll horizontal scrollbar to the left")
    public void scroll_horizontal_bar_down() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Step("Scroll horizontal scrollbar to the left")
    public void scroll_horizontal_bar_left() {
        WebElement horizontalScrollbar = driver.findElement(By.id("application-CorrectiveAction_Safety_App-Display-component---worklist--pageCA-cont"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", horizontalScrollbar);
    }

    @Step("Click on the webelement span51_18")
    public String span51_18_getText() {
        return driver.findElement(locator.getLocator("span51_18")).getText().trim();
    }

    @Step("Click on the webelement span51_18")
    public void span51_18_Action_click() {
        span51_18 = driver.findElement(locator.getLocator("span51_18"));
        clickOnElement(span51_18);
    }

    @Step("Click on the webelement span___button6___clone22_img")
    public void span___button6___clone22_img_Action_click() {
        span___button6___clone22_img = driver.findElement(locator.getLocator("span___button6___clone22_img"));
        clickOnElement(span___button6___clone22_img);
    }

    @Step("Click on the webelement bdi_fileUploader_fu_button_BDI_content")
    public String bdi_fileUploader_fu_button_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi_fileUploader_fu_button_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi_fileUploader_fu_button_BDI_content")
    public void bdi_fileUploader_fu_button_BDI_content_Action_click() {
        bdi_fileUploader_fu_button_BDI_content = driver.findElement(locator.getLocator("bdi_fileUploader_fu_button_BDI_content"));
        clickOnElement(bdi_fileUploader_fu_button_BDI_content);
    }

    @Step("Send the value C:\\fakepath\\Test.png to the webelement input_fileUploader_fu")
    public void input_fileUploader_fu_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_fileUploader_fu")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input_fileUploader_fu")).sendKeys(val);
    }

    public String input_fileUploader_fu_GetAttribute() {
        return driver.findElement(locator.getLocator("input_fileUploader_fu")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button13_BDI_content")
    public String bdi___button13_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button13_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button13_BDI_content")
    public void bdi___button13_BDI_content_Action_click() {
        bdi___button13_BDI_content = driver.findElement(locator.getLocator("bdi___button13_BDI_content"));
        clickOnElement(bdi___button13_BDI_content);
    }

    @Step("Click on the webelement bdi___button10_BDI_content")
    public String bdi___button10_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button10_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button10_BDI_content")
    public void bdi___button10_BDI_content_Action_click() {
        bdi___button10_BDI_content = driver.findElement(locator.getLocator("bdi___button10_BDI_content"));
        clickOnElement(bdi___button10_BDI_content);
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

    @Step("Click on the webelement bdi___mbox_btn_2_BDI_content")
    public String bdi___mbox_btn_2_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_2_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_2_BDI_content")
    public void bdi___mbox_btn_2_BDI_content_Action_click() {
        bdi___mbox_btn_2_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_2_BDI_content"));
        clickOnElement(bdi___mbox_btn_2_BDI_content);
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

    @Step("Click on the webelement div241_Sign_Out")
    public String div241_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div241_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div241_Sign_Out")
    public void div241_Sign_Out_Action_click() {
        div241_Sign_Out = driver.findElement(locator.getLocator("div241_Sign_Out"));
        clickOnElement(div241_Sign_Out);
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

    @Step("Click on the webelement span31_10")
    public String span31_10_getText() {
        return driver.findElement(locator.getLocator("span31_10")).getText().trim();
    }

    @Step("Click on the webelement span31_10")
    public void span31_10_Action_click() {
        span31_10 = driver.findElement(locator.getLocator("span31_10"));
        clickOnElement(span31_10);
    }

    @Step("Click on the webelement img_shell_header_icon")
    public void img_shell_header_icon_Action_click() {
        img_shell_header_icon = driver.findElement(locator.getLocator("img_shell_header_icon"));
        clickOnElement(img_shell_header_icon);
    }

    @Step("Capture the runtime value of the webelement section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont into the variable applicationId")
    public String section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont"));
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
            throw new IllegalStateException("Could not capture a runtime value for 'applicationId' from the element section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont")
    public String section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont_getText() {
        return driver.findElement(locator.getLocator("section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont")).getText().trim();
    }

    @Step("Click on the webelement section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont")
    public void section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont_Action_click() {
        section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont = driver.findElement(locator.getLocator("section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont"));
        clickOnElement(section_application_CorrectiveAction_Safety_App_Display_component___worklist__pageCA_cont);
    }

    @Step("Click on the webelement span43_22")
    public String span43_22_getText() {
        return driver.findElement(locator.getLocator("span43_22")).getText().trim();
    }

    @Step("Click on the webelement span43_22")
    public void span43_22_Action_click() {
        span43_22 = driver.findElement(locator.getLocator("span43_22"));
        clickOnElement(span43_22);
    }

    @Step("Click on the webelement bdi___button9_BDI_content")
    public String bdi___button9_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button9_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button9_BDI_content")
    public void bdi___button9_BDI_content_Action_click() {
        bdi___button9_BDI_content = driver.findElement(locator.getLocator("bdi___button9_BDI_content"));
        clickOnElement(bdi___button9_BDI_content);
    }

    @Step("Click on the webelement circle1_sap")
    public void circle1_sap_Action_click() {
        circle1_sap = driver.findElement(locator.getLocator("circle1_sap"));
        clickOnElement(circle1_sap);
    }

    @Step("Click on the webelement span___text46___clone115")
    public String span___text46___clone115_getText() {
        return driver.findElement(locator.getLocator("span___text46___clone115")).getText().trim();
    }

    @Step("Click on the webelement span___text46___clone115")
    public void span___text46___clone115_Action_click() {
        span___text46___clone115 = driver.findElement(locator.getLocator("span___text46___clone115"));
        clickOnElement(span___text46___clone115);
    }
}
