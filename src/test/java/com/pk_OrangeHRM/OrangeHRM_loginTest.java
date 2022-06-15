package com.pk_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_loginTest {

  @Test
  public void testTest() {
    
 
  //1. Launch the Chrome browser
	
  		WebDriverManager.chromedriver().setup();
  		ChromeDriver driver= new ChromeDriver();
  		
  		//. Enter the URL
  		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
  		//3. Enter the valid user name
  		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  		//4. Enter the valid valid password
  		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  		//5. Click on Login button
  		driver.findElement(By.id("btnLogin")).click();
  		
  		 
  		//Exp Result : Verify that user is on Dashboard page
  		
  		//driver.findElement(By.partialLinkText("welcome")).click()
  		driver.findElement(By.linkText("Dashboard")).isDisplayed();
  		//close the browser
  		driver.close();
  }
}
