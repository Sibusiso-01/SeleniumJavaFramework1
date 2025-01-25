package TestCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExtentReportManager;

public class TC2_User_Login_Test extends BaseClass {

    @Test
    void userLogin(){
        test = extent.createTest("TC2_User_Login_Test: Verify User Login");
        ExtentReportManager.setExtentTest(test);

        try {
          test.info("Navigate to home page");
            HomePage hp = new HomePage(driver);
            hp.setMy_Account_link();
            hp.setLogin_link();
          test.info("Navigate to login page");
            LoginPage lp = new LoginPage(driver);
            lp.setTxt_email("johndoe23@gmail.com");
            lp.setTxt_password("Test@1234");
            lp.setLogin_btn();
          test.info("Verify user login");
            String expected_message = lp.getMessage();
            String message= "My Account";
            if(message.equals(expected_message)){
                test.pass("The login test has passed");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The login test has failed");
                Assert.assertTrue(false);
            }
        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
