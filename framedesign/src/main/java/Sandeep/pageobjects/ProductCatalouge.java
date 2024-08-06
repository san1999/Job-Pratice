package Sandeep.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gsandeep.AbstractComponents.AbstractComponents;

public class ProductCatalouge extends AbstractComponents {
	
	WebDriver driver;
	
	public ProductCatalouge(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	//pagefactory
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	
	public List<WebElement> getProductLists() {
		waitforElementToAppear(productsBy);
		return products;
	}
	
	public WebElement getproduct(String productname) {
		WebElement prod = getProductLists().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productname) throws InterruptedException {
		WebElement prod = getproduct(productname);
		prod.findElement(addToCart).click();
		waitforElementToAppear(toastMessage);
		waitForElementTODisappear(spinner);
		
	}
	
	
	
}
