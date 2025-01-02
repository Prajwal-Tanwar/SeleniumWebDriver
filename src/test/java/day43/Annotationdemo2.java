package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 *	Login	------	@BeforeClass
 * 	Search  ------	@Test
 * 	Advance Search -- @Test
 * 	Logout	------	@AfterClass
 */
public class Annotationdemo2{
	
	@BeforeClass
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
	
	@AfterClass
	void logout() {
		System.out.println("Logout");
	}
}
