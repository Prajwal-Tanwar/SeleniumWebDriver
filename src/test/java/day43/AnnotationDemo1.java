package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 *	Login	------	@BeforeMethod
 * 	Search  ------	@Test
 * 	Logout	------	@AfterMethod
 * 	Login	
 * 	Advance Search -- @Test
 * 	Logout
 */
public class AnnotationDemo1 {
	
	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("Search");
	}
	
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("Advance Search");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("Logout");
	}
}
