package PropertyfileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyfile {
	Properties prop;
	ReadPropertyfile()
	{
	  File src=new File("C:\\Users\\Saad Golandaj\\eclipse-workspace\\Automation_demo\\src\\test\\java\\PropertyfileOperation\\config.properties");
	  try {
		  FileInputStream fis =new FileInputStream(src);
		  prop=new Properties();
		  prop.load(fis);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Exception is"+e.getMessage());
	  }
	}
	
	public String getName(String name)
	{
		String value=prop.getProperty(name);
		return value;
	}
	
	public String getAddress(String Address)
	{
		String value=prop.getProperty(Address);
		return value;
	}
}
