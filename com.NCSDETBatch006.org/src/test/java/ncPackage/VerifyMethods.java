package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMethods {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		boolean val=driver.findElement(By.id("Email")).isDisplayed();
		boolean val1=driver.findElement(By.id("RememberMe")).isSelected();
		boolean val2=driver.findElement(By.tagName("button")).isEnabled();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@href='#'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Shipments')]")).click();
		Thread.sleep(2000);
		boolean val3=driver.findElement(By.id("LoadNotDelivered")).isSelected();
		boolean val4=driver.findElement(By.id("TrackingNumber")).isDisplayed();
		boolean val5=driver.findElement(By.id("search-shipments")).isEnabled();
		System.out.println("Is Email field displayed: ->"+val);
		System.out.println("Rememeber me check box selected: ->"+val1);
		System.out.println("Login button  is enabled: ->"+val2);
		System.out.println("Is Load not delivered checkbox selected: ->"+val3);
		System.out.println("Able to display trackingnumber field: ->"+val4);
		System.out.println("Is search button enabled: ->"+val5);
		driver.quit();
	}
	
}
