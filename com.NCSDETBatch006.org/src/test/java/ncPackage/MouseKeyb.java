package ncPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyb {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(3));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sports, Books & More')]"))).perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.linkText("Books"))).perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.linkText("Stationery"))).perform();
		Thread.sleep(5000);
		action.doubleClick().perform();
		Thread.sleep(5000);
		
		driver.quit();
}
}