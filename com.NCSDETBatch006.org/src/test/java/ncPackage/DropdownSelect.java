package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[contains(text(),'Customers')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'GDPR requests (log)')]")).click();
		Thread.sleep(5000);
		WebElement reqType=driver.findElement(By.id("SearchRequestTypeId"));
		Select reqs=new Select(reqType);
		reqs.selectByVisibleText("Consent (agree)");
		Thread.sleep(2000);
		reqs.selectByVisibleText("Export data");
		Thread.sleep(2000);
		reqs.selectByVisibleText("User changed profile");
		Thread.sleep(2000);
		reqs.selectByVisibleText("Delete customer");
		Thread.sleep(2000);
		
		driver.quit();
		
	
}
}