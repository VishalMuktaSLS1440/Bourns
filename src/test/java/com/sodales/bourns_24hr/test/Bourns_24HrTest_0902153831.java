package com.sodales.bourns_24hr.test;
import com.sodales.testngutils.LoggerUtil;
import com.sodales.testngutils.ScreenShotUtil;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.testng.asserts.SoftAssert;
import java.util.Iterator;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.annotation.DisableHealing;
import com.sodales.webautomationexecution.DataProviderUtils;
import com.sodales.webautomationexecution.Locators;
import com.sodales.bourns_24hr.pages.*;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
public class Bourns_24HrTest_0902153831 {

    Reviewincident_Safety_App_Display_Bournsfacility reviewincident_safety_app_display_bournsfacilityObj;

    Reviewincident_Safety_App_Display reviewincident_safety_app_displayObj;

    Shell_Home shell_homeObj;

    B_A_D_E_Dff_B_C_Ac_Login b_a_d_e_dff_b_c_ac_loginObj;

    B_A_D_E_Dff_B_C_Ac_Saml b_a_d_e_dff_b_c_ac_samlObj;

    Locators locator;

    public SelfHealingDriver driver;

    @BeforeClass
    public void configDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver selfHeal = new ChromeDriver();
        driver = SelfHealingDriver.create(selfHeal);
        driver.manage().window().maximize();
        locator = new Locators(driver, System.getProperty("user.dir") + "/src/test/resources/objectRepo/Bourns_24Hr_MasterObjectRepo.json");
    }

    @AfterClass
    public void quitDriver() {
        ScreenShotUtil.takeScreenShot(driver, "");
        driver.quit();
    }

    //Attached the attchmenet  -passsed
    @Test(dataProvider = "fileDataProvider")
    @DisableHealing()
    public void Bourns_24HrTest_0902153831_Test(String input_i0116_val, String input_i0118_val, String input___input40_inner_val, String textarea___area32_inner_val) throws InterruptedException {
        driver.get("https://flpnwc-v8me11qy8y.dispatcher.us4.hana.ondemand.com/sites?siteId=b3ccbea6-6f5c-43ca-a8f5-ffad59e9351c&evictCache=true#Shell-home");
        SoftAssert softAssert = new SoftAssert();
        b_a_d_e_dff_b_c_ac_samlObj = new B_A_D_E_Dff_B_C_Ac_Saml(driver, locator);
        Thread.sleep(5000);
        b_a_d_e_dff_b_c_ac_samlObj.input_i0116_click();
        b_a_d_e_dff_b_c_ac_samlObj.input_i0116_sendKeys(input_i0116_val);
        b_a_d_e_dff_b_c_ac_samlObj.input_idSIButton9_click();
        /*b_a_d_e_dff_b_c_ac_samlObj.input_i0116_sendKeys(EmailAutomation.getNewEmailId("user2@sodalessolutions.com"))*/
        b_a_d_e_dff_b_c_ac_samlObj.input_i0118_sendKeys(locator.decode(input_i0118_val));
        /*b_a_d_e_dff_b_c_ac_samlObj.input_i0118_sendKeys(locator.decode("cmFu=EjMzA0clxWYk92UZG9t"))*/
        b_a_d_e_dff_b_c_ac_samlObj.input_idSIButton9_click();
        b_a_d_e_dff_b_c_ac_loginObj = new B_A_D_E_Dff_B_C_Ac_Login(driver, locator);
        b_a_d_e_dff_b_c_ac_loginObj.input_idSIButton9_click();
        Thread.sleep(5000);
        shell_homeObj = new Shell_Home(driver, locator);
        softAssert.assertEquals("Safety Coordinator".trim(), shell_homeObj.div___item0_anchorNavigationBar_2_inner_getText());
        shell_homeObj.div___item0_anchorNavigationBar_2_inner_Action_click();
        softAssert.assertEquals("Review Incident/Accident".trim(), shell_homeObj.span___tile5_title_inner_getText());
        shell_homeObj.span___tile5_title_inner_Action_click();
        reviewincident_safety_app_displayObj = new Reviewincident_Safety_App_Display(driver, locator);
        softAssert.assertEquals("BAG-Incident-061-2026".trim(), reviewincident_safety_app_displayObj.a___link1___clone240_getText());
        reviewincident_safety_app_displayObj.a___link1___clone240_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj = new Reviewincident_Safety_App_Display_Bournsfacility(driver, locator);
        softAssert.assertEquals("Details".trim(), reviewincident_safety_app_display_bournsfacilityObj.span121_Details_getText());
        reviewincident_safety_app_display_bournsfacilityObj.span121_Details_Action_click();
        softAssert.assertEquals("Analysis".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___filter3_text_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div___filter3_text_Action_click();
        softAssert.assertEquals("Notes".trim(), reviewincident_safety_app_display_bournsfacilityObj.span127_Notes_getText());
        reviewincident_safety_app_display_bournsfacilityObj.span127_Notes_Action_click();
        softAssert.assertEquals("Attachments".trim(), reviewincident_safety_app_display_bournsfacilityObj.span130_Attachments_getText());
        reviewincident_safety_app_display_bournsfacilityObj.span130_Attachments_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input40_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input40_inner_sendKeys(input___input40_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input40_inner_sendKeys("test")*/
        reviewincident_safety_app_display_bournsfacilityObj.textarea___area32_inner_sendKeys(textarea___area32_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.textarea___area32_inner_sendKeys("Test")*/
        softAssert.assertEquals("Add".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_sendKeys("C:\\Users\\SLS1437\\OneDrive - Sodales Solutions\\Pictures\\Screenshots\\img.png");
        Thread.sleep(5000);
        softAssert.assertEquals("Submit".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button59_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button59_BDI_content_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_0_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_0_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_2_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_2_BDI_content_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___page1_navButton_iconBtn_Action_click();
        Thread.sleep(5000);
        reviewincident_safety_app_displayObj = new Reviewincident_Safety_App_Display(driver, locator);
        softAssert.assertEquals("S".trim(), reviewincident_safety_app_displayObj.span_meAreaHeaderButton_getText());
        reviewincident_safety_app_displayObj.span_meAreaHeaderButton_Action_click();
        softAssert.assertEquals("Sign Out".trim(), reviewincident_safety_app_displayObj.div16_Sign_Out_getText());
        reviewincident_safety_app_displayObj.div16_Sign_Out_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_3_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_3_BDI_content_Action_click();
    }

    @DataProvider(name = "fileDataProvider")
    public Iterator<Object[]> Bourns_24HrTest_0902153831_DataProvider() {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/Bourns_24HrTest_0902153831.csv";
        Iterator<Object[]> obj = DataProviderUtils.getDataAsArray(filePath);
        return obj;
    }
}
