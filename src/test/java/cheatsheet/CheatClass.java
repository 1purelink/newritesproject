package cheatsheet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by man on 6/30/16.
 */
public class CheatClass {

    WebDriver driver;

    @Test
    public boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Test
    public void seleniumInterview() throws IOException {

        driver = new FirefoxDriver();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        Alert text = driver.switchTo().alert();
        String alertText = text.getText();

        System.out.println("-----------------"); //starting web browser

        driver.switchTo().frame(0); //index
        driver.switchTo().frame("frame"); //name
        driver.switchTo().frame(driver.findElement(By.id(""))); //element

        System.out.println("--------------"); //switching windows and frames

        String parentWindow = driver.getWindowHandle(); //will give you parent window
        Set<String> allWindows = driver.getWindowHandles(); //will return all windows
        Iterator<String> windowIterator = allWindows.iterator();
        String pwin = windowIterator.next(); //first window
        String cwin = windowIterator.next(); //next windows
        driver.switchTo().window(pwin);
        driver.switchTo().window(cwin);
        driver.switchTo().defaultContent(); //will return to default window

        System.out.println("------------------"); //waits

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //implicit wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))); //explicit wait

        System.out.println("---------------------"); //Action class

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id(""))).build().perform(); //move mouse to element
        act.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id(""))); //drag and drop
        act.contextClick(); //right click

        System.out.println("------------------"); //select class

        Select sel = new Select(driver.findElement(By.id(""))); //dropdown selection
        sel.selectByVisibleText(""); //by visible text
        sel.deselectByValue(""); //by value
        sel.deselectByIndex(0); //by index
        List<WebElement> op = sel.getOptions();

        System.out.println("---------------"); //screenshot

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("Users/location/filename.jpg"));

        System.out.println("-----------------------------------"); //window positions

        driver.manage().window().getPosition().getX();
        driver.manage().window().getPosition().getY();
        Point position = driver.manage().window().getPosition();
        position.getX();
        position.getY();

        System.out.println("-----------"); //navigation

        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().to("url");

        System.out.println("------------"); //get page info

        driver.getCurrentUrl();
        driver.getTitle();
        driver.getPageSource();

        System.out.println("--------------"); //group of elements

        int size = driver.findElements(By.xpath("")).size();
        driver.findElements(By.xpath("")).get(5);

        System.out.println("----------------"); //siblings

        driver.findElement(By.xpath("//div[@name='somename']/following-sibling::td[2]"));
        driver.findElement(By.xpath("//div[@name='somename']/preceding-sibling::td[2]"));

        System.out.println("---------------"); //checkbox

        driver.findElement(By.id("")).isSelected();
        driver.findElement(By.xpath("")).isEnabled();
        driver.findElement(By.xpath("")).isDisplayed();

        System.out.println("---------------"); //JavaScript

        JavascriptExecutor jsex = (JavascriptExecutor)driver;
        jsex.executeScript("java script");

        System.out.println("----------------");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().ime().isActivated();

        System.out.println("----------------");
        driver.findElement(By.xpath("")).getAttribute("");
        driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("")).sendKeys(Keys.SHIFT);
        driver.findElement(By.xpath("")).submit();
        driver.findElement(By.xpath("")).clear();

        System.out.println("--------------------"); //autoit
        Runtime.getRuntime().exec("");

    }

}
