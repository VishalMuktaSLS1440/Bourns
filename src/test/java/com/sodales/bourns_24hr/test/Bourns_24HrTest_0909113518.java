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
public class Bourns_24HrTest_0909113518 {

    Reviewincident_Safety_App_Display_Bournsfacility reviewincident_safety_app_display_bournsfacilityObj;

    Reviewincident_Safety_App_Display reviewincident_safety_app_displayObj;

    Safety_Report_Display safety_report_displayObj;

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

    //Create Accident closed and reopen
    @Test(dataProvider = "fileDataProvider")
    @DisableHealing()
    public void Bourns_24HrTest_0909113518_Test(String input_i0116_val, String input_i0118_val, String input___picker0_inner_val, String textarea___area3_inner_val, String textarea___area19_inner_val, String input___input31_inner_val, String input___input32_inner_val, String input___input33_inner_val, String input___input34_inner_val, String textarea___area20___clone506_inner_val, String input___picker9___clone508_inner_val, String input___picker10_inner_val) throws InterruptedException {
    	driver.get("https://flpnwc-v8me11qy8y.dispatcher.us4.hana.ondemand.com/sites?siteId=b3ccbea6-6f5c-43ca-a8f5-ffad59e9351c&evictCache=true#Shell-home");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(5000);
        b_a_d_e_dff_b_c_ac_samlObj = new B_A_D_E_Dff_B_C_Ac_Saml(driver, locator);
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
        softAssert.assertEquals("24 Hour Safety Report".trim(), shell_homeObj.span___tile2_title_inner_getText());
        shell_homeObj.span___tile2_title_inner_Action_click();
        safety_report_displayObj = new Safety_Report_Display(driver, locator);
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForBourns_arrow_Action_click();
        softAssert.assertEquals("BAG (Bourns AG)".trim(), safety_report_displayObj.li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_getText());
        safety_report_displayObj.li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_click();
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForCategory_arrow_Action_click();
        softAssert.assertEquals("Accident".trim(), safety_report_displayObj.li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_getText());
        safety_report_displayObj.li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_click();
        safety_report_displayObj.input___picker0_inner_click();
        safety_report_displayObj.input___picker0_inner_sendKeys(input___picker0_inner_val);
        /*safety_report_displayObj.input___picker0_inner_sendKeys("09/09/2026")*/
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow_Action_click();
        softAssert.assertEquals("Manufacturing floor".trim(), safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4_getText());
        safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_4_click();
        softAssert.assertEquals("Add Body Part".trim(), safety_report_displayObj.bdi___button4_BDI_content_getText());
        safety_report_displayObj.bdi___button4_BDI_content_Action_click();
        safety_report_displayObj.span___box1___table0_0_arrow_Action_click();
        softAssert.assertEquals("Chest Pain".trim(), safety_report_displayObj.div49_Chest_Pain_getText());
        safety_report_displayObj.div49_Chest_Pain_Action_click();
        safety_report_displayObj.span___box2___table0_0_arrow_Action_click();
        softAssert.assertEquals("Elbow".trim(), safety_report_displayObj.div170_Elbow_getText());
        safety_report_displayObj.div170_Elbow_Action_click();
        safety_report_displayObj.span___box3___table0_0_arrow_Action_click();
        softAssert.assertEquals("Left".trim(), safety_report_displayObj.div264_Left_getText());
        safety_report_displayObj.div264_Left_Action_click();
        safety_report_displayObj.textarea___area3_inner_sendKeys(textarea___area3_inner_val);
        /*safety_report_displayObj.textarea___area3_inner_sendKeys("tested")*/
        softAssert.assertEquals("Submit".trim(), safety_report_displayObj.bdi___button8_BDI_content_getText());
        safety_report_displayObj.bdi___button8_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), safety_report_displayObj.bdi___mbox_btn_0_BDI_content_getText());
        safety_report_displayObj.bdi___mbox_btn_0_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), safety_report_displayObj.span___mbox_btn_2_inner_getText());
        safety_report_displayObj.span___mbox_btn_2_inner_Action_click();
        shell_homeObj = new Shell_Home(driver, locator);
        softAssert.assertEquals("Safety Coordinator".trim(), shell_homeObj.div___item0_anchorNavigationBar_2_inner_getText());
        shell_homeObj.div___item0_anchorNavigationBar_2_inner_Action_click();
        softAssert.assertEquals("Review Incident/Accident".trim(), shell_homeObj.span___tile5_title_inner_getText());
        shell_homeObj.span___tile5_title_inner_Action_click();
        reviewincident_safety_app_displayObj = new Reviewincident_Safety_App_Display(driver, locator);
        softAssert.assertEquals("BAG-Accident-192-2026".trim(), reviewincident_safety_app_displayObj.a___link1___clone297_getText());
        reviewincident_safety_app_displayObj.a___link1___clone297_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj = new Reviewincident_Safety_App_Display_Bournsfacility(driver, locator);
        Thread.sleep(9000);
        softAssert.assertEquals("Analysis".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___filter5_text_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div___filter5_text_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.textarea___area19_inner_sendKeys(textarea___area19_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.textarea___area19_inner_sendKeys("tested")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___input31_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input31_inner_sendKeys(input___input31_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input31_inner_sendKeys("test")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___input32_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input32_inner_sendKeys(input___input32_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input32_inner_sendKeys("test")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___input33_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input33_inner_sendKeys(input___input33_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input33_inner_sendKeys("12")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___input34_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input34_inner_sendKeys(input___input34_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input34_inner_sendKeys("1")*/
        softAssert.assertEquals("Unsafe Action".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button40_label_bdi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button40_label_bdi_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button43_label_bdi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button43_label_bdi_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input35___clone497_vhi_Action_click();
        softAssert.assertEquals("Contact with (Electricity,Heat,Cold,Radiation,Caustics, Toxics, Noise)".trim(), reviewincident_safety_app_display_bournsfacilityObj.div41_Contact_with_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div41_Contact_with_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___box27___clone498_arrow_Action_click();
        softAssert.assertEquals("Substandard Conditions".trim(), reviewincident_safety_app_display_bournsfacilityObj.div13_Substandard__getText());
        reviewincident_safety_app_display_bournsfacilityObj.div13_Substandard__Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input36___clone499_vhi_Action_click();
        softAssert.assertEquals("Inadequate Guards or Bariers".trim(), reviewincident_safety_app_display_bournsfacilityObj.div54_Inadequate_G_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div54_Inadequate_G_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___box28___clone500_arrow_Action_click();
        softAssert.assertEquals("Personal Factor".trim(), reviewincident_safety_app_display_bournsfacilityObj.div23_Personal_Fac_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div23_Personal_Fac_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input37___clone501_vhi_Action_click();
        softAssert.assertEquals("Improper Motivation".trim(), reviewincident_safety_app_display_bournsfacilityObj.div58_Improper_Mot_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div58_Improper_Mot_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input38___clone502_vhi_Action_click();
        softAssert.assertEquals("Lack of incentives".trim(), reviewincident_safety_app_display_bournsfacilityObj.div64_Lack_of_ince_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div64_Lack_of_ince_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input39___clone503_vhi_Action_click();
        softAssert.assertEquals("Task Analysis And Procedures".trim(), reviewincident_safety_app_display_bournsfacilityObj.div64_Task_Analysi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div64_Task_Analysi_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input40___clone504_vhi_Action_click();  
        softAssert.assertEquals("Task Analysis and Task Procedure Objectives".trim(), reviewincident_safety_app_display_bournsfacilityObj.div64_Task_Analysi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div64_Task_Analysi_Action_click();
        
        reviewincident_safety_app_display_bournsfacilityObj.span___input41___clone505_vhi_Action_click();   /////
        
        reviewincident_safety_app_display_bournsfacilityObj.span___input41___clone505_vhi_Action();
        reviewincident_safety_app_display_bournsfacilityObj.scroll_horizontal_bar_left();
        
        //reviewincident_safety_app_display_bournsfacilityObj.scroll_upto_element();
        //reviewincident_safety_app_display_bournsfacilityObj.circle3_sap_Action_click();
        
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button70_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button70_BDI_content_Action_click();  //running till
        reviewincident_safety_app_display_bournsfacilityObj.div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span___input42___clone507_vhi_Action_click();
        softAssert.assertEquals("AMOL M".trim(), reviewincident_safety_app_display_bournsfacilityObj.span___text108___clone703_getText());
        reviewincident_safety_app_display_bournsfacilityObj.span___text108___clone703_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.textarea___area20___clone506_inner_sendKeys(textarea___area20___clone506_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.textarea___area20___clone506_inner_sendKeys("tested")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___picker9___clone508_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___picker9___clone508_inner_sendKeys(input___picker9___clone508_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___picker9___clone508_inner_sendKeys("09/09/2026")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___picker10_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___picker10_inner_sendKeys(input___picker10_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___picker10_inner_sendKeys("09/09/2026")*/
        softAssert.assertEquals("Close Incident".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button65_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button65_BDI_content_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_3_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_3_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_5_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_5_BDI_content_Action_click();
        softAssert.assertEquals("Print".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button66_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button66_BDI_content_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.img_shell_header_icon_Action_click();
        shell_homeObj = new Shell_Home(driver, locator);
        softAssert.assertEquals("Safety Coordinator".trim(), shell_homeObj.div___item0_anchorNavigationBar_2_inner_getText());
        shell_homeObj.div___item0_anchorNavigationBar_2_inner_Action_click();
        softAssert.assertEquals("Review Incident/Accident".trim(), shell_homeObj.span___tile5_title_inner_getText());
        shell_homeObj.span___tile5_title_inner_Action_click();
        reviewincident_safety_app_displayObj = new Reviewincident_Safety_App_Display(driver, locator);
        reviewincident_safety_app_displayObj.div_application_ReviewIncident_Safety_App_Display_component___worklist__idIncidentTableNonLoggedIn_rowsel0_Action_click();
        softAssert.assertEquals("Reopen".trim(), reviewincident_safety_app_displayObj.bdi___button76_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___button76_BDI_content_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_6_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_6_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_8_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_8_BDI_content_Action_click();
        softAssert.assertEquals("S".trim(), reviewincident_safety_app_displayObj.span_meAreaHeaderButton_getText());
        reviewincident_safety_app_displayObj.span_meAreaHeaderButton_Action_click();
        softAssert.assertEquals("Sign Out".trim(), reviewincident_safety_app_displayObj.div16_Sign_Out_getText());
        reviewincident_safety_app_displayObj.div16_Sign_Out_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_9_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_9_BDI_content_Action_click();
    }

    @DataProvider(name = "fileDataProvider")
    public Iterator<Object[]> Bourns_24HrTest_0909113518_DataProvider() {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/Bourns_24HrTest_0909113518.csv";
        Iterator<Object[]> obj = DataProviderUtils.getDataAsArray(filePath);
        return obj;
    }
}
