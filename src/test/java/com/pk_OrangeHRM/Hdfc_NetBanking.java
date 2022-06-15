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

public class Hdfc_NetBanking {
	  WebDriver driver=null;
	  
	    @Test
	    public void Firefox_Headless() {
	 
	        //WebDriverManager.firefoxdriver().setup();
	        WebDriverManager.chromedriver().setup();
	        //FirefoxOptions options = new FirefoxOptions();
	        ChromeOptions options = new ChromeOptions();

//	        options.setHeadless(true);
//	        options.addArguments("incognito");
	        //options.setHeadless(true);
	        //options.setHeadless(true);
	        //options.addArguments("incognito");
	        driver = new ChromeDriver(options);
	        //driver = new FirefoxDriver(options);
	        driver.manage().window().maximize();
	        
	        driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
	      //driver.switchTo().frame(0);
	        driver.switchTo().frame("login_page");
	        driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1111");
	        driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
	        
	        Boolean value=driver.findElement(By.xpath("//input[@id='fldPasswordDispId']")).isDisplayed();
	        System.out.println(value);
	        driver.quit();
	    }
	 
	}

