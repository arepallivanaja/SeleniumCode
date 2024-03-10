package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNC {
	WebDriver d;
	By email = By.id("Email");
	By pwd = By.name("Password");
	By loginbt = By.tagName("button");
	
	public void validEmail() {
		d.findElement(email).clear();
		d.findElement(email).sendKeys("admin@yourstore.com");
	}

		public void validPassword() {
			d.findElement(pwd).clear();
			d.findElement(pwd).sendKeys("admin");
		}

		public void loginBtnClick() {
			d.findElement(loginbt).click();
		}
		
		public LoginPageNC(WebDriver dr){
			this.d = dr;
		}
		
	}


