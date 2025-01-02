package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		WebElement cellPhones = driver.findElement(By.linkText("Cell phones"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).moveToElement(cellPhones).click().build().perform();
	}
}
