package com.pk_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_loginTest4 {
ChromeDriver driver;
  @Test
  public void testTest() {
  		

  		//3. Enter the valid user name
  		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
  		//4. Enter the valid valid password
  		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
  		//5. Click on Login button
  		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']")).click();
  		
  		
  		//Exp Result : Verify that user is on Dashboard page
  		 if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
  		      System.out.println("Login Successfully");
  		      }
  		      else {
  		      System.out.println("Login Failed");
  		      }
  		
  		//logout
  		driver.findElement(By.linkText("Logout")).click();
  		if(driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']")).isDisplayed()) {
  	      System.out.println("Logout Successfully");
  	      }
  	      else {
  	      System.out.println("Logout Failed");
  	      }  	
    }
  @BeforeTest
  public void LaunchBrowser()
  {

    //1.Launch Chrome
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
	//2. Enter the URL
      driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
  }
  @AfterTest
  public void CloseBrowser()
  {
		//close the browser
  		driver.close();
  }
}
