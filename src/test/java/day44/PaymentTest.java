package day44;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=1,groups= {"sanity","regression"})
	void paymentRupees(){
		System.out.println("Payment in Rupees");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	void paymentDollar(){
		System.out.println("Payment in Dollar");
	}
	
}
