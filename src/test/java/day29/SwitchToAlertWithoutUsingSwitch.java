package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Switching to alert without using switch
//So use Explicit wait

public class SwitchToAlertWithoutUsingSwitch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Using Explicit wait for accessing Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Alert myalert = driver.switchTo().alert();
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();
	}
}
