package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sample_testNG {
	@Test
	public void runtestNG()
	{
		ChromeOptions co =new ChromeOptions();
		co.setBrowserVersion("116");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.4.0");
	}

}
