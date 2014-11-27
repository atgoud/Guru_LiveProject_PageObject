package verify_the_login_section;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public GuruResultPage login() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mngr6669");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tEsYpYt");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		return  new GuruResultPage(driver);
	}

	public GuruResultPage invaliduserid_invalidpassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mngr666");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tEsYpY");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		return new GuruResultPage(driver);
	}

	public GuruResultPage invaliduserid_validpassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mngr666");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tEsYpYt");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		return new GuruResultPage(driver);	
	}
	public GuruResultPage validuserid_invalidpassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mngr666");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tEsYpYt");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		return new GuruResultPage(driver);	
	}
}

