package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@id='input-email']")
    WebElement txt_email;
    @FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
    @FindBy(xpath="//input[@value='Login']") WebElement login_btn;
    @FindBy(xpath="//h2[normalize-space()='My Account']") WebElement expected_message;


    public void setTxt_email(String email) {
        txt_email.sendKeys(email);
    }

    public void setTxt_password(String password) {
        txt_password.sendKeys(password);
    }

    public void setLogin_btn() {
        login_btn.click();
    }

    public String getMessage() {
        String m = expected_message.getText();
        return m;
    }
}
