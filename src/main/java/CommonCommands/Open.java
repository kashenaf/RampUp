package CommonCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Kalkidan on 10/20/2016.
 */
public class Open {

  @Test
    public void testOpen(){
    File file = new File("C:/Users/Kalkidan/IdeaProjects/RampUp/src/Selenium_Drivers/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.huffingtonpost.com");
    driver.close();
  }

}
