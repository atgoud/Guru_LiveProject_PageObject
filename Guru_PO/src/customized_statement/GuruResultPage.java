package customized_statement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GuruResultPage {
	
	private FirefoxDriver driver;
	
	public GuruResultPage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public void verify_number() {
		try {
			if(driver.switchTo().alert()!=null){
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Please fill all fields");
				alert.accept();
			}
		} catch (Exception e){	
		}
		
	}
}
