package ncPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) throws Exception {
		
		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the chrome browser 
		driver.manage().window().maximize();
		
		// Open NC login page in opened chrome browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		
		String str=driver.getTitle();
		System.out.println(str);
		
		String uri=driver.getCurrentUrl();
		System.out.println(uri);
		String src=driver.getPageSource();
		System.out.println(src);
		String wid=driver.getWindowHandle();
		System.out.println(wid);
		// Terminate the Chrome Browser
		driver.quit();
		Thread.sleep(2000);

	}

}
