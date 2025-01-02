package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		//Absoulte XPath
		//driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("iphone 14");
		//driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("iphone 14");
		
		//using multiple attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search store'][@name='q']")).sendKeys("iphone 14");
		//driver.findElement(By.xpath("//*[@placeholder='Search store'][@name='q']")).sendKeys("iphone 14");
	
		//using and or
		//driver.findElement(By.xpath("//input[@placeholder='Search store' and @name = 'q']")).sendKeys("iphone 14");
		//driver.findElement(By.xpath("//input[@placeholder='Search store' or @name = 'abc']")).sendKeys("iphone 14");
		
		//using text for xpath	(inner text)
		//driver.findElement(By.xpath("//a[text() = 'Books ']")).click();
		
		//using contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("iphone 14");
	
		//using start-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("iphone 14");
	}
}
