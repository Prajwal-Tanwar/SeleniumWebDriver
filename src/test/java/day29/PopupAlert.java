package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1.. Normal Alert with ok button(one single button)
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		Thread.sleep(5000);
		
		//2.. Confirmation Alert(having two buttons--ok and cancel)
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		//3.. Prompt alert with input
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("welcome");
		a.accept();
	}
}
