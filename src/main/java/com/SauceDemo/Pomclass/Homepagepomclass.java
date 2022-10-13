package com.SauceDemo.Pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepagepomclass

{

	   WebDriver driver ;
	 private Select s ;
	
	// 1. find out web Element  add its action methods
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart1;
	 public void addtocart1()
	 {
		 addtocart1.click();
	 }
	 //2. add to cart
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	 private WebElement addtocart2;
	 public void addtocart2()
	 {
		 addtocart2.click();
	 }
	  
	 
	 // cart filter
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 private WebElement filter;
	 public String  filter()
	 {
		String totalproducts= filter.getText();
		return totalproducts;
	 }
	 
	 
	 // multiple product addto card
	 @FindBy(xpath="//button[text()='Add to cart']")
	 private List<WebElement>allproduct;
	 
	 public void clickallproduct()
	 {
		// for (int i=0; i<=allproduct.size();i++)
		 for(WebElement allproduct :allproduct)
		 {
			 allproduct.click();
		 }

	 }
	 
	 // drowpdown
	 @FindBy(xpath="//select[@class='product_sort_container']")
	 private WebElement drowpdown;
	 public void drowpdown()
	 {
		 drowpdown.click();
		s.selectByValue("lohi"); 
	 }
	 
	 // menu button 
	 @FindBy(xpath ="//button[@id='react-burger-menu-btn']")
	 private WebElement menubutton;
	 public void clickmenubutton()
	 
	 {
		 menubutton.click();
	 }
	 
	 @FindBy(xpath ="//a[@id='logout_sidebar_link']")
	 private WebElement logout;
	 public void logout()
	 {
		 logout.click();
	 }
	 
	 //constructor creat
	 public Homepagepomclass(WebDriver driver)
	 {
		 this.driver =driver;
			PageFactory.initElements(driver, this);
         s= new Select(drowpdown);
        		 
	 }
}
