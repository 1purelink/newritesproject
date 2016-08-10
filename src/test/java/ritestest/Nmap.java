package ritestest;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by man on 8/1/16.
 */
public class Nmap {
    @Test
    public void cheetsheetNmap() throws InterruptedException, IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://hackertarget.com/nmap-cheatsheet-a-quick-reference-guide/");
        driver.manage().window().maximize();
        Thread.sleep(3000L);

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("/Users/man/Desktop/namp_cheet_sheet.jpg"));

        driver.quit();
    }
}
