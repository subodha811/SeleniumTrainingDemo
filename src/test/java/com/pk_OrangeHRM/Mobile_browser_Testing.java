package com.pk_OrangeHRM;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Mobile_browser_Testing {
	ChromeDriver driver;
	  @Test
	  public void SignOn() {

	          driver.get("https://www.borrowlenses.com/");
	 

	  }
	  @BeforeTest
	  public void LaunchBrowser() {
	        WebDriverManager.chromedriver().setup();

	        //ChromeOptions iPhoneOption = new ChromeOptions();
	 
	        driver = new ChromeDriver();
	        Dimension d = new Dimension(390, 844);
	        //driver.manage().window().maximize();
	        driver.manage().window().setSize(d);
	 
	  }
	 
	  @AfterTest
	  public void CloseBrowser() {
	    //    driver.quit();
	  }
	 
	}

