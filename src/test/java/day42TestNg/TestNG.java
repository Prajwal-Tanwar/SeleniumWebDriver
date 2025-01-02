package day42TestNg;

import org.testng.annotations.Test;

/*
 *	1) Open App
 *  2) Login
 *  3) Logout 
 *  
 *  If we Dont write priority then it will run alphabetical order
 */

public class TestNG {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("Open App");
	}
	
	@Test(priority=2)
	void Login() {
		System.out.println("Login App");
	}
	
	@Test(priority=3)
	void Logout() {
		System.out.println("Logout"); 
	}
}
