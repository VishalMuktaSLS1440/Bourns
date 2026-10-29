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
public class Bourns_24HrTest_0901131340 {

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

    //Create the incidents--pass
    @Test(dataProvider = "fileDataProvider")
    @DisableHealing()
    public void Bourns_24HrTest_0901131340_Test(String input_i0116_val, String input_i0118_val, String input___picker1_inner_val) throws InterruptedException {
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
        softAssert.assertEquals("Review Incident/Accident".trim(), shell_homeObj.span___tile5_title_inner_getText());
        shell_homeObj.span___tile5_title_inner_Action_click();
        reviewincident_safety_app_displayObj = new Reviewincident_Safety_App_Display(driver, locator);
        softAssert.assertEquals("Create Incident/Near Miss".trim(), reviewincident_safety_app_displayObj.bdi___button7_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___button7_BDI_content_Action_click();
        reviewincident_safety_app_displayObj.span__idForBournsC_arrow_Action_click();
        softAssert.assertEquals("BAG (Bourns AG)".trim(), reviewincident_safety_app_displayObj.div47_BAG__Bourns__getText());
        reviewincident_safety_app_displayObj.div47_BAG__Bourns__Action_click();
        reviewincident_safety_app_displayObj.span__idForCategoryC_arrow_Action_click();
        softAssert.assertEquals("Incident".trim(), reviewincident_safety_app_displayObj.div168_Incident_getText());
        reviewincident_safety_app_displayObj.div168_Incident_Action_click();
        reviewincident_safety_app_displayObj.input___picker1_inner_click();
        reviewincident_safety_app_displayObj.input___picker1_inner_sendKeys(input___picker1_inner_val);
        /*reviewincident_safety_app_displayObj.input___picker1_inner_sendKeys("01/09/2026")*/
        softAssert.assertEquals("Submit".trim(), reviewincident_safety_app_displayObj.bdi___button8_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___button8_BDI_content_Action_click();
        softAssert.assertEquals("Yes".trim(), reviewincident_safety_app_displayObj.span___mbox_btn_0_content_getText());
        reviewincident_safety_app_displayObj.span___mbox_btn_0_content_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_2_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_2_BDI_content_Action_click();
        softAssert.assertEquals("S".trim(), reviewincident_safety_app_displayObj.span_meAreaHeaderButton_getText());
        reviewincident_safety_app_displayObj.span_meAreaHeaderButton_Action_click();
        softAssert.assertEquals("Sign Out".trim(), reviewincident_safety_app_displayObj.div153_Sign_Out_getText());
        reviewincident_safety_app_displayObj.div153_Sign_Out_Action_click();
        softAssert.assertEquals("OK".trim(), reviewincident_safety_app_displayObj.bdi___mbox_btn_3_BDI_content_getText());
        reviewincident_safety_app_displayObj.bdi___mbox_btn_3_BDI_content_Action_click();
    }

    @DataProvider(name = "fileDataProvider")
    public Iterator<Object[]> Bourns_24HrTest_0901131340_DataProvider() {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/Bourns_24HrTest_0901131340.csv";
        Iterator<Object[]> obj = DataProviderUtils.getDataAsArray(filePath);
        return obj;
    }
}
