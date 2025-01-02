package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*\
 * 1.Launch Browser(Chrome)
 * 2.Open url https://demo.opencart.com/
 * 3.Validate title should be "Your Store"
 * 4.Close Browser
 */

public class firstTestCase {
	public static void main(String[] args) {
		
		//1.
		WebDriver driver = new ChromeDriver();
		
		//2.
		driver.get("https://demo.opencart.com/"); 
		
		//3.1 Two ways
		System.out.println(driver.getTitle());
		
		//		OR
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close() ----- also use
		//driver.quit();
	}
}
