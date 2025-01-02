package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zassignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='IPhone 14']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='IPhone 14 Pro']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='IPhone X']")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		
		for(String w : windowId) {
			String title = driver.switchTo().window(w).getTitle(); 
			System.out.println(title);
		}
		
	}
}
