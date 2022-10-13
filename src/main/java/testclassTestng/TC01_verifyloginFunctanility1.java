package testclassTestng;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNGpack.TestbaseClass;

public class TC01_verifyloginFunctanility1 extends TestbaseClass
{
	Logger log = Logger.getLogger("Saucedemo01");

	@Test
	public void verifyloginfunctionality1()
	{
		 PropertyConfigurator.configure("log4j.properties");
		log.info("6.Apply the validation");
		 String expectedTitle ="Swag Labs";
		 
		 String actualTitle =driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
		
		
	}
}
