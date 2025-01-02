package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login() {
		
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advanceSearch() {
		
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout() {
		
	}

}