package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPageNC {
	WebDriver dr;
	
	By productName=By.id("search-product-name");
	By searchButtonClick=By.id("search-orders");
	
	
	public void productNameSearch() {
		dr.findElement(productName).sendKeys("Mobile");
	}
	
	public void searchButtononClick() {
		dr.findElement(searchButtonClick).click();;
	}
	
	public OrdersPageNC(WebDriver d) {
		this.dr = d;

	}

}
   
