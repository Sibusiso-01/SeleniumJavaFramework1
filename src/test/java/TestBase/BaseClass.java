package TestBase;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ExtentReportManager;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    protected static ExtentReports extent;
    protected static ExtentTest test;



    @BeforeClass
    public void setupdriver(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        extent = ExtentReportManager.getExtentReports();
    }

    @AfterClass
    public void teardownd(){

        if (driver != null) {
            driver.quit();
        }
        extent.flush(); // Generate the report after all tests
    }
}

