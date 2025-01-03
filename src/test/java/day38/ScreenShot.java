package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full page screenShot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir") + "\\screenshot\\fullpage.png");
//		sourceFile.renameTo(targetFile);
//		
		//Capture the screenshot from the specific section
//		WebElement featurePart = driver.findElement(By.xpath("//div[contains(@class,'product-grid')]"));
//		File sourceFile = featurePart.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir") + "\\screenshot\\feature.png");
//		sourceFile.renameTo(targetFile);
//		
		//Specific webElement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\screenshot\\logo.png");
		sourceFile.renameTo(targetFile);
	}
}
