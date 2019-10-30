package demoOct;

import org.testng.annotations.Test;

public class TestNGBasics {

	@Test(priority=2)
	public void registration() {
		System.out.println("Code for Registration");
	}
	
	@Test(groups= {"Smoke"})
	public void login() {
		System.out.println("Code for Login12245");
	}
	
	@Test (priority=1)		//Ordering
	public void logout() {
		System.out.println("Code for Log out");
	}

	@Test (enabled=false)	// for blocking a test case from execution
	public void forgotPassword() {
		System.out.println("Code for ForgotPassword");
	}
}
