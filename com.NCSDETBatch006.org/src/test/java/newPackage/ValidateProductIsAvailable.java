package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ValidateProductIsAvailable {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		LoginPageNC lgn=new LoginPageNC(driver);
		MainPageNC mnc=new MainPageNC(driver);
		OrdersPageNC opn=new OrdersPageNC(driver);
		DashboardPage dsp=new DashboardPage(driver);
		
		mnc.loginSetUp();
		lgn.validEmail();
		lgn.validPassword();
		lgn.loginBtnClick();
		Thread.sleep(5000);
		dsp.verifyDashboard();
		Thread.sleep(5000);
		mnc.salesClick();
		Thread.sleep(5000);
		mnc.orderClick();
		Thread.sleep(5000);
		opn.productNameSearch();
		Thread.sleep(5000);
		opn.searchButtononClick();
		Thread.sleep(5000);
		mnc.doLogout();
		Thread.sleep(5000);
		mnc.quitBrowser();
		
}
}
