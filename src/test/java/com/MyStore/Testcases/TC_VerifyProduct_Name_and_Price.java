package com.MyStore.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObject.HomePage;

public class TC_VerifyProduct_Name_and_Price extends BaseClass{
    @Test
	public void verifyProductName() throws InterruptedException {
		
    	driver.manage().window().maximize();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAddToCart();
		
		String productName = driver.findElement(By.xpath("(//h2[@class=\"woocommerce-loop-product__title\"])[1]")).getText();
		System.out.println("Name Of Product : "+productName);
		
		String productPrice = driver.findElement(By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[5]")).getText();
        System.out.println("Price Of Product : "+productPrice);
        
		System.out.println("----------------Cart----------------");
		homepage.clickOnViewCart();
		
		String productNameInCart = driver.findElement(By.xpath("(//td[@class=\"product-name\"])[1]")).getText();
		System.out.println("Name Of Product In Cart : "+productNameInCart);

		String productPriceInCart = driver.findElement(By.xpath("(//td[@class=\"product-price\"])[1]")).getText();
        System.out.println("Name Of Product In Cart : "+productPriceInCart);
        
        if((productName.equalsIgnoreCase(productNameInCart)) && (productPrice.equalsIgnoreCase(productPriceInCart))) {
        	
        	System.out.println("Pass");
        }
        else {
        	System.out.println("Fail");
        }
        
        driver.close();
		
	}
}

