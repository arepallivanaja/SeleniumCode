package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	
	By dashboard = By.xpath("//h1[contains(text(), 'Dashboard')]");
	
	public void verifyDashboard() {
		boolean val = driver.findElement(dashboard).isDisplayed();
		if(val==true) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failed");
		}
	}
	
	public DashboardPage(WebDriver d){
		this.driver = d;
	}

}
