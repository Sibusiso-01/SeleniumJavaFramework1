package TestCases;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExtentReportManager;

public class TC1_User_Registration_Test extends BaseClass {


    @Test

    void user_registration_test()
    {
        test = extent.createTest("TC1_User_Registration_Test Verify User Registration");
        ExtentReportManager.setExtentTest(test);
        try {
            //Navigate to home page and click on my accouth

            test.info("Navigating to the home page.");
            HomePage hp = new HomePage(driver);
            hp.setMy_Account_link();
            hp.setRegister_link();
            Thread.sleep(2000);
            test.info("Navigating to the register page.");
            RegisterPage rp = new RegisterPage(driver);

            //Enter valid details
            test.info("Enter valid user registration details.");
            Thread.sleep(2000);
            rp.setTxt_name("John23");
            rp.setTxt_lastName("Doe23");
            rp.setTxt_email("johndoe23@gmail.com");
            rp.setPhone_numeber("1234567890");
            rp.setTxt_password("Test@1234");
            rp.setTxt_confirm_password("Test@1234");
            Thread.sleep(2000);
            // Confirm by clicking the policy check box
            test.info("Check the policy check box and click the continue button.");
            rp.setPolicy_check_Box();
            rp.setContinue_btn();

            //Verify registration message
            String message = "Your Account Has Been Created!";
            Thread.sleep(2000);
            String actual_message = rp.getMessage();

            test.info("Verify user registration message." + message);
            if (message.equals(actual_message)) {
                test.pass("Registration was successful message was displayed correct : "+ actual_message);
                Assert.assertTrue(true);
            }else {
                test.fail("Registration was successful, but message displayed was incorrect" + actual_message);
                Assert.assertTrue(false);
            }
        }catch (Exception e){
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


}
