package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageInBuiltPOM {
	
	WebDriver driver;
	
	@CacheLookup
	@FindBy(id="Email")
	WebElement email;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="Password"),
		@FindBy(name="Password")
	})
	WebElement pass;
	
	@CacheLookup
	@FindBys({
		@FindBy(className="buttons"),
		@FindBy(tagName="button")
	})
	WebElement loginButton;
	
	public void emailValid() {
		email.clear();
		email.sendKeys("admin@yourstore.com");
	}
	
	public void passValid() {
		pass.clear();
		pass.sendKeys("admin");
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public LoginPageInBuiltPOM(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
}
