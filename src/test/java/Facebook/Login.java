package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kalkidan on 10/25/2016.
 */
public class Login {
    @Test
    public void signIn() {
        setUP();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#u_0_n")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#email")).sendKeys("ashenafikalkidan@yahoo.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#pass")).sendKeys("7032203924");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#loginbutton")).click();

    }

    @BeforeTest
    public void setUP() {
        File file = new File("C:\\Users\\Kalkidan\\IdeaProjects\\RampUp\\src\\Selenium_Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    }
}
