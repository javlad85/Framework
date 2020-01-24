package registration;



import com.sun.tools.internal.xjc.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class googleSearchTest {



    public Driver driver =null;

    @Test
    public void googleSearchTestPositive() throws InterruptedException {

        // 1. Launch Google Chrome the Browser

        System.setProperty("webdriver.chrome.driver", "/Users/vladmac/IdeaProjects/facebook/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2. Navigate to facebook.com
        String googleUrl = "https://www.google.com";
        driver.get(googleUrl);

        //3.Enter text to Search
         driver.findElement(By.name("q")).sendKeys("video piit");


         //4. Press the Search button
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        //5. Close browser
        driver.close();

        System.out.println("Test have been completed sucessfully");

    }
}
