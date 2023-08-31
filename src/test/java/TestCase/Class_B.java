package TestCase;

import org.testng.annotations.Test;

public class Class_B {

	@Test(groups= {"sanity"})
	public void fourthTest()
	{
		System.out.println("this is forth test");
	}
	
	@Test(groups= {"Regression"})
	public void fifthTest()
	{
		System.out.println("this is fifth test");

}
	
}
