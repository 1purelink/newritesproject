package ritestest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by man on 7/8/16.
 */
public class LuLesson {

    @Test
    public void google() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Ulugbek Sultanov");
        driver.findElement(By.id("sblsbb")).click();
        Thread.sleep(4000L);
        driver.findElement(By.xpath("//a[contains(., 'Ulugbek Sultanov Profiles | Facebook')]")).click();
        driver.quit();
    }

}
