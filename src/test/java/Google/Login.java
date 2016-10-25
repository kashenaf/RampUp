package Google;

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
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".gb_P")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("1761467162")).click();
        driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
        driver.findElement(By.cssSelector("#Email")).sendKeys("2008kalu@gmail.com");
        driver.findElement(By.cssSelector("#next")).click();
        driver.findElement(By.cssSelector("#Passwd")).sendKeys("7032203924");
        driver.findElement(By.cssSelector("#signIn")).click();
    }

    @BeforeTest
    public void setUP() {
        File file = new File("C:\\Users\\Kalkidan\\IdeaProjects\\RampUp\\src\\Selenium_Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    }
}