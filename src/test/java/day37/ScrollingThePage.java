package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingThePage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		Scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,1500)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		
		//Scroll the page till element is displayed
//		WebElement element = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//		js.executeScript("arguments[0].scrollIntoView();", element);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scrolling till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scrolling till the top of the page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	}
}
