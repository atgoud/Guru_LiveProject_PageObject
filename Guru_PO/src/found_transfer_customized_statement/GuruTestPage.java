package found_transfer_customized_statement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruTestPage {
	
	private FirefoxDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mngr6669");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tEsYpYt");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	  public void tearDown(){
		  driver.quit();
	  }
	  @Test
	  public void verify_confirmation_message() throws InterruptedException {
		  HomePage home = new HomePage(driver);
		  home.verify_message();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.verify_confirmation();
	  }
	  @Test
	  public void verify_system_behavior_same_account_number() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.verify_message();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.verify_account();
	  }
	  @Test
	  public void verify_system_behavior_wrong_account_number() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.verify_message();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.verify_number();
	  }
	  
}
