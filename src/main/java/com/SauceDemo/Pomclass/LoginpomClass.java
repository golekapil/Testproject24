package com.SauceDemo.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpomClass 
{
//pom class steps 
	//1.Webdriver driver declare
	//2.ele find out by @findBy annotation 
	//3.create methode to perform action on it 
	//4.constructor creat
	
	
	
	//1. webdriver declare
	
	 WebDriver driver;
	
	// user name element findout  and action method
	
	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	//password element findout and its method
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password ;
	 public void sendpassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	
	//login button findout and action
	 @FindBy(xpath ="//input[@id='login-button']")
	 private WebElement login ;
	 public void clicklogin()
	 {
		 login.click();
	 }
	
	// create constructor
	 public LoginpomClass (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	 
	 
}
