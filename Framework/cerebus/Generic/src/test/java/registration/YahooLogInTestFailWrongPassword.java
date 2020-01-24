package registration;

import com.sun.tools.internal.xjc.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooLogInTestFailWrongPassword {



    @Test
    public void yahooLoginTestFailWrongPassword() throws InterruptedException {

        // set up the driver

        System.setProperty("webdriver.chrome.driver", "/Users/vladmac/IdeaProjects/facebook/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //1. go to yahooHomePage site

        String yahooUrl = "https://www.yahoo.com";
        driver.get(yahooUrl);

        //2. click on sign in button

        driver.findElement(By.id("header-signin-link")).click();

        //3. Fill in the email texBox
        driver.findElement(By.id("login-username")).sendKeys("vladimir0103@yaho.fr");
        Thread.sleep(2000);

        //4.Provide wrong password
        driver.findElement(By.id("login-username")).sendKeys("1234Test");

        //5. Click on the Button
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(1000);

        //close the page
        driver.close();

        System.out.println("Test has been passed");
    }


}
