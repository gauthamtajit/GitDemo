import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AccessaProductMultipleFilters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-shop-a")).click();
		driver.findElement(By.xpath("//a[text()='Cell phones & accessories']")).click();
		driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();
		driver.findElement(By.xpath("//button[text()='All Filters']")).click();	
		driver.findElement(By.id("c3-mainPanel-condition")).click();
		List<WebElement> lst= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<lst.size();i++)
		{
			lst.get(i).click(); }
		driver.findElement(By.id("c3-mainPanel-price")).click();
		driver.findElement(By.xpath("//input[@aria-label='Minimum Value, US Dollar']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@aria-label='Maximum Value, US Dollar']")).sendKeys("300");
		driver.findElement(By.id("c3-mainPanel-location")).click();
		driver.findElement(By.xpath("//input[@value='Worldwide']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Apply']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='11 filters applied']")).getText());
		
		driver.quit();
		
		
	}

}
