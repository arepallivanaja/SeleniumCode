package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws Exception {
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@name='Password']")).clear();
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin",Keys.TAB,Keys.TAB,Keys.ENTER);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//*[@href='#'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
	Thread.sleep(2000);
	
	String val=driver.findElement(By.name("SearchProductName")).getAttribute("name");
	System.out.println(val);
	
	String valu=driver.findElement(By.name("SearchProductName")).getTagName();
	System.out.println(valu);
	
	String valun=driver.findElement(By.id("search-products")).getText();
	System.out.println(valun);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@href='/logout']")).click();
	Thread.sleep(5000);
	driver.quit();

	}
}
