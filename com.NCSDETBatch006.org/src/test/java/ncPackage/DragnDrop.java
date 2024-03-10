package ncPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(10000);

		driver.switchTo().frame(2);

		Thread.sleep(5000);

		WebElement source = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));

		WebElement target = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		action.dragAndDrop(source, target).perform();

		Thread.sleep(3000);

		WebElement source2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));

		action.dragAndDrop(source2, target).perform();

		Thread.sleep(5000);

		driver.quit();
	}

}
