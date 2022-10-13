package testNGpack;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.Pomclass.Homepagepomclass;
import com.SauceDemo.Pomclass.LoginpomClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TestbaseClass 
{
 public WebDriver driver;
 Logger log = Logger.getLogger("Saucedemo01");

 
 @Parameters("browsername")
 @BeforeMethod
 public void setup(String browsername) throws IOException 
 {
	 if(browsername.equals("chrome"))
	 {
	 System.setProperty("webdriver.chrome.driver", "./Driverfiles\\chromedriver.exe");
	   driver = new ChromeDriver();
	//   PropertyConfigurator.configure("log4j.properties");
	 
	
 }
 else
 {
	 System.setProperty("webdriver.gecko.driver", "./Driverfiles\\geckodriver.exe");
	   driver = new FirefoxDriver();
	 
	 
 }
	 
	 
	 PropertyConfigurator.configure("log4j.properties");
	 log.info(" browser is open");
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 
	 log.info("2.url is opened");
//	driver.manage().timeouts().implicitlyWait(30, seconds)
	 
	 
	 //loginpage element +actions
	 
	 LoginpomClass x= new LoginpomClass(driver);
	 x.sendusername();
	 log.info("3.usernmae is entered");
	 
	 //send pass
	 x.sendpassword();
	 log.info("4.password is entered");
	 //login
	 x.clicklogin();
	 log.info("5.login button clicked");
	 
	 
	// home page 
	 Homepagepomclass z = new Homepagepomclass(driver);
	 
	 z.addtocart1();
	 z.addtocart2();
	 log.info("6.two product get added to cart");
	 
	 
	 // screenshot
	 ScreenshotClass tp = new ScreenshotClass();
	tp.takescreenshoot("bag product",driver );
	
	log.info(" bag product screenshot captured");
	 
	 
	 
	 
	 
	 
 }
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		log.info("7.browser is closed");
		log.info("8.end of programs");
		
		
		
		
		
	}
	
	
}
