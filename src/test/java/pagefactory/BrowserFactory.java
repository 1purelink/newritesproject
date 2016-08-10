package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by man on 6/29/16.
 */
public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver srartBrowser(String browserName, String url){
        if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("IE")){
            driver =new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
