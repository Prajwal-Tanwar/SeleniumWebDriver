 package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	public static void selectFutureDate(WebDriver driver, String month,String year,String date) {
		//Selecting month and year
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {					
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
				
		//Selecting the date
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement d : dates) {
			if(d.getText().equals(date)) {
				d.click();
				break;
			}
		}		
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switching to frame
		driver.switchTo().frame(0);
	
		//Method1  using sendKeys()
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2/13/2024");
		
		//Method2  using date picker.
		String year = "2025";
		String month = "April";
		String date = "25";
		
		selectFutureDate(driver,month,year,date);
	}
}
