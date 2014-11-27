package found_transfer_customized_statement;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage {
	
	private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public GuruResultPage verify_message() throws InterruptedException{
		driver.findElement(By.linkText("Fund Transfer")).click();
		driver.findElement(By.cssSelector("input[name='payersaccount']")).sendKeys("xyz");
		driver.findElement(By.cssSelector("input[name='payeeaccount']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name='ammount']")).sendKeys("500");
		driver.findElement(By.cssSelector("input[name='desc']")).sendKeys("cash");
		driver.findElement(By.cssSelector("input[name='AccSubmit']")).click();
		return new GuruResultPage(driver);
	}
}
