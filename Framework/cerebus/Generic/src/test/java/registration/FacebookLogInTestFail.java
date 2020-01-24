package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookLogInTestFail {
    public WebDriver driver = null;


    @Test
    public void testUserCannotLogInWhileProvideWrongPassword() throws InterruptedException {

        // 1-Launch google Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/vladmac/IdeaProjects/facebook/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //2- Navigate to facebook.com
        String facebookUrl = "https://www.facebook.com";
        driver.get(facebookUrl);

        //3- Provide the email
        driver.findElement(By.name("email")).sendKeys("vladcomix@hotmail.com");


        // 5. Provide in password.
        driver.findElement(By.name("pass")).sendKeys("Test123");

        // 8. Click on the submit button.
        driver.findElement(By.name("login")).sendKeys(Keys.RETURN);
        //Thread.sleep(2000);

        //9.close the browser
         driver.close();

    }


}
