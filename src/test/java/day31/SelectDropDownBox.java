package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownBox {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select country = new Select(countryEle);
		//country.selectByVisibleText("United States");
		//country.selectByValue("uk");
		//country.selectByIndex(4);
		
		List<WebElement> option = country.getOptions();
		
		System.out.println(option.size());
		for(int i = 0 ; i < option.size(); i++) {
			System.out.println(option.get(i).getText());
		}
	}
}
