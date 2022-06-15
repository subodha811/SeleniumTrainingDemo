package com.pk_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OrangeHrm_loginTestCase_DataProvider2 extends OrangeHRM_TestData {

	WebDriver driver;
	 
    // ChromeDriver driver;
    @BeforeTest
    public void LaunchBrowser() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
    @AfterTest
    public void CloseBrowser() {
        // driver.close();//Close will close only current chrome browser
        driver.quit();
    }
 
    @Test(dataProvider="LoginScenario")
    public void LoginToOrangeHRM(String Uname, String Upass, String Umsg) throws InterruptedException {
 
        // driver.manage().window().fullscreen();
        // This will wait for Page to load
        // driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        // This will store or rememember the cookies or navigation in terms of
        // back and forward

        driver.findElement(By.name("txtUsername")).sendKeys(Uname);
        driver.findElement(By.name("txtPassword")).sendKeys(Upass);
        driver.findElement(By.id("btnLogin")).click();
        // Verify that Dashboard page displayed
       
        String ActElement = driver.findElement(By.linkText(Umsg)).getText();
        String ExpElement = Umsg;
 if (ActElement.equals(ExpElement)) {
	 driver.findElement(By.id("welcome")).click(); Thread.sleep(3000);
     driver.findElement(By.linkText("Logout")).click();
     System.out.println("valid credential");
		}
 else {
	 driver.findElement(By.linkText("Invalid credentials")).getText();
	 System.out.println("invalid credential");
}
        Assert.assertEquals(ActElement, ExpElement);
        System.out.println(ActElement);
        // ----------------To Verify Logout Function----------------
 
        /*
         * driver.findElement(By.id("welcome")).click(); Thread.sleep(3000);
         * driver.findElement(By.linkText("Logout")).click(); String ActLogpanel
         * = driver.findElement(By.id("logInPanelHeading")).getText(); String
         * ExpLogpanel="LOGIN Panel"; Assert.assertEquals(ActLogpanel,
         * ExpLogpanel); System.out.println(ActLogpanel);
         */
        // ----------------To Verify Logout Function without using
        // Assert----------------
        Thread.sleep(3000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.id("logInPanelHeading")).isDisplayed();
 
    }
}
