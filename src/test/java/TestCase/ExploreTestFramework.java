package TestCase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExploreTestFramework extends BaseClass{

	//public WebDriver driver;
	public static Logger logger;
	
    @Test
    public void exploretest() throws InterruptedException
    {
    	
    logger=Logger.getLogger("Automation_demo");
    PropertyConfigurator.configure("Log4j.properties");
    
	//ChromeOptions co =new ChromeOptions();
	//co.setBrowserVersion("116");
	//driver = new ChromeDriver();
	 driver.get("https://demo.applitools.com/");
	 logger.info("url is opened");
	 
	 	 
	 Thread.sleep(3000);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	// wait.until(ExpectedConditions.visibilityOf(tst));
	 
	 
	 
	 driver.findElement(By.xpath("//input[@placeholder=\"Enter your username\"]")).sendKeys("saadgolandaj@gmail.com");
	 logger.info("username is inserted");
	 
	// Thread.sleep(3000);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     

	 driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("12345");
	 logger.info("password is inserted");
	 
	 driver.findElement(By.id("log-in")).click();
	 
	 //WebDriverWait wait = new WebDriverWait(driver,30);
	 
	 WebElement addacount=driver.findElement(By.xpath("//span[text()=\"Add Account\"]"));
	 Actions act=new Actions(driver);
	 
	act.moveToElement(addacount).build().perform();
	String str= addacount.getText();
	System.out.println(str);

	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("Window.scrollBy(0,1000)", "");
	js.executeScript("window.scrollBy(0,1000)", "");
	 Thread.sleep(2000);

	 
	 
	 //driver.quit();
	 
	 
	 
	 
	 
    }
}
