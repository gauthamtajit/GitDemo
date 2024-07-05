import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");	
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		
		String str=driver.findElement(By.tagName("p")).getText();
		System.out.println(str);
		
		Assert.assertEquals(str,"You are successfully logged in.");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();;
		
		

	}

}
