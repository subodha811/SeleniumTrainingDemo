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
import java.util.Calendar;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DateSelectExample {
	WebDriver driver;

    @Test
    public void Date_Select() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");

        driver.findElement(By.id("datepicker")).click();

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement ele : allDates) {

            String date = ele.getText();
            Calendar now = Calendar.getInstance();
            int day = now.get(Calendar.DAY_OF_MONTH);
            String currentday = Integer.toString(day);
            System.out.println(day);
            if (date.equalsIgnoreCase(currentday)) {
            ele.click();

            break;
        }
        // driver.quit();
    }
}
}
