package ritestest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by man on 7/3/16.
 */
public class TakeScreenshot {

    @Test
    public void ipadRehab() throws IOException, InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("lst-ib")).sendKeys("risk analyst");
        driver.findElement(By.name("btnG")).click();
        Thread.sleep(3000L);
        driver.findElement(By.id("nmtbi11")).click();
        Thread.sleep(3000L);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("/Users/man/Desktop/risk_analyst_google.jpg"));

        driver.quit();

    }

}
