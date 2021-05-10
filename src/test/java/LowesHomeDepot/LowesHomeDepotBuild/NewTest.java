package LowesHomeDepot.LowesHomeDepotBuild;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
public void beforeTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_apr2021\\chromedriver.exe");
	driver = new ChromeDriver();
	
}
	
  @Test
  public void openWalmart() {
	  driver.get("https://www.homedepot.ca");
  }
  
  

  
  
  @AfterTest
  public void afterTest() {
	  
  }

}
