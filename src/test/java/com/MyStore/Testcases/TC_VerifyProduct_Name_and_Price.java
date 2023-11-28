package com.MyStore.Testcases;

import org.openqa.selenium.By;

import com.MyStore.PageObject.HomePage;

public class TC_VerifyProduct_Name_and_Price extends BaseClass{

	public void verifyProductName() throws InterruptedException {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAddToCart();
		
		String productName = driver.findElement(By.xpath("(//h2[@class=\"woocommerce-loop-product__title\"])[1]")).getText();
		System.out.println(productName);
		
		String productPrice = driver.findElement(By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[5]")).getText();
        System.out.println(productPrice);
        
		homepage.clickOnViewCart();
		
		String productNameInCart = driver.findElement(By.xpath("(//td[@class=\"product-name\"])[1]")).getText();
		System.out.println(productNameInCart);

		String productPriceInCart = driver.findElement(By.xpath("(//td[@class=\"product-price\"])[1]")).getText();
        System.out.println(productPriceInCart);
		
	}
}

