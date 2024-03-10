package newPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageNC {
	WebDriver dr;
	
	By sales = By.xpath("//p[contains(text(),'Sales')]");
	By orders = By.xpath("//p[contains(text(),'Orders')]");
	By logout = By.linkText("Logout");

	public void salesClick() {
		dr.findElement(sales).click();
	}

	public void orderClick() {
		dr.findElement(orders).click();
	}

	public void doLogout() {
		dr.findElement(logout).click();
	}
	
	public void loginSetUp() {
		dr.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void quitBrowser() {
		dr.quit();
	}
	
	public MainPageNC(WebDriver d) {
		this.dr = d;
	}


}
