package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import newPackage.MainPageNC;

public class ValidateLoginInBuiltNC {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		MainPageNC mnc=new MainPageNC(driver);
		LoginPageInBuiltPOM pm=new LoginPageInBuiltPOM(driver);

		mnc.loginSetUp();
		Thread.sleep(5000);
		pm.emailValid();
		Thread.sleep(5000);
		pm.passValid();
		Thread.sleep(5000);
		pm.clickLogin();
		Thread.sleep(5000);
		mnc.doLogout();
		Thread.sleep(5000);
		mnc.quitBrowser();
	}

}
