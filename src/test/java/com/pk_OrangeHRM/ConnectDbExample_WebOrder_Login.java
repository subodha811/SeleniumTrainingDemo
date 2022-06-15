package com.pk_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class ConnectDbExample_WebOrder_Login extends BaseClass {
	ChromeDriver driver;
	 
    @BeforeTest
    public void LaunchApp() throws Exception {
 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        Thread.sleep(3000);
        // driver.manage().window().maximize();
    }
 
    @Test
    public void ConnectSQLDB_With_LoginApp() throws ClassNotFoundException, SQLException, InterruptedException,
            InstantiationException, IllegalAccessException {
 
        ArrayList<String> sqlData = ConnectMySQLDatabase("jdbc:mysql://localhost:3306/weborder", "root", "Chinku@811");
        System.out.println("SQL Data from DB Example Class : " + sqlData + "\n Array List Size : " + sqlData.size());
 
        for (String sqlValues : sqlData) {
            System.out.println(sqlValues + " split : 0\t" + sqlValues.split("~")[0]);
            System.out.println(sqlValues + " split : 1\t" + sqlValues.split("~")[1]);
            String uname=sqlValues.split("~")[0];
            String upass=sqlValues.split("~")[1];
            //String expresult=sqlValues.split("~")[1];
 
            driver.findElement(By.id("ctl00_MainContent_username")).clear();
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
            driver.findElement(By.id("ctl00_MainContent_password")).clear();
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
            driver.findElement(By.id("ctl00_MainContent_login_button")).click();
            Thread.sleep(4000);
            /*driver.findElementById("welcome").click();
            Thread.sleep(3000);
            driver.findElementByLinkText("Logout").click();
            Thread.sleep(3000);*/
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
 
    }
 
    @AfterTest
    public void CloseApp() throws Exception {
 
        driver.quit();
    }
}
