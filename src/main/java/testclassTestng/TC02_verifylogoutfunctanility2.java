package testclassTestng;




import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNGpack.TestbaseClass;

public class TC02_verifylogoutfunctanility2 extends TestbaseClass
{
	Logger log = Logger.getLogger("Saucedemo01");
@Test
public void verifyloutFunctanility2()
{
	 log.info("6.apply validation");
	 String expectedTitle ="Swag Labs";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	
	
	
	
}









}
