package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int pages = driver.findElements(By.xpath("//ul[@class = 'pagination']//li")).size();
		for(int p = 1 ; p <= pages ; p++) {
			if(p > 1) {
				driver.findElement(By.xpath("//ul[@class = 'pagination']//li["+p+"]")).click();
			}
			
			int rows = driver.findElements(By.xpath("//table[@id = 'productTable']//tbody//tr")).size();
			for(int r = 1 ; r<= rows ;r++) {
				String name =  driver.findElement(By.xpath("//table[@id = 'productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id = 'productTable']//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println(name + " ----------> " + price);
			}
		}
	}
}
