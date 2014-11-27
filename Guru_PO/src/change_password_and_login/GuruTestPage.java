package change_password_and_login;

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
	  public void incorrect_old_password() throws InterruptedException {
		  HomePage home = new HomePage(driver);
		  home.verify_message();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.verify_password();
	  }
	  @Test
	  public void verify_old_password() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.verify_password();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.verify_password();
	  }
}
