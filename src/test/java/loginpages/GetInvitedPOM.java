package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetInvitedPOM {

	 WebDriver driver;

	    // Constructor
	    public GetInvitedPOM(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locators
	    By getInvitedLink = By.linkText("Get Invited");
	    By nameField = By.name("name");
	    By emailField = By.xpath("//input[@type='email']");
	    By companyNameField = By.name("companyName");
	    By websiteField = By.name("website");
	    By countryDropdown = By.xpath("//div[contains(@class, 'selected-flag')]");
	    By countrySearch = By.xpath("//input[@placeholder='search']");
	    By countryIndia = By.xpath("//li[@data-country-code='in' and contains(., 'India')]");
	    By phoneField = By.id("contactNumber");
	    By companySizeDropdown = By.xpath("//div[@role='combobox']");
	    By sizeOption = By.xpath("//li[normalize-space()='11-50']");
	    By passwordField = By.name("password");
	    By submitButton = By.xpath("//button[normalize-space()='Get Invited']");

	    // Actions
	    public void openGetInvitedPage() throws InterruptedException {
	        Thread.sleep(2000);
	        driver.findElement(getInvitedLink).click();
	        Thread.sleep(2000);
	    }

	    public void fillForm(String name, String email, String company, String website, String phone, String password) throws InterruptedException {
	        driver.findElement(nameField).sendKeys(name);
	        driver.findElement(emailField).sendKeys(email);
	        driver.findElement(companyNameField).sendKeys(company);
	        driver.findElement(websiteField).sendKeys(website);

	        driver.findElement(countryDropdown).click();
	        driver.findElement(countrySearch).sendKeys("India");
	        Thread.sleep(1000);
	        driver.findElement(countryIndia).click();

	        driver.findElement(phoneField).sendKeys(phone);
	        driver.findElement(companySizeDropdown).click();
	        driver.findElement(sizeOption).click();
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void submitForm() {
	        driver.findElement(submitButton).click();
	    }
	}


