package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// Open login page
			driver.get("https://uat-verihire.dmlabs.in/login");
			
			WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
			email.click();
			email.sendKeys("autouser1@yopmail.com");
			
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.click();
			password.sendKeys("Test@1234");
			
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			loginButton.click();
				
			
			
			
		}

	}


