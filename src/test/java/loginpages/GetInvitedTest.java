package loginpages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInvitedTest {

	public static void main(String[] args)throws InterruptedException {
		// Set ChromeDriver path if needed
		//	System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// Open login page
			driver.get("https://uat-verihire.dmlabs.in/login");

			// Create Page Object
			GetInvitedPOM getInvite = new GetInvitedPOM(driver);

			// Perform actions
			getInvite.openGetInvitedPage();
			getInvite.fillForm(
					"Auto user",
					"autouser1@yopmail.com",
					"JAVA",
					"https://www.java.com",
					"9855783547",
					"Test@1234"
					);

			getInvite.submitForm();

			// Optional: Wait and quit
			Thread.sleep(5000);
			driver.quit();
		}
	
	}


