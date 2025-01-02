package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//1.. for selecting one option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2.. for getting all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		for(WebElement op : options) {
			System.out.println(op.getText());
		}
		
		//3.. for selecting multiple option
		for(WebElement w : options) {
			if(w.getText().equals("C#") ||w.getText().equals("Python")) {
				w.click(); 
			}
		}
	}
}
