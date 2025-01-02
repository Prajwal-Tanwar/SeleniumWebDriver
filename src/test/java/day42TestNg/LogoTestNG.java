package day42TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/*
 * Open Application
 * Test Logo Presence
 * Login 
 * close()
 */
public class LogoTestNG {
	
	WebDriver driver = new ChromeDriver();;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	@Test(priority=1)
	void openApp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		WebElement logo =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
		System.out.println("Logo is Displayed or not : " + logo.isDisplayed());
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@Test(priority=4)
	void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
