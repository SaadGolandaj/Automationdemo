package TestCase;

import org.testng.annotations.Test;

import PageObjects.Search_ApiQuestion;

public class TC_ValidateSearchBar_001 extends BaseClass {

	
	@Test
	public void ValidateSearchBar() throws InterruptedException
	{
		driver.get(BaseUrl);
		Search_ApiQuestion St=new Search_ApiQuestion(driver);
		St.searchApi(course);
		Thread.sleep(2000);
		St.clickSearchButton();
		Thread.sleep(2000);
		System.out.println("hi saad");
	}
}
