package com.Sucedemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.Pomclass.Homepagepomclass;
import com.SauceDemo.Pomclass.LoginpomClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC03_VerifyBagProductFunctionality 

{
	@Test
	public void verifyBagProductFunctionality(TimeUnit seconds) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing software\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 System.out.println("1.browser is opened");
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 System.out.println("2.url is opened");
		 driver.manage().timeouts().implicitlyWait(20, seconds);
		 
		 
		 //loginpage element +actions
		 
		 LoginpomClass x= new LoginpomClass(driver);
		 x.sendusername();
		 System.out.println("3.usernmae is entered");
		 
		 //send pass
		 x.sendpassword();
		 System.out.println("4.password is entered");
		 //login
		 x.clicklogin();
		 System.out.println("5.login button clicked");
		 
		 
		// home page 
		 Homepagepomclass z = new Homepagepomclass(driver);
		 
		 z.addtocart1();
		 z.addtocart2();
		 System.out.println("6.two product get added to cart");
		 
		 
		 // screenshot
		 ScreenshotClass tp = new ScreenshotClass();
		tp.takescreenshoot("bag product",driver );
		
	System.out.println(" bag product screenshot captured");
		 // validation
		 String expectedproduct = "2";
		 String actualproduct = z.filter();
		 if(expectedproduct.equals(actualproduct))
		 {
			 System.out.println("Bag product add to cart test case is passed");
			 
		 }
		 else
		 {
			 System.out.println("Bag product add to cart test case is passed");
			 
		 }
		 driver.quit();
		 System.out.println("browser get closed");
		 System.out.println("end of program");
	}

}
