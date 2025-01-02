package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		System.out.println("Title : " + driver.getTitle());
		
		System.out.println("Current URL : " + driver.getCurrentUrl());
		
		//System.out.println("Page Source : " + driver.getPageSource());
		
		//System.out.println("Window Handle : " + driver.getWindowHandle());
		
		//driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		//System.out.println(windowHandle);
		for(String s:windowHandle) {
			System.out.println(s);
		}
	}
}
