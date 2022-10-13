package com.SauceDemo.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Yourcartpomclass 

{
WebDriver driver;

// add to cart element
@FindBy(xpath ="//a[@class='shopping_cart_link']")
private WebElement cart;
public void cart()
{
	cart.click();
}

//Continue shopping
@FindBy(xpath ="//button[@id='continue-shopping']")
private WebElement continueshopping;
public void  continueshopping()
{
	 continueshopping.click();
}

//checkout
@FindBy(xpath="//button[@id='checkout']")
private WebElement checkout;

public void checkout()
{
	checkout.click();
}


}
