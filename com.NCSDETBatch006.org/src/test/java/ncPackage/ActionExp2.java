package ncPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExp2 {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(3));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.id("nopSIdeBarPusher"));
		Actions action =new Actions(driver);
		driver.quit();
	}

}
