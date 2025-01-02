package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		//id  or name also can be use
		//driver.findElement(By.id("small-searchterms")).sendKeys("iphone 14");
		//boolean googleLogo = driver.findElement(By.id("main")).isDisplayed();
		//System.out.println(googleLogo);
		
		//linkText or partialLinkText(but create issue when we locate and other also has same characters)
		//driver.findElement(By.linkText("Books")).click();
		
		
		//className
		//List<WebElement> headerTag = driver.findElements(By.className("ico-register"));
		//System.out.println(headerTag.size());
		
		//tagName
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
		//Total number of images
//		List<WebElement> image = driver.findElements(By.tagName("img"));
//		System.out.println(image.size());
//		for(WebElement w : image) {
//			System.out.println(w);
//	
//		}
	}
}