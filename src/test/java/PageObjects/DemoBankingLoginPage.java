package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBankingLoginPage {
	
	WebDriver ldriver;
	
	public DemoBankingLoginPage(WebDriver rdriver)   // if you want to call parameterize constructor then it should public
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);;
		
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter your username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your password\"]")
	WebElement password;
	
	@FindBy(id="log-in")
	WebElement signinbutton;
	
	
  public void setusername()
  {
	  username.sendKeys("saadgolandaj@gmail.com");
  }
  public void setpassword()
  {
	  password.sendKeys("12345");
	  
  }
  
  public void clicksignin()
  {
	  signinbutton.click();
	  
  }
  
  
	
	
	
	

}
