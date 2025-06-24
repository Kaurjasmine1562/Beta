package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperAdmin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://verihire-admin-uat.dmlabs.in/approval");

		//Login
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys("manpreet.kaur@digimantra.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("Root@1234");

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		//Approving request
		String status = driver.findElement(By.xpath("(//div[contains(@class, 'MuiDataGrid-row')])[1]//div[@data-field='status']//div")).getText();
        System.out.println("Latest record status: " + status);


	}



	}


