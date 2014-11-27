package found_transfer_customized_statement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GuruResultPage {
 
	private FirefoxDriver driver;
	
	public GuruResultPage(FirefoxDriver driver) {
		this.driver = driver;
	}
	public void verify_confirmation() {
		try {
			if(driver.switchTo().alert()!=null){
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Fund Transafer Details for Account No: xyz");
				alert.accept();
			}
		} catch (Exception e){	
		}
	}
	public void verify_account() {
		try {
			if(driver.switchTo().alert()!=null){
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Payers account No and Payees account No Must Not be Same!!!");
				alert.accept();
			}
		} catch (Exception e){	
		}
		
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
