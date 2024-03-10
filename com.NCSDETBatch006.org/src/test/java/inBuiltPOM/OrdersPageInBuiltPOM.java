package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPageInBuiltPOM {
	
	WebDriver driver;
	
	
	@FindBy(id="search-product-name")
	WebElement productName;
	
	@FindBy(id="search-orders")
	WebElement searchButton;
	
	public void productName() {
		productName.sendKeys("Monitor");
	}

	public void clickOnSearch() {
		searchButton.click();
	}
	
	public OrdersPageInBuiltPOM(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
}
