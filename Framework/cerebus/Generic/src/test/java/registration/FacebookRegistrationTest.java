package registration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookRegistrationTest {
    public WebDriver driver = null;




    @Test
    public void testUserCannotRegisterIfEmailFieldIsEmpty(){

       // 1-Launch google Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/vladmac/IdeaProjects/facebook/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //2- Navigate to facebook.com
        String facebookUrl = "https://www.facebook.com";
        driver.get(facebookUrl);

        //3- Provide the first name
        driver.findElement(By.name("firstName")).sendKeys("vlad");

        //4- Provide the Last name
        driver.findElement(By.name("lastName")).sendKeys("Micho");


        // 5. Provide in password.
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test123!");

        // 6. Provide in date of birth.
        // July 21, 1994
        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        Select dayDropdown = new Select(driver.findElement(By.name("birthday_day")));
        Select yearDropdown = new Select(driver.findElement(By.id("year")));

        monthDropdown.selectByValue("4");
        dayDropdown.selectByValue("28");
        yearDropdown.selectByValue("1999");

        // 7. Provide in gender (male).
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

        // 8. Click on the submit button.
        driver.findElement(By.name("websubmit")).click();

    }

}
