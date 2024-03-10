package ncPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExp {
public static void main(String[] args) throws Exception {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(4000);
	List<WebElement> row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	int crow=row.size();
	System.out.println("Rows data : "+crow);
	List<WebElement> cols= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
	int tcols=cols.size();
	System.out.println("Columns count is : "+tcols);
	for(int r=2;r<=crow;r++) {
		for(int c=1;c<=tcols;c++) {
			String val=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print(val+"      ");
		}
		System.out.println();
	}
	driver.quit();
}
}