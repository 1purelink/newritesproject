package ritestest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by man on 6/22/16.
 */
public class RitesTest {
    WebDriver driver = new FirefoxDriver();
    String url = "http://demo.borland.com/InsuranceWebExtJS/";


    @Test
    public void openbrowser() throws InterruptedException {
        driver.get(url);
        Select dpdwn = new Select(driver.findElement(By.name("quick-link:jump-menu")));
        dpdwn.selectByVisibleText("Auto Quote");
        driver.findElement(By.id("autoquote:zipcode")).sendKeys("23233");
        driver.findElement(By.id("autoquote:e-mail")).sendKeys("my@email.com");
        driver.findElement(By.id("autoquote:vehicle:0")).click();
        driver.findElement(By.id("autoquote:next")).click();
        driver.findElement(By.id("autoquote:age")).sendKeys("32");
        driver.findElement(By.id("autoquote:gender:0")).click();
        driver.findElement(By.id("autoquote:type:0")).click();
        driver.findElement(By.id("autoquote:next")).click();
        driver.findElement(By.id("autoquote:year")).sendKeys("2016");
        Thread.sleep(2000L);
        driver.findElement(By.id("ext-gen4")).click();
        driver.findElement(By.xpath("//div[contains(.,'Lexus')]/div[6]")).click();
        driver.findElement(By.id("ext-gen6")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//div[contains(.,'RX400')]/div[2]")).click();
        driver.findElement(By.id("autoquote:finInfo:0")).click();
        driver.findElement(By.id("autoquote:next")).click();
        driver.quit();
    }
}
