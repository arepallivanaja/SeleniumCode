package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import newPackage.MainPageNC;

public class ValidateInbuiltOrders {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		MainPageNC mnc=new MainPageNC(driver);
		LoginPageInBuiltPOM pm=new LoginPageInBuiltPOM(driver);
		OrdersPageInBuiltPOM opm=new OrdersPageInBuiltPOM(driver);
		
		mnc.loginSetUp();
		Thread.sleep(5000);
		pm.emailValid();
		Thread.sleep(5000);
		pm.passValid();
		Thread.sleep(5000);
		pm.clickLogin();
		Thread.sleep(5000);
		mnc.salesClick();
		Thread.sleep(5000);
		mnc.orderClick();
		Thread.sleep(5000);
		opm.productName();
		Thread.sleep(5000);
		opm.clickOnSearch();
		Thread.sleep(5000);
		mnc.doLogout();
		Thread.sleep(5000);
		mnc.quitBrowser();
		
	}
}
