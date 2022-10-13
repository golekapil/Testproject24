package testclassTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.Pomclass.Homepagepomclass;

import testNGpack.TestbaseClass;

public class TC04_verifyAllproductFunctionality4 extends TestbaseClass


{
@Test
public void verifyallproductfunctainality4()
{
	 Homepagepomclass al = new Homepagepomclass(driver);
	 al.clickallproduct();
	 
	 String expectedproduct = "6";
	 String actualproduct = al.filter();
	 Assert.assertEquals(actualproduct, expectedproduct);
}

}
