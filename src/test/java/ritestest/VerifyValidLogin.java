package ritestest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagefactory.BrowserFactory;
import pagefactory.LoginPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by man on 6/29/16.
 */
public class VerifyValidLogin {

    @Test
    public void checkValidUser() throws IOException {
        WebDriver driver = BrowserFactory.srartBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("/Users/man/Desktop/screenshot.jpg"));

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginWordpress("admin", "demo123");

        File srcFileAfter = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFileAfter, new File("/Users/man/Desktop/screenshotafter.jpg"));
    }
}
