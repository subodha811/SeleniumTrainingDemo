package com.pk_OrangeHRM;

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

public class Yatra_MouseOver_Login {
	WebDriver driver;
	@Test
    public void MouseHoverYatra() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        // create Edge instance and maximize it
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.yatra.com/");

        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        Actions action = new Actions(driver);
        action.moveToElement(MyAccount).build().perform();
        //driver.findElementById("signInBtn").click();

        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='login-form-container']//p[@class='main-title'][normalize-space()='Welcome to Yatra!']")).isDisplayed();
    }
}
