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

public class Reviewincident_Safety_App_Display_Bournsfacility {

    WebElement span135_Analysis;

    WebElement span132_Details;

    WebElement span129_24_Hour_Alert;

    WebElement span___text121;

    WebElement span122_23;

    WebElement span80_23;

    WebElement span___text116___clone729;

    WebElement div168_Level_of_Com;

    WebElement div171_Task_Observa;

    WebElement li___item157___clone697;

    WebElement bdi___button46_label_bdi;

    WebElement bdi___button42_label_bdi;

    WebElement span140_Analysis;

    WebElement bdi___button24_label_bdi;

    WebElement bdi___button21_label_bdi;

    WebElement span127_Details;

    WebElement span124_24_Hour_Alert;

    WebElement input___picker9___clone508_inner;

    WebElement span___text108___clone703;

    WebElement div64_Task_Analysi;

    WebElement div64_Lack_of_ince;

    WebElement div54_Inadequate_G;

    WebElement div13_Substandard_;

    WebElement bdi___button43_label_bdi;

    WebElement bdi___button40_label_bdi;

    WebElement div153_Sign_Out;

    WebElement span___title8_inner;

    WebElement input___picker10_inner;

    WebElement span55_8;

    WebElement span___picker9___clone528_icon;

    WebElement span___text108___clone719;

    WebElement span___input42___clone527_vhi;

    WebElement span___input41___clone525_vhi;

    WebElement div64_Level_of_Com;

    WebElement span___input40___clone524_vhi;

    WebElement div67_Task_Observa;

    WebElement span___input39___clone523_vhi;

    WebElement span___input38___clone522_vhi;

    WebElement div64_Lack_of_Know;

    WebElement span___input37___clone521_vhi;

    WebElement span___box28___clone520_arrow;

    WebElement div54_Making_Safet;

    WebElement span___input36___clone519_vhi;

    WebElement span___box27___clone518_arrow;

    WebElement div41_Contact_with;

    WebElement span___input35___clone517_vhi;

    WebElement bdi___button44_label_bdi;

    WebElement bdi___button41_label_bdi;

    WebElement div___filter5_text;

    WebElement span126_Details;

    WebElement div___list6_2_logoutBtn_content;

    WebElement bdi___picker8_OK_BDI_content;

    WebElement span___picker8_icon;

    WebElement li___item131;

    WebElement span___text97___clone624;

    WebElement span___input19_vhi;

    WebElement div403_sap;

    WebElement img_shell_header_icon;

    WebElement div___list3_2_logoutBtn_content;

    WebElement input___picker8___clone431_inner;

    WebElement span___text100___clone624;

    WebElement div50_Manpower;

    WebElement li___item46___clone609;

    WebElement li___item45___clone594;

    WebElement div64_Inadequate_i;

    WebElement div67_Lack_of_Know;

    WebElement div48_Improper_Pos;

    WebElement div38_Caught_On__S;

    WebElement bdi___button33_label_bdi;

    WebElement span106_7;

    WebElement span62_7;

    WebElement li___item162___clone718;

    WebElement div174_Emergency_Pr;

    WebElement div168_Infrequent_p;

    WebElement div171_Lack_of_Skill;

    WebElement li___item154;

    WebElement div___form4__Form__RFLayout_row0;

    WebElement div___label116__FE__RFLayout_row0;

    WebElement bdi___button61_BDI_content;

    WebElement li___item80_IdInjuryCat_3;

    WebElement bdi___button55_BDI_content;

    WebElement span___text97;

    WebElement div164_sap;

    WebElement bdi___box15_label_bdi;

    WebElement bdi___box17_label_bdi;

    WebElement bdi___box13_label_bdi;

    WebElement bdi___button13_label_bdi;

    WebElement input__searchempNameBasic_I;

    WebElement span487_Analysis;

    WebElement span484_Details;

    WebElement button___page2_navButton;

    WebElement span___page2_navButton_iconBtn;

    WebElement span___picker9___clone505_icon;

    WebElement span___input42___clone504_vhi;

    WebElement textarea___area20___clone503_inner;

    WebElement div154_Manpower;

    WebElement span___input41___clone502_vhi;

    WebElement li___item159___clone722;

    WebElement span___input40___clone501_vhi;

    WebElement span___input39___clone500_vhi;

    WebElement span___input38___clone499_vhi;

    WebElement span___input37___clone498_vhi;

    WebElement span___box28___clone497_arrow;

    WebElement span___input36___clone496_vhi;

    WebElement span___box27___clone495_arrow;

    WebElement span___input35___clone494_vhi;

    WebElement bdi___box18_label_bdi;

    WebElement bdi___button22_label_bdi;

    WebElement div26_Engineering;

    WebElement div___filter4_text;

    WebElement bdi___button65_BDI_content;

    WebElement span___picker9___clone508_icon;

    WebElement textarea___area20___clone506_inner;

    WebElement span___text113___clone735;

    WebElement span___input42___clone507_vhi;

    WebElement bdi___button71_BDI_content;

    WebElement span___input41___clone505_vhi;

    WebElement div168_Remedial_Fol;

    WebElement span___input40___clone504_vhi;

    WebElement div168_Accident_And;

    WebElement span___input39___clone503_vhi;

    WebElement span___input38___clone502_vhi;

    WebElement li___item159___clone694;

    WebElement span___input37___clone501_vhi;

    WebElement span___box28___clone500_arrow;

    WebElement span___input36___clone499_vhi;

    WebElement span___box27___clone498_arrow;

    WebElement span___input35___clone497_vhi;

    WebElement bdi___button68_BDI_content;

    WebElement div___form4__Form__RFLayout;

    WebElement input___picker8_inner;

    WebElement textarea___area16_inner;

    WebElement div___box18_CbBg;

    WebElement div___box17_CbBg;

    WebElement circle___button19_Button;

    WebElement input___input24_inner;

    WebElement span___text97___clone627;

    WebElement bdi___button64_BDI_content;

    WebElement div268_Sign_Out;

    WebElement span238_Notes;

    WebElement span103_4;

    WebElement input___input47_inner;

    WebElement span___picker10___clone750_icon;

    WebElement span___text126___clone978;

    WebElement span___input46___clone749_vhi;

    WebElement textarea___area24___clone748_inner;

    WebElement span___input45___clone747_vhi;

    WebElement li___item167___clone962;

    WebElement span___input44___clone746_vhi;

    WebElement li___item166___clone947;

    WebElement span___input43___clone745_vhi;

    WebElement div168_Inadequate_i;

    WebElement span___input42___clone744_vhi;

    WebElement div168_Lack_of_Know;

    WebElement span___input41___clone743_vhi;

    WebElement span___box32___clone742_arrow;

    WebElement div158_Making_Safet;

    WebElement span___input40___clone741_vhi;

    WebElement span___box31___clone740_arrow;

    WebElement div145_Contact_with;

    WebElement span___input39___clone739_vhi;

    WebElement div504_sap;

    WebElement div___box21_CbBg;

    WebElement div35_Human_Resour;

    WebElement span___text110___clone869;

    WebElement input___picker10___clone683_inner;

    WebElement span___input46___clone682_vhi;

    WebElement textarea___area24___clone681_inner;

    WebElement span___input45___clone680_vhi;

    WebElement li___item170___clone889;

    WebElement span___input44___clone679_vhi;

    WebElement div168_Task_Analysi;

    WebElement span___input43___clone678_vhi;

    WebElement div162_Inadequate_p;

    WebElement span___input42___clone677_vhi;

    WebElement div171_Inadequate_M;

    WebElement span___input41___clone676_vhi;

    WebElement div130_Job_Factor;

    WebElement span___box32___clone675_arrow;

    WebElement li___item164___clone860;

    WebElement span___input40___clone674_vhi;

    WebElement li___item163;

    WebElement span___box31___clone673_arrow;

    WebElement li___item161___clone838;

    WebElement span___input39___clone672_vhi;

    WebElement div548_sap;

    WebElement div___form5__Form__RFLayout_row0;

    WebElement div681_sap;

    WebElement div50_Maintenance;

    WebElement span___text110___clone802;

    WebElement div207_Sign_Out;

    WebElement span59_4;

    WebElement input___picker10___clone669_inner;

    WebElement span___text126___clone892;

    WebElement span___input46___clone668_vhi;

    WebElement textarea___area24___clone667_inner;

    WebElement span___input45___clone666_vhi;

    WebElement div162_Training_Nee;

    WebElement span___input44___clone665_vhi;

    WebElement div174_Employee_Tra;

    WebElement span___input43___clone664_vhi;

    WebElement li___item168___clone864;

    WebElement span___input42___clone663_vhi;

    WebElement li___item167___clone857;

    WebElement span___input41___clone662_vhi;

    WebElement div127_Personal_Fac;

    WebElement span___box32___clone661_arrow;

    WebElement div161_Servicing_Eq;

    WebElement span___input40___clone660_vhi;

    WebElement div114_Substandard_;

    WebElement span___box31___clone659_arrow;

    WebElement li___item161___clone824;

    WebElement span___input39___clone658_vhi;

    WebElement span137_Analysis;

    WebElement div___form5__Form__RFLayout;

    WebElement input___picker9_inner;

    WebElement div___box30_CbBg;

    WebElement div541_sap;

    WebElement input___input26_inner;

    WebElement div44_Lean_Manufac;

    WebElement input___input25_inner;

    WebElement span___text110___clone788;

    WebElement input___input23_inner;

    WebElement span124_Details;

    WebElement bdi___button78_BDI_content;

    WebElement span121_24_Hour_Alert;

    WebElement bdi___button76_BDI_content;

    WebElement span___button96_content;

    WebElement bdi___mbox_btn_21_BDI_content;

    WebElement bdi___mbox_btn_19_BDI_content;

    WebElement span___button92_inner;

    WebElement bdi___mbox_btn_17_BDI_content;

    WebElement span___button73___clone1380_inner;

    WebElement bdi___button92_BDI_content;

    WebElement bdi___mbox_btn_16_BDI_content;

    WebElement bdi___button94_BDI_content;

    WebElement span291_3;

    WebElement span___picker13_icon;

    WebElement button___mbox_btn_12;

    WebElement span___button73___clone1380_img;

    WebElement bdi___button67_label_bdi;

    WebElement input___input44_inner;

    WebElement input___input42_inner;

    WebElement input___input41_inner;

    WebElement textarea___area35_inner;

    WebElement span___filter7_icon;

    WebElement span___button98_content;

    WebElement li___item198_IdInjuryCat_0;

    WebElement bdi___button90_BDI_content;

    WebElement span___button95_content;

    WebElement bdi___picker11_OK_BDI_content;

    WebElement bdi___box22_label_bdi;

    WebElement span___box23_label_text;

    WebElement bdi___button51_label_bdi;

    WebElement div642_sap;

    WebElement div98_Afternoon;

    WebElement input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner;

    WebElement li___item165;

    WebElement span___text200___clone1498;

    WebElement span___filter6_icon;

    WebElement button___button93;

    WebElement span___mbox_btn_14_inner;

    WebElement span___mbox_btn_12_content;

    WebElement bdi___button80_BDI_content;

    WebElement bdi___button82_BDI_content;

    WebElement span349_1;

    WebElement span329_23;

    WebElement span___picker10___clone462_icon;

    WebElement span___input46___clone461_vhi;

    WebElement textarea___area24___clone460_inner;

    WebElement span___button86_content;

    WebElement div619_sap;

    WebElement input___input45___clone459_inner;

    WebElement div636_Training_Pro;

    WebElement section___dialog23_dialog_cont;

    WebElement span___input44___clone458_vhi;

    WebElement li___item183___clone740;

    WebElement span___input43___clone457_vhi;

    WebElement div633_Emotional_di;

    WebElement input___input42___clone456_inner;

    WebElement li___item181___clone722;

    WebElement input___input41___clone455_inner;

    WebElement span___box32___clone454_arrow;

    WebElement input___box32___clone454_inner;

    WebElement li___item178___clone715;

    WebElement input___input40___clone453_inner;

    WebElement div582_Substandard_;

    WebElement span___box31___clone452_arrow;

    WebElement li___item175___clone693;

    WebElement span___input39___clone451_vhi;

    WebElement div1041_sap;

    WebElement bdi___button55_label_bdi;

    WebElement div904___Analysis;

    WebElement span___mbox_btn_8_content;

    WebElement span___picker9_OK_inner;

    WebElement span___box25_label_text;

    WebElement bdi___box24_label_bdi;

    WebElement input___input32___table5_0_inner;

    WebElement div353_Other;

    WebElement span___box20___table5_0_arrow;

    WebElement div262_Eyes;

    WebElement span___box19___table5_0_arrow;

    WebElement div132_Chemical_Burn;

    WebElement span___box18___table5_0_arrow;

    WebElement bdi___button49_BDI_content;

    WebElement div98_Day;

    WebElement div629_sap;

    WebElement div31_Logistic;

    WebElement div___form3__FC_NoHead__Grid;

    WebElement h4___form3__Form__title;

    WebElement div___label112__FE;

    WebElement div318___24_Hour_Al;

    WebElement bdi___button79_BDI_content;

    WebElement bdi___mbox_btn_14_BDI_content;

    WebElement bdi___mbox_btn_12_BDI_content;

    WebElement bdi___button81_BDI_content;

    WebElement div___success3_scrollCont;

    WebElement div___success3_footer;

    WebElement span___mbox_btn_9_inner;

    WebElement bdi___button83_BDI_content;

    WebElement span421_2;

    WebElement span400_23;

    WebElement span___picker10___clone655_icon;

    WebElement td22;

    WebElement span___input46___clone654_vhi;

    WebElement textarea___area24___clone653_inner;

    WebElement bdi___button91_BDI_content;

    WebElement div494_sap;

    WebElement span___input45___clone652_vhi;

    WebElement li___item261___clone870;

    WebElement span___input44___clone651_vhi;

    WebElement div524_Group_Meeting;

    WebElement span___input43___clone650_vhi;

    WebElement li___item259___clone853;

    WebElement span___input42___clone649_vhi;

    WebElement div512_Mental_or_Ps;

    WebElement input___input41___clone648_inner;

    WebElement div465_Personal_Fac;

    WebElement span___box32___clone647_arrow;

    WebElement div502_Servicing_Eq;

    WebElement span___input40___clone646_vhi;

    WebElement div452_Substandard_;

    WebElement span___box31___clone645_arrow;

    WebElement div489_Fall_To_Lowe;

    WebElement span___input39___clone644_vhi;

    WebElement svg4_sap;

    WebElement bdi___button56_label_bdi;

    WebElement input___input38_inner;

    WebElement input___input37_inner;

    WebElement input___input36_inner;

    WebElement input___input35_inner;

    WebElement textarea___area23_inner;

    WebElement span461_Analysis;

    WebElement span___mbox_btn_8_inner;

    WebElement bdi___button84_BDI_content;

    WebElement bdi___picker9_OK_BDI_content;

    WebElement div239_PM;

    WebElement span___picker9_clocks_btnS_inner;

    WebElement bdi___picker9_clocks_btnM_BDI_content;

    WebElement div___picker9_clocks_clockM_cover;

    WebElement div___picker9_clocks_clockH_cover;

    WebElement textarea___area20_inner;

    WebElement div___box23_CbBg;

    WebElement div___box26_CbBg;

    WebElement div___box29_CbBg;

    WebElement bdi___box25_label_bdi;

    WebElement bdi___box21_label_bdi;

    WebElement span96_7;

    WebElement span56_9;

    WebElement span___picker6_icon;

    WebElement div___box16_CbBg;

    WebElement div___box15_CbBg;

    WebElement bdi___button34_label_bdi;

    WebElement div106_Night;

    WebElement div13_Facilities;

    WebElement div437_sap;

    WebElement td1;

    WebElement span___input23_vhi;

    WebElement div___filter6_tab;

    WebElement span___button82_content;

    WebElement span___button80_content;

    WebElement input___input39_inner;

    WebElement span49_2;

    WebElement span___text100___clone617;

    WebElement div61_Occupational;

    WebElement div61_Accident_Inc;

    WebElement div61_Restricted_r;

    WebElement div61_Inadequate_P;

    WebElement div51_Improper_Pla;

    WebElement span127_Analysis;

    WebElement span93_2;

    WebElement span63_16;

    WebElement span___picker8___clone431_icon;

    WebElement span___text100___clone625;

    WebElement span___input38___clone430_vhi;

    WebElement textarea___area16___clone429_inner;

    WebElement span___input37___clone428_vhi;

    WebElement div58_Management_O;

    WebElement span___input36___clone427_vhi;

    WebElement span___input35___clone426_vhi;

    WebElement div58_Improper_per;

    WebElement span___input34___clone425_vhi;

    WebElement span___input33___clone424_vhi;

    WebElement span___box24___clone423_arrow;

    WebElement div45_Horseplay;

    WebElement span___input32___clone422_vhi;

    WebElement span___box23___clone421_arrow;

    WebElement div35_Caught_In__P;

    WebElement span___input31___clone420_vhi;

    WebElement span___page1_navButton_iconBtn;

    WebElement span130_Attachments;

    WebElement span127_Notes;

    WebElement div16_Sign_Out;

    WebElement div164_Sign_Out;

    WebElement span92_1;

    WebElement input___input43_inner;

    WebElement span48_1;

    WebElement span___picker9___clone431_icon;

    WebElement span___text103___clone629;

    WebElement span___input42___clone430_vhi;

    WebElement textarea___area20___clone429_inner;

    WebElement span___input41___clone428_vhi;

    WebElement div61_Formal_Initi;

    WebElement span___input40___clone427_vhi;

    WebElement div61_Management_T;

    WebElement span___input39___clone426_vhi;

    WebElement div61_Improper_per;

    WebElement span___input38___clone425_vhi;

    WebElement div58_Improper_Mot;

    WebElement span___input37___clone424_vhi;

    WebElement div23_Personal_Fac;

    WebElement span___box28___clone423_arrow;

    WebElement div45_Failure_to_W;

    WebElement span___input36___clone422_vhi;

    WebElement div10_Substandard_;

    WebElement span___box27___clone421_arrow;

    WebElement div32_Caught_Betwe;

    WebElement span___input35___clone420_vhi;

    WebElement span124_Analysis;

    WebElement div288_Sign_Out;

    WebElement span96_1;

    WebElement span67_16;

    WebElement span___text100___clone662;

    WebElement div194_Emergency_Li;

    WebElement div194_Emergency_Pr;

    WebElement div188_Infrequent_p;

    WebElement div191_Lack_of_Skill;

    WebElement div147_Personal_Fac;

    WebElement div181_Servicing_Eq;

    WebElement div165_Contact_with;

    WebElement div336_Sign_Out;

    WebElement bdi___button60_BDI_content;

    WebElement textarea___area14___table4_0_inner;

    WebElement input___input26___table4_0_inner;

    WebElement span___button30_img;

    WebElement textarea___area13___table3_0_inner;

    WebElement bdi___button63_BDI_content;

    WebElement div___item81___clone586_selectMulti_CbBg;

    WebElement span___button28_img;

    WebElement div___box22_CbBg;

    WebElement bdi___picker7_OK_BDI_content;

    WebElement div___picker7_clocks_clockH_cover;

    WebElement span___picker7_icon;

    WebElement textarea___area12_inner;

    WebElement div143_Crushing;

    WebElement use12_;

    WebElement input___input20_inner;

    WebElement input___input19_inner;

    WebElement div56_Manufacturing;

    WebElement span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow;

    WebElement div10_Day;

    WebElement span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow;

    WebElement span___text89___clone550;

    WebElement span___input15_vhi;

    WebElement span121_Details;

    WebElement bdi___button57_BDI_content;

    WebElement span391_Attachments;

    WebElement span388_Notes;

    WebElement div___filter3_text;

    WebElement span382_Details;

    WebElement span379_24_Hour_Alert;

    WebElement span130_Details;

    WebElement span127_24_Hour_Alert;

    WebElement div376_Sign_Out;

    WebElement span_meAreaHeaderButton;

    WebElement input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu;

    WebElement bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content;

    WebElement textarea___area32_inner;

    WebElement input___input40_inner;

    WebElement span300_Attachments;

    WebElement textarea___area31_inner;

    WebElement div___title22__FC__Grid_wrapperfor___area31;

    WebElement span186_31;

    WebElement span___picker11_icon;

    WebElement span248_Notes;

    WebElement bdi___mbox_btn_2_BDI_content;

    WebElement span___text108;

    WebElement bdi___mbox_btn_0_BDI_content;

    WebElement bdi___button59_BDI_content;

    WebElement span___picker9_icon;

    WebElement span86_31;

    WebElement span___picker8___clone470_icon;

    WebElement td15;

    WebElement span___input38___clone469_vhi;

    WebElement textarea___area16___clone468_inner;

    WebElement bdi___button62_BDI_content;

    WebElement div174_Manpower;

    WebElement span___input37___clone467_vhi;

    WebElement div188_Inspection_r;

    WebElement span___input36___clone466_vhi;

    WebElement div188_Planned_Insp;

    WebElement span___input35___clone465_vhi;

    WebElement div191_Inadequate_m;

    WebElement span___input34___clone464_vhi;

    WebElement div185_Inadequate_E;

    WebElement span___input33___clone463_vhi;

    WebElement div150_Job_Factor;

    WebElement span___box24___clone462_arrow;

    WebElement div175_Making_Safet;

    WebElement span___input32___clone461_vhi;

    WebElement div134_Substandard_;

    WebElement span___box23___clone460_arrow;

    WebElement div162_Caught_On__S;

    WebElement span___input31___clone459_vhi;

    WebElement circle7_sap;

    WebElement circle5_sap;

    WebElement input___input30_inner;

    WebElement input___input29_inner;

    WebElement input___input28_inner;

    WebElement input___input27_inner;

    WebElement textarea___area15_inner;

    WebElement span131_Analysis;

    WebElement span128_Details;

    WebElement bdi___button58_BDI_content;

    WebElement span125_24_Hour_Alert;

    WebElement div183_Home;

    WebElement span147_Review_Incid;

    WebElement div___filter8_text;

    WebElement span245_Notes;

    WebElement bdi___mbox_btn_11_BDI_content;

    WebElement bdi___mbox_btn_9_BDI_content;

    WebElement bdi___mbox_btn_8_BDI_content;

    WebElement span___text119;

    WebElement bdi___mbox_btn_6_BDI_content;

    WebElement li___item60___clone644;

    WebElement span___input40___clone447_vhi;

    WebElement span137_31;

    WebElement span___picker9___clone451_icon;

    WebElement span___text113___clone634;

    WebElement span___input42___clone450_vhi;

    WebElement bdi___button77_BDI_content;

    WebElement circle3_sap;

    WebElement div126_Manpower;

    WebElement span___input41___clone448_vhi;

    WebElement div143_Task_Observa;

    WebElement span___input39___clone446_vhi;

    WebElement div140_Inadequate_i;

    WebElement span___input38___clone445_vhi;

    WebElement div140_Lack_of_Know;

    WebElement span___input37___clone444_vhi;

    WebElement div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb;

    WebElement div99_Personal_Fac;

    WebElement span___box28___clone443_arrow;

    WebElement div127_Making_Safet;

    WebElement span___input36___clone442_vhi;

    WebElement div86_Substandard_;

    WebElement span___box27___clone441_arrow;

    WebElement div111_Caught_In__P;

    WebElement span___input35___clone440_vhi;

    WebElement span77_31;

    WebElement span___picker10_icon;

    WebElement bdi___button70_BDI_content;

    WebElement input___input34_inner;

    WebElement input___input33_inner;

    WebElement input___input32_inner;

    WebElement input___input31_inner;

    WebElement circle9_sap;

    WebElement circle1_sap;

    WebElement textarea___area19_inner;

    WebElement span133_Analysis;

    WebElement bdi___mbox_btn_5_BDI_content;

    WebElement bdi___mbox_btn_3_BDI_content;

    WebElement bdi___button73_BDI_content;

    WebElement li___item47_IdInjuryCat_1;

    WebElement span_IdInjuryCat_arrow;

    WebElement bdi___button66_BDI_content;

    WebElement span129_Details;

    WebElement bdi___button69_BDI_content;

    WebElement span126_24_Hour_Alert;

    WebElement bdi___button67_BDI_content;

    Locators locator;

    WebDriver driver;

    public Reviewincident_Safety_App_Display_Bournsfacility(WebDriver driver, Locators locator) {
        this.locator = locator;
        this.driver = driver;
    }

    @Step("Click on the webelement bdi___button67_BDI_content")
    public String bdi___button67_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button67_BDI_content")).getText().trim();
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

    @Step("Click on the webelement bdi___button67_BDI_content")
    public void bdi___button67_BDI_content_Action_click() {
        bdi___button67_BDI_content = driver.findElement(locator.getLocator("bdi___button67_BDI_content"));
        clickOnElement(bdi___button67_BDI_content);
    }

    @Step("Click on the webelement span126_24_Hour_Alert")
    public String span126_24_Hour_Alert_getText() {
        return driver.findElement(locator.getLocator("span126_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span126_24_Hour_Alert")
    public void span126_24_Hour_Alert_Action_click() {
        span126_24_Hour_Alert = driver.findElement(locator.getLocator("span126_24_Hour_Alert"));
        clickOnElement(span126_24_Hour_Alert);
    }

    @Step("Click on the webelement bdi___button69_BDI_content")
    public String bdi___button69_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button69_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button69_BDI_content")
    public void bdi___button69_BDI_content_Action_click() {
        bdi___button69_BDI_content = driver.findElement(locator.getLocator("bdi___button69_BDI_content"));
        clickOnElement(bdi___button69_BDI_content);
    }

    @Step("Click on the webelement span129_Details")
    public String span129_Details_getText() {
        return driver.findElement(locator.getLocator("span129_Details")).getText().trim();
    }

    @Step("Click on the webelement span129_Details")
    public void span129_Details_Action_click() {
        span129_Details = driver.findElement(locator.getLocator("span129_Details"));
        clickOnElement(span129_Details);
    }

    @Step("Click on the webelement bdi___button66_BDI_content")
    public String bdi___button66_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button66_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button66_BDI_content")
    public void bdi___button66_BDI_content_Action_click() {
        bdi___button66_BDI_content = driver.findElement(locator.getLocator("bdi___button66_BDI_content"));
        clickOnElement(bdi___button66_BDI_content);
    }

    @Step("Click on the webelement span_IdInjuryCat_arrow")
    public void span_IdInjuryCat_arrow_Action_click() {
        span_IdInjuryCat_arrow = driver.findElement(locator.getLocator("span_IdInjuryCat_arrow"));
        clickOnElement(span_IdInjuryCat_arrow);
    }

    @Step("Click on the webelement li___item47_IdInjuryCat_1")
    public String li___item47_IdInjuryCat_1_getText() {
        return driver.findElement(locator.getLocator("li___item47_IdInjuryCat_1")).getText().trim();
    }

    @Step("Double click on the webelement li___item47_IdInjuryCat_1")
    public void li___item47_IdInjuryCat_1_click() {
        driver.findElement(locator.getLocator("li___item47_IdInjuryCat_1")).click();
    }

    @Step("Click on the webelement bdi___button73_BDI_content")
    public String bdi___button73_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button73_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button73_BDI_content")
    public void bdi___button73_BDI_content_Action_click() {
        bdi___button73_BDI_content = driver.findElement(locator.getLocator("bdi___button73_BDI_content"));
        clickOnElement(bdi___button73_BDI_content);
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

    @Step("Click on the webelement span133_Analysis")
    public String span133_Analysis_getText() {
        return driver.findElement(locator.getLocator("span133_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span133_Analysis")
    public void span133_Analysis_Action_click() {
        span133_Analysis = driver.findElement(locator.getLocator("span133_Analysis"));
        clickOnElement(span133_Analysis);
    }

    @Step("Send the value Test to the webelement textarea___area19_inner")
    public void textarea___area19_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area19_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area19_inner")).sendKeys(val);
    }

    public String textarea___area19_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area19_inner")).getAttribute("value");
    }

    @Step("Click on the webelement circle1_sap")
    public void circle1_sap_Action_click() {
        circle1_sap = driver.findElement(locator.getLocator("circle1_sap"));
        clickOnElement(circle1_sap);
    }

    @Step("Click on the webelement circle9_sap")
    public void circle9_sap_Action_click() {
        circle9_sap = driver.findElement(locator.getLocator("circle9_sap"));
        clickOnElement(circle9_sap);
    }

    @Step("Double click on the webelement input___input31_inner")
    public void input___input31_inner_click() {
        driver.findElement(locator.getLocator("input___input31_inner")).click();
    }

    @Step("Send the value Test to the webelement input___input31_inner")
    public void input___input31_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input31_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input31_inner")).sendKeys(val);
    }

    public String input___input31_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input31_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input32_inner")
    public void input___input32_inner_click() {
        driver.findElement(locator.getLocator("input___input32_inner")).click();
    }

    @Step("Send the value Test to the webelement input___input32_inner")
    public void input___input32_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input32_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input32_inner")).sendKeys(val);
    }

    public String input___input32_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input32_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input33_inner")
    public void input___input33_inner_click() {
        driver.findElement(locator.getLocator("input___input33_inner")).click();
    }

    @Step("Send the value 100 to the webelement input___input33_inner")
    public void input___input33_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input33_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input33_inner")).sendKeys(val);
    }

    public String input___input33_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input33_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input34_inner")
    public void input___input34_inner_click() {
        driver.findElement(locator.getLocator("input___input34_inner")).click();
    }

    @Step("Send the value 25 to the webelement input___input34_inner")
    public void input___input34_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input34_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input34_inner")).sendKeys(val);
    }

    public String input___input34_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input34_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button70_BDI_content")
    public String bdi___button70_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button70_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button70_BDI_content")
    public void bdi___button70_BDI_content_Action_click() {
        bdi___button70_BDI_content = driver.findElement(locator.getLocator("bdi___button70_BDI_content"));
        clickOnElement(bdi___button70_BDI_content);
    }

    @Step("Click on the webelement span___picker10_icon")
    public void span___picker10_icon_Action_click() {
        span___picker10_icon = driver.findElement(locator.getLocator("span___picker10_icon"));
        clickOnElement(span___picker10_icon);
    }

    @Step("Click on the webelement span77_31")
    public String span77_31_getText() {
        return driver.findElement(locator.getLocator("span77_31")).getText().trim();
    }

    @Step("Click on the webelement span77_31")
    public void span77_31_Action_click() {
        span77_31 = driver.findElement(locator.getLocator("span77_31"));
        clickOnElement(span77_31);
    }

    @Step("Click on the webelement span___input35___clone440_vhi")
    public void span___input35___clone440_vhi_Action_click() {
        span___input35___clone440_vhi = driver.findElement(locator.getLocator("span___input35___clone440_vhi"));
        clickOnElement(span___input35___clone440_vhi);
    }

    @Step("Click on the webelement div111_Caught_In__P")
    public String div111_Caught_In__P_getText() {
        return driver.findElement(locator.getLocator("div111_Caught_In__P")).getText().trim();
    }

    @Step("Click on the webelement div111_Caught_In__P")
    public void div111_Caught_In__P_Action_click() {
        div111_Caught_In__P = driver.findElement(locator.getLocator("div111_Caught_In__P"));
        clickOnElement(div111_Caught_In__P);
    }

    @Step("Click on the webelement span___box27___clone441_arrow")
    public void span___box27___clone441_arrow_Action_click() {
        span___box27___clone441_arrow = driver.findElement(locator.getLocator("span___box27___clone441_arrow"));
        clickOnElement(span___box27___clone441_arrow);
    }

    @Step("Click on the webelement div86_Substandard_")
    public String div86_Substandard__getText() {
        return driver.findElement(locator.getLocator("div86_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div86_Substandard_")
    public void div86_Substandard__Action_click() {
        div86_Substandard_ = driver.findElement(locator.getLocator("div86_Substandard_"));
        clickOnElement(div86_Substandard_);
    }

    @Step("Click on the webelement span___input36___clone442_vhi")
    public void span___input36___clone442_vhi_Action_click() {
        span___input36___clone442_vhi = driver.findElement(locator.getLocator("span___input36___clone442_vhi"));
        clickOnElement(span___input36___clone442_vhi);
    }

    @Step("Click on the webelement div127_Making_Safet")
    public String div127_Making_Safet_getText() {
        return driver.findElement(locator.getLocator("div127_Making_Safet")).getText().trim();
    }

    @Step("Click on the webelement div127_Making_Safet")
    public void div127_Making_Safet_Action_click() {
        div127_Making_Safet = driver.findElement(locator.getLocator("div127_Making_Safet"));
        clickOnElement(div127_Making_Safet);
    }

    @Step("Click on the webelement span___box28___clone443_arrow")
    public void span___box28___clone443_arrow_Action_click() {
        span___box28___clone443_arrow = driver.findElement(locator.getLocator("span___box28___clone443_arrow"));
        clickOnElement(span___box28___clone443_arrow);
    }

    @Step("Click on the webelement div99_Personal_Fac")
    public String div99_Personal_Fac_getText() {
        return driver.findElement(locator.getLocator("div99_Personal_Fac")).getText().trim();
    }

    @Step("Click on the webelement div99_Personal_Fac")
    public void div99_Personal_Fac_Action_click() {
        div99_Personal_Fac = driver.findElement(locator.getLocator("div99_Personal_Fac"));
        clickOnElement(div99_Personal_Fac);
    }

    @Step("Click on the webelement div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb")
    public void div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb_Action_click() {
        div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb = driver.findElement(locator.getLocator("div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb"));
        clickOnElement(div_application_ReviewIncident_Safety_App_Display_component___object__idIncidentTable_hsb);
    }

    @Step("Click on the webelement span___input37___clone444_vhi")
    public void span___input37___clone444_vhi_Action_click() {
        span___input37___clone444_vhi = driver.findElement(locator.getLocator("span___input37___clone444_vhi"));
        clickOnElement(span___input37___clone444_vhi);
    }

    @Step("Click on the webelement div140_Lack_of_Know")
    public String div140_Lack_of_Know_getText() {
        return driver.findElement(locator.getLocator("div140_Lack_of_Know")).getText().trim();
    }

    @Step("Click on the webelement div140_Lack_of_Know")
    public void div140_Lack_of_Know_Action_click() {
        div140_Lack_of_Know = driver.findElement(locator.getLocator("div140_Lack_of_Know"));
        clickOnElement(div140_Lack_of_Know);
    }

    @Step("Click on the webelement span___input38___clone445_vhi")
    public void span___input38___clone445_vhi_Action_click() {
        span___input38___clone445_vhi = driver.findElement(locator.getLocator("span___input38___clone445_vhi"));
        clickOnElement(span___input38___clone445_vhi);
    }

    @Step("Click on the webelement div140_Inadequate_i")
    public String div140_Inadequate_i_getText() {
        return driver.findElement(locator.getLocator("div140_Inadequate_i")).getText().trim();
    }

    @Step("Click on the webelement div140_Inadequate_i")
    public void div140_Inadequate_i_Action_click() {
        div140_Inadequate_i = driver.findElement(locator.getLocator("div140_Inadequate_i"));
        clickOnElement(div140_Inadequate_i);
    }

    @Step("Click on the webelement span___input39___clone446_vhi")
    public void span___input39___clone446_vhi_Action_click() {
        span___input39___clone446_vhi = driver.findElement(locator.getLocator("span___input39___clone446_vhi"));
        clickOnElement(span___input39___clone446_vhi);
    }

    @Step("Click on the webelement div143_Task_Observa")
    public String div143_Task_Observa_getText() {
        return driver.findElement(locator.getLocator("div143_Task_Observa")).getText().trim();
    }

    @Step("Click on the webelement div143_Task_Observa")
    public void div143_Task_Observa_Action_click() {
        div143_Task_Observa = driver.findElement(locator.getLocator("div143_Task_Observa"));
        clickOnElement(div143_Task_Observa);
    }

    @Step("Click on the webelement span___input41___clone448_vhi")
    public void span___input41___clone448_vhi_Action_click() {
        span___input41___clone448_vhi = driver.findElement(locator.getLocator("span___input41___clone448_vhi"));
        clickOnElement(span___input41___clone448_vhi);
    }

    @Step("Click on the webelement div126_Manpower")
    public String div126_Manpower_getText() {
        return driver.findElement(locator.getLocator("div126_Manpower")).getText().trim();
    }

    @Step("Click on the webelement div126_Manpower")
    public void div126_Manpower_Action_click() {
        //        div126_Manpower = driver.findElement(locator.getLocator("div126_Manpower"));
        //        clickOnElement(div126_Manpower);
        driver.findElement(By.xpath("__item56-__clone627-selectSingle-Button")).click();
    }

    @Step("Click on the webelement circle3_sap")
    public void circle3_sap_Action_click() {
        circle3_sap = driver.findElement(locator.getLocator("circle3_sap"));
        clickOnElement(circle3_sap);
    }

    @Step("Click on the webelement radio button Permanent Consequences")
    public void circle3_sap_Action_click_radiobutton_Permanent_Consequences() {
        circle3_sap = driver.findElement(By.xpath("//bdi[text()='Yes']"));
        clickOnElement(circle3_sap);
    }

    @Step("Click on the webelement redio button")
    public void circle3_sap_Action_clickradiobutton() {
        circle3_sap = driver.findElement(By.xpath("//bdi[text()='Unsafe Action']"));
        clickOnElement(circle3_sap);
    }

    @Step("Click on the webelement bdi___button77_BDI_content")
    public String bdi___button77_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button77_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button77_BDI_content")
    public void bdi___button77_BDI_content_Action_click() {
        bdi___button77_BDI_content = driver.findElement(locator.getLocator("bdi___button77_BDI_content"));
        clickOnElement(bdi___button77_BDI_content);
    }

    @Step("Click on the webelement span___input42___clone450_vhi")
    public void span___input42___clone450_vhi_Action_click() {
        span___input42___clone450_vhi = driver.findElement(locator.getLocator("span___input42___clone450_vhi"));
        clickOnElement(span___input42___clone450_vhi);
    }

    @Step("Click on the webelement span___text113___clone634")
    public String span___text113___clone634_getText() {
        return driver.findElement(locator.getLocator("span___text113___clone634")).getText().trim();
    }

    @Step("Click on the webelement span___text113___clone634")
    public void span___text113___clone634_Action_click() {
        span___text113___clone634 = driver.findElement(locator.getLocator("span___text113___clone634"));
        clickOnElement(span___text113___clone634);
    }

    @Step("Click on the webelement span___picker9___clone451_icon")
    public void span___picker9___clone451_icon_Action_click() {
        span___picker9___clone451_icon = driver.findElement(locator.getLocator("span___picker9___clone451_icon"));
        clickOnElement(span___picker9___clone451_icon);
    }

    @Step("Click on the webelement span137_31")
    public String span137_31_getText() {
        return driver.findElement(locator.getLocator("span137_31")).getText().trim();
    }

    @Step("Click on the webelement span137_31")
    public void span137_31_Action_click() {
        span137_31 = driver.findElement(locator.getLocator("span137_31"));
        clickOnElement(span137_31);
    }

    @Step("Click on the webelement span___input40___clone447_vhi")
    public void span___input40___clone447_vhi_Action_click() {
        span___input40___clone447_vhi = driver.findElement(locator.getLocator("span___input40___clone447_vhi"));
        clickOnElement(span___input40___clone447_vhi);
    }

    @Step("Click on the webelement li___item60___clone644")
    public String li___item60___clone644_getText() {
        return driver.findElement(locator.getLocator("li___item60___clone644")).getText().trim();
    }

    @Step("Double click on the webelement li___item60___clone644")
    public void li___item60___clone644_click() {
        driver.findElement(locator.getLocator("li___item60___clone644")).click();
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

    @Step("Click on the webelement span___text119")
    public String span___text119_getText() {
        return driver.findElement(locator.getLocator("span___text119")).getText().trim();
    }

    @Step("Click on the webelement span___text119")
    public void span___text119_Action_click() {
        span___text119 = driver.findElement(locator.getLocator("span___text119"));
        clickOnElement(span___text119);
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

    @Step("Click on the webelement span245_Notes")
    public String span245_Notes_getText() {
        return driver.findElement(locator.getLocator("span245_Notes")).getText().trim();
    }

    @Step("Click on the webelement span245_Notes")
    public void span245_Notes_Action_click() {
        span245_Notes = driver.findElement(locator.getLocator("span245_Notes"));
        clickOnElement(span245_Notes);
    }

    @Step("Click on the webelement div___filter8_text")
    public String div___filter8_text_getText() {
        return driver.findElement(locator.getLocator("div___filter8_text")).getText().trim();
    }

    @Step("Click on the webelement div___filter8_text")
    public void div___filter8_text_Action_click() {
        div___filter8_text = driver.findElement(locator.getLocator("div___filter8_text"));
        clickOnElement(div___filter8_text);
    }

    @Step("Click on the webelement span147_Review_Incid")
    public String span147_Review_Incid_getText() {
        return driver.findElement(locator.getLocator("span147_Review_Incid")).getText().trim();
    }

    @Step("Click on the webelement span147_Review_Incid")
    public void span147_Review_Incid_Action_click() {
        span147_Review_Incid = driver.findElement(locator.getLocator("span147_Review_Incid"));
        clickOnElement(span147_Review_Incid);
    }

    @Step("Click on the webelement div183_Home")
    public String div183_Home_getText() {
        return driver.findElement(locator.getLocator("div183_Home")).getText().trim();
    }

    @Step("Click on the webelement div183_Home")
    public void div183_Home_Action_click() {
        div183_Home = driver.findElement(locator.getLocator("div183_Home"));
        clickOnElement(div183_Home);
    }

    @Step("Click on the webelement span125_24_Hour_Alert")
    public String span125_24_Hour_Alert_getText() {
        return driver.findElement(locator.getLocator("span125_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span125_24_Hour_Alert")
    public void span125_24_Hour_Alert_Action_click() {
        span125_24_Hour_Alert = driver.findElement(locator.getLocator("span125_24_Hour_Alert"));
        clickOnElement(span125_24_Hour_Alert);
    }

    @Step("Click on the webelement bdi___button58_BDI_content")
    public String bdi___button58_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button58_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button58_BDI_content")
    public void bdi___button58_BDI_content_Action_click() {
        bdi___button58_BDI_content = driver.findElement(locator.getLocator("bdi___button58_BDI_content"));
        clickOnElement(bdi___button58_BDI_content);
    }

    @Step("Click on the webelement span128_Details")
    public String span128_Details_getText() {
        return driver.findElement(locator.getLocator("span128_Details")).getText().trim();
    }

    @Step("Click on the webelement span128_Details")
    public void span128_Details_Action_click() {
        span128_Details = driver.findElement(locator.getLocator("span128_Details"));
        clickOnElement(span128_Details);
    }

    @Step("Click on the webelement span131_Analysis")
    public String span131_Analysis_getText() {
        return driver.findElement(locator.getLocator("span131_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span131_Analysis")
    public void span131_Analysis_Action_click() {
        span131_Analysis = driver.findElement(locator.getLocator("span131_Analysis"));
        clickOnElement(span131_Analysis);
    }

    @Step("Send the value Test to the webelement textarea___area15_inner")
    public void textarea___area15_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area15_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area15_inner")).sendKeys(val);
    }

    public String textarea___area15_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area15_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input27_inner")
    public void input___input27_inner_click() {
        driver.findElement(locator.getLocator("input___input27_inner")).click();
    }

    @Step("Send the value Test to the webelement input___input27_inner")
    public void input___input27_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input27_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input27_inner")).sendKeys(val);
    }

    public String input___input27_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input27_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input28_inner")
    public void input___input28_inner_click() {
        driver.findElement(locator.getLocator("input___input28_inner")).click();
    }

    @Step("Send the value Test to the webelement input___input28_inner")
    public void input___input28_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input28_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input28_inner")).sendKeys(val);
    }

    public String input___input28_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input28_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input29_inner")
    public void input___input29_inner_click() {
        driver.findElement(locator.getLocator("input___input29_inner")).click();
    }

    @Step("Send the value 100 to the webelement input___input29_inner")
    public void input___input29_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input29_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input29_inner")).sendKeys(val);
    }

    public String input___input29_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input29_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input30_inner")
    public void input___input30_inner_click() {
        driver.findElement(locator.getLocator("input___input30_inner")).click();
    }

    @Step("Send the value 24 to the webelement input___input30_inner")
    public void input___input30_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input30_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input30_inner")).sendKeys(val);
    }

    public String input___input30_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input30_inner")).getAttribute("value");
    }

    @Step("Click on the webelement circle5_sap")
    public void circle5_sap_Action_click() {
        circle5_sap = driver.findElement(locator.getLocator("circle5_sap"));
        clickOnElement(circle5_sap);
    }

    @Step("Click on the webelement circle7_sap")
    public void circle7_sap_Action_click() {
        circle7_sap = driver.findElement(locator.getLocator("circle7_sap"));
        clickOnElement(circle7_sap);
    }

    @Step("Click on the webelement span___input31___clone459_vhi")
    public void span___input31___clone459_vhi_Action_click() {
        span___input31___clone459_vhi = driver.findElement(locator.getLocator("span___input31___clone459_vhi"));
        clickOnElement(span___input31___clone459_vhi);
    }

    @Step("Click on the webelement div162_Caught_On__S")
    public String div162_Caught_On__S_getText() {
        return driver.findElement(locator.getLocator("div162_Caught_On__S")).getText().trim();
    }

    @Step("Click on the webelement div162_Caught_On__S")
    public void div162_Caught_On__S_Action_click() {
        div162_Caught_On__S = driver.findElement(locator.getLocator("div162_Caught_On__S"));
        clickOnElement(div162_Caught_On__S);
    }

    @Step("Click on the webelement span___box23___clone460_arrow")
    public void span___box23___clone460_arrow_Action_click() {
        span___box23___clone460_arrow = driver.findElement(locator.getLocator("span___box23___clone460_arrow"));
        clickOnElement(span___box23___clone460_arrow);
    }

    @Step("Click on the webelement div134_Substandard_")
    public String div134_Substandard__getText() {
        return driver.findElement(locator.getLocator("div134_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div134_Substandard_")
    public void div134_Substandard__Action_click() {
        div134_Substandard_ = driver.findElement(locator.getLocator("div134_Substandard_"));
        clickOnElement(div134_Substandard_);
    }

    @Step("Click on the webelement span___input32___clone461_vhi")
    public void span___input32___clone461_vhi_Action_click() {
        span___input32___clone461_vhi = driver.findElement(locator.getLocator("span___input32___clone461_vhi"));
        clickOnElement(span___input32___clone461_vhi);
    }

    @Step("Click on the webelement div175_Making_Safet")
    public String div175_Making_Safet_getText() {
        return driver.findElement(locator.getLocator("div175_Making_Safet")).getText().trim();
    }

    @Step("Click on the webelement div175_Making_Safet")
    public void div175_Making_Safet_Action_click() {
        // div175_Making_Safet = driver.findElement(locator.getLocator("div175_Making_Safet"));
        //clickOnElement(div175_Making_Safet);
        driver.findElement(locator.getLocator("div175_Making_Safet")).click();
    }

    @Step("Click on the webelement span___box24___clone462_arrow")
    public void span___box24___clone462_arrow_Action_click() {
        span___box24___clone462_arrow = driver.findElement(locator.getLocator("span___box24___clone462_arrow"));
        clickOnElement(span___box24___clone462_arrow);
    }

    @Step("Click on the webelement div150_Job_Factor")
    public String div150_Job_Factor_getText() {
        return driver.findElement(locator.getLocator("div150_Job_Factor")).getText().trim();
    }

    @Step("Click on the webelement div150_Job_Factor")
    public void div150_Job_Factor_Action_click() {
        div150_Job_Factor = driver.findElement(locator.getLocator("div150_Job_Factor"));
        clickOnElement(div150_Job_Factor);
    }

    @Step("Click on the webelement span___input33___clone463_vhi")
    public void span___input33___clone463_vhi_Action_click() {
        span___input33___clone463_vhi = driver.findElement(locator.getLocator("span___input33___clone463_vhi"));
        clickOnElement(span___input33___clone463_vhi);
    }

    @Step("Click on the webelement div185_Inadequate_E")
    public String div185_Inadequate_E_getText() {
        return driver.findElement(locator.getLocator("div185_Inadequate_E")).getText().trim();
    }

    @Step("Click on the webelement div185_Inadequate_E")
    public void div185_Inadequate_E_Action_click() {
        div185_Inadequate_E = driver.findElement(locator.getLocator("div185_Inadequate_E"));
        clickOnElement(div185_Inadequate_E);
    }

    @Step("Click on the webelement span___input34___clone464_vhi")
    public void span___input34___clone464_vhi_Action_click() {
        span___input34___clone464_vhi = driver.findElement(locator.getLocator("span___input34___clone464_vhi"));
        clickOnElement(span___input34___clone464_vhi);
    }

    @Step("Click on the webelement div191_Inadequate_m")
    public String div191_Inadequate_m_getText() {
        return driver.findElement(locator.getLocator("div191_Inadequate_m")).getText().trim();
    }

    @Step("Click on the webelement div191_Inadequate_m")
    public void div191_Inadequate_m_Action_click() {
        div191_Inadequate_m = driver.findElement(locator.getLocator("div191_Inadequate_m"));
        clickOnElement(div191_Inadequate_m);
    }

    @Step("Click on the webelement span___input35___clone465_vhi")
    public void span___input35___clone465_vhi_Action_click() {
        span___input35___clone465_vhi = driver.findElement(locator.getLocator("span___input35___clone465_vhi"));
        clickOnElement(span___input35___clone465_vhi);
    }

    @Step("Click on the webelement div188_Planned_Insp")
    public String div188_Planned_Insp_getText() {
        return driver.findElement(locator.getLocator("div188_Planned_Insp")).getText().trim();
    }

    @Step("Click on the webelement div188_Planned_Insp")
    public void div188_Planned_Insp_Action_click() {
        div188_Planned_Insp = driver.findElement(locator.getLocator("div188_Planned_Insp"));
        clickOnElement(div188_Planned_Insp);
    }

    @Step("Click on the webelement span___input36___clone466_vhi")
    public void span___input36___clone466_vhi_Action_click() {
        span___input36___clone466_vhi = driver.findElement(locator.getLocator("span___input36___clone466_vhi"));
        clickOnElement(span___input36___clone466_vhi);
    }

    @Step("Click on the webelement div188_Inspection_r")
    public String div188_Inspection_r_getText() {
        return driver.findElement(locator.getLocator("div188_Inspection_r")).getText().trim();
    }

    @Step("Click on the webelement div188_Inspection_r")
    public void div188_Inspection_r_Action_click() {
        div188_Inspection_r = driver.findElement(locator.getLocator("div188_Inspection_r"));
        clickOnElement(div188_Inspection_r);
    }

    @Step("Click on the webelement span___input37___clone467_vhi")
    public void span___input37___clone467_vhi_Action_click() {
        span___input37___clone467_vhi = driver.findElement(locator.getLocator("span___input37___clone467_vhi"));
        clickOnElement(span___input37___clone467_vhi);
    }

    @Step("Click on the webelement div174_Manpower")
    public String div174_Manpower_getText() {
        return driver.findElement(locator.getLocator("div174_Manpower")).getText().trim();
    }

    @Step("Click on the webelement div174_Manpower")
    public void div174_Manpower_Action_click() {
        div174_Manpower = driver.findElement(locator.getLocator("div174_Manpower"));
        clickOnElement(div174_Manpower);
    }

    @Step("Click on the webelement bdi___button62_BDI_content")
    public String bdi___button62_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button62_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button62_BDI_content")
    public void bdi___button62_BDI_content_Action_click() {
        // bdi___button62_BDI_content = driver.findElement(locator.getLocator("bdi___button62_BDI_content"));
        //clickOnElement(bdi___button62_BDI_content);
        driver.findElement(locator.getLocator("bdi___button62_BDI_content")).click();
    }

    @Step("Send the value Test to the webelement textarea___area16___clone468_inner")
    public void textarea___area16___clone468_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area16___clone468_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area16___clone468_inner")).sendKeys(val);
    }

    public String textarea___area16___clone468_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area16___clone468_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input38___clone469_vhi")
    public void span___input38___clone469_vhi_Action_click() {
        span___input38___clone469_vhi = driver.findElement(locator.getLocator("span___input38___clone469_vhi"));
        clickOnElement(span___input38___clone469_vhi);
    }

    @Step("Click on the webelement td15")
    public String td15_getText() {
        return driver.findElement(locator.getLocator("td15")).getText().trim();
    }

    @Step("Click on the webelement td15")
    public void td15_Action_click() {
        td15 = driver.findElement(locator.getLocator("td15"));
        clickOnElement(td15);
    }

    @Step("Click on the webelement span___picker8___clone470_icon")
    public void span___picker8___clone470_icon_Action_click() {
        span___picker8___clone470_icon = driver.findElement(locator.getLocator("span___picker8___clone470_icon"));
        clickOnElement(span___picker8___clone470_icon);
    }

    @Step("Click on the webelement span86_31")
    public String span86_31_getText() {
        return driver.findElement(locator.getLocator("span86_31")).getText().trim();
    }

    @Step("Click on the webelement span86_31")
    public void span86_31_Action_click() {
        span86_31 = driver.findElement(locator.getLocator("span86_31"));
        clickOnElement(span86_31);
    }

    @Step("Click on the webelement span___picker9_icon")
    public void span___picker9_icon_Action_click() {
        span___picker9_icon = driver.findElement(locator.getLocator("span___picker9_icon"));
        clickOnElement(span___picker9_icon);
    }

    @Step("Click on the webelement bdi___button59_BDI_content")
    public String bdi___button59_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button59_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button59_BDI_content")
    public void bdi___button59_BDI_content_Action_click() {
        bdi___button59_BDI_content = driver.findElement(locator.getLocator("bdi___button59_BDI_content"));
        clickOnElement(bdi___button59_BDI_content);
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

    @Step("Click on the webelement span___text108")
    public String span___text108_getText() {
        return driver.findElement(locator.getLocator("span___text108")).getText().trim();
    }

    @Step("Click on the webelement span___text108")
    public void span___text108_Action_click() {
        span___text108 = driver.findElement(locator.getLocator("span___text108"));
        clickOnElement(span___text108);
    }

    @Step("Capture the runtime value of the webelement span___text108 into the variable incidentId2")
    public String span___text108_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("span___text108"));
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
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId2' from the element span___text108. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
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

    @Step("Click on the webelement span248_Notes")
    public String span248_Notes_getText() {
        return driver.findElement(locator.getLocator("span248_Notes")).getText().trim();
    }

    @Step("Click on the webelement span248_Notes")
    public void span248_Notes_Action_click() {
        span248_Notes = driver.findElement(locator.getLocator("span248_Notes"));
        clickOnElement(span248_Notes);
    }

    @Step("Click on the webelement span___picker11_icon")
    public void span___picker11_icon_Action_click() {
        span___picker11_icon = driver.findElement(locator.getLocator("span___picker11_icon"));
        clickOnElement(span___picker11_icon);
    }

    @Step("Click on the webelement span186_31")
    public String span186_31_getText() {
        return driver.findElement(locator.getLocator("span186_31")).getText().trim();
    }

    @Step("Click on the webelement span186_31")
    public void span186_31_Action_click() {
        span186_31 = driver.findElement(locator.getLocator("span186_31"));
        clickOnElement(span186_31);
    }

    @Step("Click on the webelement div___title22__FC__Grid_wrapperfor___area31")
    public void div___title22__FC__Grid_wrapperfor___area31_Action_click() {
        div___title22__FC__Grid_wrapperfor___area31 = driver.findElement(locator.getLocator("div___title22__FC__Grid_wrapperfor___area31"));
        clickOnElement(div___title22__FC__Grid_wrapperfor___area31);
    }

    @Step("Send the value Test to the webelement textarea___area31_inner")
    public void textarea___area31_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area31_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area31_inner")).sendKeys(val);
    }

    public String textarea___area31_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area31_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span300_Attachments")
    public String span300_Attachments_getText() {
        return driver.findElement(locator.getLocator("span300_Attachments")).getText().trim();
    }

    @Step("Click on the webelement span300_Attachments")
    public void span300_Attachments_Action_click() {
        span300_Attachments = driver.findElement(locator.getLocator("span300_Attachments"));
        clickOnElement(span300_Attachments);
    }

    @Step("Double click on the webelement input___input40_inner")
    public void input___input40_inner_click() {
        driver.findElement(locator.getLocator("input___input40_inner")).click();
    }

    @Step("Send the value Test Document to the webelement input___input40_inner")
    public void input___input40_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input40_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input40_inner")).sendKeys(val);
    }

    public String input___input40_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input40_inner")).getAttribute("value");
    }

    @Step("Send the value Test Document to the webelement textarea___area32_inner")
    public void textarea___area32_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area32_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area32_inner")).sendKeys(val);
    }

    public String textarea___area32_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area32_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content")
    public String bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content")
    public void bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content_Action_click() {
        bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content = driver.findElement(locator.getLocator("bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content"));
        clickOnElement(bdi_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_button_BDI_content);
    }

    //    @Step("Send the value C:\\fakepath\\testexcel.xlsx to the webelement input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu")
    //    public void input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_sendKeys(String val) {
    //        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
    //        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu")).sendKeys(val);
    //    }
    @Step("Send the value to the file upload webelement")
    public void input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu")).sendKeys(val);
    }

    public String input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu_GetAttribute() {
        return driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object___idForDocUpload_2_uploader_fu")).getAttribute("value");
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

    @Step("Click on the webelement div376_Sign_Out")
    public String div376_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div376_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div376_Sign_Out")
    public void div376_Sign_Out_Action_click() {
        div376_Sign_Out = driver.findElement(locator.getLocator("div376_Sign_Out"));
        clickOnElement(div376_Sign_Out);
    }

    @Step("Click on the webelement span127_24_Hour_Alert")
    public String span127_24_Hour_Alert_getText() {
        return driver.findElement(locator.getLocator("span127_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span127_24_Hour_Alert")
    public void span127_24_Hour_Alert_Action_click() {
        span127_24_Hour_Alert = driver.findElement(locator.getLocator("span127_24_Hour_Alert"));
        clickOnElement(span127_24_Hour_Alert);
    }

    @Step("Click on the webelement span130_Details")
    public String span130_Details_getText() {
        return driver.findElement(locator.getLocator("span130_Details")).getText().trim();
    }

    @Step("Click on the webelement span130_Details")
    public void span130_Details_Action_click() {
        span130_Details = driver.findElement(locator.getLocator("span130_Details"));
        clickOnElement(span130_Details);
    }

    @Step("Click on the webelement span379_24_Hour_Alert")
    public String span379_24_Hour_Alert_getText() {
        return driver.findElement(locator.getLocator("span379_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span379_24_Hour_Alert")
    public void span379_24_Hour_Alert_Action_click() {
        span379_24_Hour_Alert = driver.findElement(locator.getLocator("span379_24_Hour_Alert"));
        clickOnElement(span379_24_Hour_Alert);
    }

    @Step("Click on the webelement span382_Details")
    public String span382_Details_getText() {
        return driver.findElement(locator.getLocator("span382_Details")).getText().trim();
    }

    @Step("Click on the webelement span382_Details")
    public void span382_Details_Action_click() {
        span382_Details = driver.findElement(locator.getLocator("span382_Details"));
        clickOnElement(span382_Details);
    }

    @Step("Click on the webelement div___filter3_text")
    public String div___filter3_text_getText() {
        return driver.findElement(locator.getLocator("div___filter3_text")).getText().trim();
    }

    @Step("Click on the webelement div___filter3_text")
    public void div___filter3_text_Action_click() {
        div___filter3_text = driver.findElement(locator.getLocator("div___filter3_text"));
        clickOnElement(div___filter3_text);
    }

    @Step("Click on the webelement span388_Notes")
    public String span388_Notes_getText() {
        return driver.findElement(locator.getLocator("span388_Notes")).getText().trim();
    }

    @Step("Click on the webelement span388_Notes")
    public void span388_Notes_Action_click() {
        span388_Notes = driver.findElement(locator.getLocator("span388_Notes"));
        clickOnElement(span388_Notes);
    }

    @Step("Click on the webelement span391_Attachments")
    public String span391_Attachments_getText() {
        return driver.findElement(locator.getLocator("span391_Attachments")).getText().trim();
    }

    @Step("Click on the webelement span391_Attachments")
    public void span391_Attachments_Action_click() {
        span391_Attachments = driver.findElement(locator.getLocator("span391_Attachments"));
        clickOnElement(span391_Attachments);
    }

    @Step("Click on the webelement bdi___button57_BDI_content")
    public String bdi___button57_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button57_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button57_BDI_content")
    public void bdi___button57_BDI_content_Action_click() {
        bdi___button57_BDI_content = driver.findElement(locator.getLocator("bdi___button57_BDI_content"));
        clickOnElement(bdi___button57_BDI_content);
    }

    @Step("Click on the webelement span121_Details")
    public String span121_Details_getText() {
        return driver.findElement(locator.getLocator("span121_Details")).getText().trim();
    }

    @Step("Click on the webelement span121_Details")
    public void span121_Details_Action_click() {
        span121_Details = driver.findElement(locator.getLocator("span121_Details"));
        clickOnElement(span121_Details);
    }

    @Step("Click on the webelement span___input15_vhi")
    public void span___input15_vhi_Action_click() {
        span___input15_vhi = driver.findElement(locator.getLocator("span___input15_vhi"));
        clickOnElement(span___input15_vhi);
    }

    @Step("Click on the webelement span___text89___clone550")
    public String span___text89___clone550_getText() {
        return driver.findElement(locator.getLocator("span___text89___clone550")).getText().trim();
    }

    @Step("Click on the webelement span___text89___clone550")
    public void span___text89___clone550_Action_click() {
        span___text89___clone550 = driver.findElement(locator.getLocator("span___text89___clone550"));
        clickOnElement(span___text89___clone550);
    }

    @Step("Click on the webelement span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow")
    public void span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow_Action_click() {
        span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow = driver.findElement(locator.getLocator("span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow"));
        clickOnElement(span_application_ReviewIncident_Safety_App_Display_component___object__idShift_arrow);
    }

    @Step("Click on the webelement div10_Day")
    public String div10_Day_getText() {
        return driver.findElement(locator.getLocator("div10_Day")).getText().trim();
    }

    @Step("Click on the webelement div10_Day")
    public void div10_Day_Action_click() {
        div10_Day = driver.findElement(locator.getLocator("div10_Day"));
        clickOnElement(div10_Day);
    }

    @Step("Click on the webelement span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow")
    public void span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow_Action_click() {
        span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow = driver.findElement(locator.getLocator("span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow"));
        clickOnElement(span_application_ReviewIncident_Safety_App_Display_component___object__idDepartment_arrow);
    }

    @Step("Click on the webelement div56_Manufacturing")
    public String div56_Manufacturing_getText() {
        return driver.findElement(locator.getLocator("div56_Manufacturing")).getText().trim();
    }

    @Step("Click on the webelement div56_Manufacturing")
    public void div56_Manufacturing_Action_click() {
        div56_Manufacturing = driver.findElement(locator.getLocator("div56_Manufacturing"));
        clickOnElement(div56_Manufacturing);
    }

    @Step("Double click on the webelement input___input19_inner")
    public void input___input19_inner_click() {
        driver.findElement(locator.getLocator("input___input19_inner")).click();
    }

    @Step("Send the value Test to the webelement input___input19_inner")
    public void input___input19_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input19_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input19_inner")).sendKeys(val);
    }

    public String input___input19_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input19_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input20_inner")
    public void input___input20_inner_click() {
        driver.findElement(locator.getLocator("input___input20_inner")).click();
    }

    @Step("Send the value 123 to the webelement input___input20_inner")
    public void input___input20_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input20_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input20_inner")).sendKeys(val);
    }

    public String input___input20_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input20_inner")).getAttribute("value");
    }

    @Step("Click on the webelement use12_")
    public void use12__Action_click() {
        use12_ = driver.findElement(locator.getLocator("use12_"));
        clickOnElement(use12_);
    }

    @Step("Click on the webelement div143_Crushing")
    public String div143_Crushing_getText() {
        return driver.findElement(locator.getLocator("div143_Crushing")).getText().trim();
    }

    @Step("Click on the webelement div143_Crushing")
    public void div143_Crushing_Action_click() {
        div143_Crushing = driver.findElement(locator.getLocator("div143_Crushing"));
        clickOnElement(div143_Crushing);
    }

    @Step("Send the value test to the webelement textarea___area12_inner")
    public void textarea___area12_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area12_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area12_inner")).sendKeys(val);
    }

    public String textarea___area12_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area12_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___picker7_icon")
    public void span___picker7_icon_Action_click() {
        span___picker7_icon = driver.findElement(locator.getLocator("span___picker7_icon"));
        clickOnElement(span___picker7_icon);
    }

    @Step("Click on the webelement div___picker7_clocks_clockH_cover")
    public void div___picker7_clocks_clockH_cover_Action_click() {
        div___picker7_clocks_clockH_cover = driver.findElement(locator.getLocator("div___picker7_clocks_clockH_cover"));
        clickOnElement(div___picker7_clocks_clockH_cover);
    }

    @Step("Click on the webelement bdi___picker7_OK_BDI_content")
    public String bdi___picker7_OK_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___picker7_OK_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___picker7_OK_BDI_content")
    public void bdi___picker7_OK_BDI_content_Action_click() {
        bdi___picker7_OK_BDI_content = driver.findElement(locator.getLocator("bdi___picker7_OK_BDI_content"));
        clickOnElement(bdi___picker7_OK_BDI_content);
    }

    @Step("Click on the webelement div___box22_CbBg")
    public void div___box22_CbBg_Action_click() {
        div___box22_CbBg = driver.findElement(locator.getLocator("div___box22_CbBg"));
        clickOnElement(div___box22_CbBg);
    }

    @Step("Click on the webelement span___button28_img")
    public void span___button28_img_Action_click() {
        span___button28_img = driver.findElement(locator.getLocator("span___button28_img"));
        clickOnElement(span___button28_img);
    }

    @Step("Click on the webelement div___item81___clone586_selectMulti_CbBg")
    public void div___item81___clone586_selectMulti_CbBg_Action_click() {
        div___item81___clone586_selectMulti_CbBg = driver.findElement(locator.getLocator("div___item81___clone586_selectMulti_CbBg"));
        clickOnElement(div___item81___clone586_selectMulti_CbBg);
    }

    @Step("Click on the webelement bdi___button63_BDI_content")
    public String bdi___button63_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button63_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button63_BDI_content")
    public void bdi___button63_BDI_content_Action_click() {
        bdi___button63_BDI_content = driver.findElement(locator.getLocator("bdi___button63_BDI_content"));
        clickOnElement(bdi___button63_BDI_content);
    }

    @Step("Send the value test to the webelement textarea___area13___table3_0_inner")
    public void textarea___area13___table3_0_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area13___table3_0_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area13___table3_0_inner")).sendKeys(val);
    }

    public String textarea___area13___table3_0_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area13___table3_0_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___button30_img")
    public void span___button30_img_Action_click() {
        span___button30_img = driver.findElement(locator.getLocator("span___button30_img"));
        clickOnElement(span___button30_img);
    }

    @Step("Double click on the webelement input___input26___table4_0_inner")
    public void input___input26___table4_0_inner_click() {
        driver.findElement(locator.getLocator("input___input26___table4_0_inner")).click();
    }

    @Step("Send the value test to the webelement input___input26___table4_0_inner")
    public void input___input26___table4_0_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input26___table4_0_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input26___table4_0_inner")).sendKeys(val);
    }

    public String input___input26___table4_0_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input26___table4_0_inner")).getAttribute("value");
    }

    @Step("Send the value test to the webelement textarea___area14___table4_0_inner")
    public void textarea___area14___table4_0_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area14___table4_0_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area14___table4_0_inner")).sendKeys(val);
    }

    public String textarea___area14___table4_0_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area14___table4_0_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button60_BDI_content")
    public String bdi___button60_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button60_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button60_BDI_content")
    public void bdi___button60_BDI_content_Action_click() {
        bdi___button60_BDI_content = driver.findElement(locator.getLocator("bdi___button60_BDI_content"));
        clickOnElement(bdi___button60_BDI_content);
    }

    @Step("Click on the webelement div336_Sign_Out")
    public String div336_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div336_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div336_Sign_Out")
    public void div336_Sign_Out_Action_click() {
        div336_Sign_Out = driver.findElement(locator.getLocator("div336_Sign_Out"));
        clickOnElement(div336_Sign_Out);
    }

    @Step("Click on the webelement div165_Contact_with")
    public String div165_Contact_with_getText() {
        return driver.findElement(locator.getLocator("div165_Contact_with")).getText().trim();
    }

    @Step("Click on the webelement div165_Contact_with")
    public void div165_Contact_with_Action_click() {
        div165_Contact_with = driver.findElement(locator.getLocator("div165_Contact_with"));
        clickOnElement(div165_Contact_with);
    }

    @Step("Click on the webelement div181_Servicing_Eq")
    public String div181_Servicing_Eq_getText() {
        return driver.findElement(locator.getLocator("div181_Servicing_Eq")).getText().trim();
    }

    @Step("Click on the webelement div181_Servicing_Eq")
    public void div181_Servicing_Eq_Action_click() {
        div181_Servicing_Eq = driver.findElement(locator.getLocator("div181_Servicing_Eq"));
        clickOnElement(div181_Servicing_Eq);
    }

    @Step("Click on the webelement div147_Personal_Fac")
    public String div147_Personal_Fac_getText() {
        return driver.findElement(locator.getLocator("div147_Personal_Fac")).getText().trim();
    }

    @Step("Click on the webelement div147_Personal_Fac")
    public void div147_Personal_Fac_Action_click() {
        div147_Personal_Fac = driver.findElement(locator.getLocator("div147_Personal_Fac"));
        clickOnElement(div147_Personal_Fac);
    }

    @Step("Click on the webelement div191_Lack_of_Skill")
    public String div191_Lack_of_Skill_getText() {
        return driver.findElement(locator.getLocator("div191_Lack_of_Skill")).getText().trim();
    }

    @Step("Click on the webelement div191_Lack_of_Skill")
    public void div191_Lack_of_Skill_Action_click() {
        div191_Lack_of_Skill = driver.findElement(locator.getLocator("div191_Lack_of_Skill"));
        clickOnElement(div191_Lack_of_Skill);
    }

    @Step("Click on the webelement div188_Infrequent_p")
    public String div188_Infrequent_p_getText() {
        return driver.findElement(locator.getLocator("div188_Infrequent_p")).getText().trim();
    }

    @Step("Click on the webelement div188_Infrequent_p")
    public void div188_Infrequent_p_Action_click() {
        div188_Infrequent_p = driver.findElement(locator.getLocator("div188_Infrequent_p"));
        clickOnElement(div188_Infrequent_p);
    }

    @Step("Click on the webelement div194_Emergency_Pr")
    public String div194_Emergency_Pr_getText() {
        return driver.findElement(locator.getLocator("div194_Emergency_Pr")).getText().trim();
    }

    @Step("Click on the webelement div194_Emergency_Pr")
    public void div194_Emergency_Pr_Action_click() {
        div194_Emergency_Pr = driver.findElement(locator.getLocator("div194_Emergency_Pr"));
        clickOnElement(div194_Emergency_Pr);
    }

    @Step("Click on the webelement div194_Emergency_Li")
    public String div194_Emergency_Li_getText() {
        return driver.findElement(locator.getLocator("div194_Emergency_Li")).getText().trim();
    }

    @Step("Click on the webelement div194_Emergency_Li")
    public void div194_Emergency_Li_Action_click() {
        div194_Emergency_Li = driver.findElement(locator.getLocator("div194_Emergency_Li"));
        clickOnElement(div194_Emergency_Li);
    }

    @Step("Click on the webelement span___text100___clone662")
    public String span___text100___clone662_getText() {
        return driver.findElement(locator.getLocator("span___text100___clone662")).getText().trim();
    }

    @Step("Click on the webelement span___text100___clone662")
    public void span___text100___clone662_Action_click() {
        span___text100___clone662 = driver.findElement(locator.getLocator("span___text100___clone662"));
        clickOnElement(span___text100___clone662);
    }

    @Step("Click on the webelement span67_16")
    public String span67_16_getText() {
        return driver.findElement(locator.getLocator("span67_16")).getText().trim();
    }

    @Step("Click on the webelement span67_16")
    public void span67_16_Action_click() {
        span67_16 = driver.findElement(locator.getLocator("span67_16"));
        clickOnElement(span67_16);
    }

    @Step("Click on the webelement span96_1")
    public String span96_1_getText() {
        return driver.findElement(locator.getLocator("span96_1")).getText().trim();
    }

    @Step("Click on the webelement span96_1")
    public void span96_1_Action_click() {
        span96_1 = driver.findElement(locator.getLocator("span96_1"));
        clickOnElement(span96_1);
    }

    @Step("Click on the webelement div288_Sign_Out")
    public String div288_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div288_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div288_Sign_Out")
    public void div288_Sign_Out_Action_click() {
        div288_Sign_Out = driver.findElement(locator.getLocator("div288_Sign_Out"));
        clickOnElement(div288_Sign_Out);
    }

    @Step("Click on the webelement span124_Analysis")
    public String span124_Analysis_getText() {
        return driver.findElement(locator.getLocator("span124_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span124_Analysis")
    public void span124_Analysis_Action_click() {
        span124_Analysis = driver.findElement(locator.getLocator("span124_Analysis"));
        clickOnElement(span124_Analysis);
    }

    @Step("Click on the webelement span___input35___clone420_vhi")
    public void span___input35___clone420_vhi_Action_click() {
        span___input35___clone420_vhi = driver.findElement(locator.getLocator("span___input35___clone420_vhi"));
        clickOnElement(span___input35___clone420_vhi);
    }

    @Step("Click on the webelement div32_Caught_Betwe")
    public String div32_Caught_Betwe_getText() {
        return driver.findElement(locator.getLocator("div32_Caught_Betwe")).getText().trim();
    }

    @Step("Click on the webelement div32_Caught_Betwe")
    public void div32_Caught_Betwe_Action_click() {
        div32_Caught_Betwe = driver.findElement(locator.getLocator("div32_Caught_Betwe"));
        clickOnElement(div32_Caught_Betwe);
    }

    @Step("Click on the webelement span___box27___clone421_arrow")
    public void span___box27___clone421_arrow_Action_click() {
        span___box27___clone421_arrow = driver.findElement(locator.getLocator("span___box27___clone421_arrow"));
        clickOnElement(span___box27___clone421_arrow);
    }

    @Step("Click on the webelement div10_Substandard_")
    public String div10_Substandard__getText() {
        return driver.findElement(locator.getLocator("div10_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div10_Substandard_")
    public void div10_Substandard__Action_click() {
        div10_Substandard_ = driver.findElement(locator.getLocator("div10_Substandard_"));
        clickOnElement(div10_Substandard_);
    }

    @Step("Click on the webelement span___input36___clone422_vhi")
    public void span___input36___clone422_vhi_Action_click() {
        span___input36___clone422_vhi = driver.findElement(locator.getLocator("span___input36___clone422_vhi"));
        clickOnElement(span___input36___clone422_vhi);
    }

    @Step("Click on the webelement div45_Failure_to_W")
    public String div45_Failure_to_W_getText() {
        return driver.findElement(locator.getLocator("div45_Failure_to_W")).getText().trim();
    }

    @Step("Click on the webelement div45_Failure_to_W")
    public void div45_Failure_to_W_Action_click() {
        div45_Failure_to_W = driver.findElement(locator.getLocator("div45_Failure_to_W"));
        clickOnElement(div45_Failure_to_W);
    }

    @Step("Click on the webelement span___box28___clone423_arrow")
    public void span___box28___clone423_arrow_Action_click() {
        span___box28___clone423_arrow = driver.findElement(locator.getLocator("span___box28___clone423_arrow"));
        clickOnElement(span___box28___clone423_arrow);
    }

    @Step("Click on the webelement div23_Personal_Fac")
    public String div23_Personal_Fac_getText() {
        return driver.findElement(locator.getLocator("div23_Personal_Fac")).getText().trim();
    }

    @Step("Click on the webelement div23_Personal_Fac")
    public void div23_Personal_Fac_Action_click() {
        div23_Personal_Fac = driver.findElement(locator.getLocator("div23_Personal_Fac"));
        clickOnElement(div23_Personal_Fac);
    }

    @Step("Click on the webelement span___input37___clone424_vhi")
    public void span___input37___clone424_vhi_Action_click() {
        span___input37___clone424_vhi = driver.findElement(locator.getLocator("span___input37___clone424_vhi"));
        clickOnElement(span___input37___clone424_vhi);
    }

    @Step("Click on the webelement div58_Improper_Mot")
    public String div58_Improper_Mot_getText() {
        return driver.findElement(locator.getLocator("div58_Improper_Mot")).getText().trim();
    }

    @Step("Click on the webelement div58_Improper_Mot")
    public void div58_Improper_Mot_Action_click() {
        div58_Improper_Mot = driver.findElement(locator.getLocator("div58_Improper_Mot"));
        clickOnElement(div58_Improper_Mot);
    }

    @Step("Click on the webelement span___input38___clone425_vhi")
    public void span___input38___clone425_vhi_Action_click() {
        span___input38___clone425_vhi = driver.findElement(locator.getLocator("span___input38___clone425_vhi"));
        clickOnElement(span___input38___clone425_vhi);
    }

    @Step("Click on the webelement div61_Improper_per")
    public String div61_Improper_per_getText() {
        return driver.findElement(locator.getLocator("div61_Improper_per")).getText().trim();
    }

    @Step("Click on the webelement div61_Improper_per")
    public void div61_Improper_per_Action_click() {
        div61_Improper_per = driver.findElement(locator.getLocator("div61_Improper_per"));
        clickOnElement(div61_Improper_per);
    }

    @Step("Click on the webelement span___input39___clone426_vhi")
    public void span___input39___clone426_vhi_Action_click() {
        span___input39___clone426_vhi = driver.findElement(locator.getLocator("span___input39___clone426_vhi"));
        clickOnElement(span___input39___clone426_vhi);
    }

    @Step("Click on the webelement div61_Management_T")
    public String div61_Management_T_getText() {
        return driver.findElement(locator.getLocator("div61_Management_T")).getText().trim();
    }

    @Step("Click on the webelement div61_Management_T")
    public void div61_Management_T_Action_click() {
        div61_Management_T = driver.findElement(locator.getLocator("div61_Management_T"));
        clickOnElement(div61_Management_T);
    }

    @Step("Click on the webelement span___input40___clone427_vhi")
    public void span___input40___clone427_vhi_Action_click() {
        span___input40___clone427_vhi = driver.findElement(locator.getLocator("span___input40___clone427_vhi"));
        clickOnElement(span___input40___clone427_vhi);
    }

    @Step("Click on the webelement div61_Formal_Initi")
    public String div61_Formal_Initi_getText() {
        return driver.findElement(locator.getLocator("div61_Formal_Initi")).getText().trim();
    }

    @Step("Click on the webelement div61_Formal_Initi")
    public void div61_Formal_Initi_Action_click() {
        div61_Formal_Initi = driver.findElement(locator.getLocator("div61_Formal_Initi"));
        clickOnElement(div61_Formal_Initi);
    }

    @Step("Click on the webelement span___input41___clone428_vhi")
    public void span___input41___clone428_vhi_Action_click() {
        span___input41___clone428_vhi = driver.findElement(locator.getLocator("span___input41___clone428_vhi"));
        clickOnElement(span___input41___clone428_vhi);
    }

    @Step("Send the value test to the webelement textarea___area20___clone429_inner")
    public void textarea___area20___clone429_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area20___clone429_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area20___clone429_inner")).sendKeys(val);
    }

    public String textarea___area20___clone429_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area20___clone429_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input42___clone430_vhi")
    public void span___input42___clone430_vhi_Action_click() {
        span___input42___clone430_vhi = driver.findElement(locator.getLocator("span___input42___clone430_vhi"));
        clickOnElement(span___input42___clone430_vhi);
    }

    @Step("Click on the webelement span___text103___clone629")
    public String span___text103___clone629_getText() {
        return driver.findElement(locator.getLocator("span___text103___clone629")).getText().trim();
    }

    @Step("Click on the webelement span___text103___clone629")
    public void span___text103___clone629_Action_click() {
        span___text103___clone629 = driver.findElement(locator.getLocator("span___text103___clone629"));
        clickOnElement(span___text103___clone629);
    }

    @Step("Click on the webelement span___picker9___clone431_icon")
    public void span___picker9___clone431_icon_Action_click() {
        span___picker9___clone431_icon = driver.findElement(locator.getLocator("span___picker9___clone431_icon"));
        clickOnElement(span___picker9___clone431_icon);
    }

    @Step("Click on the webelement span48_1")
    public String span48_1_getText() {
        return driver.findElement(locator.getLocator("span48_1")).getText().trim();
    }

    @Step("Click on the webelement span48_1")
    public void span48_1_Action_click() {
        span48_1 = driver.findElement(locator.getLocator("span48_1"));
        clickOnElement(span48_1);
    }

    @Step("Double click on the webelement input___input43_inner")
    public void input___input43_inner_click() {
        driver.findElement(locator.getLocator("input___input43_inner")).click();
    }

    @Step("Send the value test to the webelement input___input43_inner")
    public void input___input43_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input43_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input43_inner")).sendKeys(val);
    }

    public String input___input43_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input43_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span92_1")
    public String span92_1_getText() {
        return driver.findElement(locator.getLocator("span92_1")).getText().trim();
    }

    @Step("Click on the webelement span92_1")
    public void span92_1_Action_click() {
        span92_1 = driver.findElement(locator.getLocator("span92_1"));
        clickOnElement(span92_1);
    }

    @Step("Click on the webelement div164_Sign_Out")
    public String div164_Sign_Out_getText() {
        return driver.findElement(locator.getLocator("div164_Sign_Out")).getText().trim();
    }

    @Step("Click on the webelement div164_Sign_Out")
    public void div164_Sign_Out_Action_click() {
        div164_Sign_Out = driver.findElement(locator.getLocator("div164_Sign_Out"));
        clickOnElement(div164_Sign_Out);
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

    @Step("Click on the webelement span127_Notes")
    public String span127_Notes_getText() {
        return driver.findElement(locator.getLocator("span127_Notes")).getText().trim();
    }

    @Step("Click on the webelement span127_Notes")
    public void span127_Notes_Action_click() {
        span127_Notes = driver.findElement(locator.getLocator("span127_Notes"));
        clickOnElement(span127_Notes);
    }

    @Step("Click on the webelement span130_Attachments")
    public String span130_Attachments_getText() {
        return driver.findElement(locator.getLocator("span130_Attachments")).getText().trim();
    }

    @Step("Click on the webelement span130_Attachments")
    public void span130_Attachments_Action_click() {
        span130_Attachments = driver.findElement(locator.getLocator("span130_Attachments"));
        clickOnElement(span130_Attachments);
    }

    @Step("Click on the webelement span___page1_navButton_iconBtn")
    public void span___page1_navButton_iconBtn_Action_click() {
        span___page1_navButton_iconBtn = driver.findElement(locator.getLocator("span___page1_navButton_iconBtn"));
        clickOnElement(span___page1_navButton_iconBtn);
    }

    @Step("Click on the webelement span___input31___clone420_vhi")
    public void span___input31___clone420_vhi_Action_click() {
        span___input31___clone420_vhi = driver.findElement(locator.getLocator("span___input31___clone420_vhi"));
        clickOnElement(span___input31___clone420_vhi);
    }

    @Step("Click on the webelement div35_Caught_In__P")
    public String div35_Caught_In__P_getText() {
        return driver.findElement(locator.getLocator("div35_Caught_In__P")).getText().trim();
    }

    @Step("Click on the webelement div35_Caught_In__P")
    public void div35_Caught_In__P_Action_click() {
        div35_Caught_In__P = driver.findElement(locator.getLocator("div35_Caught_In__P"));
        clickOnElement(div35_Caught_In__P);
    }

    @Step("Click on the webelement span___box23___clone421_arrow")
    public void span___box23___clone421_arrow_Action_click() {
        span___box23___clone421_arrow = driver.findElement(locator.getLocator("span___box23___clone421_arrow"));
        clickOnElement(span___box23___clone421_arrow);
    }

    @Step("Click on the webelement span___input32___clone422_vhi")
    public void span___input32___clone422_vhi_Action_click() {
        span___input32___clone422_vhi = driver.findElement(locator.getLocator("span___input32___clone422_vhi"));
        clickOnElement(span___input32___clone422_vhi);
    }

    @Step("Click on the webelement div45_Horseplay")
    public String div45_Horseplay_getText() {
        return driver.findElement(locator.getLocator("div45_Horseplay")).getText().trim();
    }

    @Step("Click on the webelement div45_Horseplay")
    public void div45_Horseplay_Action_click() {
        div45_Horseplay = driver.findElement(locator.getLocator("div45_Horseplay"));
        clickOnElement(div45_Horseplay);
    }

    @Step("Click on the webelement span___box24___clone423_arrow")
    public void span___box24___clone423_arrow_Action_click() {
        span___box24___clone423_arrow = driver.findElement(locator.getLocator("span___box24___clone423_arrow"));
        clickOnElement(span___box24___clone423_arrow);
    }

    @Step("Click on the webelement span___input33___clone424_vhi")
    public void span___input33___clone424_vhi_Action_click() {
        span___input33___clone424_vhi = driver.findElement(locator.getLocator("span___input33___clone424_vhi"));
        clickOnElement(span___input33___clone424_vhi);
    }

    @Step("Click on the webelement span___input34___clone425_vhi")
    public void span___input34___clone425_vhi_Action_click() {
        span___input34___clone425_vhi = driver.findElement(locator.getLocator("span___input34___clone425_vhi"));
        clickOnElement(span___input34___clone425_vhi);
    }

    @Step("Click on the webelement div58_Improper_per")
    public String div58_Improper_per_getText() {
        return driver.findElement(locator.getLocator("div58_Improper_per")).getText().trim();
    }

    @Step("Click on the webelement div58_Improper_per")
    public void div58_Improper_per_Action_click() {
        div58_Improper_per = driver.findElement(locator.getLocator("div58_Improper_per"));
        clickOnElement(div58_Improper_per);
    }

    @Step("Click on the webelement span___input35___clone426_vhi")
    public void span___input35___clone426_vhi_Action_click() {
        span___input35___clone426_vhi = driver.findElement(locator.getLocator("span___input35___clone426_vhi"));
        clickOnElement(span___input35___clone426_vhi);
    }

    @Step("Click on the webelement span___input36___clone427_vhi")
    public void span___input36___clone427_vhi_Action_click() {
        span___input36___clone427_vhi = driver.findElement(locator.getLocator("span___input36___clone427_vhi"));
        clickOnElement(span___input36___clone427_vhi);
    }

    @Step("Click on the webelement div58_Management_O")
    public String div58_Management_O_getText() {
        return driver.findElement(locator.getLocator("div58_Management_O")).getText().trim();
    }

    @Step("Click on the webelement div58_Management_O")
    public void div58_Management_O_Action_click() {
        div58_Management_O = driver.findElement(locator.getLocator("div58_Management_O"));
        clickOnElement(div58_Management_O);
    }

    @Step("Click on the webelement span___input37___clone428_vhi")
    public void span___input37___clone428_vhi_Action_click() {
        span___input37___clone428_vhi = driver.findElement(locator.getLocator("span___input37___clone428_vhi"));
        clickOnElement(span___input37___clone428_vhi);
    }

    @Step("Send the value TESTED test to the webelement textarea___area16___clone429_inner")
    public void textarea___area16___clone429_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area16___clone429_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area16___clone429_inner")).sendKeys(val);
    }

    public String textarea___area16___clone429_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area16___clone429_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input38___clone430_vhi")
    public void span___input38___clone430_vhi_Action_click() {
        span___input38___clone430_vhi = driver.findElement(locator.getLocator("span___input38___clone430_vhi"));
        clickOnElement(span___input38___clone430_vhi);
    }

    @Step("Click on the webelement span___text100___clone625")
    public String span___text100___clone625_getText() {
        return driver.findElement(locator.getLocator("span___text100___clone625")).getText().trim();
    }

    @Step("Click on the webelement span___text100___clone625")
    public void span___text100___clone625_Action_click() {
        span___text100___clone625 = driver.findElement(locator.getLocator("span___text100___clone625"));
        clickOnElement(span___text100___clone625);
    }

    @Step("Click on the webelement span___picker8___clone431_icon")
    public void span___picker8___clone431_icon_Action_click() {
        span___picker8___clone431_icon = driver.findElement(locator.getLocator("span___picker8___clone431_icon"));
        clickOnElement(span___picker8___clone431_icon);
    }

    @Step("Click on the webelement span63_16")
    public String span63_16_getText() {
        return driver.findElement(locator.getLocator("span63_16")).getText().trim();
    }

    @Step("Click on the webelement span63_16")
    public void span63_16_Action_click() {
        span63_16 = driver.findElement(locator.getLocator("span63_16"));
        clickOnElement(span63_16);
    }

    @Step("Click on the webelement span93_2")
    public String span93_2_getText() {
        return driver.findElement(locator.getLocator("span93_2")).getText().trim();
    }

    @Step("Click on the webelement span93_2")
    public void span93_2_Action_click() {
        span93_2 = driver.findElement(locator.getLocator("span93_2"));
        clickOnElement(span93_2);
    }

    @Step("Click on the webelement span127_Analysis")
    public String span127_Analysis_getText() {
        return driver.findElement(locator.getLocator("span127_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span127_Analysis")
    public void span127_Analysis_Action_click() {
        span127_Analysis = driver.findElement(locator.getLocator("span127_Analysis"));
        clickOnElement(span127_Analysis);
    }

    @Step("Click on the webelement div51_Improper_Pla")
    public String div51_Improper_Pla_getText() {
        return driver.findElement(locator.getLocator("div51_Improper_Pla")).getText().trim();
    }

    @Step("Click on the webelement div51_Improper_Pla")
    public void div51_Improper_Pla_Action_click() {
        div51_Improper_Pla = driver.findElement(locator.getLocator("div51_Improper_Pla"));
        clickOnElement(div51_Improper_Pla);
    }

    @Step("Click on the webelement div61_Inadequate_P")
    public String div61_Inadequate_P_getText() {
        return driver.findElement(locator.getLocator("div61_Inadequate_P")).getText().trim();
    }

    @Step("Click on the webelement div61_Inadequate_P")
    public void div61_Inadequate_P_Action_click() {
        div61_Inadequate_P = driver.findElement(locator.getLocator("div61_Inadequate_P"));
        clickOnElement(div61_Inadequate_P);
    }

    @Step("Click on the webelement div61_Restricted_r")
    public String div61_Restricted_r_getText() {
        return driver.findElement(locator.getLocator("div61_Restricted_r")).getText().trim();
    }

    @Step("Click on the webelement div61_Restricted_r")
    public void div61_Restricted_r_Action_click() {
        div61_Restricted_r = driver.findElement(locator.getLocator("div61_Restricted_r"));
        clickOnElement(div61_Restricted_r);
    }

    @Step("Click on the webelement div61_Accident_Inc")
    public String div61_Accident_Inc_getText() {
        return driver.findElement(locator.getLocator("div61_Accident_Inc")).getText().trim();
    }

    @Step("Click on the webelement div61_Accident_Inc")
    public void div61_Accident_Inc_Action_click() {
        div61_Accident_Inc = driver.findElement(locator.getLocator("div61_Accident_Inc"));
        clickOnElement(div61_Accident_Inc);
    }

    @Step("Click on the webelement div61_Occupational")
    public String div61_Occupational_getText() {
        return driver.findElement(locator.getLocator("div61_Occupational")).getText().trim();
    }

    @Step("Click on the webelement div61_Occupational")
    public void div61_Occupational_Action_click() {
        div61_Occupational = driver.findElement(locator.getLocator("div61_Occupational"));
        clickOnElement(div61_Occupational);
    }

    @Step("Click on the webelement span___text100___clone617")
    public String span___text100___clone617_getText() {
        return driver.findElement(locator.getLocator("span___text100___clone617")).getText().trim();
    }

    @Step("Click on the webelement span___text100___clone617")
    public void span___text100___clone617_Action_click() {
        span___text100___clone617 = driver.findElement(locator.getLocator("span___text100___clone617"));
        clickOnElement(span___text100___clone617);
    }

    @Step("Click on the webelement span49_2")
    public String span49_2_getText() {
        return driver.findElement(locator.getLocator("span49_2")).getText().trim();
    }

    @Step("Click on the webelement span49_2")
    public void span49_2_Action_click() {
        span49_2 = driver.findElement(locator.getLocator("span49_2"));
        clickOnElement(span49_2);
    }

    @Step("Double click on the webelement input___input39_inner")
    public void input___input39_inner_click() {
        driver.findElement(locator.getLocator("input___input39_inner")).click();
    }

    @Step("Send the value test to the webelement input___input39_inner")
    public void input___input39_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input39_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input39_inner")).sendKeys(val);
    }

    public String input___input39_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input39_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___button80_content")
    public String span___button80_content_getText() {
        return driver.findElement(locator.getLocator("span___button80_content")).getText().trim();
    }

    @Step("Click on the webelement span___button80_content")
    public void span___button80_content_Action_click() {
        span___button80_content = driver.findElement(locator.getLocator("span___button80_content"));
        clickOnElement(span___button80_content);
    }

    @Step("Click on the webelement span___button82_content")
    public String span___button82_content_getText() {
        return driver.findElement(locator.getLocator("span___button82_content")).getText().trim();
    }

    @Step("Click on the webelement span___button82_content")
    public void span___button82_content_Action_click() {
        span___button82_content = driver.findElement(locator.getLocator("span___button82_content"));
        clickOnElement(span___button82_content);
    }

    @Step("Click on the webelement div___filter6_tab")
    public void div___filter6_tab_Action_click() {
        div___filter6_tab = driver.findElement(locator.getLocator("div___filter6_tab"));
        clickOnElement(div___filter6_tab);
    }

    @Step("Click on the webelement span___input23_vhi")
    public void span___input23_vhi_Action_click() {
        span___input23_vhi = driver.findElement(locator.getLocator("span___input23_vhi"));
        clickOnElement(span___input23_vhi);
    }

    @Step("Click on the webelement td1")
    public String td1_getText() {
        return driver.findElement(locator.getLocator("td1")).getText().trim();
    }

    @Step("Click on the webelement td1")
    public void td1_Action_click() {
        td1 = driver.findElement(locator.getLocator("td1"));
        clickOnElement(td1);
    }

    @Step("Click on the webelement div437_sap")
    public void div437_sap_Action_click() {
        div437_sap = driver.findElement(locator.getLocator("div437_sap"));
        clickOnElement(div437_sap);
    }

    @Step("Click on the webelement div13_Facilities")
    public String div13_Facilities_getText() {
        return driver.findElement(locator.getLocator("div13_Facilities")).getText().trim();
    }

    @Step("Click on the webelement div13_Facilities")
    public void div13_Facilities_Action_click() {
        div13_Facilities = driver.findElement(locator.getLocator("div13_Facilities"));
        clickOnElement(div13_Facilities);
    }

    @Step("Click on the webelement div106_Night")
    public String div106_Night_getText() {
        return driver.findElement(locator.getLocator("div106_Night")).getText().trim();
    }

    @Step("Click on the webelement div106_Night")
    public void div106_Night_Action_click() {
        div106_Night = driver.findElement(locator.getLocator("div106_Night"));
        clickOnElement(div106_Night);
    }

    @Step("Click on the webelement bdi___button34_label_bdi")
    public String bdi___button34_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button34_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button34_label_bdi")
    public void bdi___button34_label_bdi_Action_click() {
        bdi___button34_label_bdi = driver.findElement(locator.getLocator("bdi___button34_label_bdi"));
        clickOnElement(bdi___button34_label_bdi);
    }

    @Step("Click on the webelement div___box15_CbBg")
    public void div___box15_CbBg_Action_click() {
        div___box15_CbBg = driver.findElement(locator.getLocator("div___box15_CbBg"));
        clickOnElement(div___box15_CbBg);
    }

    @Step("Click on the webelement div___box16_CbBg")
    public void div___box16_CbBg_Action_click() {
        div___box16_CbBg = driver.findElement(locator.getLocator("div___box16_CbBg"));
        clickOnElement(div___box16_CbBg);
    }

    @Step("Click on the webelement span___picker6_icon")
    public void span___picker6_icon_Action_click() {
        span___picker6_icon = driver.findElement(locator.getLocator("span___picker6_icon"));
        clickOnElement(span___picker6_icon);
    }

    @Step("Click on the webelement span56_9")
    public String span56_9_getText() {
        return driver.findElement(locator.getLocator("span56_9")).getText().trim();
    }

    @Step("Click on the webelement span56_9")
    public void span56_9_Action_click() {
        span56_9 = driver.findElement(locator.getLocator("span56_9"));
        clickOnElement(span56_9);
    }

    @Step("Click on the webelement span96_7")
    public String span96_7_getText() {
        return driver.findElement(locator.getLocator("span96_7")).getText().trim();
    }

    @Step("Click on the webelement span96_7")
    public void span96_7_Action_click() {
        span96_7 = driver.findElement(locator.getLocator("span96_7"));
        clickOnElement(span96_7);
    }

    @Step("Click on the webelement bdi___box21_label_bdi")
    public String bdi___box21_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box21_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box21_label_bdi")
    public void bdi___box21_label_bdi_Action_click() {
        bdi___box21_label_bdi = driver.findElement(locator.getLocator("bdi___box21_label_bdi"));
        clickOnElement(bdi___box21_label_bdi);
    }

    @Step("Click on the webelement bdi___box25_label_bdi")
    public String bdi___box25_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box25_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box25_label_bdi")
    public void bdi___box25_label_bdi_Action_click() {
        bdi___box25_label_bdi = driver.findElement(locator.getLocator("bdi___box25_label_bdi"));
        clickOnElement(bdi___box25_label_bdi);
    }

    @Step("Click on the webelement div___box29_CbBg")
    public void div___box29_CbBg_Action_click() {
        div___box29_CbBg = driver.findElement(locator.getLocator("div___box29_CbBg"));
        clickOnElement(div___box29_CbBg);
    }

    @Step("Click on the webelement div___box26_CbBg")
    public void div___box26_CbBg_Action_click() {
        div___box26_CbBg = driver.findElement(locator.getLocator("div___box26_CbBg"));
        clickOnElement(div___box26_CbBg);
    }

    @Step("Click on the webelement div___box23_CbBg")
    public void div___box23_CbBg_Action_click() {
        div___box23_CbBg = driver.findElement(locator.getLocator("div___box23_CbBg"));
        clickOnElement(div___box23_CbBg);
    }

    @Step("Send the value tested to the webelement textarea___area20_inner")
    public void textarea___area20_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area20_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area20_inner")).sendKeys(val);
    }

    public String textarea___area20_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area20_inner")).getAttribute("value");
    }

    @Step("Click on the webelement div___picker9_clocks_clockH_cover")
    public void div___picker9_clocks_clockH_cover_Action_click() {
        div___picker9_clocks_clockH_cover = driver.findElement(locator.getLocator("div___picker9_clocks_clockH_cover"));
        clickOnElement(div___picker9_clocks_clockH_cover);
    }

    @Step("Click on the webelement div___picker9_clocks_clockM_cover")
    public void div___picker9_clocks_clockM_cover_Action_click() {
        div___picker9_clocks_clockM_cover = driver.findElement(locator.getLocator("div___picker9_clocks_clockM_cover"));
        clickOnElement(div___picker9_clocks_clockM_cover);
    }

    @Step("Click on the webelement bdi___picker9_clocks_btnM_BDI_content")
    public String bdi___picker9_clocks_btnM_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___picker9_clocks_btnM_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___picker9_clocks_btnM_BDI_content")
    public void bdi___picker9_clocks_btnM_BDI_content_Action_click() {
        bdi___picker9_clocks_btnM_BDI_content = driver.findElement(locator.getLocator("bdi___picker9_clocks_btnM_BDI_content"));
        clickOnElement(bdi___picker9_clocks_btnM_BDI_content);
    }

    @Step("Click on the webelement span___picker9_clocks_btnS_inner")
    public String span___picker9_clocks_btnS_inner_getText() {
        return driver.findElement(locator.getLocator("span___picker9_clocks_btnS_inner")).getText().trim();
    }

    @Step("Click on the webelement span___picker9_clocks_btnS_inner")
    public void span___picker9_clocks_btnS_inner_Action_click() {
        span___picker9_clocks_btnS_inner = driver.findElement(locator.getLocator("span___picker9_clocks_btnS_inner"));
        clickOnElement(span___picker9_clocks_btnS_inner);
    }

    @Step("Click on the webelement div239_PM")
    public String div239_PM_getText() {
        return driver.findElement(locator.getLocator("div239_PM")).getText().trim();
    }

    @Step("Click on the webelement div239_PM")
    public void div239_PM_Action_click() {
        div239_PM = driver.findElement(locator.getLocator("div239_PM"));
        clickOnElement(div239_PM);
    }

    @Step("Click on the webelement bdi___picker9_OK_BDI_content")
    public String bdi___picker9_OK_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___picker9_OK_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___picker9_OK_BDI_content")
    public void bdi___picker9_OK_BDI_content_Action_click() {
        bdi___picker9_OK_BDI_content = driver.findElement(locator.getLocator("bdi___picker9_OK_BDI_content"));
        clickOnElement(bdi___picker9_OK_BDI_content);
    }

    @Step("Click on the webelement bdi___button84_BDI_content")
    public String bdi___button84_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button84_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button84_BDI_content")
    public void bdi___button84_BDI_content_Action_click() {
        bdi___button84_BDI_content = driver.findElement(locator.getLocator("bdi___button84_BDI_content"));
        clickOnElement(bdi___button84_BDI_content);
    }

    @Step("Click on the webelement span___mbox_btn_8_inner")
    public String span___mbox_btn_8_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_8_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_8_inner")
    public void span___mbox_btn_8_inner_Action_click() {
        span___mbox_btn_8_inner = driver.findElement(locator.getLocator("span___mbox_btn_8_inner"));
        clickOnElement(span___mbox_btn_8_inner);
    }

    @Step("Click on the webelement span461_Analysis")
    public String span461_Analysis_getText() {
        return driver.findElement(locator.getLocator("span461_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span461_Analysis")
    public void span461_Analysis_Action_click() {
        span461_Analysis = driver.findElement(locator.getLocator("span461_Analysis"));
        clickOnElement(span461_Analysis);
    }

    @Step("Send the value tested to the webelement textarea___area23_inner")
    public void textarea___area23_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area23_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area23_inner")).sendKeys(val);
    }

    public String textarea___area23_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area23_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input35_inner")
    public void input___input35_inner_click() {
        driver.findElement(locator.getLocator("input___input35_inner")).click();
    }

    @Step("Send the value test to the webelement input___input35_inner")
    public void input___input35_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input35_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input35_inner")).sendKeys(val);
    }

    public String input___input35_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input35_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input36_inner")
    public void input___input36_inner_click() {
        driver.findElement(locator.getLocator("input___input36_inner")).click();
    }

    @Step("Send the value test to the webelement input___input36_inner")
    public void input___input36_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input36_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input36_inner")).sendKeys(val);
    }

    public String input___input36_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input36_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input37_inner")
    public void input___input37_inner_click() {
        driver.findElement(locator.getLocator("input___input37_inner")).click();
    }

    @Step("Send the value 11 to the webelement input___input37_inner")
    public void input___input37_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input37_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input37_inner")).sendKeys(val);
    }

    public String input___input37_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input37_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input38_inner")
    public void input___input38_inner_click() {
        driver.findElement(locator.getLocator("input___input38_inner")).click();
    }

    @Step("Send the value 21 to the webelement input___input38_inner")
    public void input___input38_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input38_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input38_inner")).sendKeys(val);
    }

    public String input___input38_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input38_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button56_label_bdi")
    public String bdi___button56_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button56_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button56_label_bdi")
    public void bdi___button56_label_bdi_Action_click() {
        bdi___button56_label_bdi = driver.findElement(locator.getLocator("bdi___button56_label_bdi"));
        clickOnElement(bdi___button56_label_bdi);
    }

    @Step("Click on the webelement svg4_sap")
    public void svg4_sap_Action_click() {
        svg4_sap = driver.findElement(locator.getLocator("svg4_sap"));
        clickOnElement(svg4_sap);
    }

    @Step("Click on the webelement span___input39___clone644_vhi")
    public void span___input39___clone644_vhi_Action_click() {
        span___input39___clone644_vhi = driver.findElement(locator.getLocator("span___input39___clone644_vhi"));
        clickOnElement(span___input39___clone644_vhi);
    }

    @Step("Click on the webelement div489_Fall_To_Lowe")
    public String div489_Fall_To_Lowe_getText() {
        return driver.findElement(locator.getLocator("div489_Fall_To_Lowe")).getText().trim();
    }

    @Step("Click on the webelement div489_Fall_To_Lowe")
    public void div489_Fall_To_Lowe_Action_click() {
        div489_Fall_To_Lowe = driver.findElement(locator.getLocator("div489_Fall_To_Lowe"));
        clickOnElement(div489_Fall_To_Lowe);
    }

    @Step("Click on the webelement span___box31___clone645_arrow")
    public void span___box31___clone645_arrow_Action_click() {
        span___box31___clone645_arrow = driver.findElement(locator.getLocator("span___box31___clone645_arrow"));
        clickOnElement(span___box31___clone645_arrow);
    }

    @Step("Click on the webelement div452_Substandard_")
    public String div452_Substandard__getText() {
        return driver.findElement(locator.getLocator("div452_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div452_Substandard_")
    public void div452_Substandard__Action_click() {
        div452_Substandard_ = driver.findElement(locator.getLocator("div452_Substandard_"));
        clickOnElement(div452_Substandard_);
    }

    @Step("Click on the webelement span___input40___clone646_vhi")
    public void span___input40___clone646_vhi_Action_click() {
        span___input40___clone646_vhi = driver.findElement(locator.getLocator("span___input40___clone646_vhi"));
        clickOnElement(span___input40___clone646_vhi);
    }

    @Step("Click on the webelement div502_Servicing_Eq")
    public String div502_Servicing_Eq_getText() {
        return driver.findElement(locator.getLocator("div502_Servicing_Eq")).getText().trim();
    }

    @Step("Click on the webelement div502_Servicing_Eq")
    public void div502_Servicing_Eq_Action_click() {
        div502_Servicing_Eq = driver.findElement(locator.getLocator("div502_Servicing_Eq"));
        clickOnElement(div502_Servicing_Eq);
    }

    @Step("Click on the webelement span___box32___clone647_arrow")
    public void span___box32___clone647_arrow_Action_click() {
        span___box32___clone647_arrow = driver.findElement(locator.getLocator("span___box32___clone647_arrow"));
        clickOnElement(span___box32___clone647_arrow);
    }

    @Step("Click on the webelement div465_Personal_Fac")
    public String div465_Personal_Fac_getText() {
        return driver.findElement(locator.getLocator("div465_Personal_Fac")).getText().trim();
    }

    @Step("Click on the webelement div465_Personal_Fac")
    public void div465_Personal_Fac_Action_click() {
        div465_Personal_Fac = driver.findElement(locator.getLocator("div465_Personal_Fac"));
        clickOnElement(div465_Personal_Fac);
    }

    @Step("Double click on the webelement input___input41___clone648_inner")
    public void input___input41___clone648_inner_click() {
        driver.findElement(locator.getLocator("input___input41___clone648_inner")).click();
    }

    @Step("Click on the webelement div512_Mental_or_Ps")
    public String div512_Mental_or_Ps_getText() {
        return driver.findElement(locator.getLocator("div512_Mental_or_Ps")).getText().trim();
    }

    @Step("Click on the webelement div512_Mental_or_Ps")
    public void div512_Mental_or_Ps_Action_click() {
        div512_Mental_or_Ps = driver.findElement(locator.getLocator("div512_Mental_or_Ps"));
        clickOnElement(div512_Mental_or_Ps);
    }

    @Step("Click on the webelement span___input42___clone649_vhi")
    public void span___input42___clone649_vhi_Action_click() {
        span___input42___clone649_vhi = driver.findElement(locator.getLocator("span___input42___clone649_vhi"));
        clickOnElement(span___input42___clone649_vhi);
    }

    @Step("Click on the webelement li___item259___clone853")
    public String li___item259___clone853_getText() {
        return driver.findElement(locator.getLocator("li___item259___clone853")).getText().trim();
    }

    @Step("Double click on the webelement li___item259___clone853")
    public void li___item259___clone853_click() {
        driver.findElement(locator.getLocator("li___item259___clone853")).click();
    }

    @Step("Click on the webelement span___input43___clone650_vhi")
    public void span___input43___clone650_vhi_Action_click() {
        span___input43___clone650_vhi = driver.findElement(locator.getLocator("span___input43___clone650_vhi"));
        clickOnElement(span___input43___clone650_vhi);
    }

    @Step("Click on the webelement div524_Group_Meeting")
    public String div524_Group_Meeting_getText() {
        return driver.findElement(locator.getLocator("div524_Group_Meeting")).getText().trim();
    }

    @Step("Click on the webelement div524_Group_Meeting")
    public void div524_Group_Meeting_Action_click() {
        div524_Group_Meeting = driver.findElement(locator.getLocator("div524_Group_Meeting"));
        clickOnElement(div524_Group_Meeting);
    }

    @Step("Click on the webelement span___input44___clone651_vhi")
    public void span___input44___clone651_vhi_Action_click() {
        span___input44___clone651_vhi = driver.findElement(locator.getLocator("span___input44___clone651_vhi"));
        clickOnElement(span___input44___clone651_vhi);
    }

    @Step("Click on the webelement li___item261___clone870")
    public String li___item261___clone870_getText() {
        return driver.findElement(locator.getLocator("li___item261___clone870")).getText().trim();
    }

    @Step("Double click on the webelement li___item261___clone870")
    public void li___item261___clone870_click() {
        driver.findElement(locator.getLocator("li___item261___clone870")).click();
    }

    @Step("Click on the webelement span___input45___clone652_vhi")
    public void span___input45___clone652_vhi_Action_click() {
        span___input45___clone652_vhi = driver.findElement(locator.getLocator("span___input45___clone652_vhi"));
        clickOnElement(span___input45___clone652_vhi);
    }

    @Step("Click on the webelement div494_sap")
    public void div494_sap_Action_click() {
        div494_sap = driver.findElement(locator.getLocator("div494_sap"));
        clickOnElement(div494_sap);
    }

    @Step("Click on the webelement bdi___button91_BDI_content")
    public String bdi___button91_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button91_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button91_BDI_content")
    public void bdi___button91_BDI_content_Action_click() {
        bdi___button91_BDI_content = driver.findElement(locator.getLocator("bdi___button91_BDI_content"));
        clickOnElement(bdi___button91_BDI_content);
    }

    @Step("Send the value tested to the webelement textarea___area24___clone653_inner")
    public void textarea___area24___clone653_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area24___clone653_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area24___clone653_inner")).sendKeys(val);
    }

    public String textarea___area24___clone653_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area24___clone653_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input46___clone654_vhi")
    public void span___input46___clone654_vhi_Action_click() {
        span___input46___clone654_vhi = driver.findElement(locator.getLocator("span___input46___clone654_vhi"));
        clickOnElement(span___input46___clone654_vhi);
    }

    @Step("Click on the webelement td22")
    public String td22_getText() {
        return driver.findElement(locator.getLocator("td22")).getText().trim();
    }

    @Step("Click on the webelement td22")
    public void td22_Action_click() {
        td22 = driver.findElement(locator.getLocator("td22"));
        clickOnElement(td22);
    }

    @Step("Click on the webelement span___picker10___clone655_icon")
    public void span___picker10___clone655_icon_Action_click() {
        span___picker10___clone655_icon = driver.findElement(locator.getLocator("span___picker10___clone655_icon"));
        clickOnElement(span___picker10___clone655_icon);
    }

    @Step("Click on the webelement span400_23")
    public String span400_23_getText() {
        return driver.findElement(locator.getLocator("span400_23")).getText().trim();
    }

    @Step("Click on the webelement span400_23")
    public void span400_23_Action_click() {
        span400_23 = driver.findElement(locator.getLocator("span400_23"));
        clickOnElement(span400_23);
    }

    @Step("Click on the webelement span421_2")
    public String span421_2_getText() {
        return driver.findElement(locator.getLocator("span421_2")).getText().trim();
    }

    @Step("Click on the webelement span421_2")
    public void span421_2_Action_click() {
        span421_2 = driver.findElement(locator.getLocator("span421_2"));
        clickOnElement(span421_2);
    }

    @Step("Click on the webelement bdi___button83_BDI_content")
    public String bdi___button83_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button83_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button83_BDI_content")
    public void bdi___button83_BDI_content_Action_click() {
        bdi___button83_BDI_content = driver.findElement(locator.getLocator("bdi___button83_BDI_content"));
        clickOnElement(bdi___button83_BDI_content);
    }

    @Step("Click on the webelement span___mbox_btn_9_inner")
    public String span___mbox_btn_9_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_9_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_9_inner")
    public void span___mbox_btn_9_inner_Action_click() {
        span___mbox_btn_9_inner = driver.findElement(locator.getLocator("span___mbox_btn_9_inner"));
        clickOnElement(span___mbox_btn_9_inner);
    }

    @Step("Click on the webelement div___success3_footer")
    public String div___success3_footer_getText() {
        return driver.findElement(locator.getLocator("div___success3_footer")).getText().trim();
    }

    @Step("Click on the webelement div___success3_footer")
    public void div___success3_footer_Action_click() {
        div___success3_footer = driver.findElement(locator.getLocator("div___success3_footer"));
        clickOnElement(div___success3_footer);
    }

    @Step("Click on the webelement div___success3_scrollCont")
    public String div___success3_scrollCont_getText() {
        return driver.findElement(locator.getLocator("div___success3_scrollCont")).getText().trim();
    }

    @Step("Click on the webelement div___success3_scrollCont")
    public void div___success3_scrollCont_Action_click() {
        div___success3_scrollCont = driver.findElement(locator.getLocator("div___success3_scrollCont"));
        clickOnElement(div___success3_scrollCont);
    }

    @Step("Click on the webelement bdi___button81_BDI_content")
    public String bdi___button81_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button81_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button81_BDI_content")
    public void bdi___button81_BDI_content_Action_click() {
        bdi___button81_BDI_content = driver.findElement(locator.getLocator("bdi___button81_BDI_content"));
        clickOnElement(bdi___button81_BDI_content);
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

    @Step("Click on the webelement bdi___button79_BDI_content")
    public String bdi___button79_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button79_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button79_BDI_content")
    public void bdi___button79_BDI_content_Action_click() {
        bdi___button79_BDI_content = driver.findElement(locator.getLocator("bdi___button79_BDI_content"));
        clickOnElement(bdi___button79_BDI_content);
    }

    @Step("Click on the webelement div318___24_Hour_Al")
    public String div318___24_Hour_Al_getText() {
        return driver.findElement(locator.getLocator("div318___24_Hour_Al")).getText().trim();
    }

    @Step("Click on the webelement div318___24_Hour_Al")
    public void div318___24_Hour_Al_Action_click() {
        div318___24_Hour_Al = driver.findElement(locator.getLocator("div318___24_Hour_Al"));
        clickOnElement(div318___24_Hour_Al);
    }

    @Step("Click on the webelement div___label112__FE")
    public String div___label112__FE_getText() {
        return driver.findElement(locator.getLocator("div___label112__FE")).getText().trim();
    }

    @Step("Click on the webelement div___label112__FE")
    public void div___label112__FE_Action_click() {
        div___label112__FE = driver.findElement(locator.getLocator("div___label112__FE"));
        clickOnElement(div___label112__FE);
    }

    @Step("Click on the webelement h4___form3__Form__title")
    public String h4___form3__Form__title_getText() {
        return driver.findElement(locator.getLocator("h4___form3__Form__title")).getText().trim();
    }

    @Step("Click on the webelement h4___form3__Form__title")
    public void h4___form3__Form__title_Action_click() {
        h4___form3__Form__title = driver.findElement(locator.getLocator("h4___form3__Form__title"));
        clickOnElement(h4___form3__Form__title);
    }

    @Step("Click on the webelement div___form3__FC_NoHead__Grid")
    public String div___form3__FC_NoHead__Grid_getText() {
        return driver.findElement(locator.getLocator("div___form3__FC_NoHead__Grid")).getText().trim();
    }

    @Step("Click on the webelement div___form3__FC_NoHead__Grid")
    public void div___form3__FC_NoHead__Grid_Action_click() {
        div___form3__FC_NoHead__Grid = driver.findElement(locator.getLocator("div___form3__FC_NoHead__Grid"));
        clickOnElement(div___form3__FC_NoHead__Grid);
    }

    @Step("Click on the webelement div31_Logistic")
    public String div31_Logistic_getText() {
        return driver.findElement(locator.getLocator("div31_Logistic")).getText().trim();
    }

    @Step("Click on the webelement div31_Logistic")
    public void div31_Logistic_Action_click() {
        div31_Logistic = driver.findElement(locator.getLocator("div31_Logistic"));
        clickOnElement(div31_Logistic);
    }

    @Step("Click on the webelement div629_sap")
    public void div629_sap_Action_click() {
        div629_sap = driver.findElement(locator.getLocator("div629_sap"));
        clickOnElement(div629_sap);
    }

    @Step("Click on the webelement div98_Day")
    public String div98_Day_getText() {
        return driver.findElement(locator.getLocator("div98_Day")).getText().trim();
    }

    @Step("Click on the webelement div98_Day")
    public void div98_Day_Action_click() {
        div98_Day = driver.findElement(locator.getLocator("div98_Day"));
        clickOnElement(div98_Day);
    }

    @Step("Click on the webelement bdi___button49_BDI_content")
    public String bdi___button49_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button49_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button49_BDI_content")
    public void bdi___button49_BDI_content_Action_click() {
        bdi___button49_BDI_content = driver.findElement(locator.getLocator("bdi___button49_BDI_content"));
        clickOnElement(bdi___button49_BDI_content);
    }

    @Step("Click on the webelement span___box18___table5_0_arrow")
    public void span___box18___table5_0_arrow_Action_click() {
        span___box18___table5_0_arrow = driver.findElement(locator.getLocator("span___box18___table5_0_arrow"));
        clickOnElement(span___box18___table5_0_arrow);
    }

    @Step("Click on the webelement div132_Chemical_Burn")
    public String div132_Chemical_Burn_getText() {
        return driver.findElement(locator.getLocator("div132_Chemical_Burn")).getText().trim();
    }

    @Step("Click on the webelement div132_Chemical_Burn")
    public void div132_Chemical_Burn_Action_click() {
        div132_Chemical_Burn = driver.findElement(locator.getLocator("div132_Chemical_Burn"));
        clickOnElement(div132_Chemical_Burn);
    }

    @Step("Click on the webelement span___box19___table5_0_arrow")
    public void span___box19___table5_0_arrow_Action_click() {
        span___box19___table5_0_arrow = driver.findElement(locator.getLocator("span___box19___table5_0_arrow"));
        clickOnElement(span___box19___table5_0_arrow);
    }

    @Step("Click on the webelement div262_Eyes")
    public String div262_Eyes_getText() {
        return driver.findElement(locator.getLocator("div262_Eyes")).getText().trim();
    }

    @Step("Click on the webelement div262_Eyes")
    public void div262_Eyes_Action_click() {
        div262_Eyes = driver.findElement(locator.getLocator("div262_Eyes"));
        clickOnElement(div262_Eyes);
    }

    @Step("Click on the webelement span___box20___table5_0_arrow")
    public void span___box20___table5_0_arrow_Action_click() {
        span___box20___table5_0_arrow = driver.findElement(locator.getLocator("span___box20___table5_0_arrow"));
        clickOnElement(span___box20___table5_0_arrow);
    }

    @Step("Click on the webelement div353_Other")
    public String div353_Other_getText() {
        return driver.findElement(locator.getLocator("div353_Other")).getText().trim();
    }

    @Step("Click on the webelement div353_Other")
    public void div353_Other_Action_click() {
        div353_Other = driver.findElement(locator.getLocator("div353_Other"));
        clickOnElement(div353_Other);
    }

    @Step("Double click on the webelement input___input32___table5_0_inner")
    public void input___input32___table5_0_inner_click() {
        driver.findElement(locator.getLocator("input___input32___table5_0_inner")).click();
    }

    @Step("Send the value twest to the webelement input___input32___table5_0_inner")
    public void input___input32___table5_0_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input32___table5_0_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input32___table5_0_inner")).sendKeys(val);
    }

    public String input___input32___table5_0_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input32___table5_0_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___box24_label_bdi")
    public String bdi___box24_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box24_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box24_label_bdi")
    public void bdi___box24_label_bdi_Action_click() {
        bdi___box24_label_bdi = driver.findElement(locator.getLocator("bdi___box24_label_bdi"));
        clickOnElement(bdi___box24_label_bdi);
    }

    @Step("Click on the webelement span___box25_label_text")
    public String span___box25_label_text_getText() {
        return driver.findElement(locator.getLocator("span___box25_label_text")).getText().trim();
    }

    @Step("Click on the webelement span___box25_label_text")
    public void span___box25_label_text_Action_click() {
        span___box25_label_text = driver.findElement(locator.getLocator("span___box25_label_text"));
        clickOnElement(span___box25_label_text);
    }

    @Step("Click on the webelement span___picker9_OK_inner")
    public String span___picker9_OK_inner_getText() {
        return driver.findElement(locator.getLocator("span___picker9_OK_inner")).getText().trim();
    }

    @Step("Click on the webelement span___picker9_OK_inner")
    public void span___picker9_OK_inner_Action_click() {
        span___picker9_OK_inner = driver.findElement(locator.getLocator("span___picker9_OK_inner"));
        clickOnElement(span___picker9_OK_inner);
    }

    @Step("Click on the webelement span___mbox_btn_8_content")
    public String span___mbox_btn_8_content_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_8_content")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_8_content")
    public void span___mbox_btn_8_content_Action_click() {
        span___mbox_btn_8_content = driver.findElement(locator.getLocator("span___mbox_btn_8_content"));
        clickOnElement(span___mbox_btn_8_content);
    }

    @Step("Click on the webelement div904___Analysis")
    public String div904___Analysis_getText() {
        return driver.findElement(locator.getLocator("div904___Analysis")).getText().trim();
    }

    @Step("Click on the webelement div904___Analysis")
    public void div904___Analysis_Action_click() {
        div904___Analysis = driver.findElement(locator.getLocator("div904___Analysis"));
        clickOnElement(div904___Analysis);
    }

    @Step("Click on the webelement bdi___button55_label_bdi")
    public String bdi___button55_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button55_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button55_label_bdi")
    public void bdi___button55_label_bdi_Action_click() {
        bdi___button55_label_bdi = driver.findElement(locator.getLocator("bdi___button55_label_bdi"));
        clickOnElement(bdi___button55_label_bdi);
    }

    @Step("Click on the webelement div1041_sap")
    public void div1041_sap_Action_click() {
        div1041_sap = driver.findElement(locator.getLocator("div1041_sap"));
        clickOnElement(div1041_sap);
    }

    @Step("Click on the webelement span___input39___clone451_vhi")
    public void span___input39___clone451_vhi_Action_click() {
        span___input39___clone451_vhi = driver.findElement(locator.getLocator("span___input39___clone451_vhi"));
        clickOnElement(span___input39___clone451_vhi);
    }

    @Step("Click on the webelement li___item175___clone693")
    public String li___item175___clone693_getText() {
        return driver.findElement(locator.getLocator("li___item175___clone693")).getText().trim();
    }

    @Step("Double click on the webelement li___item175___clone693")
    public void li___item175___clone693_click() {
        driver.findElement(locator.getLocator("li___item175___clone693")).click();
    }

    @Step("Click on the webelement span___box31___clone452_arrow")
    public void span___box31___clone452_arrow_Action_click() {
        span___box31___clone452_arrow = driver.findElement(locator.getLocator("span___box31___clone452_arrow"));
        clickOnElement(span___box31___clone452_arrow);
    }

    @Step("Click on the webelement div582_Substandard_")
    public String div582_Substandard__getText() {
        return driver.findElement(locator.getLocator("div582_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div582_Substandard_")
    public void div582_Substandard__Action_click() {
        div582_Substandard_ = driver.findElement(locator.getLocator("div582_Substandard_"));
        clickOnElement(div582_Substandard_);
    }

    @Step("Double click on the webelement input___input40___clone453_inner")
    public void input___input40___clone453_inner_click() {
        driver.findElement(locator.getLocator("input___input40___clone453_inner")).click();
    }

    @Step("Click on the webelement li___item178___clone715")
    public String li___item178___clone715_getText() {
        return driver.findElement(locator.getLocator("li___item178___clone715")).getText().trim();
    }

    @Step("Double click on the webelement li___item178___clone715")
    public void li___item178___clone715_click() {
        driver.findElement(locator.getLocator("li___item178___clone715")).click();
    }

    @Step("Double click on the webelement input___box32___clone454_inner")
    public void input___box32___clone454_inner_click() {
        driver.findElement(locator.getLocator("input___box32___clone454_inner")).click();
    }

    @Step("Click on the webelement span___box32___clone454_arrow")
    public void span___box32___clone454_arrow_Action_click() {
        span___box32___clone454_arrow = driver.findElement(locator.getLocator("span___box32___clone454_arrow"));
        clickOnElement(span___box32___clone454_arrow);
    }

    @Step("Send the value Personal Factor to the webelement input___box32___clone454_inner")
    public void input___box32___clone454_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___box32___clone454_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___box32___clone454_inner")).sendKeys(val);
    }

    public String input___box32___clone454_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___box32___clone454_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input41___clone455_inner")
    public void input___input41___clone455_inner_click() {
        driver.findElement(locator.getLocator("input___input41___clone455_inner")).click();
    }

    @Step("Click on the webelement li___item181___clone722")
    public String li___item181___clone722_getText() {
        return driver.findElement(locator.getLocator("li___item181___clone722")).getText().trim();
    }

    @Step("Double click on the webelement li___item181___clone722")
    public void li___item181___clone722_click() {
        driver.findElement(locator.getLocator("li___item181___clone722")).click();
    }

    @Step("Double click on the webelement input___input42___clone456_inner")
    public void input___input42___clone456_inner_click() {
        driver.findElement(locator.getLocator("input___input42___clone456_inner")).click();
    }

    @Step("Click on the webelement div633_Emotional_di")
    public String div633_Emotional_di_getText() {
        return driver.findElement(locator.getLocator("div633_Emotional_di")).getText().trim();
    }

    @Step("Click on the webelement div633_Emotional_di")
    public void div633_Emotional_di_Action_click() {
        div633_Emotional_di = driver.findElement(locator.getLocator("div633_Emotional_di"));
        clickOnElement(div633_Emotional_di);
    }

    @Step("Click on the webelement span___input43___clone457_vhi")
    public void span___input43___clone457_vhi_Action_click() {
        span___input43___clone457_vhi = driver.findElement(locator.getLocator("span___input43___clone457_vhi"));
        clickOnElement(span___input43___clone457_vhi);
    }

    @Step("Click on the webelement li___item183___clone740")
    public String li___item183___clone740_getText() {
        return driver.findElement(locator.getLocator("li___item183___clone740")).getText().trim();
    }

    @Step("Double click on the webelement li___item183___clone740")
    public void li___item183___clone740_click() {
        driver.findElement(locator.getLocator("li___item183___clone740")).click();
    }

    @Step("Click on the webelement span___input44___clone458_vhi")
    public void span___input44___clone458_vhi_Action_click() {
        span___input44___clone458_vhi = driver.findElement(locator.getLocator("span___input44___clone458_vhi"));
        clickOnElement(span___input44___clone458_vhi);
    }

    @Step("Click on the webelement section___dialog23_dialog_cont")
    public String section___dialog23_dialog_cont_getText() {
        return driver.findElement(locator.getLocator("section___dialog23_dialog_cont")).getText().trim();
    }

    @Step("Click on the webelement section___dialog23_dialog_cont")
    public void section___dialog23_dialog_cont_Action_click() {
        section___dialog23_dialog_cont = driver.findElement(locator.getLocator("section___dialog23_dialog_cont"));
        clickOnElement(section___dialog23_dialog_cont);
    }

    @Step("Click on the webelement div636_Training_Pro")
    public String div636_Training_Pro_getText() {
        return driver.findElement(locator.getLocator("div636_Training_Pro")).getText().trim();
    }

    @Step("Click on the webelement div636_Training_Pro")
    public void div636_Training_Pro_Action_click() {
        div636_Training_Pro = driver.findElement(locator.getLocator("div636_Training_Pro"));
        clickOnElement(div636_Training_Pro);
    }

    @Step("Double click on the webelement input___input45___clone459_inner")
    public void input___input45___clone459_inner_click() {
        driver.findElement(locator.getLocator("input___input45___clone459_inner")).click();
    }

    @Step("Click on the webelement div619_sap")
    public void div619_sap_Action_click() {
        div619_sap = driver.findElement(locator.getLocator("div619_sap"));
        clickOnElement(div619_sap);
    }

    @Step("Click on the webelement span___button86_content")
    public String span___button86_content_getText() {
        return driver.findElement(locator.getLocator("span___button86_content")).getText().trim();
    }

    @Step("Click on the webelement span___button86_content")
    public void span___button86_content_Action_click() {
        span___button86_content = driver.findElement(locator.getLocator("span___button86_content"));
        clickOnElement(span___button86_content);
    }

    @Step("Send the value test to the webelement textarea___area24___clone460_inner")
    public void textarea___area24___clone460_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area24___clone460_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area24___clone460_inner")).sendKeys(val);
    }

    public String textarea___area24___clone460_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area24___clone460_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input46___clone461_vhi")
    public void span___input46___clone461_vhi_Action_click() {
        span___input46___clone461_vhi = driver.findElement(locator.getLocator("span___input46___clone461_vhi"));
        clickOnElement(span___input46___clone461_vhi);
    }

    @Step("Click on the webelement span___picker10___clone462_icon")
    public void span___picker10___clone462_icon_Action_click() {
        span___picker10___clone462_icon = driver.findElement(locator.getLocator("span___picker10___clone462_icon"));
        clickOnElement(span___picker10___clone462_icon);
    }

    @Step("Click on the webelement span329_23")
    public String span329_23_getText() {
        return driver.findElement(locator.getLocator("span329_23")).getText().trim();
    }

    @Step("Click on the webelement span329_23")
    public void span329_23_Action_click() {
        span329_23 = driver.findElement(locator.getLocator("span329_23"));
        clickOnElement(span329_23);
    }

    @Step("Click on the webelement span349_1")
    public String span349_1_getText() {
        return driver.findElement(locator.getLocator("span349_1")).getText().trim();
    }

    @Step("Click on the webelement span349_1")
    public void span349_1_Action_click() {
        span349_1 = driver.findElement(locator.getLocator("span349_1"));
        clickOnElement(span349_1);
    }

    @Step("Click on the webelement bdi___button82_BDI_content")
    public String bdi___button82_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button82_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button82_BDI_content")
    public void bdi___button82_BDI_content_Action_click() {
        bdi___button82_BDI_content = driver.findElement(locator.getLocator("bdi___button82_BDI_content"));
        clickOnElement(bdi___button82_BDI_content);
    }

    @Step("Click on the webelement bdi___button80_BDI_content")
    public String bdi___button80_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button80_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button80_BDI_content")
    public void bdi___button80_BDI_content_Action_click() {
        bdi___button80_BDI_content = driver.findElement(locator.getLocator("bdi___button80_BDI_content"));
        clickOnElement(bdi___button80_BDI_content);
    }

    @Step("Click on the webelement span___mbox_btn_12_content")
    public String span___mbox_btn_12_content_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_12_content")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_12_content")
    public void span___mbox_btn_12_content_Action_click() {
        span___mbox_btn_12_content = driver.findElement(locator.getLocator("span___mbox_btn_12_content"));
        clickOnElement(span___mbox_btn_12_content);
    }

    @Step("Click on the webelement span___mbox_btn_14_inner")
    public String span___mbox_btn_14_inner_getText() {
        return driver.findElement(locator.getLocator("span___mbox_btn_14_inner")).getText().trim();
    }

    @Step("Click on the webelement span___mbox_btn_14_inner")
    public void span___mbox_btn_14_inner_Action_click() {
        span___mbox_btn_14_inner = driver.findElement(locator.getLocator("span___mbox_btn_14_inner"));
        clickOnElement(span___mbox_btn_14_inner);
    }

    @Step("Click on the webelement button___button93")
    public String button___button93_getText() {
        return driver.findElement(locator.getLocator("button___button93")).getText().trim();
    }

    @Step("Double click on the webelement button___button93")
    public void button___button93_click() {
        driver.findElement(locator.getLocator("button___button93")).click();
    }

    @Step("Click on the webelement span___filter6_icon")
    public void span___filter6_icon_Action_click() {
        span___filter6_icon = driver.findElement(locator.getLocator("span___filter6_icon"));
        clickOnElement(span___filter6_icon);
    }

    @Step("Click on the webelement span___text200___clone1498")
    public String span___text200___clone1498_getText() {
        return driver.findElement(locator.getLocator("span___text200___clone1498")).getText().trim();
    }

    @Step("Click on the webelement span___text200___clone1498")
    public void span___text200___clone1498_Action_click() {
        span___text200___clone1498 = driver.findElement(locator.getLocator("span___text200___clone1498"));
        clickOnElement(span___text200___clone1498);
    }

    @Step("Click on the webelement li___item165")
    public String li___item165_getText() {
        return driver.findElement(locator.getLocator("li___item165")).getText().trim();
    }

    @Step("Double click on the webelement li___item165")
    public void li___item165_click() {
        driver.findElement(locator.getLocator("li___item165")).click();
    }

    @Step("Double click on the webelement input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")
    public void input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner_click() {
        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")).click();
    }

    @Step("Send the value Afternoon to the webelement input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")
    public void input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")).sendKeys(val);
    }

    public String input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input_application_ReviewIncident_Safety_App_Display_component___object__idShift_inner")).getAttribute("value");
    }

    @Step("Click on the webelement div98_Afternoon")
    public String div98_Afternoon_getText() {
        return driver.findElement(locator.getLocator("div98_Afternoon")).getText().trim();
    }

    @Step("Click on the webelement div98_Afternoon")
    public void div98_Afternoon_Action_click() {
        div98_Afternoon = driver.findElement(locator.getLocator("div98_Afternoon"));
        clickOnElement(div98_Afternoon);
    }

    @Step("Click on the webelement div642_sap")
    public void div642_sap_Action_click() {
        div642_sap = driver.findElement(locator.getLocator("div642_sap"));
        clickOnElement(div642_sap);
    }

    @Step("Click on the webelement bdi___button51_label_bdi")
    public String bdi___button51_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button51_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button51_label_bdi")
    public void bdi___button51_label_bdi_Action_click() {
        bdi___button51_label_bdi = driver.findElement(locator.getLocator("bdi___button51_label_bdi"));
        clickOnElement(bdi___button51_label_bdi);
    }

    @Step("Click on the webelement span___box23_label_text")
    public String span___box23_label_text_getText() {
        return driver.findElement(locator.getLocator("span___box23_label_text")).getText().trim();
    }

    @Step("Click on the webelement span___box23_label_text")
    public void span___box23_label_text_Action_click() {
        span___box23_label_text = driver.findElement(locator.getLocator("span___box23_label_text"));
        clickOnElement(span___box23_label_text);
    }

    @Step("Click on the webelement bdi___box22_label_bdi")
    public String bdi___box22_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box22_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box22_label_bdi")
    public void bdi___box22_label_bdi_Action_click() {
        bdi___box22_label_bdi = driver.findElement(locator.getLocator("bdi___box22_label_bdi"));
        clickOnElement(bdi___box22_label_bdi);
    }

    @Step("Click on the webelement bdi___picker11_OK_BDI_content")
    public String bdi___picker11_OK_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___picker11_OK_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___picker11_OK_BDI_content")
    public void bdi___picker11_OK_BDI_content_Action_click() {
        bdi___picker11_OK_BDI_content = driver.findElement(locator.getLocator("bdi___picker11_OK_BDI_content"));
        clickOnElement(bdi___picker11_OK_BDI_content);
    }

    @Step("Click on the webelement span___button95_content")
    public String span___button95_content_getText() {
        return driver.findElement(locator.getLocator("span___button95_content")).getText().trim();
    }

    @Step("Click on the webelement span___button95_content")
    public void span___button95_content_Action_click() {
        span___button95_content = driver.findElement(locator.getLocator("span___button95_content"));
        clickOnElement(span___button95_content);
    }

    @Step("Click on the webelement bdi___button90_BDI_content")
    public String bdi___button90_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button90_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button90_BDI_content")
    public void bdi___button90_BDI_content_Action_click() {
        bdi___button90_BDI_content = driver.findElement(locator.getLocator("bdi___button90_BDI_content"));
        clickOnElement(bdi___button90_BDI_content);
    }

    @Step("Click on the webelement li___item198_IdInjuryCat_0")
    public String li___item198_IdInjuryCat_0_getText() {
        return driver.findElement(locator.getLocator("li___item198_IdInjuryCat_0")).getText().trim();
    }

    @Step("Double click on the webelement li___item198_IdInjuryCat_0")
    public void li___item198_IdInjuryCat_0_click() {
        driver.findElement(locator.getLocator("li___item198_IdInjuryCat_0")).click();
    }

    @Step("Click on the webelement span___button98_content")
    public String span___button98_content_getText() {
        return driver.findElement(locator.getLocator("span___button98_content")).getText().trim();
    }

    @Step("Click on the webelement span___button98_content")
    public void span___button98_content_Action_click() {
        span___button98_content = driver.findElement(locator.getLocator("span___button98_content"));
        clickOnElement(span___button98_content);
    }

    @Step("Click on the webelement span___filter7_icon")
    public void span___filter7_icon_Action_click() {
        span___filter7_icon = driver.findElement(locator.getLocator("span___filter7_icon"));
        clickOnElement(span___filter7_icon);
    }

    @Step("Send the value tested to the webelement textarea___area35_inner")
    public void textarea___area35_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area35_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area35_inner")).sendKeys(val);
    }

    public String textarea___area35_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area35_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input41_inner")
    public void input___input41_inner_click() {
        driver.findElement(locator.getLocator("input___input41_inner")).click();
    }

    @Step("Send the value testedttt to the webelement input___input41_inner")
    public void input___input41_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input41_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input41_inner")).sendKeys(val);
    }

    public String input___input41_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input41_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input42_inner")
    public void input___input42_inner_click() {
        driver.findElement(locator.getLocator("input___input42_inner")).click();
    }

    @Step("Send the value tested2 to the webelement input___input42_inner")
    public void input___input42_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input42_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input42_inner")).sendKeys(val);
    }

    public String input___input42_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input42_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input44_inner")
    public void input___input44_inner_click() {
        driver.findElement(locator.getLocator("input___input44_inner")).click();
    }

    @Step("Send the value 21 to the webelement input___input44_inner")
    public void input___input44_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input44_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input44_inner")).sendKeys(val);
    }

    public String input___input44_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input44_inner")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button67_label_bdi")
    public String bdi___button67_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button67_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button67_label_bdi")
    public void bdi___button67_label_bdi_Action_click() {
        bdi___button67_label_bdi = driver.findElement(locator.getLocator("bdi___button67_label_bdi"));
        clickOnElement(bdi___button67_label_bdi);
    }

    @Step("Click on the webelement span___button73___clone1380_img")
    public void span___button73___clone1380_img_Action_click() {
        span___button73___clone1380_img = driver.findElement(locator.getLocator("span___button73___clone1380_img"));
        clickOnElement(span___button73___clone1380_img);
    }

    @Step("Click on the webelement button___mbox_btn_12")
    public String button___mbox_btn_12_getText() {
        return driver.findElement(locator.getLocator("button___mbox_btn_12")).getText().trim();
    }

    @Step("Double click on the webelement button___mbox_btn_12")
    public void button___mbox_btn_12_click() {
        driver.findElement(locator.getLocator("button___mbox_btn_12")).click();
    }

    @Step("Click on the webelement span___picker13_icon")
    public void span___picker13_icon_Action_click() {
        span___picker13_icon = driver.findElement(locator.getLocator("span___picker13_icon"));
        clickOnElement(span___picker13_icon);
    }

    @Step("Click on the webelement span291_3")
    public String span291_3_getText() {
        return driver.findElement(locator.getLocator("span291_3")).getText().trim();
    }

    @Step("Click on the webelement span291_3")
    public void span291_3_Action_click() {
        span291_3 = driver.findElement(locator.getLocator("span291_3"));
        clickOnElement(span291_3);
    }

    @Step("Click on the webelement bdi___button94_BDI_content")
    public String bdi___button94_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button94_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button94_BDI_content")
    public void bdi___button94_BDI_content_Action_click() {
        bdi___button94_BDI_content = driver.findElement(locator.getLocator("bdi___button94_BDI_content"));
        clickOnElement(bdi___button94_BDI_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_16_BDI_content")
    public String bdi___mbox_btn_16_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_16_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_16_BDI_content")
    public void bdi___mbox_btn_16_BDI_content_Action_click() {
        bdi___mbox_btn_16_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_16_BDI_content"));
        clickOnElement(bdi___mbox_btn_16_BDI_content);
    }

    @Step("Click on the webelement bdi___button92_BDI_content")
    public String bdi___button92_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button92_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button92_BDI_content")
    public void bdi___button92_BDI_content_Action_click() {
        bdi___button92_BDI_content = driver.findElement(locator.getLocator("bdi___button92_BDI_content"));
        clickOnElement(bdi___button92_BDI_content);
    }

    @Step("Click on the webelement span___button73___clone1380_inner")
    public void span___button73___clone1380_inner_Action_click() {
        span___button73___clone1380_inner = driver.findElement(locator.getLocator("span___button73___clone1380_inner"));
        clickOnElement(span___button73___clone1380_inner);
    }

    @Step("Click on the webelement bdi___mbox_btn_17_BDI_content")
    public String bdi___mbox_btn_17_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_17_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_17_BDI_content")
    public void bdi___mbox_btn_17_BDI_content_Action_click() {
        bdi___mbox_btn_17_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_17_BDI_content"));
        clickOnElement(bdi___mbox_btn_17_BDI_content);
    }

    @Step("Click on the webelement span___button92_inner")
    public String span___button92_inner_getText() {
        return driver.findElement(locator.getLocator("span___button92_inner")).getText().trim();
    }

    @Step("Click on the webelement span___button92_inner")
    public void span___button92_inner_Action_click() {
        span___button92_inner = driver.findElement(locator.getLocator("span___button92_inner"));
        clickOnElement(span___button92_inner);
    }

    @Step("Click on the webelement bdi___mbox_btn_19_BDI_content")
    public String bdi___mbox_btn_19_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_19_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_19_BDI_content")
    public void bdi___mbox_btn_19_BDI_content_Action_click() {
        bdi___mbox_btn_19_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_19_BDI_content"));
        clickOnElement(bdi___mbox_btn_19_BDI_content);
    }

    @Step("Click on the webelement bdi___mbox_btn_21_BDI_content")
    public String bdi___mbox_btn_21_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___mbox_btn_21_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___mbox_btn_21_BDI_content")
    public void bdi___mbox_btn_21_BDI_content_Action_click() {
        bdi___mbox_btn_21_BDI_content = driver.findElement(locator.getLocator("bdi___mbox_btn_21_BDI_content"));
        clickOnElement(bdi___mbox_btn_21_BDI_content);
    }

    @Step("Click on the webelement span___button96_content")
    public String span___button96_content_getText() {
        return driver.findElement(locator.getLocator("span___button96_content")).getText().trim();
    }

    @Step("Click on the webelement span___button96_content")
    public void span___button96_content_Action_click() {
        span___button96_content = driver.findElement(locator.getLocator("span___button96_content"));
        clickOnElement(span___button96_content);
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

    @Step("Click on the webelement span121_24_Hour_Alert")
    public String span121_24_Hour_Alert_getText() {
        return driver.findElement(locator.getLocator("span121_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span121_24_Hour_Alert")
    public void span121_24_Hour_Alert_Action_click() {
        span121_24_Hour_Alert = driver.findElement(locator.getLocator("span121_24_Hour_Alert"));
        clickOnElement(span121_24_Hour_Alert);
    }

    @Step("Click on the webelement bdi___button78_BDI_content")
    public String bdi___button78_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button78_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button78_BDI_content")
    public void bdi___button78_BDI_content_Action_click() {
        bdi___button78_BDI_content = driver.findElement(locator.getLocator("bdi___button78_BDI_content"));
        clickOnElement(bdi___button78_BDI_content);
    }

    @Step("Click on the webelement span124_Details")
    public String span124_Details_getText() {
        return driver.findElement(locator.getLocator("span124_Details")).getText().trim();
    }

    @Step("Click on the webelement span124_Details")
    public void span124_Details_Action_click() {
        span124_Details = driver.findElement(locator.getLocator("span124_Details"));
        clickOnElement(span124_Details);
    }

    @Step("Double click on the webelement input___input23_inner")
    public void input___input23_inner_click() {
        driver.findElement(locator.getLocator("input___input23_inner")).click();
    }

    @Step("Click on the webelement span___text110___clone788")
    public String span___text110___clone788_getText() {
        return driver.findElement(locator.getLocator("span___text110___clone788")).getText().trim();
    }

    @Step("Click on the webelement span___text110___clone788")
    public void span___text110___clone788_Action_click() {
        span___text110___clone788 = driver.findElement(locator.getLocator("span___text110___clone788"));
        clickOnElement(span___text110___clone788);
    }

    @Step("Double click on the webelement input___input25_inner")
    public void input___input25_inner_click() {
        driver.findElement(locator.getLocator("input___input25_inner")).click();
    }

    @Step("Click on the webelement div44_Lean_Manufac")
    public String div44_Lean_Manufac_getText() {
        return driver.findElement(locator.getLocator("div44_Lean_Manufac")).getText().trim();
    }

    @Step("Click on the webelement div44_Lean_Manufac")
    public void div44_Lean_Manufac_Action_click() {
        div44_Lean_Manufac = driver.findElement(locator.getLocator("div44_Lean_Manufac"));
        clickOnElement(div44_Lean_Manufac);
    }

    @Step("Double click on the webelement input___input26_inner")
    public void input___input26_inner_click() {
        driver.findElement(locator.getLocator("input___input26_inner")).click();
    }

    @Step("Click on the webelement div541_sap")
    public void div541_sap_Action_click() {
        div541_sap = driver.findElement(locator.getLocator("div541_sap"));
        clickOnElement(div541_sap);
    }

    @Step("Click on the webelement div___box30_CbBg")
    public void div___box30_CbBg_Action_click() {
        div___box30_CbBg = driver.findElement(locator.getLocator("div___box30_CbBg"));
        clickOnElement(div___box30_CbBg);
    }

    @Step("Double click on the webelement input___picker9_inner")
    public void input___picker9_inner_click() {
        driver.findElement(locator.getLocator("input___picker9_inner")).click();
    }

    @Step("Click on the webelement div___form5__Form__RFLayout")
    public String div___form5__Form__RFLayout_getText() {
        return driver.findElement(locator.getLocator("div___form5__Form__RFLayout")).getText().trim();
    }

    @Step("Click on the webelement div___form5__Form__RFLayout")
    public void div___form5__Form__RFLayout_Action_click() {
        div___form5__Form__RFLayout = driver.findElement(locator.getLocator("div___form5__Form__RFLayout"));
        clickOnElement(div___form5__Form__RFLayout);
    }

    @Step("Click on the webelement span137_Analysis")
    public String span137_Analysis_getText() {
        return driver.findElement(locator.getLocator("span137_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span137_Analysis")
    public void span137_Analysis_Action_click() {
        span137_Analysis = driver.findElement(locator.getLocator("span137_Analysis"));
        clickOnElement(span137_Analysis);
    }

    @Step("Click on the webelement span___input39___clone658_vhi")
    public void span___input39___clone658_vhi_Action_click() {
        span___input39___clone658_vhi = driver.findElement(locator.getLocator("span___input39___clone658_vhi"));
        clickOnElement(span___input39___clone658_vhi);
    }

    @Step("Click on the webelement li___item161___clone824")
    public String li___item161___clone824_getText() {
        return driver.findElement(locator.getLocator("li___item161___clone824")).getText().trim();
    }

    @Step("Double click on the webelement li___item161___clone824")
    public void li___item161___clone824_click() {
        driver.findElement(locator.getLocator("li___item161___clone824")).click();
    }

    @Step("Click on the webelement span___box31___clone659_arrow")
    public void span___box31___clone659_arrow_Action_click() {
        span___box31___clone659_arrow = driver.findElement(locator.getLocator("span___box31___clone659_arrow"));
        clickOnElement(span___box31___clone659_arrow);
    }

    @Step("Click on the webelement div114_Substandard_")
    public String div114_Substandard__getText() {
        return driver.findElement(locator.getLocator("div114_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div114_Substandard_")
    public void div114_Substandard__Action_click() {
        div114_Substandard_ = driver.findElement(locator.getLocator("div114_Substandard_"));
        clickOnElement(div114_Substandard_);
    }

    @Step("Click on the webelement span___input40___clone660_vhi")
    public void span___input40___clone660_vhi_Action_click() {
        span___input40___clone660_vhi = driver.findElement(locator.getLocator("span___input40___clone660_vhi"));
        clickOnElement(span___input40___clone660_vhi);
    }

    @Step("Click on the webelement div161_Servicing_Eq")
    public String div161_Servicing_Eq_getText() {
        return driver.findElement(locator.getLocator("div161_Servicing_Eq")).getText().trim();
    }

    @Step("Click on the webelement div161_Servicing_Eq")
    public void div161_Servicing_Eq_Action_click() {
        div161_Servicing_Eq = driver.findElement(locator.getLocator("div161_Servicing_Eq"));
        clickOnElement(div161_Servicing_Eq);
    }

    @Step("Click on the webelement span___box32___clone661_arrow")
    public void span___box32___clone661_arrow_Action_click() {
        span___box32___clone661_arrow = driver.findElement(locator.getLocator("span___box32___clone661_arrow"));
        clickOnElement(span___box32___clone661_arrow);
    }

    @Step("Click on the webelement div127_Personal_Fac")
    public String div127_Personal_Fac_getText() {
        return driver.findElement(locator.getLocator("div127_Personal_Fac")).getText().trim();
    }

    @Step("Click on the webelement div127_Personal_Fac")
    public void div127_Personal_Fac_Action_click() {
        div127_Personal_Fac = driver.findElement(locator.getLocator("div127_Personal_Fac"));
        clickOnElement(div127_Personal_Fac);
    }

    @Step("Click on the webelement span___input41___clone662_vhi")
    public void span___input41___clone662_vhi_Action_click() {
        span___input41___clone662_vhi = driver.findElement(locator.getLocator("span___input41___clone662_vhi"));
        clickOnElement(span___input41___clone662_vhi);
    }

    @Step("Click on the webelement li___item167___clone857")
    public String li___item167___clone857_getText() {
        return driver.findElement(locator.getLocator("li___item167___clone857")).getText().trim();
    }

    @Step("Double click on the webelement li___item167___clone857")
    public void li___item167___clone857_click() {
        driver.findElement(locator.getLocator("li___item167___clone857")).click();
    }

    @Step("Click on the webelement span___input42___clone663_vhi")
    public void span___input42___clone663_vhi_Action_click() {
        span___input42___clone663_vhi = driver.findElement(locator.getLocator("span___input42___clone663_vhi"));
        clickOnElement(span___input42___clone663_vhi);
    }

    @Step("Click on the webelement li___item168___clone864")
    public String li___item168___clone864_getText() {
        return driver.findElement(locator.getLocator("li___item168___clone864")).getText().trim();
    }

    @Step("Double click on the webelement li___item168___clone864")
    public void li___item168___clone864_click() {
        driver.findElement(locator.getLocator("li___item168___clone864")).click();
    }

    @Step("Click on the webelement span___input43___clone664_vhi")
    public void span___input43___clone664_vhi_Action_click() {
        span___input43___clone664_vhi = driver.findElement(locator.getLocator("span___input43___clone664_vhi"));
        clickOnElement(span___input43___clone664_vhi);
    }

    @Step("Click on the webelement div174_Employee_Tra")
    public String div174_Employee_Tra_getText() {
        return driver.findElement(locator.getLocator("div174_Employee_Tra")).getText().trim();
    }

    @Step("Click on the webelement div174_Employee_Tra")
    public void div174_Employee_Tra_Action_click() {
        div174_Employee_Tra = driver.findElement(locator.getLocator("div174_Employee_Tra"));
        clickOnElement(div174_Employee_Tra);
    }

    @Step("Click on the webelement span___input44___clone665_vhi")
    public void span___input44___clone665_vhi_Action_click() {
        span___input44___clone665_vhi = driver.findElement(locator.getLocator("span___input44___clone665_vhi"));
        clickOnElement(span___input44___clone665_vhi);
    }

    @Step("Click on the webelement div162_Training_Nee")
    public String div162_Training_Nee_getText() {
        return driver.findElement(locator.getLocator("div162_Training_Nee")).getText().trim();
    }

    @Step("Click on the webelement div162_Training_Nee")
    public void div162_Training_Nee_Action_click() {
        div162_Training_Nee = driver.findElement(locator.getLocator("div162_Training_Nee"));
        clickOnElement(div162_Training_Nee);
    }

    @Step("Click on the webelement span___input45___clone666_vhi")
    public void span___input45___clone666_vhi_Action_click() {
        span___input45___clone666_vhi = driver.findElement(locator.getLocator("span___input45___clone666_vhi"));
        clickOnElement(span___input45___clone666_vhi);
    }

    @Step("Send the value test to the webelement textarea___area24___clone667_inner")
    public void textarea___area24___clone667_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area24___clone667_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area24___clone667_inner")).sendKeys(val);
    }

    public String textarea___area24___clone667_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area24___clone667_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input46___clone668_vhi")
    public void span___input46___clone668_vhi_Action_click() {
        span___input46___clone668_vhi = driver.findElement(locator.getLocator("span___input46___clone668_vhi"));
        clickOnElement(span___input46___clone668_vhi);
    }

    @Step("Click on the webelement span___text126___clone892")
    public String span___text126___clone892_getText() {
        return driver.findElement(locator.getLocator("span___text126___clone892")).getText().trim();
    }

    @Step("Click on the webelement span___text126___clone892")
    public void span___text126___clone892_Action_click() {
        span___text126___clone892 = driver.findElement(locator.getLocator("span___text126___clone892"));
        clickOnElement(span___text126___clone892);
    }

    @Step("Double click on the webelement input___picker10___clone669_inner")
    public void input___picker10___clone669_inner_click() {
        driver.findElement(locator.getLocator("input___picker10___clone669_inner")).click();
    }

    @Step("Send the value 04/09/2026 to the webelement input___picker10___clone669_inner")
    public void input___picker10___clone669_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker10___clone669_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker10___clone669_inner")).sendKeys(val);
    }

    public String input___picker10___clone669_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker10___clone669_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span59_4")
    public String span59_4_getText() {
        return driver.findElement(locator.getLocator("span59_4")).getText().trim();
    }

    @Step("Click on the webelement span59_4")
    public void span59_4_Action_click() {
        span59_4 = driver.findElement(locator.getLocator("span59_4"));
        clickOnElement(span59_4);
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

    @Step("Click on the webelement span___text110___clone802")
    public String span___text110___clone802_getText() {
        return driver.findElement(locator.getLocator("span___text110___clone802")).getText().trim();
    }

    @Step("Click on the webelement span___text110___clone802")
    public void span___text110___clone802_Action_click() {
        span___text110___clone802 = driver.findElement(locator.getLocator("span___text110___clone802"));
        clickOnElement(span___text110___clone802);
    }

    @Step("Click on the webelement div50_Maintenance")
    public String div50_Maintenance_getText() {
        return driver.findElement(locator.getLocator("div50_Maintenance")).getText().trim();
    }

    @Step("Click on the webelement div50_Maintenance")
    public void div50_Maintenance_Action_click() {
        div50_Maintenance = driver.findElement(locator.getLocator("div50_Maintenance"));
        clickOnElement(div50_Maintenance);
    }

    @Step("Click on the webelement div681_sap")
    public void div681_sap_Action_click() {
        div681_sap = driver.findElement(locator.getLocator("div681_sap"));
        clickOnElement(div681_sap);
    }

    @Step("Click on the webelement div___form5__Form__RFLayout_row0")
    public String div___form5__Form__RFLayout_row0_getText() {
        return driver.findElement(locator.getLocator("div___form5__Form__RFLayout_row0")).getText().trim();
    }

    @Step("Click on the webelement div___form5__Form__RFLayout_row0")
    public void div___form5__Form__RFLayout_row0_Action_click() {
        div___form5__Form__RFLayout_row0 = driver.findElement(locator.getLocator("div___form5__Form__RFLayout_row0"));
        clickOnElement(div___form5__Form__RFLayout_row0);
    }

    @Step("Click on the webelement div548_sap")
    public void div548_sap_Action_click() {
        div548_sap = driver.findElement(locator.getLocator("div548_sap"));
        clickOnElement(div548_sap);
    }

    @Step("Click on the webelement span___input39___clone672_vhi")
    public void span___input39___clone672_vhi_Action_click() {
        span___input39___clone672_vhi = driver.findElement(locator.getLocator("span___input39___clone672_vhi"));
        clickOnElement(span___input39___clone672_vhi);
    }

    @Step("Click on the webelement li___item161___clone838")
    public String li___item161___clone838_getText() {
        return driver.findElement(locator.getLocator("li___item161___clone838")).getText().trim();
    }

    @Step("Double click on the webelement li___item161___clone838")
    public void li___item161___clone838_click() {
        driver.findElement(locator.getLocator("li___item161___clone838")).click();
    }

    @Step("Click on the webelement span___box31___clone673_arrow")
    public void span___box31___clone673_arrow_Action_click() {
        span___box31___clone673_arrow = driver.findElement(locator.getLocator("span___box31___clone673_arrow"));
        clickOnElement(span___box31___clone673_arrow);
    }

    @Step("Click on the webelement li___item163")
    public String li___item163_getText() {
        return driver.findElement(locator.getLocator("li___item163")).getText().trim();
    }

    @Step("Double click on the webelement li___item163")
    public void li___item163_click() {
        driver.findElement(locator.getLocator("li___item163")).click();
    }

    @Step("Click on the webelement span___input40___clone674_vhi")
    public void span___input40___clone674_vhi_Action_click() {
        span___input40___clone674_vhi = driver.findElement(locator.getLocator("span___input40___clone674_vhi"));
        clickOnElement(span___input40___clone674_vhi);
    }

    @Step("Click on the webelement li___item164___clone860")
    public String li___item164___clone860_getText() {
        return driver.findElement(locator.getLocator("li___item164___clone860")).getText().trim();
    }

    @Step("Double click on the webelement li___item164___clone860")
    public void li___item164___clone860_click() {
        driver.findElement(locator.getLocator("li___item164___clone860")).click();
    }

    @Step("Click on the webelement span___box32___clone675_arrow")
    public void span___box32___clone675_arrow_Action_click() {
        span___box32___clone675_arrow = driver.findElement(locator.getLocator("span___box32___clone675_arrow"));
        clickOnElement(span___box32___clone675_arrow);
    }

    @Step("Click on the webelement div130_Job_Factor")
    public String div130_Job_Factor_getText() {
        return driver.findElement(locator.getLocator("div130_Job_Factor")).getText().trim();
    }

    @Step("Click on the webelement div130_Job_Factor")
    public void div130_Job_Factor_Action_click() {
        div130_Job_Factor = driver.findElement(locator.getLocator("div130_Job_Factor"));
        clickOnElement(div130_Job_Factor);
    }

    @Step("Click on the webelement span___input41___clone676_vhi")
    public void span___input41___clone676_vhi_Action_click() {
        span___input41___clone676_vhi = driver.findElement(locator.getLocator("span___input41___clone676_vhi"));
        clickOnElement(span___input41___clone676_vhi);
    }

    @Step("Click on the webelement div171_Inadequate_M")
    public String div171_Inadequate_M_getText() {
        return driver.findElement(locator.getLocator("div171_Inadequate_M")).getText().trim();
    }

    @Step("Click on the webelement div171_Inadequate_M")
    public void div171_Inadequate_M_Action_click() {
        div171_Inadequate_M = driver.findElement(locator.getLocator("div171_Inadequate_M"));
        clickOnElement(div171_Inadequate_M);
    }

    @Step("Click on the webelement span___input42___clone677_vhi")
    public void span___input42___clone677_vhi_Action_click() {
        span___input42___clone677_vhi = driver.findElement(locator.getLocator("span___input42___clone677_vhi"));
        clickOnElement(span___input42___clone677_vhi);
    }

    @Step("Click on the webelement div162_Inadequate_p")
    public String div162_Inadequate_p_getText() {
        return driver.findElement(locator.getLocator("div162_Inadequate_p")).getText().trim();
    }

    @Step("Click on the webelement div162_Inadequate_p")
    public void div162_Inadequate_p_Action_click() {
        div162_Inadequate_p = driver.findElement(locator.getLocator("div162_Inadequate_p"));
        clickOnElement(div162_Inadequate_p);
    }

    @Step("Click on the webelement span___input43___clone678_vhi")
    public void span___input43___clone678_vhi_Action_click() {
        span___input43___clone678_vhi = driver.findElement(locator.getLocator("span___input43___clone678_vhi"));
        clickOnElement(span___input43___clone678_vhi);
    }

    @Step("Click on the webelement div168_Task_Analysi")
    public String div168_Task_Analysi_getText() {
        return driver.findElement(locator.getLocator("div168_Task_Analysi")).getText().trim();
    }

    @Step("Click on the webelement div168_Task_Analysi")
    public void div168_Task_Analysi_Action_click() {
        div168_Task_Analysi = driver.findElement(locator.getLocator("div168_Task_Analysi"));
        clickOnElement(div168_Task_Analysi);
    }

    @Step("Click on the webelement span___input44___clone679_vhi")
    public void span___input44___clone679_vhi_Action_click() {
        span___input44___clone679_vhi = driver.findElement(locator.getLocator("span___input44___clone679_vhi"));
        clickOnElement(span___input44___clone679_vhi);
    }

    @Step("Click on the webelement li___item170___clone889")
    public String li___item170___clone889_getText() {
        return driver.findElement(locator.getLocator("li___item170___clone889")).getText().trim();
    }

    @Step("Double click on the webelement li___item170___clone889")
    public void li___item170___clone889_click() {
        driver.findElement(locator.getLocator("li___item170___clone889")).click();
    }

    @Step("Click on the webelement span___input45___clone680_vhi")
    public void span___input45___clone680_vhi_Action_click() {
        span___input45___clone680_vhi = driver.findElement(locator.getLocator("span___input45___clone680_vhi"));
        clickOnElement(span___input45___clone680_vhi);
    }

    @Step("Send the value test to the webelement textarea___area24___clone681_inner")
    public void textarea___area24___clone681_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area24___clone681_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area24___clone681_inner")).sendKeys(val);
    }

    public String textarea___area24___clone681_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area24___clone681_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input46___clone682_vhi")
    public void span___input46___clone682_vhi_Action_click() {
        span___input46___clone682_vhi = driver.findElement(locator.getLocator("span___input46___clone682_vhi"));
        clickOnElement(span___input46___clone682_vhi);
    }

    @Step("Double click on the webelement input___picker10___clone683_inner")
    public void input___picker10___clone683_inner_click() {
        driver.findElement(locator.getLocator("input___picker10___clone683_inner")).click();
    }

    @Step("Send the value 04/09/2026 to the webelement input___picker10___clone683_inner")
    public void input___picker10___clone683_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker10___clone683_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker10___clone683_inner")).sendKeys(val);
    }

    public String input___picker10___clone683_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker10___clone683_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___text110___clone869")
    public String span___text110___clone869_getText() {
        return driver.findElement(locator.getLocator("span___text110___clone869")).getText().trim();
    }

    @Step("Click on the webelement span___text110___clone869")
    public void span___text110___clone869_Action_click() {
        span___text110___clone869 = driver.findElement(locator.getLocator("span___text110___clone869"));
        clickOnElement(span___text110___clone869);
    }

    @Step("Click on the webelement div35_Human_Resour")
    public String div35_Human_Resour_getText() {
        return driver.findElement(locator.getLocator("div35_Human_Resour")).getText().trim();
    }

    @Step("Click on the webelement div35_Human_Resour")
    public void div35_Human_Resour_Action_click() {
        div35_Human_Resour = driver.findElement(locator.getLocator("div35_Human_Resour"));
        clickOnElement(div35_Human_Resour);
    }

    @Step("Click on the webelement div___box21_CbBg")
    public void div___box21_CbBg_Action_click() {
        div___box21_CbBg = driver.findElement(locator.getLocator("div___box21_CbBg"));
        clickOnElement(div___box21_CbBg);
    }

    @Step("Click on the webelement div504_sap")
    public void div504_sap_Action_click() {
        div504_sap = driver.findElement(locator.getLocator("div504_sap"));
        clickOnElement(div504_sap);
    }

    @Step("Click on the webelement span___input39___clone739_vhi")
    public void span___input39___clone739_vhi_Action_click() {
        span___input39___clone739_vhi = driver.findElement(locator.getLocator("span___input39___clone739_vhi"));
        clickOnElement(span___input39___clone739_vhi);
    }

    @Step("Click on the webelement div145_Contact_with")
    public String div145_Contact_with_getText() {
        return driver.findElement(locator.getLocator("div145_Contact_with")).getText().trim();
    }

    @Step("Click on the webelement div145_Contact_with")
    public void div145_Contact_with_Action_click() {
        div145_Contact_with = driver.findElement(locator.getLocator("div145_Contact_with"));
        clickOnElement(div145_Contact_with);
    }

    @Step("Click on the webelement span___box31___clone740_arrow")
    public void span___box31___clone740_arrow_Action_click() {
        span___box31___clone740_arrow = driver.findElement(locator.getLocator("span___box31___clone740_arrow"));
        clickOnElement(span___box31___clone740_arrow);
    }

    @Step("Click on the webelement span___input40___clone741_vhi")
    public void span___input40___clone741_vhi_Action_click() {
        span___input40___clone741_vhi = driver.findElement(locator.getLocator("span___input40___clone741_vhi"));
        clickOnElement(span___input40___clone741_vhi);
    }

    @Step("Click on the webelement div158_Making_Safet")
    public String div158_Making_Safet_getText() {
        return driver.findElement(locator.getLocator("div158_Making_Safet")).getText().trim();
    }

    @Step("Click on the webelement div158_Making_Safet")
    public void div158_Making_Safet_Action_click() {
        div158_Making_Safet = driver.findElement(locator.getLocator("div158_Making_Safet"));
        clickOnElement(div158_Making_Safet);
    }

    @Step("Click on the webelement span___box32___clone742_arrow")
    public void span___box32___clone742_arrow_Action_click() {
        span___box32___clone742_arrow = driver.findElement(locator.getLocator("span___box32___clone742_arrow"));
        clickOnElement(span___box32___clone742_arrow);
    }

    @Step("Click on the webelement span___input41___clone743_vhi")
    public void span___input41___clone743_vhi_Action_click() {
        span___input41___clone743_vhi = driver.findElement(locator.getLocator("span___input41___clone743_vhi"));
        clickOnElement(span___input41___clone743_vhi);
    }

    @Step("Click on the webelement div168_Lack_of_Know")
    public String div168_Lack_of_Know_getText() {
        return driver.findElement(locator.getLocator("div168_Lack_of_Know")).getText().trim();
    }

    @Step("Click on the webelement div168_Lack_of_Know")
    public void div168_Lack_of_Know_Action_click() {
        div168_Lack_of_Know = driver.findElement(locator.getLocator("div168_Lack_of_Know"));
        clickOnElement(div168_Lack_of_Know);
    }

    @Step("Click on the webelement span___input42___clone744_vhi")
    public void span___input42___clone744_vhi_Action_click() {
        span___input42___clone744_vhi = driver.findElement(locator.getLocator("span___input42___clone744_vhi"));
        clickOnElement(span___input42___clone744_vhi);
    }

    @Step("Click on the webelement div168_Inadequate_i")
    public String div168_Inadequate_i_getText() {
        return driver.findElement(locator.getLocator("div168_Inadequate_i")).getText().trim();
    }

    @Step("Click on the webelement div168_Inadequate_i")
    public void div168_Inadequate_i_Action_click() {
        div168_Inadequate_i = driver.findElement(locator.getLocator("div168_Inadequate_i"));
        clickOnElement(div168_Inadequate_i);
    }

    @Step("Click on the webelement span___input43___clone745_vhi")
    public void span___input43___clone745_vhi_Action_click() {
        span___input43___clone745_vhi = driver.findElement(locator.getLocator("span___input43___clone745_vhi"));
        clickOnElement(span___input43___clone745_vhi);
    }

    @Step("Click on the webelement li___item166___clone947")
    public String li___item166___clone947_getText() {
        return driver.findElement(locator.getLocator("li___item166___clone947")).getText().trim();
    }

    @Step("Double click on the webelement li___item166___clone947")
    public void li___item166___clone947_click() {
        driver.findElement(locator.getLocator("li___item166___clone947")).click();
    }

    @Step("Click on the webelement span___input44___clone746_vhi")
    public void span___input44___clone746_vhi_Action_click() {
        span___input44___clone746_vhi = driver.findElement(locator.getLocator("span___input44___clone746_vhi"));
        clickOnElement(span___input44___clone746_vhi);
    }

    @Step("Click on the webelement li___item167___clone962")
    public String li___item167___clone962_getText() {
        return driver.findElement(locator.getLocator("li___item167___clone962")).getText().trim();
    }

    @Step("Double click on the webelement li___item167___clone962")
    public void li___item167___clone962_click() {
        driver.findElement(locator.getLocator("li___item167___clone962")).click();
    }

    @Step("Click on the webelement span___input45___clone747_vhi")
    public void span___input45___clone747_vhi_Action_click() {
        span___input45___clone747_vhi = driver.findElement(locator.getLocator("span___input45___clone747_vhi"));
        clickOnElement(span___input45___clone747_vhi);
    }

    @Step("Send the value test to the webelement textarea___area24___clone748_inner")
    public void textarea___area24___clone748_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area24___clone748_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area24___clone748_inner")).sendKeys(val);
    }

    public String textarea___area24___clone748_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area24___clone748_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input46___clone749_vhi")
    public void span___input46___clone749_vhi_Action_click() {
        span___input46___clone749_vhi = driver.findElement(locator.getLocator("span___input46___clone749_vhi"));
        clickOnElement(span___input46___clone749_vhi);
    }

    @Step("Click on the webelement span___text126___clone978")
    public String span___text126___clone978_getText() {
        return driver.findElement(locator.getLocator("span___text126___clone978")).getText().trim();
    }

    @Step("Click on the webelement span___text126___clone978")
    public void span___text126___clone978_Action_click() {
        span___text126___clone978 = driver.findElement(locator.getLocator("span___text126___clone978"));
        clickOnElement(span___text126___clone978);
    }

    @Step("Click on the webelement span___picker10___clone750_icon")
    public void span___picker10___clone750_icon_Action_click() {
        span___picker10___clone750_icon = driver.findElement(locator.getLocator("span___picker10___clone750_icon"));
        clickOnElement(span___picker10___clone750_icon);
    }

    @Step("Double click on the webelement input___input47_inner")
    public void input___input47_inner_click() {
        driver.findElement(locator.getLocator("input___input47_inner")).click();
    }

    @Step("Send the value te to the webelement input___input47_inner")
    public void input___input47_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input47_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input47_inner")).sendKeys(val);
    }

    public String input___input47_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input47_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span103_4")
    public String span103_4_getText() {
        return driver.findElement(locator.getLocator("span103_4")).getText().trim();
    }

    @Step("Click on the webelement span103_4")
    public void span103_4_Action_click() {
        span103_4 = driver.findElement(locator.getLocator("span103_4"));
        clickOnElement(span103_4);
    }

    @Step("Click on the webelement span238_Notes")
    public String span238_Notes_getText() {
        return driver.findElement(locator.getLocator("span238_Notes")).getText().trim();
    }

    @Step("Click on the webelement span238_Notes")
    public void span238_Notes_Action_click() {
        span238_Notes = driver.findElement(locator.getLocator("span238_Notes"));
        clickOnElement(span238_Notes);
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

    @Step("Click on the webelement bdi___button64_BDI_content")
    public String bdi___button64_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button64_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button64_BDI_content")
    public void bdi___button64_BDI_content_Action_click() {
        bdi___button64_BDI_content = driver.findElement(locator.getLocator("bdi___button64_BDI_content"));
        clickOnElement(bdi___button64_BDI_content);
    }

    @Step("Click on the webelement span___text97___clone627")
    public String span___text97___clone627_getText() {
        return driver.findElement(locator.getLocator("span___text97___clone627")).getText().trim();
    }

    @Step("Click on the webelement span___text97___clone627")
    public void span___text97___clone627_Action_click() {
        span___text97___clone627 = driver.findElement(locator.getLocator("span___text97___clone627"));
        clickOnElement(span___text97___clone627);
    }

    @Step("Send the value test to the webelement input___input23_inner")
    public void input___input23_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input23_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input23_inner")).sendKeys(val);
    }

    public String input___input23_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input23_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___input24_inner")
    public void input___input24_inner_click() {
        driver.findElement(locator.getLocator("input___input24_inner")).click();
    }

    @Step("Send the value 1 to the webelement input___input24_inner")
    public void input___input24_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___input24_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___input24_inner")).sendKeys(val);
    }

    public String input___input24_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___input24_inner")).getAttribute("value");
    }

    @Step("Click on the webelement circle___button19_Button")
    public void circle___button19_Button_Action_click() {
        circle___button19_Button = driver.findElement(locator.getLocator("circle___button19_Button"));
        clickOnElement(circle___button19_Button);
    }

    @Step("Click on the webelement div___box17_CbBg")
    public void div___box17_CbBg_Action_click() {
        div___box17_CbBg = driver.findElement(locator.getLocator("div___box17_CbBg"));
        clickOnElement(div___box17_CbBg);
    }

    @Step("Click on the webelement div___box18_CbBg")
    public void div___box18_CbBg_Action_click() {
        div___box18_CbBg = driver.findElement(locator.getLocator("div___box18_CbBg"));
        clickOnElement(div___box18_CbBg);
    }

    @Step("Send the value tested to the webelement textarea___area16_inner")
    public void textarea___area16_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area16_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area16_inner")).sendKeys(val);
    }

    public String textarea___area16_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area16_inner")).getAttribute("value");
    }

    @Step("Double click on the webelement input___picker8_inner")
    public void input___picker8_inner_click() {
        driver.findElement(locator.getLocator("input___picker8_inner")).click();
    }

    @Step("send on the webelement input___picker8_inner")
    public void input___picker8_inner() {
        driver.findElement(locator.getLocator("input___picker8_inner")).sendKeys("11:23:43");
    }

    @Step("Click on the webelement div___form4__Form__RFLayout")
    public String div___form4__Form__RFLayout_getText() {
        return driver.findElement(locator.getLocator("div___form4__Form__RFLayout")).getText().trim();
    }

    @Step("Click on the webelement div___form4__Form__RFLayout")
    public void div___form4__Form__RFLayout_Action_click() {
        div___form4__Form__RFLayout = driver.findElement(locator.getLocator("div___form4__Form__RFLayout"));
        clickOnElement(div___form4__Form__RFLayout);
    }

    @Step("Click on the webelement bdi___button68_BDI_content")
    public String bdi___button68_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button68_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button68_BDI_content")
    public void bdi___button68_BDI_content_Action_click() {
        bdi___button68_BDI_content = driver.findElement(locator.getLocator("bdi___button68_BDI_content"));
        clickOnElement(bdi___button68_BDI_content);
    }

    @Step("Click on the webelement span___input35___clone497_vhi")
    public void span___input35___clone497_vhi_Action_click() {
        span___input35___clone497_vhi = driver.findElement(locator.getLocator("span___input35___clone497_vhi"));
        clickOnElement(span___input35___clone497_vhi);
    }

    @Step("Click on the webelement span___box27___clone498_arrow")
    public void span___box27___clone498_arrow_Action_click() {
        span___box27___clone498_arrow = driver.findElement(locator.getLocator("span___box27___clone498_arrow"));
        clickOnElement(span___box27___clone498_arrow);
    }

    @Step("Click on the webelement span___input36___clone499_vhi")
    public void span___input36___clone499_vhi_Action_click() {
        span___input36___clone499_vhi = driver.findElement(locator.getLocator("span___input36___clone499_vhi"));
        clickOnElement(span___input36___clone499_vhi);
    }

    @Step("Click on the webelement span___box28___clone500_arrow")
    public void span___box28___clone500_arrow_Action_click() {
        span___box28___clone500_arrow = driver.findElement(locator.getLocator("span___box28___clone500_arrow"));
        clickOnElement(span___box28___clone500_arrow);
    }

    @Step("Click on the webelement span___input37___clone501_vhi")
    public void span___input37___clone501_vhi_Action_click() {
        span___input37___clone501_vhi = driver.findElement(locator.getLocator("span___input37___clone501_vhi"));
        clickOnElement(span___input37___clone501_vhi);
    }

    @Step("Click on the webelement li___item159___clone694")
    public String li___item159___clone694_getText() {
        return driver.findElement(locator.getLocator("li___item159___clone694")).getText().trim();
    }

    @Step("Double click on the webelement li___item159___clone694")
    public void li___item159___clone694_click() {
        driver.findElement(locator.getLocator("li___item159___clone694")).click();
    }

    @Step("Click on the webelement span___input38___clone502_vhi")
    public void span___input38___clone502_vhi_Action_click() {
        span___input38___clone502_vhi = driver.findElement(locator.getLocator("span___input38___clone502_vhi"));
        clickOnElement(span___input38___clone502_vhi);
    }

    @Step("Click on the webelement span___input39___clone503_vhi")
    public void span___input39___clone503_vhi_Action_click() {
        span___input39___clone503_vhi = driver.findElement(locator.getLocator("span___input39___clone503_vhi"));
        clickOnElement(span___input39___clone503_vhi);
    }

    @Step("Click on the webelement div168_Accident_And")
    public String div168_Accident_And_getText() {
        return driver.findElement(locator.getLocator("div168_Accident_And")).getText().trim();
    }

    @Step("Click on the webelement div168_Accident_And")
    public void div168_Accident_And_Action_click() {
        div168_Accident_And = driver.findElement(locator.getLocator("div168_Accident_And"));
        clickOnElement(div168_Accident_And);
    }

    @Step("Click on the webelement span___input40___clone504_vhi")
    public void span___input40___clone504_vhi_Action_click() {
        span___input40___clone504_vhi = driver.findElement(locator.getLocator("span___input40___clone504_vhi"));
        clickOnElement(span___input40___clone504_vhi);
    }

    @Step("Click on the webelement div168_Remedial_Fol")
    public String div168_Remedial_Fol_getText() {
        return driver.findElement(locator.getLocator("div168_Remedial_Fol")).getText().trim();
    }

    @Step("Click on the webelement div168_Remedial_Fol")
    public void div168_Remedial_Fol_Action_click() {
        div168_Remedial_Fol = driver.findElement(locator.getLocator("div168_Remedial_Fol"));
        clickOnElement(div168_Remedial_Fol);
    }

    @Step("Click on the webelement span___input41___clone505_vhi")
    public void span___input41___clone505_vhi_Action_click() {
        span___input41___clone505_vhi = driver.findElement(locator.getLocator("span___input41___clone505_vhi"));
        clickOnElement(span___input41___clone505_vhi);
    }

    @Step("Click on the webelement span Action")
    public void span___input41___clone505_vhi_Action() {
        span___input41___clone505_vhi = driver.findElement(By.xpath("//*[@id=\"__item132-__clone696-selectSingle-Button\"]"));
        clickOnElement(span___input41___clone505_vhi);
    }

    @Step("Click on the webelement bdi___button71_BDI_content")
    public String bdi___button71_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button71_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button71_BDI_content")
    public void bdi___button71_BDI_content_Action_click() {
        bdi___button71_BDI_content = driver.findElement(locator.getLocator("bdi___button71_BDI_content"));
        clickOnElement(bdi___button71_BDI_content);
    }

    @Step("Click on the webelement span___input42___clone507_vhi")
    public void span___input42___clone507_vhi_Action_click() {
        span___input42___clone507_vhi = driver.findElement(locator.getLocator("span___input42___clone507_vhi"));
        clickOnElement(span___input42___clone507_vhi);
    }

    @Step("Scroll to and click on the element span___input42___clone507_vhi")
    public void scroll_upto_element() {
        WebElement element = driver.findElement(By.xpath("//div[@id='application-ReviewIncident_Safety_App-Display-component---object--idIncidentTable-hsb']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", element);
        //clickOnElement(element);
    }

    @Step("Scroll horizontal scrollbar to the left")
    public void scroll_horizontal_bar_left() {
        WebElement horizontalScrollbar = driver.findElement(By.id("application-ReviewIncident_Safety_App-Display-component---object--idIncidentTable-hsb"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 0;", horizontalScrollbar);
    }

    @Step("Click on the webelement span___text113___clone735")
    public String span___text113___clone735_getText() {
        return driver.findElement(locator.getLocator("span___text113___clone735")).getText().trim();
    }

    @Step("Click on the webelement span___text113___clone735")
    public void span___text113___clone735_Action_click() {
        span___text113___clone735 = driver.findElement(locator.getLocator("span___text113___clone735"));
        clickOnElement(span___text113___clone735);
    }

    @Step("Send the value test to the webelement textarea___area20___clone506_inner")
    public void textarea___area20___clone506_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area20___clone506_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area20___clone506_inner")).sendKeys(val);
    }

    public String textarea___area20___clone506_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area20___clone506_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___picker9___clone508_icon")
    public void span___picker9___clone508_icon_Action_click() {
        span___picker9___clone508_icon = driver.findElement(locator.getLocator("span___picker9___clone508_icon"));
        clickOnElement(span___picker9___clone508_icon);
    }

    @Step("Click on the webelement bdi___button65_BDI_content")
    public String bdi___button65_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button65_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button65_BDI_content")
    public void bdi___button65_BDI_content_Action_click() {
        bdi___button65_BDI_content = driver.findElement(locator.getLocator("bdi___button65_BDI_content"));
        clickOnElement(bdi___button65_BDI_content);
    }

    @Step("Click on the webelement div___filter4_text")
    public String div___filter4_text_getText() {
        return driver.findElement(locator.getLocator("div___filter4_text")).getText().trim();
    }

    @Step("Click on the webelement div___filter4_text")
    public void div___filter4_text_Action_click() {
        div___filter4_text = driver.findElement(locator.getLocator("div___filter4_text"));
        clickOnElement(div___filter4_text);
    }

    @Step("Click on the webelement div26_Engineering")
    public String div26_Engineering_getText() {
        return driver.findElement(locator.getLocator("div26_Engineering")).getText().trim();
    }

    @Step("Click on the webelement div26_Engineering")
    public void div26_Engineering_Action_click() {
        div26_Engineering = driver.findElement(locator.getLocator("div26_Engineering"));
        clickOnElement(div26_Engineering);
    }

    @Step("Click on the webelement bdi___button22_label_bdi")
    public String bdi___button22_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button22_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button22_label_bdi")
    public void bdi___button22_label_bdi_Action_click() {
        bdi___button22_label_bdi = driver.findElement(locator.getLocator("bdi___button22_label_bdi"));
        clickOnElement(bdi___button22_label_bdi);
    }

    @Step("Click on the webelement bdi___box18_label_bdi")
    public String bdi___box18_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box18_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box18_label_bdi")
    public void bdi___box18_label_bdi_Action_click() {
        bdi___box18_label_bdi = driver.findElement(locator.getLocator("bdi___box18_label_bdi"));
        clickOnElement(bdi___box18_label_bdi);
    }

    @Step("Click on the webelement span___input35___clone494_vhi")
    public void span___input35___clone494_vhi_Action_click() {
        span___input35___clone494_vhi = driver.findElement(locator.getLocator("span___input35___clone494_vhi"));
        clickOnElement(span___input35___clone494_vhi);
    }

    @Step("Click on the webelement span___box27___clone495_arrow")
    public void span___box27___clone495_arrow_Action_click() {
        span___box27___clone495_arrow = driver.findElement(locator.getLocator("span___box27___clone495_arrow"));
        clickOnElement(span___box27___clone495_arrow);
    }

    @Step("Click on the webelement span___input36___clone496_vhi")
    public void span___input36___clone496_vhi_Action_click() {
        span___input36___clone496_vhi = driver.findElement(locator.getLocator("span___input36___clone496_vhi"));
        clickOnElement(span___input36___clone496_vhi);
    }

    @Step("Click on the webelement span___box28___clone497_arrow")
    public void span___box28___clone497_arrow_Action_click() {
        span___box28___clone497_arrow = driver.findElement(locator.getLocator("span___box28___clone497_arrow"));
        clickOnElement(span___box28___clone497_arrow);
    }

    @Step("Click on the webelement span___input37___clone498_vhi")
    public void span___input37___clone498_vhi_Action_click() {
        span___input37___clone498_vhi = driver.findElement(locator.getLocator("span___input37___clone498_vhi"));
        clickOnElement(span___input37___clone498_vhi);
    }

    @Step("Click on the webelement span___input38___clone499_vhi")
    public void span___input38___clone499_vhi_Action_click() {
        span___input38___clone499_vhi = driver.findElement(locator.getLocator("span___input38___clone499_vhi"));
        clickOnElement(span___input38___clone499_vhi);
    }

    @Step("Click on the webelement span___input39___clone500_vhi")
    public void span___input39___clone500_vhi_Action_click() {
        span___input39___clone500_vhi = driver.findElement(locator.getLocator("span___input39___clone500_vhi"));
        clickOnElement(span___input39___clone500_vhi);
    }

    @Step("Click on the webelement span___input40___clone501_vhi")
    public void span___input40___clone501_vhi_Action_click() {
        span___input40___clone501_vhi = driver.findElement(locator.getLocator("span___input40___clone501_vhi"));
        clickOnElement(span___input40___clone501_vhi);
    }

    @Step("Click on the webelement li___item159___clone722")
    public String li___item159___clone722_getText() {
        return driver.findElement(locator.getLocator("li___item159___clone722")).getText().trim();
    }

    @Step("Double click on the webelement li___item159___clone722")
    public void li___item159___clone722_click() {
        driver.findElement(locator.getLocator("li___item159___clone722")).click();
    }

    @Step("Click on the webelement span___input41___clone502_vhi")
    public void span___input41___clone502_vhi_Action_click() {
        span___input41___clone502_vhi = driver.findElement(locator.getLocator("span___input41___clone502_vhi"));
        clickOnElement(span___input41___clone502_vhi);
    }

    @Step("Click on the webelement div154_Manpower")
    public String div154_Manpower_getText() {
        return driver.findElement(locator.getLocator("div154_Manpower")).getText().trim();
    }

    @Step("Click on the webelement div154_Manpower")
    public void div154_Manpower_Action_click() {
        div154_Manpower = driver.findElement(By.xpath("//input[@id='__item37-__clone551-selectSingle-RB']"));
        clickOnElement(div154_Manpower);
    }

    @Step("Send the value test to the webelement textarea___area20___clone503_inner")
    public void textarea___area20___clone503_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("textarea___area20___clone503_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("textarea___area20___clone503_inner")).sendKeys(val);
    }

    public String textarea___area20___clone503_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("textarea___area20___clone503_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___input42___clone504_vhi")
    public void span___input42___clone504_vhi_Action_click() {
        span___input42___clone504_vhi = driver.findElement(locator.getLocator("span___input42___clone504_vhi"));
        clickOnElement(span___input42___clone504_vhi);
    }

    @Step("Click on the webelement span___picker9___clone505_icon")
    public void span___picker9___clone505_icon_Action_click() {
        span___picker9___clone505_icon = driver.findElement(locator.getLocator("span___picker9___clone505_icon"));
        clickOnElement(span___picker9___clone505_icon);
    }

    @Step("Click on the webelement span___page2_navButton_iconBtn")
    public void span___page2_navButton_iconBtn_Action_click() {
        span___page2_navButton_iconBtn = driver.findElement(locator.getLocator("span___page2_navButton_iconBtn"));
        clickOnElement(span___page2_navButton_iconBtn);
    }

    @Step("Click on the webelement button___page2_navButton")
    public String button___page2_navButton_getText() {
        return driver.findElement(locator.getLocator("button___page2_navButton")).getText().trim();
    }

    @Step("Double click on the webelement button___page2_navButton")
    public void button___page2_navButton_click() {
        driver.findElement(locator.getLocator("button___page2_navButton")).click();
    }

    @Step("Click on the webelement span484_Details")
    public String span484_Details_getText() {
        return driver.findElement(locator.getLocator("span484_Details")).getText().trim();
    }

    @Step("Click on the webelement span484_Details")
    public void span484_Details_Action_click() {
        span484_Details = driver.findElement(locator.getLocator("span484_Details"));
        clickOnElement(span484_Details);
    }

    @Step("Click on the webelement span487_Analysis")
    public String span487_Analysis_getText() {
        return driver.findElement(locator.getLocator("span487_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span487_Analysis")
    public void span487_Analysis_Action_click() {
        span487_Analysis = driver.findElement(locator.getLocator("span487_Analysis"));
        clickOnElement(span487_Analysis);
    }

    @Step("Send the value amol  to the webelement input__searchempNameBasic_I")
    public void input__searchempNameBasic_I_sendKeys(String val) {
        driver.findElement(locator.getLocator("input__searchempNameBasic_I")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input__searchempNameBasic_I")).sendKeys(val);
    }

    public String input__searchempNameBasic_I_GetAttribute() {
        return driver.findElement(locator.getLocator("input__searchempNameBasic_I")).getAttribute("value");
    }

    @Step("Click on the webelement bdi___button13_label_bdi")
    public String bdi___button13_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button13_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button13_label_bdi")
    public void bdi___button13_label_bdi_Action_click() {
        bdi___button13_label_bdi = driver.findElement(locator.getLocator("bdi___button13_label_bdi"));
        clickOnElement(bdi___button13_label_bdi);
    }

    @Step("Click on the webelement bdi___box13_label_bdi")
    public String bdi___box13_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box13_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box13_label_bdi")
    public void bdi___box13_label_bdi_Action_click() {
        bdi___box13_label_bdi = driver.findElement(locator.getLocator("bdi___box13_label_bdi"));
        clickOnElement(bdi___box13_label_bdi);
    }

    @Step("Click on the webelement bdi___box17_label_bdi")
    public String bdi___box17_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box17_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box17_label_bdi")
    public void bdi___box17_label_bdi_Action_click() {
        bdi___box17_label_bdi = driver.findElement(locator.getLocator("bdi___box17_label_bdi"));
        clickOnElement(bdi___box17_label_bdi);
    }

    @Step("Click on the webelement bdi___box15_label_bdi")
    public String bdi___box15_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___box15_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___box15_label_bdi")
    public void bdi___box15_label_bdi_Action_click() {
        bdi___box15_label_bdi = driver.findElement(locator.getLocator("bdi___box15_label_bdi"));
        clickOnElement(bdi___box15_label_bdi);
    }

    @Step("Click on the webelement div164_sap")
    public void div164_sap_Action_click() {
        div164_sap = driver.findElement(locator.getLocator("div164_sap"));
        clickOnElement(div164_sap);
    }

    @Step("Click on the webelement span___text97")
    public String span___text97_getText() {
        return driver.findElement(locator.getLocator("span___text97")).getText().trim();
    }

    @Step("Click on the webelement span___text97")
    public void span___text97_Action_click() {
        span___text97 = driver.findElement(locator.getLocator("span___text97"));
        clickOnElement(span___text97);
    }

    @Step("Capture the runtime value of the webelement span___text97 into the variable incidentId2")
    public String span___text97_captureValue() {
        String capturedValue = "";
        String lastSeenText = "";
        String capturePattern = "\\b[A-Za-z]{3,}-[A-Za-z]{8,}-\\d{3,}-\\d{4,}\\b";
        long deadline = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < deadline) {
            java.util.List<WebElement> found = driver.findElements(locator.getLocator("span___text97"));
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
            throw new IllegalStateException("Could not capture a runtime value for 'incidentId2' from the element span___text97. Text on screen was: '" + lastSeenText + "'. Capture pattern: '" + capturePattern + "'.");
        }
        return capturedValue;
    }

    @Step("Click on the webelement bdi___button55_BDI_content")
    public String bdi___button55_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button55_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button55_BDI_content")
    public void bdi___button55_BDI_content_Action_click() {
        bdi___button55_BDI_content = driver.findElement(locator.getLocator("bdi___button55_BDI_content"));
        clickOnElement(bdi___button55_BDI_content);
    }

    @Step("Click on the webelement li___item80_IdInjuryCat_3")
    public String li___item80_IdInjuryCat_3_getText() {
        return driver.findElement(locator.getLocator("li___item80_IdInjuryCat_3")).getText().trim();
    }

    @Step("Double click on the webelement li___item80_IdInjuryCat_3")
    public void li___item80_IdInjuryCat_3_click() {
        driver.findElement(locator.getLocator("li___item80_IdInjuryCat_3")).click();
    }

    @Step("Click on the webelement bdi___button61_BDI_content")
    public String bdi___button61_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___button61_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___button61_BDI_content")
    public void bdi___button61_BDI_content_Action_click() {
        bdi___button61_BDI_content = driver.findElement(locator.getLocator("bdi___button61_BDI_content"));
        clickOnElement(bdi___button61_BDI_content);
    }

    @Step("Click on the webelement div___label116__FE__RFLayout_row0")
    public String div___label116__FE__RFLayout_row0_getText() {
        return driver.findElement(locator.getLocator("div___label116__FE__RFLayout_row0")).getText().trim();
    }

    @Step("Click on the webelement div___label116__FE__RFLayout_row0")
    public void div___label116__FE__RFLayout_row0_Action_click() {
        div___label116__FE__RFLayout_row0 = driver.findElement(locator.getLocator("div___label116__FE__RFLayout_row0"));
        clickOnElement(div___label116__FE__RFLayout_row0);
    }

    @Step("Click on the webelement div___form4__Form__RFLayout_row0")
    public String div___form4__Form__RFLayout_row0_getText() {
        return driver.findElement(locator.getLocator("div___form4__Form__RFLayout_row0")).getText().trim();
    }

    @Step("Click on the webelement div___form4__Form__RFLayout_row0")
    public void div___form4__Form__RFLayout_row0_Action_click() {
        div___form4__Form__RFLayout_row0 = driver.findElement(locator.getLocator("div___form4__Form__RFLayout_row0"));
        clickOnElement(div___form4__Form__RFLayout_row0);
    }

    @Step("Click on the webelement li___item154")
    public String li___item154_getText() {
        return driver.findElement(locator.getLocator("li___item154")).getText().trim();
    }

    @Step("Double click on the webelement li___item154")
    public void li___item154_click() {
        driver.findElement(locator.getLocator("li___item154")).click();
    }

    @Step("Click on the webelement div171_Lack_of_Skill")
    public String div171_Lack_of_Skill_getText() {
        return driver.findElement(locator.getLocator("div171_Lack_of_Skill")).getText().trim();
    }

    @Step("Click on the webelement div171_Lack_of_Skill")
    public void div171_Lack_of_Skill_Action_click() {
        div171_Lack_of_Skill = driver.findElement(locator.getLocator("div171_Lack_of_Skill"));
        clickOnElement(div171_Lack_of_Skill);
    }

    @Step("Click on the webelement div168_Infrequent_p")
    public String div168_Infrequent_p_getText() {
        return driver.findElement(locator.getLocator("div168_Infrequent_p")).getText().trim();
    }

    @Step("Click on the webelement div168_Infrequent_p")
    public void div168_Infrequent_p_Action_click() {
        div168_Infrequent_p = driver.findElement(locator.getLocator("div168_Infrequent_p"));
        clickOnElement(div168_Infrequent_p);
    }

    @Step("Click on the webelement div174_Emergency_Pr")
    public String div174_Emergency_Pr_getText() {
        return driver.findElement(locator.getLocator("div174_Emergency_Pr")).getText().trim();
    }

    @Step("Click on the webelement div174_Emergency_Pr")
    public void div174_Emergency_Pr_Action_click() {
        div174_Emergency_Pr = driver.findElement(locator.getLocator("div174_Emergency_Pr"));
        clickOnElement(div174_Emergency_Pr);
    }

    @Step("Click on the webelement li___item162___clone718")
    public String li___item162___clone718_getText() {
        return driver.findElement(locator.getLocator("li___item162___clone718")).getText().trim();
    }

    @Step("Double click on the webelement li___item162___clone718")
    public void li___item162___clone718_click() {
        driver.findElement(locator.getLocator("li___item162___clone718")).click();
    }

    @Step("Click on the webelement span62_7")
    public String span62_7_getText() {
        return driver.findElement(locator.getLocator("span62_7")).getText().trim();
    }

    @Step("Click on the webelement span62_7")
    public void span62_7_Action_click() {
        span62_7 = driver.findElement(locator.getLocator("span62_7"));
        clickOnElement(span62_7);
    }

    @Step("Click on the webelement span106_7")
    public String span106_7_getText() {
        return driver.findElement(locator.getLocator("span106_7")).getText().trim();
    }

    @Step("Click on the webelement span106_7")
    public void span106_7_Action_click() {
        span106_7 = driver.findElement(locator.getLocator("span106_7"));
        clickOnElement(span106_7);
    }

    @Step("Click on the webelement bdi___button33_label_bdi")
    public String bdi___button33_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button33_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button33_label_bdi")
    public void bdi___button33_label_bdi_Action_click() {
        bdi___button33_label_bdi = driver.findElement(locator.getLocator("bdi___button33_label_bdi"));
        clickOnElement(bdi___button33_label_bdi);
    }

    @Step("Click on the webelement div38_Caught_On__S")
    public String div38_Caught_On__S_getText() {
        return driver.findElement(locator.getLocator("div38_Caught_On__S")).getText().trim();
    }

    @Step("Click on the webelement div38_Caught_On__S")
    public void div38_Caught_On__S_Action_click() {
        div38_Caught_On__S = driver.findElement(locator.getLocator("div38_Caught_On__S"));
        clickOnElement(div38_Caught_On__S);
    }

    @Step("Click on the webelement div48_Improper_Pos")
    public String div48_Improper_Pos_getText() {
        return driver.findElement(locator.getLocator("div48_Improper_Pos")).getText().trim();
    }

    @Step("Click on the webelement div48_Improper_Pos")
    public void div48_Improper_Pos_Action_click() {
        div48_Improper_Pos = driver.findElement(locator.getLocator("div48_Improper_Pos"));
        clickOnElement(div48_Improper_Pos);
    }

    @Step("Click on the webelement div67_Lack_of_Know")
    public String div67_Lack_of_Know_getText() {
        return driver.findElement(locator.getLocator("div67_Lack_of_Know")).getText().trim();
    }

    @Step("Click on the webelement div67_Lack_of_Know")
    public void div67_Lack_of_Know_Action_click() {
        div67_Lack_of_Know = driver.findElement(locator.getLocator("div67_Lack_of_Know"));
        clickOnElement(div67_Lack_of_Know);
    }

    @Step("Click on the webelement div64_Inadequate_i")
    public String div64_Inadequate_i_getText() {
        return driver.findElement(locator.getLocator("div64_Inadequate_i")).getText().trim();
    }

    @Step("Click on the webelement div64_Inadequate_i")
    public void div64_Inadequate_i_Action_click() {
        div64_Inadequate_i = driver.findElement(locator.getLocator("div64_Inadequate_i"));
        clickOnElement(div64_Inadequate_i);
    }

    @Step("Click on the webelement li___item45___clone594")
    public String li___item45___clone594_getText() {
        return driver.findElement(locator.getLocator("li___item45___clone594")).getText().trim();
    }

    @Step("Double click on the webelement li___item45___clone594")
    public void li___item45___clone594_click() {
        driver.findElement(locator.getLocator("li___item45___clone594")).click();
    }

    @Step("Click on the webelement li___item46___clone609")
    public String li___item46___clone609_getText() {
        return driver.findElement(locator.getLocator("li___item46___clone609")).getText().trim();
    }

    @Step("Double click on the webelement li___item46___clone609")
    public void li___item46___clone609_click() {
        driver.findElement(locator.getLocator("li___item46___clone609")).click();
    }

    @Step("Click on the webelement div50_Manpower")
    public String div50_Manpower_getText() {
        return driver.findElement(locator.getLocator("div50_Manpower")).getText().trim();
    }

    @Step("Click on the webelement div50_Manpower")
    public void div50_Manpower_Action_click() {
        div50_Manpower = driver.findElement(locator.getLocator("div50_Manpower"));
        clickOnElement(div50_Manpower);
    }

    @Step("Click on the webelement span___text100___clone624")
    public String span___text100___clone624_getText() {
        return driver.findElement(locator.getLocator("span___text100___clone624")).getText().trim();
    }

    @Step("Click on the webelement span___text100___clone624")
    public void span___text100___clone624_Action_click() {
        span___text100___clone624 = driver.findElement(locator.getLocator("span___text100___clone624"));
        clickOnElement(span___text100___clone624);
    }

    @Step("Double click on the webelement input___picker8___clone431_inner")
    public void input___picker8___clone431_inner_click() {
        driver.findElement(locator.getLocator("input___picker8___clone431_inner")).click();
    }

    @Step("Send the value 09/07/2026 to the webelement input___picker8___clone431_inner")
    public void input___picker8___clone431_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker8___clone431_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker8___clone431_inner")).sendKeys(val);
    }

    public String input___picker8___clone431_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker8___clone431_inner")).getAttribute("value");
    }

    @Step("Send the value 09/07/2026 to the webelement input___picker9_inner")
    public void input___picker9_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker9_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker9_inner")).sendKeys(val);
    }

    public String input___picker9_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker9_inner")).getAttribute("value");
    }

    @Step("Click on the webelement div___list3_2_logoutBtn_content")
    public String div___list3_2_logoutBtn_content_getText() {
        return driver.findElement(locator.getLocator("div___list3_2_logoutBtn_content")).getText().trim();
    }

    @Step("Click on the webelement div___list3_2_logoutBtn_content")
    public void div___list3_2_logoutBtn_content_Action_click() {
        div___list3_2_logoutBtn_content = driver.findElement(locator.getLocator("div___list3_2_logoutBtn_content"));
        clickOnElement(div___list3_2_logoutBtn_content);
    }

    @Step("Click on the webelement img_shell_header_icon")
    public void img_shell_header_icon_Action_click() {
        img_shell_header_icon = driver.findElement(locator.getLocator("img_shell_header_icon"));
        clickOnElement(img_shell_header_icon);
    }

    @Step("Click on the webelement div403_sap")
    public void div403_sap_Action_click() {
        div403_sap = driver.findElement(locator.getLocator("div403_sap"));
        clickOnElement(div403_sap);
    }

    @Step("Click on the webelement span___input19_vhi")
    public void span___input19_vhi_Action_click() {
        span___input19_vhi = driver.findElement(locator.getLocator("span___input19_vhi"));
        clickOnElement(span___input19_vhi);
    }

    @Step("Click on the webelement span___text97___clone624")
    public String span___text97___clone624_getText() {
        return driver.findElement(locator.getLocator("span___text97___clone624")).getText().trim();
    }

    @Step("Click on the webelement span___text97___clone624")
    public void span___text97___clone624_Action_click() {
        span___text97___clone624 = driver.findElement(locator.getLocator("span___text97___clone624"));
        clickOnElement(span___text97___clone624);
    }

    @Step("Click on the webelement li___item131")
    public String li___item131_getText() {
        return driver.findElement(locator.getLocator("li___item131")).getText().trim();
    }

    @Step("Double click on the webelement li___item131")
    public void li___item131_click() {
        driver.findElement(locator.getLocator("li___item131")).click();
    }

    @Step("Click on the webelement span___picker8_icon")
    public void span___picker8_icon_Action_click() {
        span___picker8_icon = driver.findElement(locator.getLocator("span___picker8_icon"));
        clickOnElement(span___picker8_icon);
    }

    @Step("Click on the webelement bdi___picker8_OK_BDI_content")
    public String bdi___picker8_OK_BDI_content_getText() {
        return driver.findElement(locator.getLocator("bdi___picker8_OK_BDI_content")).getText().trim();
    }

    @Step("Click on the webelement bdi___picker8_OK_BDI_content")
    public void bdi___picker8_OK_BDI_content_Action_click() {
        bdi___picker8_OK_BDI_content = driver.findElement(locator.getLocator("bdi___picker8_OK_BDI_content"));
        clickOnElement(bdi___picker8_OK_BDI_content);
    }

    @Step("Click on the webelement div___list6_2_logoutBtn_content")
    public String div___list6_2_logoutBtn_content_getText() {
        return driver.findElement(locator.getLocator("div___list6_2_logoutBtn_content")).getText().trim();
    }

    @Step("Click on the webelement div___list6_2_logoutBtn_content")
    public void div___list6_2_logoutBtn_content_Action_click() {
        div___list6_2_logoutBtn_content = driver.findElement(locator.getLocator("div___list6_2_logoutBtn_content"));
        clickOnElement(div___list6_2_logoutBtn_content);
    }

    @Step("Click on the webelement span126_Details")
    public String span126_Details_getText() {
        return driver.findElement(locator.getLocator("span126_Details")).getText().trim();
    }

    @Step("Click on the webelement span126_Details")
    public void span126_Details_Action_click() {
        span126_Details = driver.findElement(locator.getLocator("span126_Details"));
        clickOnElement(span126_Details);
    }

    @Step("Click on the webelement div___filter5_text")
    public String div___filter5_text_getText() {
        return driver.findElement(locator.getLocator("div___filter5_text")).getText().trim();
    }

    @Step("Click on the webelement div___filter5_text")
    public void div___filter5_text_Action_click() {
        div___filter5_text = driver.findElement(locator.getLocator("div___filter5_text"));
        clickOnElement(div___filter5_text);
    }

    @Step("Click on the webelement bdi___button41_label_bdi")
    public String bdi___button41_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button41_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button41_label_bdi")
    public void bdi___button41_label_bdi_Action_click() {
        bdi___button41_label_bdi = driver.findElement(locator.getLocator("bdi___button41_label_bdi"));
        clickOnElement(bdi___button41_label_bdi);
    }

    @Step("Click on the webelement bdi___button44_label_bdi")
    public String bdi___button44_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button44_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button44_label_bdi")
    public void bdi___button44_label_bdi_Action_click() {
        bdi___button44_label_bdi = driver.findElement(locator.getLocator("bdi___button44_label_bdi"));
        clickOnElement(bdi___button44_label_bdi);
    }

    @Step("Click on the webelement span___input35___clone517_vhi")
    public void span___input35___clone517_vhi_Action_click() {
        span___input35___clone517_vhi = driver.findElement(locator.getLocator("span___input35___clone517_vhi"));
        clickOnElement(span___input35___clone517_vhi);
    }

    @Step("Click on the webelement div41_Contact_with")
    public String div41_Contact_with_getText() {
        return driver.findElement(locator.getLocator("div41_Contact_with")).getText().trim();
    }

    @Step("Click on the webelement div41_Contact_with")
    public void div41_Contact_with_Action_click() {
        div41_Contact_with = driver.findElement(locator.getLocator("div41_Contact_with"));
        clickOnElement(div41_Contact_with);
    }

    @Step("Click on the webelement span___box27___clone518_arrow")
    public void span___box27___clone518_arrow_Action_click() {
        span___box27___clone518_arrow = driver.findElement(locator.getLocator("span___box27___clone518_arrow"));
        clickOnElement(span___box27___clone518_arrow);
    }

    @Step("Click on the webelement span___input36___clone519_vhi")
    public void span___input36___clone519_vhi_Action_click() {
        span___input36___clone519_vhi = driver.findElement(locator.getLocator("span___input36___clone519_vhi"));
        clickOnElement(span___input36___clone519_vhi);
    }

    @Step("Click on the webelement div54_Making_Safet")
    public String div54_Making_Safet_getText() {
        return driver.findElement(locator.getLocator("div54_Making_Safet")).getText().trim();
    }

    @Step("Click on the webelement div54_Making_Safet")
    public void div54_Making_Safet_Action_click() {
        div54_Making_Safet = driver.findElement(locator.getLocator("div54_Making_Safet"));
        clickOnElement(div54_Making_Safet);
    }

    @Step("Click on the webelement span___box28___clone520_arrow")
    public void span___box28___clone520_arrow_Action_click() {
        span___box28___clone520_arrow = driver.findElement(locator.getLocator("span___box28___clone520_arrow"));
        clickOnElement(span___box28___clone520_arrow);
    }

    @Step("Click on the webelement span___input37___clone521_vhi")
    public void span___input37___clone521_vhi_Action_click() {
        span___input37___clone521_vhi = driver.findElement(locator.getLocator("span___input37___clone521_vhi"));
        clickOnElement(span___input37___clone521_vhi);
    }

    @Step("Click on the webelement div64_Lack_of_Know")
    public String div64_Lack_of_Know_getText() {
        return driver.findElement(locator.getLocator("div64_Lack_of_Know")).getText().trim();
    }

    @Step("Click on the webelement div64_Lack_of_Know")
    public void div64_Lack_of_Know_Action_click() {
        div64_Lack_of_Know = driver.findElement(locator.getLocator("div64_Lack_of_Know"));
        clickOnElement(div64_Lack_of_Know);
    }

    @Step("Click on the webelement span___input38___clone522_vhi")
    public void span___input38___clone522_vhi_Action_click() {
        span___input38___clone522_vhi = driver.findElement(locator.getLocator("span___input38___clone522_vhi"));
        clickOnElement(span___input38___clone522_vhi);
    }

    @Step("Click on the webelement span___input39___clone523_vhi")
    public void span___input39___clone523_vhi_Action_click() {
        span___input39___clone523_vhi = driver.findElement(locator.getLocator("span___input39___clone523_vhi"));
        clickOnElement(span___input39___clone523_vhi);
    }

    @Step("Click on the webelement div67_Task_Observa")
    public String div67_Task_Observa_getText() {
        return driver.findElement(locator.getLocator("div67_Task_Observa")).getText().trim();
    }

    @Step("Click on the webelement div67_Task_Observa")
    public void div67_Task_Observa_Action_click() {
        div67_Task_Observa = driver.findElement(locator.getLocator("div67_Task_Observa"));
        clickOnElement(div67_Task_Observa);
    }

    @Step("Click on the webelement span___input40___clone524_vhi")
    public void span___input40___clone524_vhi_Action_click() {
        span___input40___clone524_vhi = driver.findElement(locator.getLocator("span___input40___clone524_vhi"));
        clickOnElement(span___input40___clone524_vhi);
    }

    @Step("Click on the webelement div64_Level_of_Com")
    public String div64_Level_of_Com_getText() {
        return driver.findElement(locator.getLocator("div64_Level_of_Com")).getText().trim();
    }

    @Step("Click on the webelement div64_Level_of_Com")
    public void div64_Level_of_Com_Action_click() {
        div64_Level_of_Com = driver.findElement(locator.getLocator("div64_Level_of_Com"));
        clickOnElement(div64_Level_of_Com);
    }

    @Step("Click on the webelement span___input41___clone525_vhi")
    public void span___input41___clone525_vhi_Action_click() {
        span___input41___clone525_vhi = driver.findElement(locator.getLocator("span___input41___clone525_vhi"));
        clickOnElement(span___input41___clone525_vhi);
    }

    @Step("Click on the webelement span___input42___clone527_vhi")
    public void span___input42___clone527_vhi_Action_click() {
        span___input42___clone527_vhi = driver.findElement(locator.getLocator("span___input42___clone527_vhi"));
        clickOnElement(span___input42___clone527_vhi);
    }

    @Step("Click on the webelement span___text108___clone719")
    public String span___text108___clone719_getText() {
        return driver.findElement(locator.getLocator("span___text108___clone719")).getText().trim();
    }

    @Step("Click on the webelement span___text108___clone719")
    public void span___text108___clone719_Action_click() {
        span___text108___clone719 = driver.findElement(locator.getLocator("span___text108___clone719"));
        clickOnElement(span___text108___clone719);
    }

    @Step("Click on the webelement span___picker9___clone528_icon")
    public void span___picker9___clone528_icon_Action_click() {
        span___picker9___clone528_icon = driver.findElement(locator.getLocator("span___picker9___clone528_icon"));
        clickOnElement(span___picker9___clone528_icon);
    }

    @Step("Click on the webelement span55_8")
    public String span55_8_getText() {
        return driver.findElement(locator.getLocator("span55_8")).getText().trim();
    }

    @Step("Click on the webelement span55_8")
    public void span55_8_Action_click() {
        span55_8 = driver.findElement(locator.getLocator("span55_8"));
        clickOnElement(span55_8);
    }

    @Step("Double click on the webelement input___picker10_inner")
    public void input___picker10_inner_click() {
        driver.findElement(locator.getLocator("input___picker10_inner")).click();
    }

    @Step("Send the value 09/08/2026 to the webelement input___picker10_inner")
    public void input___picker10_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker10_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker10_inner")).sendKeys(val);
    }

    public String input___picker10_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker10_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span___title8_inner")
    public String span___title8_inner_getText() {
        return driver.findElement(locator.getLocator("span___title8_inner")).getText().trim();
    }

    @Step("Click on the webelement span___title8_inner")
    public void span___title8_inner_Action_click() {
        span___title8_inner = driver.findElement(locator.getLocator("span___title8_inner"));
        clickOnElement(span___title8_inner);
    }

    @Step("Click on the webelement div153_Sign_Out")
    public String div153_Sign_Out_getText() {
        //return driver.findElement(locator.getLocator("div153_Sign_Out")).getText().trim();
        return driver.findElement(By.xpath("//span[@id='meAreaHeaderButton']")).getText().trim();
    }

    @Step("Click on the webelement div153_Sign_Out")
    public void div153_Sign_Out_Action_click() {
        div153_Sign_Out = driver.findElement(locator.getLocator("div153_Sign_Out"));
        clickOnElement(div153_Sign_Out);
    }

    @Step("Click on the webelement bdi___button40_label_bdi")
    public String bdi___button40_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button40_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button40_label_bdi")
    public void bdi___button40_label_bdi_Action_click() {
        bdi___button40_label_bdi = driver.findElement(locator.getLocator("bdi___button40_label_bdi"));
        clickOnElement(bdi___button40_label_bdi);
    }

    @Step("Click on the webelement bdi___button43_label_bdi")
    public String bdi___button43_label_bdi_getText() {
        return driver.findElement(locator.getLocator("bdi___button43_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button43_label_bdi")
    public void bdi___button43_label_bdi_Action_click() {
        bdi___button43_label_bdi = driver.findElement(locator.getLocator("bdi___button43_label_bdi"));
        clickOnElement(bdi___button43_label_bdi);
    }

    @Step("Click on the webelement div13_Substandard_")
    public String div13_Substandard__getText() {
        return driver.findElement(locator.getLocator("div13_Substandard_")).getText().trim();
    }

    @Step("Click on the webelement div13_Substandard_")
    public void div13_Substandard__Action_click() {
        div13_Substandard_ = driver.findElement(locator.getLocator("div13_Substandard_"));
        clickOnElement(div13_Substandard_);
    }

    @Step("Click on the webelement div54_Inadequate_G")
    public String div54_Inadequate_G_getText() {
        return driver.findElement(locator.getLocator("div54_Inadequate_G")).getText().trim();
    }

    @Step("Click on the webelement div54_Inadequate_G")
    public void div54_Inadequate_G_Action_click() {
        div54_Inadequate_G = driver.findElement(locator.getLocator("div54_Inadequate_G"));
        clickOnElement(div54_Inadequate_G);
    }

    @Step("Click on the webelement div64_Lack_of_ince")
    public String div64_Lack_of_ince_getText() {
        return driver.findElement(locator.getLocator("div64_Lack_of_ince")).getText().trim();
    }

    @Step("Click on the webelement div64_Lack_of_ince")
    public void div64_Lack_of_ince_Action_click() {
        div64_Lack_of_ince = driver.findElement(locator.getLocator("div64_Lack_of_ince"));
        clickOnElement(div64_Lack_of_ince);
    }

    @Step("Click on the webelement div64_Task_Analysi")
    public String div64_Task_Analysi_getText() {
        return driver.findElement(locator.getLocator("div64_Task_Analysi")).getText().trim();
    }

    @Step("Click on the webelement div64_Task_Analysi")
    public void div64_Task_Analysi_Action_click() {
        //        div64_Task_Analysi = driver.findElement(locator.getLocator("div64_Task_Analysi"));
        //        clickOnElement(div64_Task_Analysi);
        //
        driver.findElement(locator.getLocator("div64_Task_Analysi")).click();
    }

    @Step("Click on the webelement span___text108___clone703")
    public String span___text108___clone703_getText() {
        return driver.findElement(locator.getLocator("span___text108___clone703")).getText().trim();
    }

    @Step("Click on the webelement span___text108___clone703")
    public void span___text108___clone703_Action_click() {
        span___text108___clone703 = driver.findElement(locator.getLocator("span___text108___clone703"));
        clickOnElement(span___text108___clone703);
    }

    @Step("Double click on the webelement input___picker9___clone508_inner")
    public void input___picker9___clone508_inner_click() {
        driver.findElement(locator.getLocator("input___picker9___clone508_inner")).click();
    }

    @Step("Send the value 09/09/2026 to the webelement input___picker9___clone508_inner")
    public void input___picker9___clone508_inner_sendKeys(String val) {
        driver.findElement(locator.getLocator("input___picker9___clone508_inner")).sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
        driver.findElement(locator.getLocator("input___picker9___clone508_inner")).sendKeys(val);
    }

    public String input___picker9___clone508_inner_GetAttribute() {
        return driver.findElement(locator.getLocator("input___picker9___clone508_inner")).getAttribute("value");
    }

    @Step("Click on the webelement span124_24_Hour_Alert")
    public String span124_24_Hour_Alert_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span124_24_Hour_Alert", 30);
        return driver.findElement(locator.getLocator("span124_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span124_24_Hour_Alert")
    public void span124_24_Hour_Alert_Action_click() {
        span124_24_Hour_Alert = driver.findElement(locator.getLocator("span124_24_Hour_Alert"));
        clickOnElement(span124_24_Hour_Alert);
    }

    @Step("Click on the webelement span127_Details")
    public String span127_Details_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span127_Details", 30);
        return driver.findElement(locator.getLocator("span127_Details")).getText().trim();
    }

    @Step("Click on the webelement span127_Details")
    public void span127_Details_Action_click() {
        span127_Details = driver.findElement(locator.getLocator("span127_Details"));
        clickOnElement(span127_Details);
    }

    @Step("Click on the webelement bdi___button21_label_bdi")
    public String bdi___button21_label_bdi_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("bdi___button21_label_bdi", 30);
        return driver.findElement(locator.getLocator("bdi___button21_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button21_label_bdi")
    public void bdi___button21_label_bdi_Action_click() {
        bdi___button21_label_bdi = driver.findElement(locator.getLocator("bdi___button21_label_bdi"));
        clickOnElement(bdi___button21_label_bdi);
    }

    @Step("Click on the webelement bdi___button24_label_bdi")
    public String bdi___button24_label_bdi_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("bdi___button24_label_bdi", 30);
        return driver.findElement(locator.getLocator("bdi___button24_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button24_label_bdi")
    public void bdi___button24_label_bdi_Action_click() {
        bdi___button24_label_bdi = driver.findElement(locator.getLocator("bdi___button24_label_bdi"));
        clickOnElement(bdi___button24_label_bdi);
    }

    @Step("Click on the webelement span140_Analysis")
    public String span140_Analysis_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span140_Analysis", 30);
        return driver.findElement(locator.getLocator("span140_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span140_Analysis")
    public void span140_Analysis_Action_click() {
        span140_Analysis = driver.findElement(locator.getLocator("span140_Analysis"));
        clickOnElement(span140_Analysis);
    }

    @Step("Click on the webelement bdi___button42_label_bdi")
    public String bdi___button42_label_bdi_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("bdi___button42_label_bdi", 30);
        return driver.findElement(locator.getLocator("bdi___button42_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button42_label_bdi")
    public void bdi___button42_label_bdi_Action_click() {
        bdi___button42_label_bdi = driver.findElement(locator.getLocator("bdi___button42_label_bdi"));
        clickOnElement(bdi___button42_label_bdi);
    }

    @Step("Click on the webelement bdi___button46_label_bdi")
    public String bdi___button46_label_bdi_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("bdi___button46_label_bdi", 30);
        return driver.findElement(locator.getLocator("bdi___button46_label_bdi")).getText().trim();
    }

    @Step("Click on the webelement bdi___button46_label_bdi")
    public void bdi___button46_label_bdi_Action_click() {
        bdi___button46_label_bdi = driver.findElement(locator.getLocator("bdi___button46_label_bdi"));
        clickOnElement(bdi___button46_label_bdi);
    }

    @Step("Click on the webelement li___item157___clone697")
    public String li___item157___clone697_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("li___item157___clone697", 30);
        return driver.findElement(locator.getLocator("li___item157___clone697")).getText().trim();
    }

    @Step("Double click on the webelement li___item157___clone697")
    public void li___item157___clone697_click() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsClickable("li___item157___clone697", 30);
        driver.findElement(locator.getLocator("li___item157___clone697")).click();
        wait.waitForPageLoad(driver);
    }

    @Step("Click on the webelement div171_Task_Observa")
    public String div171_Task_Observa_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("div171_Task_Observa", 30);
        return driver.findElement(locator.getLocator("div171_Task_Observa")).getText().trim();
    }

    @Step("Click on the webelement div171_Task_Observa")
    public void div171_Task_Observa_Action_click() {
        div171_Task_Observa = driver.findElement(locator.getLocator("div171_Task_Observa"));
        clickOnElement(div171_Task_Observa);
    }

    @Step("Click on the webelement div168_Level_of_Com")
    public String div168_Level_of_Com_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("div168_Level_of_Com", 30);
        return driver.findElement(locator.getLocator("div168_Level_of_Com")).getText().trim();
    }

    @Step("Click on the webelement div168_Level_of_Com")
    public void div168_Level_of_Com_Action_click() {
        div168_Level_of_Com = driver.findElement(locator.getLocator("div168_Level_of_Com"));
        clickOnElement(div168_Level_of_Com);
    }

    @Step("Click on the webelement span___text116___clone729")
    public String span___text116___clone729_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span___text116___clone729", 30);
        return driver.findElement(locator.getLocator("span___text116___clone729")).getText().trim();
    }

    @Step("Click on the webelement span___text116___clone729")
    public void span___text116___clone729_Action_click() {
        span___text116___clone729 = driver.findElement(locator.getLocator("span___text116___clone729"));
        clickOnElement(span___text116___clone729);
    }

    @Step("Click on the webelement span80_23")
    public String span80_23_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span80_23", 30);
        return driver.findElement(locator.getLocator("span80_23")).getText().trim();
    }

    @Step("Click on the webelement span80_23")
    public void span80_23_Action_click() {
        span80_23 = driver.findElement(locator.getLocator("span80_23"));
        clickOnElement(span80_23);
    }

    @Step("Click on the webelement span122_23")
    public String span122_23_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span122_23", 30);
        return driver.findElement(locator.getLocator("span122_23")).getText().trim();
    }

    @Step("Click on the webelement span122_23")
    public void span122_23_Action_click() {
        span122_23 = driver.findElement(locator.getLocator("span122_23"));
        clickOnElement(span122_23);
    }

    @Step("Click on the webelement span___text121")
    public String span___text121_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span___text121", 30);
        return driver.findElement(locator.getLocator("span___text121")).getText().trim();
    }

    @Step("Click on the webelement span___text121")
    public void span___text121_Action_click() {
        span___text121 = driver.findElement(locator.getLocator("span___text121"));
        clickOnElement(span___text121);
    }

    @Step("Click on the webelement span129_24_Hour_Alert")
    public String span129_24_Hour_Alert_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span129_24_Hour_Alert", 30);
        return driver.findElement(locator.getLocator("span129_24_Hour_Alert")).getText().trim();
    }

    @Step("Click on the webelement span129_24_Hour_Alert")
    public void span129_24_Hour_Alert_Action_click() {
        span129_24_Hour_Alert = driver.findElement(locator.getLocator("span129_24_Hour_Alert"));
        clickOnElement(span129_24_Hour_Alert);
    }

    @Step("Click on the webelement span132_Details")
    public String span132_Details_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span132_Details", 30);
        return driver.findElement(locator.getLocator("span132_Details")).getText().trim();
    }

    @Step("Click on the webelement span132_Details")
    public void span132_Details_Action_click() {
        span132_Details = driver.findElement(locator.getLocator("span132_Details"));
        clickOnElement(span132_Details);
    }

    @Step("Click on the webelement span135_Analysis")
    public String span135_Analysis_getText() {
        DriverWait wait = new DriverWait(driver, locator);
        wait.waitForPageLoad(driver);
        wait.waitUntilElementWithLocatorIsVisible("span135_Analysis", 30);
        return driver.findElement(locator.getLocator("span135_Analysis")).getText().trim();
    }

    @Step("Click on the webelement span135_Analysis")
    public void span135_Analysis_Action_click() {
        span135_Analysis = driver.findElement(locator.getLocator("span135_Analysis"));
        clickOnElement(span135_Analysis);
    }
}
