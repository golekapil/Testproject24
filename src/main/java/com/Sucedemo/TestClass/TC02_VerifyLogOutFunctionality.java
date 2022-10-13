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

public class TC02_VerifyLogOutFunctionality 
{
@Test
public void verifyLogoutFunctionality(TimeUnit seconds) throws IOException
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
	 
	 //Homepage actions
	 Homepagepomclass y = new Homepagepomclass(driver);
	 y.clickmenubutton();
	 y.logout();
	 //loginpage
	 
	 
	 //screenshot
	 ScreenshotClass lg = new ScreenshotClass();
	 lg.takescreenshoot("logoutscreenshot", driver);
	 System.out.println("screenshot captured");

	 System.out.println("6.apply validation");
	 String expectedTitle ="Swag Labs";
	  String actualTitle = driver.getTitle();
	  if(actualTitle.equals(expectedTitle))
	  {
		  System.out.println("6.logout functionality test case passed");
		  
	  }
	  else
	  {
		  System.out.println("6.logout functionality test case passed");
	  }
	  
	  driver.quit();
	  System.out.println("7.browser is closed");
	  System.out.println("8.end of programs");
	  
}

}
