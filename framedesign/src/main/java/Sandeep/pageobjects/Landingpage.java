package Sandeep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gsandeep.AbstractComponents.AbstractComponents;

public class Landingpage extends AbstractComponents {
	
	WebDriver driver;
	
	public Landingpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='email@example.com']"));
	//pagefactory
	
	@FindBy(xpath="//input[@placeholder='email@example.com']")
	WebElement userEmail;
	
	//driver.findElement(By.xpath("//input[@id='userPassword']"))
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement userPassword;
	
	//driver.findElement(By.xpath("//input[@name='login']"))
	@FindBy(xpath="//input[@name='login']")
	WebElement submit;
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;
	
	


	public void loginApplication(String email, String password) {
		
		// TODO Auto-generated method stub
		
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		submit.click();
		
		
		
	}
	
	public String getErrorMessage() {
		waitforWebElementToAppear(errorMessage);
		return errorMessage.getText();
				
	}
	
	public void goTO() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
}
