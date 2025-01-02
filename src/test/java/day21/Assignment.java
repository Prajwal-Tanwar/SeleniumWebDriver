package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		
		String title = driver.getTitle();
		if(title.equals("nopCommerce demo store")) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		
		driver.close();
	}
}
