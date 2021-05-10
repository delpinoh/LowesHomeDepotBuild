package LowesHomeDepot.LowesHomeDepotBuild;


import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class lowesTest {
	
	WebDriver driver;
	Logger log = Logger.getLogger(lowesTest.class);
	
	@BeforeTest
public void beforeTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_apr2021\\chromedriver.exe");
	driver = new ChromeDriver();
	log.info("Launching Lowes");
	PropertyConfigurator.configure("C:\\Users\\delpi\\eclipse-workspace\\WebDriverTest\\src\\main\\resources\\log4j.properties");
	
}
	
  @Test
  public void openLowes() {
	  driver.get("https://www.lowes.ca");
	  Assert.assertEquals(true, true);
  }
  
    
  @AfterTest
  public void afterTest() {
	  
  }

}
