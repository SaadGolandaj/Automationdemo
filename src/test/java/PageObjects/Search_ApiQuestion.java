package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_ApiQuestion {
	
	WebDriver ldriver;
	
	public Search_ApiQuestion(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath="(//input[@type=\"text\"])[1]")
	WebElement SearchBox;

	@FindBy (id="searchsubmit")
	WebElement SearchButton;
	
	public void searchApi(String course)
	{
		SearchBox.sendKeys(course);
	}
	
	public void clickSearchButton()
	{
		SearchButton.click();
	}
	
	
	
	

}
