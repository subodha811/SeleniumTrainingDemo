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

public class Authontication {
	WebDriver driver;
    @Test
    public void HTTPAuth() throws InterruptedException {
        //driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        String confmsg=driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
        System.out.println(confmsg);

    }
    @BeforeTest
    public void LaunchBrowser() {
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

    @AfterTest
    public void CloseBrowser() {
          driver.quit();
    }
	 
	}

