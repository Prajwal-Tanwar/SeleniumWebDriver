package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		1.Selecting Specific Checkbox 
//		driver.findElement(By.xpath("//label[@for='sunday']")).click();
//		
//		2.Selecting Multiple Checkbox
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input.form-check-input[type = 'checkbox']"));
		
		for(WebElement w : checkBoxes) {
			w.click();
		}
		
		//3.for last 3 checkbox
		//totalsize - 3  i.e 7 - 3 = 4;
		for(int i = 4 ; i < checkBoxes.size(); i++ ) {
			checkBoxes.get(i).click();
		}
		
		//4.for first 3
//		for(int i = 0 ; i < 3 ; i++) {
//			checkBoxes.get(i).click();
//		}
		
		//5.unselect the selected checkbox
		for(WebElement w : checkBoxes) {
			if(w.isSelected()) {
				w.click();
			}
		}
		
	}
}
