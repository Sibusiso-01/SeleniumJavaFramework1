package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@id='input-firstname']")
    WebElement txt_name;
    @FindBy(xpath="//input[@id='input-lastname']")WebElement txt_lastName;
    @FindBy(xpath="//input[@id='input-email']")WebElement txt_email;
    @FindBy(xpath="//input[@id='input-telephone']")WebElement phone_numeber;
    @FindBy(xpath="//input[@id='input-password']")WebElement txt_password;
    @FindBy(xpath="//input[@id='input-confirm']")WebElement txt_confirm_password;
    @FindBy(xpath="//input[@name='agree']") WebElement policy_check_Box;
    @FindBy(xpath="//input[@value='Continue']") WebElement continue_btn;
    @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement actual_message;
    public void setTxt_name(String name) {
        txt_name.sendKeys(name);

    }
    public void setTxt_email(String email) {
        txt_email.sendKeys(email);
    }
    public void setTxt_lastName(String lastName) {
        txt_lastName.sendKeys(lastName);
    }
    public void setPhone_numeber(String number) {
        phone_numeber.sendKeys(number);

    }
    public void setTxt_password(String password) {
        txt_password.sendKeys(password);

    }
    public void setTxt_confirm_password(String confirmPassword) {
        txt_confirm_password.sendKeys(confirmPassword);

    }
    public void setPolicy_check_Box() {
        policy_check_Box.click();

    }
    public void setContinue_btn() {
        continue_btn.click();

    }
    public String getMessage(){
        String m = actual_message.getText();

        return m;
    }
}
