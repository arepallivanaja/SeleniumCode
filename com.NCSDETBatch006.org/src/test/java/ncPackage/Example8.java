package ncPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8 {

	public static void main(String[] args) throws Exception {

		// Launch the Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				
				// Maximize the chrome browser 
				driver.manage().window().maximize();
				
				// Open NC login page in opened chrome browser
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
				Thread.sleep(4000);
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//*[@href='#'])[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Categories')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Manufacturers')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Product reviews')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@href='#'])[6]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Orders')]")).click();
				Thread.sleep(2000);
				Set<String> str=driver.getWindowHandles();
				System.out.println(str);
				driver.close();
				Thread.sleep(2000);
				driver.quit();

				

	}

}
