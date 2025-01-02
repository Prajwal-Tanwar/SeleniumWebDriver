package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// see all the methods in whatsapp
		
		//Self - Select the current Node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/self::a")).getText();
		System.out.println("Self : " + text );
		
		//Parent - Select the parent Node
		String parent = driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/parent::td")).getText();
		System.out.println("Parent : " + parent );
		
		//child- Select the child Node(same but no child available)
		
		//ancestor - Select the ancestor Node
		String ances = driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/ancestor::td")).getText();
		System.out.println("Ancestor : " + ances );
		
		//descendant(same but no descendant available)
		
		//Following - select everything in the document after the closing tag of the current node
		List<WebElement> follow = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/following::td"));
		System.out.println("Size of following : " + follow.size());
		
		//Preceding - select everything in the document before the  tag of the current node
		List<WebElement> prece = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/preceding::td"));
		System.out.println("Size of preceding : " + prece.size());
		
		//same for following-sibling 	 and 	preceding-sibling
		
	}
}
