package day44;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1,groups= {"regression"})
	void signUpEmail() {
		System.out.println("Sign Up by Email : ");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signUpFacebook() {
		System.out.println("Sign Up by Facebook : ");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signUpInstagram() {
		System.out.println("Sign Up by Instagram : ");
	}
	
}
