package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String BaseUrl="https://testmatick.com/best-demo-websites-to-perform-software-test-automation/";
	public static WebDriver driver;
	public String course="API";
	
	@BeforeClass
	public void setup()
	{

		ChromeOptions co =new ChromeOptions();
		co.setBrowserVersion("116");
		 driver = new ChromeDriver();
		System.out.println("i am in before class");
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("i am in after class");
	}

}
