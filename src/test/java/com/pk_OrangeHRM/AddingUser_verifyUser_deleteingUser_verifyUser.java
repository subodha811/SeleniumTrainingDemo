//ChromeDriver driver;
//@BeforeTest
//public void LaunchBrowser()
//{
//WebDriverManager.chromedriver().setup();
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
//}
//
//public void Sign_On() throws InterruptedException
//
//{
//driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Admin");
//driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("admin123");
//driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//driver.findElement(By.linkText("View all orders")).getText();
//}
//public void AddOrderAndVerifyOrder()
//{
//
//driver.findElement(By.xpath("//a[text()='Order']")).click();
//
//
//Select dd = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
//dd.selectByVisibleText("ScreenSaver");
//
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).sendKeys("Demo");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("7");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("lee cooper");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("hinjedcf");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("banglore");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("509087");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList"));
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("5555 4444 6666 7777");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("09/22");
//driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
//Thread.sleep(2000);
//String UserName = "lee cooper";
//System.out.println(UserName);
//WebElement Actusername = driver.findElement(By.xpath("//a[text()='" + UserName + "']"));
//String valueIneed = Actusername.getText();
//System.out.println("Cell value is : " + valueIneed);
//Assert.assertEquals(UserName, valueIneed);
//
//
//
//}