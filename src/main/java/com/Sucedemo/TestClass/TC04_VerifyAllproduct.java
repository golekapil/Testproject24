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

public class TC04_VerifyAllproduct 
{
	@Test
	public void verifyAllproduct_functionality(TimeUnit seconds) throws IOException
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
		 
		 // screen shot 
		 ScreenshotClass ap = new ScreenshotClass();
		 ap.takescreenshoot("loginpagescreenshot", driver);
		 System.out.println("screenshot captured");
	// apply validation
		 
		 Homepagepomclass al = new Homepagepomclass(driver);
		 al.clickallproduct();
		 
		 String expectedproduct = "6";
		 String actualproduct = al.filter();
		 if (expectedproduct.equals(actualproduct))
		 {
			 System.out.println("all product test case passed");
		 }
		 else 
		 {
			 
			 System.out.println("all product test case failed");
		 }
		
		driver.close();
		System.out.println("end of program");
	}

	
}
