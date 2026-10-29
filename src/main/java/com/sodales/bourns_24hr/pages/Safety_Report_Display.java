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

public class Safety_Report_Display {

    WebElement div234_Entire_Body;

    WebElement div107_Chemical_Burn;

    WebElement span48_22;

    WebElement div49_Chest_Pain;

    WebElement div37_Bruise;

    WebElement section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead;

    WebElement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4;

    WebElement li___item57;

    WebElement li___item20;

    WebElement span___mbox_btn_2_inner;

    WebElement div270_Right;

    WebElement div170_Elbow;

    WebElement div40_Burn;

    WebElement div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content;

    WebElement li___item56;

    WebElement div43_Cardiac;

    WebElement div173_Entire_Body;

    WebElement div179_Face;

    WebElement div46_Chemical_Burn;

    WebElement bdi___button10_BDI_content;

    WebElement div264_Left;

    WebElement div188_Head;

    WebElement div64_Discolor__Sk;

    WebElement input___picker0_inner;

    WebElement span___text46;

    WebElement span___mbox_btn_3_inner;

    WebElement button___button19;

    WebElement li___item53;

    WebElement div89_Abdominal_Pa;

    WebElement input___input7_inner;

    WebElement div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content;

    WebElement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6;

    WebElement div_sap_ui_blocklayer_popup;

    WebElement span22__;

    WebElement bdi___button18_BDI_content;

    WebElement span___mbox_btn_5_inner;

    WebElement div43_sap;

    WebElement span___button13_content;

    WebElement button___button6;

    WebElement li___item12___list3_8;

    WebElement bdi___button12_BDI_content;

    WebElement span28_2;

    WebElement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3;

    WebElement bdi___button20_BDI_content;

    WebElement bdi___mbox_btn_5_BDI_content;

    WebElement span___text49;

    WebElement bdi___button19_BDI_content;

    WebElement bdi___button23_BDI_content;

    WebElement bdi___button13_BDI_content;

    WebElement span___mbox_btn_2_content;

    WebElement div___success0_footer;

    WebElement span___button6_content;

    WebElement input___input9___table0_1_inner;

    WebElement div580_Other;

    WebElement li___item143;

    WebElement li___item120;

    WebElement span___button4_content;

    WebElement div255_Internal_Org;

    WebElement div128_Dislocation;

    WebElement span___input7_vhi;

    WebElement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1;

    WebElement span27_1;

    WebElement img_shell_header_icon;

    WebElement li___item54;

    WebElement div110_Chest_Pain;

    WebElement span31_1;

    WebElement div111_Sign_Out;

    WebElement bdi___button16_BDI_content;

    WebElement textarea___area7_inner;

    WebElement textarea___area6_inner;

    WebElement textarea___area5_inner;

    WebElement div137_Dec_Movement;

    WebElement use13_;

    WebElement span___input11_vhi;

    WebElement li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1;

    WebElement li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1;

    WebElement span45_1;

    WebElement span___picker1_icon;

    WebElement li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1;

    WebElement span___item9_titleText;

    WebElement span15_24_Hour_Safe;

    WebElement span___mbox_btn_0_inner;

    WebElement bdi___button6_BDI_content;

    WebElement div325_Left;

    WebElement span___box3___table0_1_arrow;

    WebElement div219_Ankle;

    WebElement span___box2___table0_1_arrow;

    WebElement li___item13;

    WebElement span___box1___table0_1_arrow;

    WebElement bdi___button2_BDI_content;

    WebElement div97_Abrasion;

    WebElement use12_;

    WebElement circle1_sap;

    WebElement span___input1_vhi;

    WebElement li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0;

    WebElement textarea___area2_inner;

    WebElement textarea___area1_inner;

    WebElement li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1;

    WebElement span25_1;

    WebElement li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement div356_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement span___text28;

    WebElement div337_Other;

    WebElement span___box3___table0_0_arrow;

    WebElement div258_Head;

    WebElement span___box2___table0_0_arrow;

    WebElement div134_Discolor__Sk;

    WebElement span___box1___table0_0_arrow;

    WebElement bdi___button4_BDI_content;

    WebElement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3;

    WebElement span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow;

    WebElement span61_31;

    WebElement bdi___mbox_btn_2_BDI_content;

    WebElement span___text29;

    WebElement bdi___mbox_btn_0_BDI_content;

    WebElement bdi___button8_BDI_content;

    WebElement textarea___area3_inner;

    WebElement div118_Chest_Pain;

    WebElement use_Background;

    WebElement span65_31;

    WebElement span___picker0_icon;

    WebElement li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0;

    WebElement span_application_Safety_Report_Display_component___worklist___idForCategory_arrow;

    WebElement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1;

    WebElement span_application_Safety_Report_Display_component___worklist___idForBourns_arrow;

    Locators locator;

    WebDriver driver;

    public Safety_Report_Display(WebDriver driver, Locators locator) {
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

    @Step("Click on the webelement span_application_Safety_Report_Display_component___worklist___idForBourns_arrow")
    public void span_application_Safety_Report_Display_component___worklist___idForBourns_arrow_Action_click() {
        driver.findElement(locator.getLocator("span_application_Safety_Report_Display_component___worklist___idForBourns_arrow")).click();
        //clickOnElement(span_application_Safety_Report_Display_component___worklist___idForBourns_arrow);
    }

    @Step("Click on the webelement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public String li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_getText() {
        return driver.findElement(locator.getLocator("li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public void li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_click() {
        driver.findElement(locator.getLocator("li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1")).click();
    }

    @Step("Click on the webelement span_application_Safety_Report_Display_component___worklist___idForCategory_arrow")
    public void span_application_Safety_Report_Display_component___worklist___idForCategory_arrow_Action_click() {
        driver.findElement(locator.getLocator("span_application_Safety_Report_Display_component___worklist___idForCategory_arrow")).click();
        //clickOnElement(span_application_Safety_Report_Display_component___worklist___idForCategory_arrow);
    }

    @Step("Click on the webelement li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0")
    public String li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_getText() {
        return driver.findElement(locator.getLocator("li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0")).getText().trim();
    }

    @Step("Double click on the webelement li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0")
    public void li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_click() {
        driver.findElement(locator.getLocator("li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0")).click();
    }

    @Step("Click on the webelement span___picker0_icon")
    public void span___picker0_icon_Action_click() {
        //span___picker0_icon = driver.findElement(locator.getLocator("span___picker0_icon"));
        //clickOnElement(span___picker0_icon);
        driver.findElement(locator.getLocator("span___picker0_icon")).click();
    }

    @Step("Click on the webelement span65_31")
    public String span65_31_getText() {
        return driver.findElement(locator.getLocator("span65_31")).getText().trim();
    }

    @Step("Click on the webelement span65_31")
    public void span65_31_Action_click() {
        span65_31 = driver.findElement(locator.getLocator("span65_31"));
        clickOnElement(span65_31);
    }

    @Step("Click on the webelement use_Background")
    public void use_Background_Action_click() {
        use_Background = driver.findElement(locator.getLocator("use_Background"));
        //clickOnElement(use_Background);
        use_Background.click();
    }

    @Step("Click on the webelement div118_Chest_Pain")
    public String div118_Chest_Pain_getText() {
        return driver.findElement(locator.getLocator("div118_Chest_Pain")).getText().trim();
    }

    @Step("Click on the webelement div118_Chest_Pain")
    public void div118_Chest_Pain_Action_click() {
        div118_Chest_Pain = driver.findElement(locator.getLocator("div118_Chest_Pain"));
        clickOnElement(div118_Chest_Pain);
    }

    @Step("Send the value test to the webelement textarea___area3_inner")
    public void textarea___area3_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area3_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area3_inner")).sendKeys(val);
    }

    public String textarea___area3_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area3_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button8_BDI_content")
    public String bdi___button8_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button8_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button8_BDI_content")
    public void bdi___button8_BDI_content_Action_click() {
        driver.findElement(locator.getLocator("bdi___button8_BDI_content")).click();
        // clickOnElement(bdi___button8_BDI_content);
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

    @Step("Click on the webelement span___text29")
    public String span___text29_getText() {
        return driver.findElement(locator.getLocator("span___text29")).getText().trim();
    }

    @Step("Click on the webelement span___text29")
    public void span___text29_Action_click() {
        span___text29 = driver.findElement(locator.getLocator("span___text29"));
        clickOnElement(span___text29);
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

    @Step("Click on the webelement span61_31")
    public String span61_31_getText() {
        return driver.findElement(locator.getLocator("span61_31")).getText().trim();
    }

    @Step("Click on the webelement span61_31")
    public void span61_31_Action_click() {
        span61_31 = driver.findElement(locator.getLocator("span61_31"));
        clickOnElement(span61_31);
    }
    
    @Step("Send the value test to the webelement textarea___area1_inner")
    public void date_inner_sendKeys(String val) {
        driver.findElement(By.xpath("//input[@id='__picker0-inner']")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@id='__picker0-inner']")).sendKeys(val);
    }

    @Step("Click on the webelement span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow")
    public void span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow_Action_click() {
        span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow = driver.findElement(locator.getLocator("span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow"));
        clickOnElement(span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow);
    }

    @Step("Click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3")
    public String li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_getText() {
        return driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3")).getText().trim();
    }

    @Step("Double click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3")
    public void li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_click() {
        driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3")).click();
    }

    @Step("Click on the webelement bdi___button4_BDI_content")
    public String bdi___button4_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button4_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button4_BDI_content")
    public void bdi___button4_BDI_content_Action_click() {
        bdi___button4_BDI_content = driver.findElement(locator.getLocator("bdi___button4_BDI_content"));
        clickOnElement(bdi___button4_BDI_content);
    }

    @Step("Click on the webelement span___box1___table0_0_arrow")
    public void span___box1___table0_0_arrow_Action_click() {
        span___box1___table0_0_arrow = driver.findElement(locator.getLocator("span___box1___table0_0_arrow"));
        clickOnElement(span___box1___table0_0_arrow);
    }

    @Step("Click on the webelement div134_Discolor__Sk")
    public String div134_Discolor__Sk_getText() {
        return driver.findElement(locator.getLocator("div134_Discolor__Sk")).getText().trim();
    }

    @Step("Click on the webelement div134_Discolor__Sk")
    public void div134_Discolor__Sk_Action_click() {
        div134_Discolor__Sk = driver.findElement(locator.getLocator("div134_Discolor__Sk"));
        clickOnElement(div134_Discolor__Sk);
    }

    @Step("Click on the webelement span___box2___table0_0_arrow")
    public void span___box2___table0_0_arrow_Action_click() {
        span___box2___table0_0_arrow = driver.findElement(locator.getLocator("span___box2___table0_0_arrow"));
        clickOnElement(span___box2___table0_0_arrow);
    }

    @Step("Click on the webelement div258_Head")
    public String div258_Head_getText() {
        return driver.findElement(locator.getLocator("div258_Head")).getText().trim();
    }

    @Step("Click on the webelement div258_Head")
    public void div258_Head_Action_click() {
        div258_Head = driver.findElement(locator.getLocator("div258_Head"));
        clickOnElement(div258_Head);
    }

    @Step("Click on the webelement span___box3___table0_0_arrow")
    public void span___box3___table0_0_arrow_Action_click() {
        span___box3___table0_0_arrow = driver.findElement(locator.getLocator("span___box3___table0_0_arrow"));
        clickOnElement(span___box3___table0_0_arrow);
    }

    @Step("Click on the webelement div337_Other")
    public String div337_Other_getText() {
        return driver.findElement(locator.getLocator("div337_Other")).getText().trim();
    }

    @Step("Click on the webelement div337_Other")
    public void div337_Other_Action_click() {
        div337_Other = driver.findElement(locator.getLocator("div337_Other"));
        clickOnElement(div337_Other);
    }

    @Step("Click on the webelement span___text28")
    public String span___text28_getText() {
        return driver.findElement(locator.getLocator("span___text28")).getText().trim();
    }

    @Step("Click on the webelement span___text28")
    public void span___text28_Action_click() {
        span___text28 = driver.findElement(locator.getLocator("span___text28"));
        clickOnElement(span___text28);
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

    @Step("Click on the webelement div356_Sign_Out")
    public String div356_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div356_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div356_Sign_Out")
    public void div356_Sign_Out_Action_click() {
        div356_Sign_Out = driver.findElement(locator.getLocator("div356_Sign_Out"));
        clickOnElement(div356_Sign_Out);
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

    @Step("Click on the webelement li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public String li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1_getText() {
        return driver.findElement(locator.getLocator("li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public void li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1_click() {
        driver.findElement(locator.getLocator("li___item0_application_Safety_Report_Display_component___worklist___idForBourns_1")).click();
    }

    @Step("Click on the webelement span25_1")
    public String span25_1_getText() {
        return driver.findElement(locator.getLocator("span25_1")).getText().trim();
    }

    @Step("Click on the webelement span25_1")
    public void span25_1_Action_click() {
        span25_1 = driver.findElement(locator.getLocator("span25_1"));
        clickOnElement(span25_1);
    }

    @Step("Click on the webelement li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1")
    public String li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1_getText() {
        return driver.findElement(locator.getLocator("li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1")
    public void li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1_click() {
        driver.findElement(locator.getLocator("li___item1_application_Safety_Report_Display_component___worklist___idForCategory_1")).click();
    }

    @Step("Send the value test to the webelement textarea___area1_inner")
    public void textarea___area1_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area1_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area1_inner")).sendKeys(val);
    }

    public String textarea___area1_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area1_inner")).getAttribute("value");
    }

    @Step("Send the value test to the webelement textarea___area2_inner")
    public void textarea___area2_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area2_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area2_inner")).sendKeys(val);
    }

    public String textarea___area2_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area2_inner")).getAttribute("value");
    }

    @Step("Click on the webelement li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0")
    public String li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0_getText() {
        return driver.findElement(locator.getLocator("li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0")).getText().trim();
    }

    @Step("Double click on the webelement li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0")
    public void li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0_click() {
        driver.findElement(locator.getLocator("li___item2_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_0")).click();
    }

    @Step("Click on the webelement span___input1_vhi")
    public void span___input1_vhi_Action_click() {
        span___input1_vhi = driver.findElement(locator.getLocator("span___input1_vhi"));
        clickOnElement(span___input1_vhi);
    }

    @Step("Click on the webelement circle1_sap")
    public void circle1_sap_Action_click() {
        circle1_sap = driver.findElement(locator.getLocator("circle__button42-__clone419-Button"));
        clickOnElement(circle1_sap);
        // driver.findElement(By.xpath("//*[@id=\"__button42-__clone419\"]/div/svg/circle[2]")).click();
    }

    @Step("Click on the webelement use12_")
    public void use12__Action_click() {
        use12_ = driver.findElement(locator.getLocator("use12_"));
        clickOnElement(use12_);
    }

    @Step("Click on the webelement div97_Abrasion")
    public String div97_Abrasion_getText() {
        return driver.findElement(locator.getLocator("div97_Abrasion")).getText().trim();
    }

    @Step("Click on the webelement div97_Abrasion")
    public void div97_Abrasion_Action_click() {
        div97_Abrasion = driver.findElement(locator.getLocator("div97_Abrasion"));
        clickOnElement(div97_Abrasion);
    }

    @Step("Click on the webelement bdi___button2_BDI_content")
    public String bdi___button2_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button2_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button2_BDI_content")
    public void bdi___button2_BDI_content_Action_click() {
        bdi___button2_BDI_content = driver.findElement(locator.getLocator("bdi___button2_BDI_content"));
        clickOnElement(bdi___button2_BDI_content);
    }

    @Step("Click on the webelement span___box1___table0_1_arrow")
    public void span___box1___table0_1_arrow_Action_click() {
        span___box1___table0_1_arrow = driver.findElement(locator.getLocator("span___box1___table0_1_arrow"));
        clickOnElement(span___box1___table0_1_arrow);
    }

    @Step("Click on the webelement li___item13")
    public String li___item13_getText() {
        return driver.findElement(locator.getLocator("li___item13")).getText().trim();
    }

    @Step("Double click on the webelement li___item13")
    public void li___item13_click() {
        driver.findElement(locator.getLocator("li___item13")).click();
    }

    @Step("Click on the webelement span___box2___table0_1_arrow")
    public void span___box2___table0_1_arrow_Action_click() {
        span___box2___table0_1_arrow = driver.findElement(locator.getLocator("span___box2___table0_1_arrow"));
        clickOnElement(span___box2___table0_1_arrow);
    }

    @Step("Click on the webelement div219_Ankle")
    public String div219_Ankle_getText() {
        return driver.findElement(locator.getLocator("div219_Ankle")).getText().trim();
    }

    @Step("Click on the webelement div219_Ankle")
    public void div219_Ankle_Action_click() {
        div219_Ankle = driver.findElement(locator.getLocator("div219_Ankle"));
        clickOnElement(div219_Ankle);
    }

    @Step("Click on the webelement span___box3___table0_1_arrow")
    public void span___box3___table0_1_arrow_Action_click() {
        span___box3___table0_1_arrow = driver.findElement(locator.getLocator("span___box3___table0_1_arrow"));
        clickOnElement(span___box3___table0_1_arrow);
    }

    @Step("Click on the webelement div325_Left")
    public String div325_Left_getText() {
        return driver.findElement(locator.getLocator("div325_Left")).getText().trim();
    }

    @Step("Click on the webelement div325_Left")
    public void div325_Left_Action_click() {
        div325_Left = driver.findElement(locator.getLocator("div325_Left"));
        clickOnElement(div325_Left);
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

    @Step("Click on the webelement span___mbox_btn_0_inner")
    public String span___mbox_btn_0_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_0_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_0_inner")
    public void span___mbox_btn_0_inner_Action_click() {
        span___mbox_btn_0_inner = driver.findElement(locator.getLocator("span___mbox_btn_0_inner"));
        clickOnElement(span___mbox_btn_0_inner);
    }

    @Step("Click on the webelement span15_24_Hour_Safe")
    public String span15_24_Hour_Safe_getText() {
        return driver.findElement(locator.getLocator("span15_24_Hour_Safe")).getText().trim();
    }

    @Step("Click on the webelement span15_24_Hour_Safe")
    public void span15_24_Hour_Safe_Action_click() {
        span15_24_Hour_Safe = driver.findElement(locator.getLocator("span15_24_Hour_Safe"));
        clickOnElement(span15_24_Hour_Safe);
    }

    @Step("Click on the webelement span___item9_titleText")
    public String span___item9_titleText_getText() {
        return driver.findElement(locator.getLocator("span___item9_titleText")).getText().trim();
    }

    @Step("Click on the webelement span___item9_titleText")
    public void span___item9_titleText_Action_click() {
        span___item9_titleText = driver.findElement(locator.getLocator("span___item9_titleText"));
        clickOnElement(span___item9_titleText);
    }

    @Step("Click on the webelement li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public String li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1_getText() {
        return driver.findElement(locator.getLocator("li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1")
    public void li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1_click() {
        driver.findElement(locator.getLocator("li___item12_application_Safety_Report_Display_component___worklist___idForBourns_1")).click();
    }

    @Step("Click on the webelement span___picker1_icon")
    public void span___picker1_icon_Action_click() {
        span___picker1_icon = driver.findElement(locator.getLocator("span___picker1_icon"));
        clickOnElement(span___picker1_icon);
    }

    @Step("Click on the webelement span45_1")
    public String span45_1_getText() {
        return driver.findElement(locator.getLocator("span45_1")).getText().trim();
    }

    @Step("Click on the webelement span45_1")
    public void span45_1_Action_click() {
        span45_1 = driver.findElement(locator.getLocator("span45_1"));
        clickOnElement(span45_1);
    }

    @Step("Click on the webelement li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1")
    public String li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1_getText() {
        return driver.findElement(locator.getLocator("li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1")
    public void li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1_click() {
        driver.findElement(locator.getLocator("li___item13_application_Safety_Report_Display_component___worklist___idForCategory_1")).click();
    }

    @Step("Click on the webelement li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")
    public String li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1_getText() {
        return driver.findElement(locator.getLocator("li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")
    public void li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1_click() {
        driver.findElement(locator.getLocator("li___item14_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")).click();
    }

    @Step("Click on the webelement span___input11_vhi")
    public void span___input11_vhi_Action_click() {
        span___input11_vhi = driver.findElement(locator.getLocator("span___input11_vhi"));
        clickOnElement(span___input11_vhi);
    }

    @Step("Click on the webelement use13_")
    public void use13__Action_click() {
        use13_ = driver.findElement(locator.getLocator("use13_"));
        clickOnElement(use13_);
    }

    @Step("Click on the webelement div137_Dec_Movement")
    public String div137_Dec_Movement_getText() {
        return driver.findElement(locator.getLocator("div137_Dec_Movement")).getText().trim();
    }

    @Step("Click on the webelement div137_Dec_Movement")
    public void div137_Dec_Movement_Action_click() {
        div137_Dec_Movement = driver.findElement(locator.getLocator("div137_Dec_Movement"));
        clickOnElement(div137_Dec_Movement);
    }

    @Step("Send the value test  to the webelement textarea___area5_inner")
    public void textarea___area5_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area5_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area5_inner")).sendKeys(val);
    }

    public String textarea___area5_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area5_inner")).getAttribute("value");
    }

    @Step("Send the value test  to the webelement textarea___area6_inner")
    public void textarea___area6_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area6_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area6_inner")).sendKeys(val);
    }

    public String textarea___area6_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area6_inner")).getAttribute("value");
    }

    @Step("Send the value test to the webelement textarea___area7_inner")
    public void textarea___area7_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area7_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area7_inner")).sendKeys(val);
    }

    public String textarea___area7_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area7_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button16_BDI_content")
    public String bdi___button16_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button16_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button16_BDI_content")
    public void bdi___button16_BDI_content_Action_click() {
        bdi___button16_BDI_content = driver.findElement(locator.getLocator("bdi___button16_BDI_content"));
        clickOnElement(bdi___button16_BDI_content);
    }

    @Step("Click on the webelement div111_Sign_Out")
    public String div111_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div111_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div111_Sign_Out")
    public void div111_Sign_Out_Action_click() {
        div111_Sign_Out = driver.findElement(locator.getLocator("div111_Sign_Out"));
        clickOnElement(div111_Sign_Out);
    }

    @Step("Click on the webelement span31_1")
    public String span31_1_getText() {
        return driver.findElement(locator.getLocator("span31_1")).getText().trim();
    }

    @Step("Click on the webelement span31_1")
    public void span31_1_Action_click() {
        span31_1 = driver.findElement(locator.getLocator("span31_1"));
        clickOnElement(span31_1);
    }

    @Step("Click on the webelement div110_Chest_Pain")
    public String div110_Chest_Pain_getText() {
        return driver.findElement(locator.getLocator("div110_Chest_Pain")).getText().trim();
    }

    @Step("Click on the webelement div110_Chest_Pain")
    public void div110_Chest_Pain_Action_click() {
        div110_Chest_Pain = driver.findElement(locator.getLocator("div110_Chest_Pain"));
        clickOnElement(div110_Chest_Pain);
    }

    @Step("Click on the webelement li___item54")
    public String li___item54_getText() {
        return driver.findElement(locator.getLocator("li___item54")).getText().trim();
    }

    @Step("Double click on the webelement li___item54")
    public void li___item54_click() {
        driver.findElement(locator.getLocator("li___item54")).click();
    }

    @Step("Click on the webelement img_shell_header_icon")
    public void img_shell_header_icon_Action_click() {
        img_shell_header_icon = driver.findElement(locator.getLocator("img_shell_header_icon"));
        clickOnElement(img_shell_header_icon);
    }

    @Step("Click on the webelement span27_1")
    public String span27_1_getText() {
        return driver.findElement(locator.getLocator("span27_1")).getText().trim();
    }

    @Step("Click on the webelement span27_1")
    public void span27_1_Action_click() {
        span27_1 = driver.findElement(locator.getLocator("span27_1"));
        clickOnElement(span27_1);
    }

    @Step("Click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")
    public String li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1_getText() {
        return driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")
    public void li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1_click() {
        driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_1")).click();
    }

    @Step("Click on the webelement span___input7_vhi")
    public void span___input7_vhi_Action_click() {
        span___input7_vhi = driver.findElement(locator.getLocator("span___input7_vhi"));
        clickOnElement(span___input7_vhi);
    }

    @Step("Click on the webelement div128_Dislocation")
    public String div128_Dislocation_getText() {
        return driver.findElement(locator.getLocator("div128_Dislocation")).getText().trim();
    }

    @Step("Click on the webelement div128_Dislocation")
    public void div128_Dislocation_Action_click() {
        div128_Dislocation = driver.findElement(locator.getLocator("div128_Dislocation"));
        clickOnElement(div128_Dislocation);
    }

    @Step("Click on the webelement div255_Internal_Org")
    public String div255_Internal_Org_getText() {
        return driver.findElement(locator.getLocator("div255_Internal_Org")).getText().trim();
    }

    @Step("Click on the webelement div255_Internal_Org")
    public void div255_Internal_Org_Action_click() {
        div255_Internal_Org = driver.findElement(locator.getLocator("div255_Internal_Org"));
        clickOnElement(div255_Internal_Org);
    }

    @Step("Click on the webelement span___button4_content")
    public String span___button4_content_getText() {
        return driver.findElement(locator.getLocator("span___button4_content")).getText().trim();
    }

    @Step("Click on the webelement span___button4_content")
    public void span___button4_content_Action_click() {
        span___button4_content = driver.findElement(locator.getLocator("span___button4_content"));
        clickOnElement(span___button4_content);
    }

    @Step("Click on the webelement li___item120")
    public String li___item120_getText() {
        return driver.findElement(locator.getLocator("li___item120")).getText().trim();
    }

    @Step("Double click on the webelement li___item120")
    public void li___item120_click() {
        driver.findElement(locator.getLocator("li___item120")).click();
    }

    @Step("Click on the webelement li___item143")
    public String li___item143_getText() {
        return driver.findElement(locator.getLocator("li___item143")).getText().trim();
    }

    @Step("Double click on the webelement li___item143")
    public void li___item143_click() {
        driver.findElement(locator.getLocator("li___item143")).click();
    }

    @Step("Click on the webelement div580_Other")
    public String div580_Other_getText() {
        return driver.findElement(locator.getLocator("div580_Other")).getText().trim();
    }

    @Step("Click on the webelement div580_Other")
    public void div580_Other_Action_click() {
        div580_Other = driver.findElement(locator.getLocator("div580_Other"));
        clickOnElement(div580_Other);
    }

    @Step("Double click on the webelement input___input9___table0_1_inner")
    public void input___input9___table0_1_inner_click() {
        driver.findElement(locator.getLocator("input___input9___table0_1_inner")).click();
    }

    @Step("Send the value tested to the webelement input___input9___table0_1_inner")
    public void input___input9___table0_1_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input9___table0_1_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input9___table0_1_inner")).sendKeys(val);
    }

    public String input___input9___table0_1_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input9___table0_1_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___button6_content")
    public String span___button6_content_getText() {
        return driver.findElement(locator.getLocator("span___button6_content")).getText().trim();
    }

    @Step("Click on the webelement span___button6_content")
    public void span___button6_content_Action_click() {
        span___button6_content = driver.findElement(locator.getLocator("span___button6_content"));
        clickOnElement(span___button6_content);
    }

    @Step("Click on the webelement div___success0_footer")
    public String div___success0_footer_getText() {
        return driver.findElement(locator.getLocator("div___success0_footer")).getText().trim();
    }

    @Step("Click on the webelement div___success0_footer")
    public void div___success0_footer_Action_click() {
        div___success0_footer = driver.findElement(locator.getLocator("div___success0_footer"));
        clickOnElement(div___success0_footer);
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

    @Step("Click on the webelement bdi___button13_BDI_content")
    public String bdi___button13_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button13_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button13_BDI_content")
    public void bdi___button13_BDI_content_Action_click() {
        //        bdi___button13_BDI_content = driver.findElement(By.xpath("//span[@id='__button8-inner']/span/bdi"));
        //        clickOnElement(bdi___button13_BDI_content);
        driver.findElement(By.xpath("//bdi[text()='Load Draft']")).click();
    }

    @Step("Click on the webelement bdi___button23_BDI_content")
    public String bdi___button23_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button23_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button23_BDI_content")
    public void bdi___button23_BDI_content_Action_click() {
        bdi___button23_BDI_content = driver.findElement(locator.getLocator("bdi___button23_BDI_content"));
        clickOnElement(bdi___button23_BDI_content);
    }

    @Step("Click on the webelement bdi___button19_BDI_content")
    public String bdi___button19_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button19_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button19_BDI_content")
    public void bdi___button19_BDI_content_Action_click() {
        bdi___button19_BDI_content = driver.findElement(locator.getLocator("bdi___button19_BDI_content"));
        clickOnElement(bdi___button19_BDI_content);
    }

    @Step("Click on the webelement span___text49")
    public String span___text49_getText() {
        return driver.findElement(locator.getLocator("span___text49")).getText().trim();
    }

    @Step("Click on the webelement span___text49")
    public void span___text49_Action_click() {
        span___text49 = driver.findElement(locator.getLocator("span___text49"));
        clickOnElement(span___text49);
    }

    @Step("Capture the runtime value of the webelement span___text49 into the variable text49")
    public String span___text49_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("span___text49"));
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
            throw new IllegalStateException("Could not capture a runtime value for 'text49' from the element span___text49. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
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

    @Step("Click on the webelement bdi___button20_BDI_content")
    public String bdi___button20_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button20_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button20_BDI_content")
    public void bdi___button20_BDI_content_Action_click() {
        bdi___button20_BDI_content = driver.findElement(locator.getLocator("bdi___button20_BDI_content"));
        clickOnElement(bdi___button20_BDI_content);
    }

    @Step("Click on the webelement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3")
    public String li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3_getText() {
        return driver.findElement(locator.getLocator("li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3")).getText().trim();
    }

    @Step("Double click on the webelement li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3")
    public void li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3_click() {
        driver.findElement(locator.getLocator("li___item4_application_Safety_Report_Display_component___worklist___idForBourns_3")).click();
    }

    @Step("Click on the webelement span28_2")
    public String span28_2_getText() {
        return driver.findElement(locator.getLocator("span28_2")).getText().trim();
    }

    @Step("Click on the webelement span28_2")
    public void span28_2_Action_click() {
        span28_2 = driver.findElement(locator.getLocator("span28_2"));
        clickOnElement(span28_2);
    }

    @Step("Click on the webelement bdi___button12_BDI_content")
    public String bdi___button12_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button12_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button12_BDI_content")
    public void bdi___button12_BDI_content_Action_click() {
        bdi___button12_BDI_content = driver.findElement(locator.getLocator("bdi___button12_BDI_content"));
        clickOnElement(bdi___button12_BDI_content);
    }

    @Step("Click on the webelement li___item12___list3_8")
    public String li___item12___list3_8_getText() {
        return driver.findElement(locator.getLocator("li___item12___list3_8")).getText().trim();
    }

    @Step("Double click on the webelement li___item12___list3_8")
    public void li___item12___list3_8_click() {
        driver.findElement(locator.getLocator("li___item12___list3_8")).click();
    }

    @Step("Click on the webelement button___button6")
    public String button___button6_getText() {
        return driver.findElement(locator.getLocator("button___button6")).getText().trim();
    }

    @Step("Double click on the webelement button___button6")
    public void button___button6_click() {
        driver.findElement(locator.getLocator("button___button6")).click();
    }

    @Step("Click on the webelement span___button13_content")
    public String span___button13_content_getText() {
        return driver.findElement(locator.getLocator("span___button13_content")).getText().trim();
    }

    @Step("Click on the webelement span___button13_content")
    public void span___button13_content_Action_click() {
        span___button13_content = driver.findElement(locator.getLocator("span___button13_content"));
        clickOnElement(span___button13_content);
    }

    @Step("Click on the webelement div43_sap")
    public void div43_sap_Action_click() {
        //div43_sap = driver.findElement(locator.getLocator("div43_sap"));
        //clickOnElement(div43_sap);
        driver.findElement(locator.getLocator("div43_sap")).click();
    }

    @Step("Click on the webelement span___mbox_btn_5_inner")
    public String span___mbox_btn_5_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_5_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_5_inner")
    public void span___mbox_btn_5_inner_Action_click() {
        span___mbox_btn_5_inner = driver.findElement(locator.getLocator("span___mbox_btn_5_inner"));
        clickOnElement(span___mbox_btn_5_inner);
    }

    @Step("Click on the webelement bdi___button18_BDI_content")
    public String bdi___button18_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button18_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button18_BDI_content")
    public void bdi___button18_BDI_content_Action_click() {
        bdi___button18_BDI_content = driver.findElement(locator.getLocator("bdi___button18_BDI_content"));
        clickOnElement(bdi___button18_BDI_content);
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

    @Step("Click on the webelement div_sap_ui_blocklayer_popup")
    public void div_sap_ui_blocklayer_popup_Action_click() {
        div_sap_ui_blocklayer_popup = driver.findElement(locator.getLocator("div_sap_ui_blocklayer_popup"));
        clickOnElement(div_sap_ui_blocklayer_popup);
    }

    @Step("Click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6")
    public String li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6_getText() {
        return driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6")).getText().trim();
    }

    @Step("Double click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6")
    public void li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6_click() {
        driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_6")).click();
    }

    @Step("Click on the webelement div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content")
    public String div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content_getText() {
        return driver.findElement(locator.getLocator("div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content")).getText().trim();
    }

    @Step("Click on the webelement div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content")
    public void div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content_Action_click() {
        div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content = driver.findElement(locator.getLocator("div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content"));
        clickOnElement(div_application_Safety_Report_Display_component___worklist__idIconTabBarFiori2_content);
    }

    @Step("Double click on the webelement input___input7_inner")
    public void input___input7_inner_click() {
        driver.findElement(locator.getLocator("input___input7_inner")).click();
    }

    @Step("Click on the webelement div89_Abdominal_Pa")
    public String div89_Abdominal_Pa_getText() {
        return driver.findElement(locator.getLocator("div89_Abdominal_Pa")).getText().trim();
    }

    @Step("Click on the webelement div89_Abdominal_Pa")
    public void div89_Abdominal_Pa_Action_click() {
        div89_Abdominal_Pa = driver.findElement(locator.getLocator("div89_Abdominal_Pa"));
        clickOnElement(div89_Abdominal_Pa);
    }

    @Step("Click on the webelement li___item53")
    public String li___item53_getText() {
        return driver.findElement(locator.getLocator("li___item53")).getText().trim();
    }

    @Step("Double click on the webelement li___item53")
    public void li___item53_click() {
        driver.findElement(locator.getLocator("li___item53")).click();
    }

    @Step("Click on the webelement button___button19")
    public String button___button19_getText() {
        return driver.findElement(locator.getLocator("button___button19")).getText().trim();
    }

    @Step("Double click on the webelement button___button19")
    public void button___button19_click() {
        driver.findElement(locator.getLocator("button___button19")).click();
    }

    @Step("Click on the webelement span___mbox_btn_3_inner")
    public String span___mbox_btn_3_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_3_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_3_inner")
    public void span___mbox_btn_3_inner_Action_click() {
        span___mbox_btn_3_inner = driver.findElement(locator.getLocator("span___mbox_btn_3_inner"));
        clickOnElement(span___mbox_btn_3_inner);
    }

    @Step("Capture the runtime value of the webelement span___text46 into the variable text46")
    public String span___text46_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("span___text46"));
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
            throw new IllegalStateException("Could not capture a runtime value for 'text46' from the element span___text46. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement span___text46")
    public String span___text46_getText() {
        return driver.findElement(locator.getLocator("span___text46")).getText().trim();
    }

    @Step("Click on the webelement span___text46")
    public void span___text46_Action_click() {
        span___text46 = driver.findElement(locator.getLocator("span___text46"));
        clickOnElement(span___text46);
    }

    @Step("Double click on the webelement input___picker0_inner")
    public void input___picker0_inner_click() {
        driver.findElement(locator.getLocator("input___picker0_inner")).click();
    }

    @Step("Send the value 04/09/2026 to the webelement input___picker0_inner")
    public void input___picker0_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker0_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker0_inner")).sendKeys(val);
    }

    public String input___picker0_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker0_inner")).getAttribute("value");
    }

    @Step("Click on the webelement div64_Discolor__Sk")
    public String div64_Discolor__Sk_getText() {
        return driver.findElement(locator.getLocator("div64_Discolor__Sk")).getText().trim();
    }

    @Step("Click on the webelement div64_Discolor__Sk")
    public void div64_Discolor__Sk_Action_click() {
        div64_Discolor__Sk = driver.findElement(locator.getLocator("div64_Discolor__Sk"));
        clickOnElement(div64_Discolor__Sk);
    }

    @Step("Click on the webelement div188_Head")
    public String div188_Head_getText() {
        return driver.findElement(locator.getLocator("div188_Head")).getText().trim();
    }

    @Step("Click on the webelement div188_Head")
    public void div188_Head_Action_click() {
        div188_Head = driver.findElement(locator.getLocator("div188_Head"));
        clickOnElement(div188_Head);
    }

    @Step("Click on the webelement div264_Left")
    public String div264_Left_getText() {
        return driver.findElement(locator.getLocator("div264_Left")).getText().trim();
    }

    @Step("Click on the webelement div264_Left")
    public void div264_Left_Action_click() {
        div264_Left = driver.findElement(locator.getLocator("div264_Left"));
        clickOnElement(div264_Left);
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

    @Step("Click on the webelement div46_Chemical_Burn")
    public String div46_Chemical_Burn_getText() {
        return driver.findElement(locator.getLocator("div46_Chemical_Burn")).getText().trim();
    }

    @Step("Click on the webelement div46_Chemical_Burn")
    public void div46_Chemical_Burn_Action_click() {
        div46_Chemical_Burn = driver.findElement(locator.getLocator("div46_Chemical_Burn"));
        clickOnElement(div46_Chemical_Burn);
    }

    @Step("Click on the webelement div179_Face")
    public String div179_Face_getText() {
        return driver.findElement(locator.getLocator("div179_Face")).getText().trim();
    }

    @Step("Click on the webelement div179_Face")
    public void div179_Face_Action_click() {
        div179_Face = driver.findElement(locator.getLocator("div179_Face"));
        clickOnElement(div179_Face);
    }

    @Step("Click on the webelement div173_Entire_Body")
    public String div173_Entire_Body_getText() {
        return driver.findElement(locator.getLocator("div173_Entire_Body")).getText().trim();
    }

    @Step("Click on the webelement div173_Entire_Body")
    public void div173_Entire_Body_Action_click() {
        div173_Entire_Body = driver.findElement(locator.getLocator("div173_Entire_Body"));
        clickOnElement(div173_Entire_Body);
    }

    @Step("Click on the webelement div43_Cardiac")
    public String div43_Cardiac_getText() {
        return driver.findElement(locator.getLocator("div43_Cardiac")).getText().trim();
    }

    @Step("Click on the webelement div43_Cardiac")
    public void div43_Cardiac_Action_click() {
        div43_Cardiac = driver.findElement(locator.getLocator("div43_Cardiac"));
        clickOnElement(div43_Cardiac);
    }

    @Step("Click on the webelement li___item56")
    public String li___item56_getText() {
        return driver.findElement(locator.getLocator("li___item56")).getText().trim();
    }

    @Step("Double click on the webelement li___item56")
    public void li___item56_click() {
        driver.findElement(locator.getLocator("li___item56")).click();
    }

    @Step("Click on the webelement div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content")
    public String div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content_getText() {
        return driver.findElement(locator.getLocator("div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content")).getText().trim();
    }

    @Step("Click on the webelement div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content")
    public void div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content_Action_click() {
        div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content = driver.findElement(locator.getLocator("div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content"));
        clickOnElement(div_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_content);
    }

    @Step("Click on the webelement div40_Burn")
    public String div40_Burn_getText() {
        return driver.findElement(locator.getLocator("div40_Burn")).getText().trim();
    }

    @Step("Click on the webelement div40_Burn")
    public void div40_Burn_Action_click() {
        div40_Burn = driver.findElement(locator.getLocator("div40_Burn"));
        clickOnElement(div40_Burn);
    }

    @Step("Click on the webelement div170_Elbow")
    public String div170_Elbow_getText() {
        return driver.findElement(locator.getLocator("div170_Elbow")).getText().trim();
    }

    @Step("Click on the webelement div170_Elbow")
    public void div170_Elbow_Action_click() {
        div170_Elbow = driver.findElement(locator.getLocator("div170_Elbow"));
        clickOnElement(div170_Elbow);
    }

    @Step("Click on the webelement div270_Right")
    public String div270_Right_getText() {
        return driver.findElement(locator.getLocator("div270_Right")).getText().trim();
    }

    @Step("Click on the webelement div270_Right")
    public void div270_Right_Action_click() {
        div270_Right = driver.findElement(locator.getLocator("div270_Right"));
        clickOnElement(div270_Right);
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

    @Step("Click on the webelement li___item20")
    public String li___item20_getText() {
        return driver.findElement(locator.getLocator("li___item20")).getText().trim();
    }

    @Step("Double click on the webelement li___item20")
    public void li___item20_click() {
        driver.findElement(locator.getLocator("li___item20")).click();
    }

    @Step("Click on the webelement li___item57")
    public String li___item57_getText() {
        return driver.findElement(locator.getLocator("li___item57")).getText().trim();
    }

    @Step("Double click on the webelement li___item57")
    public void li___item57_click() {
        driver.findElement(locator.getLocator("li___item57")).click();
    }

    @Step("Click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4")
    public String li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4_getText() {
        return driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4")).getText().trim();
    }

    @Step("Double click on the webelement li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4")
    public void li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4_click() {
        driver.findElement(locator.getLocator("li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4")).click();
    }

    @Step("Click on the webelement section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead")
    public String section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_getText() {
        return driver.findElement(locator.getLocator("section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead")).getText().trim();
    }

    @Step("Click on the webelement section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead")
    public void section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead_Action_click() {
        section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead = driver.findElement(locator.getLocator("section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead"));
        clickOnElement(section_application_Safety_Report_Display_component___worklist__SimpleFormChangeColumn_oneGroup234__FC_NoHead);
    }

    @Step("Click on the webelement div37_Bruise")
    public String div37_Bruise_getText() {
        return driver.findElement(locator.getLocator("div37_Bruise")).getText().trim();
    }

    @Step("Click on the webelement div37_Bruise")
    public void div37_Bruise_Action_click() {
        div37_Bruise = driver.findElement(locator.getLocator("div37_Bruise"));
        clickOnElement(div37_Bruise);
    }

    @Step("Click on the webelement div49_Chest_Pain")
    public String div49_Chest_Pain_getText() {
        return driver.findElement(locator.getLocator("div49_Chest_Pain")).getText().trim();
    }

    @Step("Click on the webelement div49_Chest_Pain")
    public void div49_Chest_Pain_Action_click() {
        div49_Chest_Pain = driver.findElement(locator.getLocator("div49_Chest_Pain"));
        clickOnElement(div49_Chest_Pain);
    }

    @Step("Click on the webelement span48_22")
    public String span48_22_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span48_22", 30);
        return driver.findElement(locator.getLocator("span48_22")).getText().trim();
    }

    @Step("Click on the webelement span48_22")
    public void span48_22_Action_click() {
        span48_22 = driver.findElement(locator.getLocator("span48_22"));
        clickOnElement(span48_22);
    }

    @Step("Click on the webelement div107_Chemical_Burn")
    public String div107_Chemical_Burn_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("div107_Chemical_Burn", 30);
        return driver.findElement(locator.getLocator("div107_Chemical_Burn")).getText().trim();
    }

    @Step("Click on the webelement div107_Chemical_Burn")
    public void div107_Chemical_Burn_Action_click() {
        div107_Chemical_Burn = driver.findElement(locator.getLocator("div107_Chemical_Burn"));
        clickOnElement(div107_Chemical_Burn);
    }

    @Step("Click on the webelement div234_Entire_Body")
    public String div234_Entire_Body_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("div234_Entire_Body", 30);
        return driver.findElement(locator.getLocator("div234_Entire_Body")).getText().trim();
    }

    @Step("Click on the webelement div234_Entire_Body")
    public void div234_Entire_Body_Action_click() {
        div234_Entire_Body = driver.findElement(locator.getLocator("div234_Entire_Body"));
        clickOnElement(div234_Entire_Body);
    }
}
