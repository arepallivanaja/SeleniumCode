package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) throws Exception {
		
		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the chrome browser 
		driver.manage().window().maximize();
		
		// Open NC login page in opened chrome browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		
		// Validate the data using the locator as "id"
		driver.findElement(By.xpath("//*[@id='Email']")).clear();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(4000);
		
		// Validate the data using the locator as "name"
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(4000);

	
		
		// Validate the data using the locator as "xpath"
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(3000);
		
		// Validate the data using the locator as "tagName"
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("(//*[@href='#'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),' Products')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/Admin/Product/Create']")).click();
		Thread.sleep(4000);

		// Terminate the Chrome Browser
		driver.quit();
		Thread.sleep(2000);

	}

}
