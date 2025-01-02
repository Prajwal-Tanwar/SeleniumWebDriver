package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find the number of rows
		//int rows = driver.findElements(By.tagName("tr")).size();	//for 1 table(Prefer)
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		System.out.println("Number of rows : " + rows);
		 
		//find the number of columns
		//int columns = driver.findElements(By.tagName("th")).size();	for 1 table(Prefer)
		int columns = driver.findElements(By.xpath(" //table[@name = 'BookTable']//th")).size();
		System.out.println("Number of columns : " + columns);
		
		//Read data from specific rows and table(5th row and 3 column)
		WebElement particularElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		System.out.println("Particular Element : " + particularElement.getText());
		
		//Reading all the data
		/*for(int r = 2 ; r <= rows ; r++) {
			for(int c = 1 ; c <= columns ; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		*/
		//for writing the books with author name mukesh
		for(int r = 2 ; r <= rows ;r++) {
			String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(value.equals("Mukesh")) {
				String output = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(output);
			}
		}
		
		//Calculating the total Price
		int total = 0;
		for(int r = 2 ; r <= rows ;r++) {
			String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total += Integer.parseInt(value);
		}
		System.out.println(total);
	}
}
