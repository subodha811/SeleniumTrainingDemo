package com.pk_OrangeHRM;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	// Read DB Function
    // Connection objectmy
        static Connection con = null;
        // Statement object
        private static java.sql.Statement stmt;
        // Constant for Database URL
        /*public static String DB_URL = "jdbc:mysql://localhost:3306/orangehrm";
        // Constant for Database Username
        public static String DB_USER = "root";
        // Constant for Database Password
        public static String DB_PASSWORD = "root";*/
 
        public ArrayList<String> ConnectMySQLDatabase(String DB_URL,String DB_USER,String DB_PASSWORD) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
                 {

        // String[][] arrayDBData = null;
            // Make the database connection
            String dbClass = "com.mysql.jdbc.Driver";
            //String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(dbClass);
            // Get connection to DB
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // Statement object to send the SQL statement to the Database
            stmt = con.createStatement();
 
            String query = "select uname,upass from login";
            // Get the contents of userinfo table from DB
            ResultSet res = stmt.executeQuery(query);
            // Print the result untill all the records are printed
            // res.next() returns true if there is any next record else returns
            // false

            ArrayList<String> sqlData = new ArrayList<String>();
            while (res.next()) {
                System.out.print("\t" + res.getString("uname"));
                System.out.println("\t" + res.getString("upass"));
                sqlData.add(res.getString("uname")+"~"+res.getString("upass"));
                //Adminadmin123
            }
 
            // Close DB connection
            if (con != null) {
                con.close();
            }
            return sqlData;
        }
        
        // String filePath_failure = "D:\\F Drive\\Selenium Training
        // Data\\workspace\\Maven_Selenium_WebDriver_4\\Screenshot_Failure";
        static String filePath = System.getProperty("user.dir");
     
        static String Relativepath_failure = filePath + "\\Screenshot_Failure";
        static String Relativepath_success = filePath + "\\Screenshot_Success";

        public static String getScreenshotfailure(WebDriver driver, String screenshotName) throws Exception {
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
                    //after execution, you could see a folder "FailedTestsScreenshots" under src folder
            String destination = Relativepath_failure + "//"+screenshotName+dateName+".png";
            File finalDestination = new File(destination);
            FileUtils.copyFile(source, finalDestination);
            return destination;
        }

        public static String getScreenshotSuccess(WebDriver driver, String screenshotName) throws Exception {
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
                    //after execution, you could see a folder "FailedTestsScreenshots" under src folder
            String destination = Relativepath_success + "//"+screenshotName+dateName+".png";
            File finalDestination = new File(destination);
            FileUtils.copyFile(source, finalDestination);
            return destination;
        }
}
