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
public class Bourns_24HrTest_0901164951 {

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

    //Create Accident -User2--BAG
    @Test(dataProvider = "fileDataProvider")
    @DisableHealing()
    public void Bourns_24HrTest_0901164951_Test(String input_i0116_val, String input_i0118_val, String textarea___area3_inner_val) throws InterruptedException {
        driver.get("https://flpnwc-v8me11qy8y.dispatcher.us4.hana.ondemand.com/sites?siteId=b3ccbea6-6f5c-43ca-a8f5-ffad59e9351c&evictCache=true#Shell-home");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(5000);
        b_a_d_e_dff_b_c_ac_samlObj = new B_A_D_E_Dff_B_C_Ac_Saml(driver, locator);
        b_a_d_e_dff_b_c_ac_samlObj.input_i0116_click();
        b_a_d_e_dff_b_c_ac_samlObj.input_i0116_sendKeys(input_i0116_val);
        b_a_d_e_dff_b_c_ac_samlObj.input_idSIButton9_click();
        /*b_a_d_e_dff_b_c_ac_samlObj.input_i0116_sendKeys(EmailAutomation.getNewEmailId("user2@sodalessolutions.com"))*/
        b_a_d_e_dff_b_c_ac_samlObj.input_i0118_click();
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
        safety_report_displayObj.span___picker0_icon_Action_click();
        softAssert.assertEquals("1".trim(), safety_report_displayObj.span31_1_getText());
        safety_report_displayObj.span31_1_Action_click();
        safety_report_displayObj.span_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_arrow_Action_click();
        softAssert.assertEquals("Maintenance areas".trim(), safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_getText());
        safety_report_displayObj.li___item6_application_Safety_Report_Display_component___worklist___idForEnvironmentAccident_3_click();
        softAssert.assertEquals("Add Body Part".trim(), safety_report_displayObj.bdi___button4_BDI_content_getText());
        safety_report_displayObj.bdi___button4_BDI_content_Action_click();
        safety_report_displayObj.span___box1___table0_0_arrow_Action_click();
        softAssert.assertEquals("Chest Pain".trim(), safety_report_displayObj.div110_Chest_Pain_getText());
        safety_report_displayObj.div110_Chest_Pain_Action_click();
        safety_report_displayObj.span___box2___table0_0_arrow_Action_click();
        softAssert.assertEquals("Chest".trim(), safety_report_displayObj.li___item54_getText());
        safety_report_displayObj.li___item54_click();
        safety_report_displayObj.span___box3___table0_0_arrow_Action_click();
        softAssert.assertEquals("Left".trim(), safety_report_displayObj.div325_Left_getText());
        safety_report_displayObj.div325_Left_Action_click();
        safety_report_displayObj.textarea___area3_inner_sendKeys(textarea___area3_inner_val);
        /*safety_report_displayObj.textarea___area3_inner_sendKeys("test")*/
        softAssert.assertEquals("Submit".trim(), safety_report_displayObj.bdi___button8_BDI_content_getText());
        safety_report_displayObj.bdi___button8_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), safety_report_displayObj.bdi___mbox_btn_0_BDI_content_getText());
        safety_report_displayObj.bdi___mbox_btn_0_BDI_content_Action_click();
        softAssert.assertEquals("OK".trim(), safety_report_displayObj.bdi___mbox_btn_2_BDI_content_getText());
        safety_report_displayObj.bdi___mbox_btn_2_BDI_content_Action_click();
        shell_homeObj = new Shell_Home(driver, locator);
        softAssert.assertEquals("S".trim(), shell_homeObj.span_meAreaHeaderButton_getText());
        shell_homeObj.span_meAreaHeaderButton_Action_click();
        softAssert.assertEquals("Sign Out".trim(), shell_homeObj.div16_Sign_Out_getText());
        shell_homeObj.div16_Sign_Out_Action_click();
        softAssert.assertEquals("OK".trim(), shell_homeObj.bdi___mbox_btn_3_BDI_content_getText());
        shell_homeObj.bdi___mbox_btn_3_BDI_content_Action_click();
    }

    @DataProvider(name = "fileDataProvider")
    public Iterator<Object[]> Bourns_24HrTest_0901164951_DataProvider() {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/Bourns_24HrTest_0901164951.csv";
        Iterator<Object[]> obj = DataProviderUtils.getDataAsArray(filePath);
        return obj;
    }
}
