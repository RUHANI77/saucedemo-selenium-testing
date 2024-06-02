package swaglabSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// Login Automation
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		
		// Find product and Add to Cart
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		
		// go to Cart and Checkout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		// Checkout: Your Information
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ruhani");
		Thread.sleep(3000);
		driver.findElement(By.id("last-name")).sendKeys("Akter");
		Thread.sleep(3000);
		driver.findElement(By.id("postal-code")).sendKeys("1205");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='continue'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		
		// Logout Automation
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(3000);
		
	}

}
