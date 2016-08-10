package ritestest;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by man on 8/1/16.
 */
public class Cozmo {

    @Test
    public void cozmoScreenshot() throws InterruptedException, IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://anki.com/en-us/cozmo");
        driver.manage().window().maximize();

        Thread.sleep(3000L);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("/Users/man/Desktop/cozmo_robot.jpg"));

        Thread.sleep(3000L);
        driver.quit();
    }
}
