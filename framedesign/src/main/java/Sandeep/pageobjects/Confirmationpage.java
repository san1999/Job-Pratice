package Sandeep.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gsandeep.AbstractComponents.AbstractComponents;

public class Confirmationpage extends AbstractComponents {
	
	WebDriver driver;

	public Confirmationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".hero-primary")
	WebElement confirmationMessage;
	
	public String getConfirmationMessage() {
		
		return confirmationMessage.getText();
		
	}

}
