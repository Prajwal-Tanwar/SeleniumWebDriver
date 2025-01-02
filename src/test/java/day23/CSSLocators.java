package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//tag ID      tag#id	or	#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone 14");
		
		//tag class	  tag.className  or  .classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("iphone 14");
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("iphone 14");
		
		//tag class attribute
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("iphone 14");
		//driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("iphone 14");
	}
}
