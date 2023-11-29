package com.MyStore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	
	public HomePage(WebDriver rDriver) {
		
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "(//a[text()=\"Add to cart\"])[1]")
	WebElement addToCart;
	
	public void clickOnAddToCart() throws InterruptedException {
		
		JavascriptExecutor AC = (JavascriptExecutor)ldriver;
		AC.executeScript("window.scrollBy(0, 400)","");
		addToCart.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "(//a[text()=\"Add to cart\"])[3]")
	WebElement addToCart2;
	
	public void clickOnAddToCart2() throws InterruptedException {
		
		addToCart2.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "(//a[@class=\"added_to_cart wc-forward\"])[2]")
	WebElement viewCart;
	
	public void clickOnViewCart() throws InterruptedException {
		
		viewCart.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "(//a[@class=\"added_to_cart wc-forward\"])[1]")
	WebElement viewCart2;
	
	public void clickOnViewCart2() throws InterruptedException {
		
		viewCart.click();
		Thread.sleep(2000);
		JavascriptExecutor AS = (JavascriptExecutor)ldriver;
		AS.executeScript("window.scrollBy(0, 500)","");
		Thread.sleep(2000);
	}
}
