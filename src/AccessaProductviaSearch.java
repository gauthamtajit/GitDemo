import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AccessaProductviaSearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String str="Macbook";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys(str);
		driver.findElement(By.xpath("//option[text()='Computers/Tablets & Networking']")).click();
		driver.findElement(By.id("gh-btn")).click();
		String mac= driver.findElement(By.xpath("//*[@id=\"item4d8cbf0397\"]/div/div[2]/a/div/span/span")).getText();		
		System.out.println(mac);
		Assert.assertTrue(mac.contains(str));
		
		driver.quit();
		
	}

}
