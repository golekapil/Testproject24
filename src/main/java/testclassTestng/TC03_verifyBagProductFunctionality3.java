package testclassTestng;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.Pomclass.Homepagepomclass;

import testNGpack.TestbaseClass;

public class TC03_verifyBagProductFunctionality3 extends TestbaseClass
{
	
	@Test
	public void verifybagproductfunctionality3()
	{
		Homepagepomclass z = new Homepagepomclass(driver);
		 String expectedproduct = "2";
		 String actualproduct = z.filter();
		Assert.assertEquals(actualproduct, expectedproduct);
		
	}

}
