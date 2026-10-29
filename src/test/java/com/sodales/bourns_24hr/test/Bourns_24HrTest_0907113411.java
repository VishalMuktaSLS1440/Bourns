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
public class Bourns_24HrTest_0907113411 {

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

    //E2E--Create accident >>download attchechment>> update incident 
    @Test(dataProvider = "fileDataProvider")
    @DisableHealing()
    public void Bourns_24HrTest_0907113411_Test(String input_i0116_val, String input_i0118_val, String input___picker0_inner_val, String textarea___area3_inner_val, String input___input23_inner_val, String input___input24_inner_val, String textarea___area15_inner_val, String textarea___area16_inner_val, String textarea___area19_inner_val, String input___input31_inner_val, String input___input32_inner_val, String input___input33_inner_val, String input___input34_inner_val, String textarea___area20___clone506_inner_val) throws InterruptedException {
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
        Thread.sleep(7000);  
        shell_homeObj = new Shell_Home(driver, locator);
        softAssert.assertEquals("Safety Coordinator".trim(), shell_homeObj.div___item0_anchorNavigationBar_2_inner_getText());
        shell_homeObj.div___item0_anchorNavigationBar_2_inner_Action_click();
        softAssert.assertEquals("24 Hour Safety Report".trim(), shell_homeObj.span___tile2_title_inner_getText());
        shell_homeObj.span___tile2_title_inner_Action_click();
        safety_report_displayObj = new Safety_Report_Display(driver, locator);
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForBourns_arrow_Action_click();
        softAssert.assertEquals("BAG (Bourns AG)".trim(), safety_report_displayObj.li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_getText());
        safety_report_displayObj.li___item4_application_Safety_Report_Display_component___worklist___idForBourns_1_click();
        safety_report_displayObj.input___picker0_inner_click();
        safety_report_displayObj.input___picker0_inner_sendKeys(input___picker0_inner_val);
        /*safety_report_displayObj.input___picker0_inner_sendKeys("09/07/2026")*/
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForCategory_arrow_Action_click();
        softAssert.assertEquals("Accident".trim(), safety_report_displayObj.li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_getText());
        safety_report_displayObj.li___item5_application_Safety_Report_Display_component___worklist___idForCategory_0_click();
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow_Action_click();
        softAssert.assertEquals("Maintenance areas".trim(), safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_getText());
        safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_click();
        softAssert.assertEquals("Add Body Part".trim(), safety_report_displayObj.bdi___button4_BDI_content_getText());
        safety_report_displayObj.bdi___button4_BDI_content_Action_click();
        safety_report_displayObj.span___box1___table0_0_arrow_Action_click();
        softAssert.assertEquals("Burn".trim(), safety_report_displayObj.div40_Burn_getText());
        safety_report_displayObj.div40_Burn_Action_click();
        safety_report_displayObj.span___box2___table0_0_arrow_Action_click();
        softAssert.assertEquals("Elbow".trim(), safety_report_displayObj.div170_Elbow_getText());
        safety_report_displayObj.div170_Elbow_Action_click();
        safety_report_displayObj.span___box3___table0_0_arrow_Action_click();
        softAssert.assertEquals("Right".trim(), safety_report_displayObj.div270_Right_getText());
        safety_report_displayObj.div270_Right_Action_click();
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
        //softAssert.assertEquals("BAG-Accident-139-2026".trim(), reviewincident_safety_app_displayObj.a___link1___clone297_getText());
        reviewincident_safety_app_displayObj.a___link1___clone297_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj = new Reviewincident_Safety_App_Display_Bournsfacility(driver, locator);
        softAssert.assertEquals("Print Summary".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button64_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button64_BDI_content_Action_click();
        softAssert.assertEquals("24 Hour Alert".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___filter3_text_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div___filter3_text_Action_click();
        softAssert.assertEquals("Print".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button66_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button66_BDI_content_Action_click();
        softAssert.assertEquals("Details".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___filter4_text_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div___filter4_text_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input19_inner_click();
        softAssert.assertEquals("AMOL M".trim(), reviewincident_safety_app_display_bournsfacilityObj.span___text97___clone627_getText());
        reviewincident_safety_app_display_bournsfacilityObj.span___text97___clone627_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow_Action_click();
        softAssert.assertEquals("Day".trim(), reviewincident_safety_app_display_bournsfacilityObj.div10_Day_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div10_Day_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow_Action_click();
        softAssert.assertEquals("Lean Manufacturing".trim(), reviewincident_safety_app_display_bournsfacilityObj.div44_Lean_Manufac_getText());
        reviewincident_safety_app_display_bournsfacilityObj.div44_Lean_Manufac_Action_click(); //  
        System.out.println("BEFORE circle5 click: " + System.currentTimeMillis());
        reviewincident_safety_app_display_bournsfacilityObj.circle5_sap_Action_click();
        System.out.println("AFTER circle5 click: " + System.currentTimeMillis());
        Thread.sleep(5000);
        reviewincident_safety_app_display_bournsfacilityObj.input___input23_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input23_inner_sendKeys(input___input23_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input23_inner_sendKeys("tested")*/
        reviewincident_safety_app_display_bournsfacilityObj.input___input24_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___input24_inner_sendKeys(input___input24_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.input___input24_inner_sendKeys("2")*/ 
        //reviewincident_safety_app_display_bournsfacilityObj.textarea___area15_inner_sendKeys(textarea___area15_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.textarea___area15_inner_sendKeys("tested")*/
        //softAssert.assertEquals("Training does not apply".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___label116__FE__RFLayout_row0_getText());
        //reviewincident_safety_app_display_bournsfacilityObj.div___label116__FE__RFLayout_row0_Action_click();
       // softAssert.assertEquals("Incident".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button22_label_bdi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button22_label_bdi_Action_click();   //pass till
        //reviewincident_safety_app_display_bournsfacilityObj.circle9_sap_Action_click();
        softAssert.assertEquals("Private External Medical Service".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___box17_label_bdi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___box17_label_bdi_Action_click();
        softAssert.assertEquals("Public Medical Service".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___box18_label_bdi_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___box18_label_bdi_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.div___box26_CbBg_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___picker8_inner_click();
        reviewincident_safety_app_display_bournsfacilityObj.input___picker8_inner();
        //softAssert.assertEquals("Accident/Incident Date\nWitnesses\nAccident/Incident Hour".trim(), reviewincident_safety_app_display_bournsfacilityObj.div___form4__Form__RFLayout_row0_getText());
        //reviewincident_safety_app_display_bournsfacilityObj.div___form4__Form__RFLayout_row0_Action_click();
        softAssert.assertEquals("Update".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button68_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button68_BDI_content_Action_click();
        reviewincident_safety_app_display_bournsfacilityObj.textarea___area16_inner_sendKeys(textarea___area16_inner_val);
        /*reviewincident_safety_app_display_bournsfacilityObj.textarea___area16_inner_sendKeys("tested")*/
        softAssert.assertEquals("Update".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___button68_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___button68_BDI_content_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_3_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_3_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_5_BDI_content_getText());
        reviewincident_safety_app_display_bournsfacilityObj.bdi___mbox_btn_5_BDI_content_Action_click();
        Thread.sleep(5000);
        softAssert.assertEquals("S".trim(), reviewincident_safety_app_displayObj.span_meAreaHeaderButton_getText());
        reviewincident_safety_app_displayObj.span_meAreaHeaderButton_Action_click();
        softAssert.assertEquals("Sign Out".trim(), reviewincident_safety_app_displayObj.div268_Sign_Out_getText());
        reviewincident_safety_app_displayObj.div268_Sign_Out_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_12_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_12_BDI_content_Action_click();
    }

    @DataProvider(name = "fileDataProvider")
    public Iterator<Object[]> Bourns_24HrTest_0907113411_DataProvider() {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/Bourns_24HrTest_0907113411.csv";
        Iterator<Object[]> obj = DataProviderUtils.getDataAsArray(filePath);
        return obj;
    }
}
