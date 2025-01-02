package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsID = driver.getWindowHandles();
		
//		Approach 1(For having 2-3 browser window)
//		List<String> windowsList = new ArrayList(windowsID);
//		String parent = windowsList.get(0);
//		String child = windowsList.get(1);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle());

//		Approach 2(For more than 2-3 window)
		for(String w : windowsID) {
			String title = driver.switchTo().window(w).getTitle();
			System.out.println(title);
		}
	}
		
}
