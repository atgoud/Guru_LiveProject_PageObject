package verify_the_login_section;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class GuruTestPage {
	private FirefoxDriver driver;
	@BeforeTest
	  public void setUp() {
		  	driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V4/");
	  }
	  @AfterTest
	  public void tearDown() {
		  driver.quit();
	  }
	  @Test
	  public void valid_userid_password() throws InterruptedException{
		  	HomePage home = new HomePage(driver);
			home.login();
			GuruResultPage result = new GuruResultPage(driver);
			result.verify_data();
	  }
	  @Test
	  public void invalid_userid_invalid_password() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.invaliduserid_invalidpassword();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.invalid_data();
	  }
	  @Test
	  public void invalid_userid_valid_password() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.invaliduserid_validpassword();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.invalid_data();
	  }
	  @Test
	  public void valid_userid_invalid_password() throws InterruptedException{
		  HomePage home = new HomePage(driver);
		  home.validuserid_invalidpassword();
		  GuruResultPage result = new GuruResultPage(driver);
		  result.invalid_data();  
	  }
}
