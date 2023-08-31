package TestCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_A {

	@Test(groups= {"sanity"})
	public void firstTest()
	{
		System.out.println("this is first test");
	}
	
	@Test(groups= {"Regression"})
	public void SecondTest()
	{
		System.out.println("this is second test");
	}
	
	@Test(groups= {"sanity"})
	public void ThirdTest()
	{
		System.out.println("this is third test");
	}
	
	@Test
	   @Parameters("myName")
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }
}
