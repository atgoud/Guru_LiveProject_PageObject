package customized_statement;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import found_transfer_customized_statement.GuruResultPage;

public class HomePage {
private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public GuruResultPage verify_message() throws InterruptedException{
		driver.findElement(By.linkText("Customised Statement")).click();
		driver.findElement(By.cssSelector("input[name='fdate']")).sendKeys("17112014");
		driver.findElement(By.cssSelector("input[name='tdate']")).sendKeys("18112014");
		driver.findElement(By.cssSelector("input[name='amountlowerlimit']")).sendKeys("500");
		driver.findElement(By.cssSelector("input[name='numtransaction']")).sendKeys("10");
		driver.findElement(By.cssSelector("input[name='AccSubmit']")).click();
		return new GuruResultPage(driver);
	}
}
