package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		//for lower limit
		WebElement minAxes = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Before : " + minAxes.getLocation());	
		act.dragAndDropBy(minAxes,100,0).perform();
		System.out.println("After : " + minAxes.getLocation());
		
		//for higher limit
		WebElement maxAxes = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Before : " + maxAxes.getLocation());	
		act.dragAndDropBy(maxAxes,-100,0).perform();
		System.out.println("After : " + maxAxes.getLocation());
	}
}
