package verify_the_login_section;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GuruResultPage {
	
	private FirefoxDriver driver;
	
	public GuruResultPage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public void verify_data() {
		driver.findElement(By.linkText("Manager")).isDisplayed();
	}

	public void invalid_data() {
		try
        {
            if (driver.switchTo().alert() != null)
            {
                Alert alert = driver.switchTo().alert();
                alert.accept();
            }
        }
        catch (Exception e) { }
		
	}
}
