package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Sampletest {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions();
	    co.setBrowserVersion("116");
	    
		driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
		
	}
}
