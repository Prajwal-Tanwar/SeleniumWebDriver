package officeTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTestNG {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void testCase() {
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		//Thread.sleep(5000); 				//only for debugging purpose
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Title=driver.getTitle();
		System.out.println(Title);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
 
}
