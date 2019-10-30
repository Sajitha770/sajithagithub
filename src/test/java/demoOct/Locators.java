package demoOct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Sajitha\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");

		Dimension d = new Dimension (300,600);
		driver.manage().window().setSize(d);

		Thread.sleep(2000);

		Point p = new Point (300,400);
		driver.manage().window().setPosition(p);

		Thread.sleep(2000);

		driver.manage().window().maximize();


		driver.findElement(By.linkText("REGISTER")).click();
		
		String title = driver.getTitle();
		if(title.equals("Register: Mercury Tours"))
		{
			System.out.println("Title is correct:"+title);
		}
		else
		{
			System.out.println("Title is incorrect:"+title);
		}		

		// To capture total number of links and respective texts of "Register" page
		List<WebElement> T_links = driver.findElements(By.tagName("a"));
		int Tn_links = T_links.size();
		System.out.println("Total number of links on Register page:"+ Tn_links);
		for(int i=0;i<Tn_links;i++)
		{
			String linkText = T_links.get(i).getText();
			System.out.println(linkText);

		}

		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.name("lastName")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("5132456980");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("test@abc.com");
		Select countrydropdown = new Select (driver.findElement(By.name("country")));
		countrydropdown.selectByValue("15");
		
		//Flights Page
		
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String title1 = driver.getTitle();
		System.out.println("Title is:"+title1);
		driver.findElement(By.xpath("//input[starts-with(@value,'one')]"));
		Select passengers = new Select(driver.findElement(By.xpath(("//select[contains(@name,'passCount')]"))));
		passengers.selectByVisibleText("3");
		
		
		driver.close();
		

		

	}

}
