package CommonCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

/**
 * Created by Kalkidan on 10/20/2016.
 */
public class Open {


  @Test
    public void testOpen(){
      File file = new File("C:/Users/Kalkidan/IdeaProjects/RampUp/src/Selenium_Drivers/chromedriver.exe");
      System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.huffingtonpost.com");
      driver.close();
  }
  @Test
    public void testOpenIE(){
    File file1 = new File("C:\\Users\\Kalkidan\\IdeaProjects\\RampUp\\src\\Selenium_Drivers\\IEDriverServer.exe");
    System.setProperty("webdriver.ie.driver", file1.getAbsolutePath());
    WebDriver driver = new InternetExplorerDriver();
    driver.get("https://www.google.com");
    driver.close();
  }
  @Test
    public void testOpen1(){
      File file= new File("C:/Users/Kalkidan/IdeaProjects/RampUp/src/Selenium_Drivers/chromedriver.exe");
      System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.close();
  }
  @Test
    public void testOpen2(){
      File file = new File("C:/Users/Kalkidan/IdeaProjects/RampUp/src/Selenium_Drivers/chromedriver.exe");
      System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.cnn.com");
      driver.close();
  }
}
