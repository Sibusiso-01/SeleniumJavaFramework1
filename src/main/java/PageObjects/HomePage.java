package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement My_Account_link;
    @FindBy(xpath="//a[normalize-space()='Register']") WebElement Register_link;
    @FindBy(xpath="(//a[normalize-space()='Login'])[1]") WebElement login_link;

    public void setMy_Account_link() {
        My_Account_link.click();
    }

    public void setLogin_link() {
        login_link.click();
    }

    public void setRegister_link() {
        Register_link.click();
    }
}
