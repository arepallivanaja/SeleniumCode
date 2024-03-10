package ncPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExp {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		JavascriptExecutor jsExe=(JavascriptExecutor)driver;
		jsExe.executeScript("document.getElementById('Email').value='admin@yourstore.com';");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementById('Email').style.border=\"4px red solid\";");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementById('Email').style.background=\"yellow\";");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementById('Password').style.border=\"2px blue solid\";");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementById('Password').style.background=\"pink\";");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(5000);
		jsExe.executeScript("window.scrollTo(0, 100);");
		Thread.sleep(5000);
		jsExe.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(5000);
		jsExe.executeScript("document.getElementsByClassName('card-title')[8].scrollIntoView();");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
