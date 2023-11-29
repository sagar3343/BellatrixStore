package com.MyStore.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObject.HomePage;

public class TC_VerifySubTotalAmount extends BaseClass{
	@Test
	public void verifySubTotalAmount() throws InterruptedException {

		driver.manage().window().maximize();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAddToCart();
		homepage.clickOnAddToCart();
		homepage.clickOnAddToCart2();
		homepage.clickOnViewCart2();
		
		String TotalCart1 = driver.findElement(By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[1]")).getText();
		
		String Price = driver.findElement(By.xpath("(//td[@class=\"product-price\"])[1]")).getText();
		System.out.println("Price OF First Product : "+Price);
		
		//String Quantity = driver.findElement(By.xpath("(//input[@class=\"input-text qty text\"])[1]")).getText();
		//System.out.println("Quantity OF First Product : "+Quantity);
		
		String SubTotal = driver.findElement(By.xpath("(//td[@class=\"product-subtotal\"])[1]")).getText();
		System.out.println("SubTotal OF First Product : "+SubTotal);
	
		
		String Price2 = driver.findElement(By.xpath("(//td[@class=\"product-price\"])[2]")).getText();
		System.out.println("Price OF Second Product : "+Price2);
		
		//String Quantity2 = driver.findElement(By.xpath("(//input[@class=\"input-text qty text\"])[2]")).getText();
		//System.out.println("Quantity OF Second Product : "+Quantity2);
		
		String SubTotal2 = driver.findElement(By.xpath("(//td[@class=\"product-subtotal\"])[2]")).getText();
		System.out.println("SubTotal OF Second Product : "+SubTotal2);
			
		String TotalCart2 = driver.findElement(By.xpath("(//td[@data-title=\"Subtotal\"])[3]")).getText();
		System.out.println("Total Amount In Cart : "+TotalCart2);
			
		if(TotalCart1.equalsIgnoreCase(TotalCart2)) {
			
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");

		}
		
	}

}
