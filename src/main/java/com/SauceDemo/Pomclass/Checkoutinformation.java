package com.SauceDemo.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutinformation 
{
WebDriver driver;

// find element
//name    //input[@id='first-name']
// last name     //input[@id='last-name']
//pin     //input[@id='postal-code']


//firstname

@FindBy(xpath ="//input[@id='first-name']")
private WebElement firstname;
public void firstname()
{
	firstname.sendKeys("kapil ");
}


//lastname
  
@FindBy(xpath ="//input[@id='last-name']")
private WebElement lastname;
public void lastname()
{
	firstname.sendKeys("gole");
}

//pincode


@FindBy(xpath ="//input[@id='postal-code']")
private WebElement pincode;
public void pincode()
{
	firstname.sendKeys("412105");
}
	//contineu

@FindBy(xpath="//input[@class='submit-button btn btn_primary cart_button btn_action']")
private WebElement contineu ;
	
public void  contineu()
{
	 contineu.click();
}

//cancle

@FindBy(xpath="//button[@id='cancel']")
private WebElement cancle;
public void cancle()
{
	cancle.click();
}


///finish  


@FindBy(xpath ="//button[@id='finish']")
private WebElement finish ;
public void finish()
{
	finish.click();
}
	




}
