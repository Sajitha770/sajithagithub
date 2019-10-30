package demoOct;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngGrouping {

	@Test(groups= {"Sanity"})
	public void launch() {
		System.out.println("Code for Launch");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void login() {
		System.out.println("Code for login");
	}
	
	@Test(groups= {"Smoke"})
	public void registration() {
		System.out.println("Code for registration");
	}
	
	@Test(groups= {"Sanity","Smoke"})
	public void addToCart() {
		System.out.println("Code for addToCart");
	}
	
	@Test(groups= {"Regression"})
	@Parameters({"location","DCNO"})
	public void removeFromCart(String location, String DCNO) {
		System.out.println("Code for removeFromCart");
		System.out.println(location);
		System.out.println(DCNO);
	}
}
