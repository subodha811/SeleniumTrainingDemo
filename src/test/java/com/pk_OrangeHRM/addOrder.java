package com.pk_OrangeHRM;

import java.awt.Dimension;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class addOrder {
	ChromeDriver driver;
	 @Test
	  public void Update() {
		 driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		 driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Tester");
		 driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		 
	 

	  }
	
	@BeforeTest
    public void LaunchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }
    @AfterTest
    public void CloseBrowser()
    {
        driver.quit();
    }
	 
	}

