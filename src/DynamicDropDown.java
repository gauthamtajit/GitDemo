import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		driver.findElement(By.xpath("//div[text()=\"Chennai\"]")).click();
		driver.switchTo().alert().accept();	
		//xpath- 
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("BLR");
		driver.findElement(By.cssSelector("input[class*='r-13qz1uu']")).sendKeys("BLR");

	}

}
