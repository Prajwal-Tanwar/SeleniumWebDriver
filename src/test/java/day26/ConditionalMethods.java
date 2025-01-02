package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/Register");
		driver.manage().window().maximize();
		
		//.isDisplayed()
		WebElement image = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		System.out.println(image.isDisplayed());
	}
}
