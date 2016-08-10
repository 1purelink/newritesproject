package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by man on 6/28/16.
 */
public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "user_login")
    WebElement username;

    @FindBy(how = How.ID, using = "user_pass")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id='wp-submit']")
    WebElement submitButton;

    @FindBy(how = How.LINK_TEXT, using = "Lost your password")
    WebElement forgetPassword;

    public void loginWordpress(String uid, String pass){
        username.sendKeys(uid);
        password.sendKeys(pass);
        submitButton.click();
    }
}
