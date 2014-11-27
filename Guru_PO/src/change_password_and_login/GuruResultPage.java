package change_password_and_login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GuruResultPage {
	private FirefoxDriver driver;
	
	public GuruResultPage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public void verify_password() {
		try {
			if(driver.switchTo().alert()!=null){
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Old password is incorrect");
				alert.accept();
			}
		} catch (Exception e){	
		}
		
	}
}
