package com.pk_OrangeHRM;

import java.awt.Dimension;
import java.util.List;
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

public class NavigateToAllLinks {
	ChromeDriver driver;
    //WebDriver driver;

	@Test
    public void navigateToAllLinks() throws InterruptedException {
 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in/");
 
        List<WebElement> linksize = driver.findElements(By.tagName("a"));
        int linksCount = linksize.size();
        System.out.println("Total no of links Available:" + linksCount);
        String[] links = new String[linksCount];
        System.out.println("List of links Available:");
        // print all the links from webpage
        for (int i = 0; i < linksCount; i++) {
 
            links[i] = linksize.get(i).getAttribute("href");
            System.out.println(linksize.get(i).getAttribute("href"));
        }
        // navigate to each Link on the webpage
        for (int i = 0; i < linksCount; i++) {
            driver.navigate().to(links[i]);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());

            driver.navigate().back();
 
        }
        driver.close();
    }
	 
	}

