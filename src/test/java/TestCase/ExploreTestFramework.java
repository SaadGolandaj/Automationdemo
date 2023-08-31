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

import PageObjects.DemoBankingLoginPage;


public class ExploreTestFramework extends BaseClass{

	//public WebDriver driver;
	public static Logger logger;
	
    @Test
    public void exploretest() throws InterruptedException
    {
    try {	
    logger=Logger.getLogger("Automation_demo");   //here your need to specify the project name-->automation demo
    PropertyConfigurator.configure("Log4j.properties");     //here you need to pass the .properties file name
    
	//ChromeOptions co =new ChromeOptions();
	//co.setBrowserVersion("116");
	//driver = new ChromeDriver();
	 driver.get(appliteURL);
	 logger.info("url is opened");
	 
	 	 
	 Thread.sleep(3000);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	// wait.until(ExpectedConditions.visibilityOf(tst));
	 
	 DemoBankingLoginPage dm=new DemoBankingLoginPage(driver);
	 
	 dm.setusername();
			 
	 
	 //driver.findElement(By.xpath("//input[@placeholder=\"Enter your username\"]")).sendKeys("saadgolandaj@gmail.com");
	 logger.info("username is inserted");
	 
	// Thread.sleep(3000);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
    dm.setpassword();
	// driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("12345");
	 logger.info("password is inserted");
	 
	 
	 dm.clicksignin();
	 //driver.findElement(By.id("log-in")).click();
	 
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
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
	 
	 
    }
}
