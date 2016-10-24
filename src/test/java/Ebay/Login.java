package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kalkidan on 10/24/2016.
 */
public class Login {
    @BeforeTest
    public void setUP(){
        File file= new File("C:\\Users\\Kalkidan\\IdeaProjects\\RampUp\\src\\Selenium_Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
    }
    @Test
    public void Hover(){
        setUP();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#gh-ug > a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("ml51 tx")).click();
    }
}
