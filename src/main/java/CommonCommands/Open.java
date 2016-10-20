package CommonCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Kalkidan on 10/20/2016.
 */
public class Open {

  @Test
    public void testOpen(){
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.google.com");

      driver.close();
  }

}
