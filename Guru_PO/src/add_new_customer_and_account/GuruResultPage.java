package add_new_customer_and_account;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GuruResultPage {
private FirefoxDriver driver;
	
	public GuruResultPage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public void verify_adding() {
		try {
			if(driver.switchTo().alert()!=null){
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "New user added!");
				alert.accept();
			}
		} 	catch (Exception e){	
	}
	
	}	
}
