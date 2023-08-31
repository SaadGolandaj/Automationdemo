package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public String BaseUrl="https://testmatick.com/best-demo-websites-to-perform-software-test-automation/";
	public static WebDriver driver;
	public String course="API";
	public String appliteURL="https://demo.applitools.com/";
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser)
	{
         if(browser.equalsIgnoreCase("chrome"))
         {
		ChromeOptions co =new ChromeOptions();
		co.setBrowserVersion("116");
		 driver = new ChromeDriver();
		System.out.println("i am in before class");
         }
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("i am in after class");
	}

}
