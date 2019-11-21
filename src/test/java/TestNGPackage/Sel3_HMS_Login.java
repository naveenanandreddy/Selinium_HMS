package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sel3_HMS_Login {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver", ".//Library//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
	  
	  
	
  }

  @AfterTest
  public void afterTest() {
	  //the below statement will close the browser
	  driver.close();
  }

}
