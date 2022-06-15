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

public class Navigate {
	ChromeDriver driver;
    //WebDriver driver;

    @Test
    public void ForgetPassword() throws InterruptedException
    {

        driver.findElement(By.linkText("Forgot your password?")).click();
        String ExpURL="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
        String ActURL=driver.getCurrentUrl();
        Assert.assertEquals(ExpURL, ActURL);
        //Navigate back to Login Back
        driver.navigate().back();
        driver.findElement(By.id("btnLogin")).isDisplayed();
        //Navigate Forward
        driver.navigate().forward();
        String ExpURLForward="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
        String ActURLForward=driver.getCurrentUrl();
        Assert.assertEquals(ExpURLForward, ActURLForward);
        driver.navigate().refresh();
        String ExpURLForward1="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
        String ActURLForward1=driver.getCurrentUrl();
        Assert.assertEquals(ExpURLForward1, ActURLForward1);

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
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
    //Post Condition
    @AfterTest
    public void CloseBrowser(){
        //driver.quit();
    }
	 
	}

