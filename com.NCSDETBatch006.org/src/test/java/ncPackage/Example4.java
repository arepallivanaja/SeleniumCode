package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
public static void main(String[] args) throws Exception {
		
		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the chrome browser 
		driver.manage().window().maximize();
		
		// Open NC login page in opened chrome browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='RememberMe']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		
		// Terminate the Chrome Browser
		driver.quit();
		Thread.sleep(6000);

	}


}
