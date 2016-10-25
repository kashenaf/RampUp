package Walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
    @Test
    public void signIn(){
        setUP();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.walmart.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".header-GlobalAccountFlyout-link.header-GlobalAccountFlyout-name.display-block.text-right")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("1761467162")).click();
        driver.findElement(By.cssSelector(".form-control")).sendKeys("kalkidanashenafi@yahoo.com");
        driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/section/form/div[2]/div/label[1]/div/input")).sendKeys("7032203924");
        driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/section/form/div[4]/button")).click();
    }
    @BeforeTest
    public void setUP(){
        File file= new File("C:\\Users\\Kalkidan\\IdeaProjects\\RampUp\\src\\Selenium_Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
    }
}
