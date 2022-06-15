package com.pk_OrangeHRM;

import java.awt.Dimension;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HeadlessBrowser {
	  WebDriver driver=null;
	  
	    @Test
	    public void Firefox_Headless() {
	 
	        //WebDriverManager.firefoxdriver().setup();
	        WebDriverManager.chromedriver().setup();
	        //FirefoxOptions options = new FirefoxOptions();
	        ChromeOptions options = new ChromeOptions();

	        options.setHeadless(true);
	        options.addArguments("incognito");
	        //options.setHeadless(true);
	        //options.setHeadless(true);
	        //options.addArguments("incognito");
	        driver = new ChromeDriver(options);
	        //driver = new FirefoxDriver(options);
	        driver.manage().window().maximize();
	 
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        driver.quit();
	    }
	 
	}

