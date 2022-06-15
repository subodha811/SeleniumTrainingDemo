package com.pk_OrangeHRM;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class ScrollToElement {
	ChromeDriver driver;
    @Test
    public void ScrollElement() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
 
        // Launch the application        
        driver.get("https://stackoverflow.com/");

        WebElement Element = driver.findElement(By.linkText("Take a tour of Teams"));
        Thread.sleep(2000);
        //This will scroll the page Horizontally till the element is found        
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Thread.sleep(5000);
        Element.click();
        String ActTitle = driver.getTitle();
        System.out.println(ActTitle);
        Thread.sleep(2000);
        driver.quit();
    }
}
