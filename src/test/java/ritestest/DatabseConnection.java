package ritestest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.sql.*;

/**
 * Created by man on 6/23/16.
 */
public class DatabseConnection {
    WebDriver driver;
    @Test
    public void dbconnection() throws ClassNotFoundException, SQLException { 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/test3", "root", "root");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from student");
        while(rs.next()){
            String firstname = rs.getString("first_name");
            String lastname = rs.getString("last_name");
            String email = rs.getString("email");
            String street = rs.getString("street");
            String city = rs.getString("city");
            String state = rs.getString("state");
            String zip = rs.getString("zip");
            String phone = rs.getString("phone");
            String birthdate = rs.getString("birth_date");
            String sex = rs.getString("sex");
            System.out.println(firstname);
            System.out.println(lastname);
            System.out.println(email);
            System.out.println(street);
            System.out.println(city);
            System.out.println(state);
            System.out.println(zip);
            System.out.println(phone);
            System.out.println(birthdate);
            System.out.println(sex);
        }
    }

    @Test
    public void scrShot(){
        driver = new FirefoxDriver();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }

}
