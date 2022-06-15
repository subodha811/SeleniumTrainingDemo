//package com.pk_OrangeHRM;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.DriverManager;
//public class Lunch_Uncert_Browser {
//	WebDriver driver;
//	 
//   
// 
//    @SuppressWarnings("deprecation")
//    @BeforeTest
//    public void LaunchBrowserChrome() {
//    // Create object of DesiredCapabilities class
//    /*
//    * DesiredCapabilities capabilities = new DesiredCapabilities(); // other way to
//    * handle ACCEPT_SSL_CERTS or any insecure website.
//    * capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//    * capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//    */
//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("incognito");
//    options.setAcceptInsecureCerts(true);
//    //options.setHeadless(true);
//    //options.merge(capabilities); //this will merge the capabilities to the ChromeOptions
//    // setting system property for Edge browser
//    WebDriverManager.chromedriver().setup();
//    // create Edge instance and maximize it
//    //driver = new ChromeDriver(capabilities);
//    driver = new ChromeDriver(options);
//    driver.manage().window().maximize();
//    }
//
//    /*@BeforeTest
//    public void LaunchBrowserChrome() {
//         // Create object of DesiredCapabilities class
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        // other way to handle ACCEPT_SSL_CERTS or any insecure website.
//        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        //options.setHeadless(true);
//        options.merge(capabilities);  //this will merge the capabilities to the ChromeOptions
//        // setting system property for Edge browser
//        WebDriverManager.chromedriver().setup();
//        // create Edge instance and maximize it
//        //driver = new ChromeDriver(capabilities);
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//    }*/
// 
//    @Test
//    public void openApplication() {
//        System.out.println("Navigating to application");
//        driver.get("https://expired.badssl.com/");
//        String ActTitle=driver.getTitle();
//        String ExpTitle="expired.badssl.com";
//        Assert.assertEquals(ActTitle, ExpTitle);
//    }
// 
//    @AfterTest
//    public void tearDown() {
//        /*if (driver != null)
//            driver.quit();*/
//    }
//}
