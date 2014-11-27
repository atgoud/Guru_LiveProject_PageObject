package add_new_customer_and_account;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import found_transfer_customized_statement.GuruResultPage;

public class HomePage {
private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public GuruResultPage verify_message() throws InterruptedException{
		driver.findElement(By.linkText("New Customer")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Denys");
		driver.findElement(By.cssSelector("input[name='rad1']")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("25081992");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Kiev");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Kiev");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Kiev");
		driver.findElement(By.cssSelector("input[name='pinno']")).sendKeys("567321");
		driver.findElement(By.cssSelector("input[name='telephoneno']")).sendKeys("380951428617");
		driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("Aleksdenkoval@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Aleksandra");
		driver.findElement(By.cssSelector("input[type='Submit']")).click();	
		return new GuruResultPage(driver);
	}
}
