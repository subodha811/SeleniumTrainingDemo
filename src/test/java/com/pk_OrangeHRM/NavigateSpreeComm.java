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

public class NavigateSpreeComm {
	ChromeDriver driver;
    //WebDriver driver;

    @Test
    public void ForgetPassword() throws InterruptedException
    {

        driver.findElement(By.xpath("//a[@class='nav-link main-nav-bar-item main-nav-bar-category-button dropdown-toggle'][normalize-space()='Women']")).click();
        String ExpURL="https://demo.spreecommerce.org/t/categories/women";
        String ActURL=driver.getCurrentUrl();
        Assert.assertEquals(ExpURL, ActURL);
        Thread.sleep(3000);
        String ActTitle=driver.getTitle();
        System.out.println(ActTitle);
        String ExpTitle="Women - Spree Demo Site";
        Assert.assertEquals(ExpTitle, ActTitle);
        
        //Navigate back to Login Back
        driver.navigate().back();
        Thread.sleep(3000);
        String ExpURL1="https://demo.spreecommerce.org/";
        String ActURL1=driver.getCurrentUrl();
         Assert.assertEquals(ExpURL1, ActURL1);
         Thread.sleep(3000);
         String ActTitle1=driver.getTitle();
         String ExpTitle1="Homepage (English) - Spree Demo Site";
         Assert.assertEquals(ExpTitle1, ActTitle1); 
        driver.close();

    }
    //Pre-Condition
    @BeforeTest
    public void LaunchBrowser(){
         WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //This will wait for Page to load
            //driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
          //This will store or rememember the cookies or navigation in terms of back and forward
            driver.navigate().to("https://demo.spreecommerce.org/");
    }
    //Post Condition
    @AfterTest
    public void CloseBrowser(){
        //driver.quit();
    }
	 
	}

