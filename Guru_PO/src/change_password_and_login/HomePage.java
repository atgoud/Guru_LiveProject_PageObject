package change_password_and_login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import found_transfer_customized_statement.GuruResultPage;

public class HomePage {
private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public GuruResultPage verify_message() throws InterruptedException{
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.cssSelector("input[name='oldpassword']")).sendKeys("bla-bla");
		driver.findElement(By.cssSelector("input[name='newpassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='confirmpassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		return new GuruResultPage(driver);
	}
	public void verify_password() throws InterruptedException{
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.cssSelector("input[name='oldpassword']")).sendKeys("tEsYpYt");
		driver.findElement(By.cssSelector("input[name='newpassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='confirmpassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[type='submit']")).click();		
	}
}
