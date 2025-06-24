package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInvitedFlow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-verihire.dmlabs.in/login");
		
		Thread.sleep(2000);
		
		WebElement getinvite = driver.findElement(By.linkText("Get Invited"));
		getinvite.click();
		
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.click();
		name.sendKeys("AutoUser");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.click();
		email.sendKeys("autouser1@yopmail.com");
		
		WebElement CName = driver.findElement(By.xpath("//input[@name='companyName']"));
		CName.click();
		CName.sendKeys("JAVA");
		
		WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
		website.click();
		website.sendKeys("https://www.java.com");
		
		WebElement flag = driver.findElement(By.xpath("//div[@class='flag in']"));
		flag.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='search']"));
		search.click();
		search.sendKeys("India");
		
		WebElement India = driver.findElement(By.xpath("//li[@data-country-code='in' and contains(., 'India')]"));
		India.click();
		
		WebElement number = driver.findElement(By.xpath("//input[@id='contactNumber']"));
		number.click();
		number.sendKeys("9855783547");
		
		WebElement CSize = driver.findElement(By.xpath("//div[@role='combobox']"));
		CSize.click();
		
		WebElement dropwdown = driver.findElement(By.xpath("//li[normalize-space()='11-50']"));
		dropwdown.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("Test@1234");
		
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Get Invited']"));
		submit.click();
	
		
	}





	}


