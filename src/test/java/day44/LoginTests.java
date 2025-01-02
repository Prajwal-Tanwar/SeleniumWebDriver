package day44;

import org.testng.annotations.Test;
/*
 * loginByEmail			------		Sanity
 * loginByFacebook		------ 		Sanity
 * loginByInstagram		------		Sanity
 * 
 * signByEmail			------		Regression
 * signByFacebook		------		Regression
 * signByInstagram		------		Regression
 * 
 * paymentRupees		------		Sanity,Regression(Functional)
 * paymentDollars		------		Sanity,Regression(Functional)
 */
public class LoginTests {
	
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail() {
		System.out.println("Login By Email : ");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("Login By Facebook : ");
	} 
	
	@Test(priority=3,groups= {"sanity"})
	void loginByInstagram() {
		System.out.println("Login By Instagram : ");
	}
}
