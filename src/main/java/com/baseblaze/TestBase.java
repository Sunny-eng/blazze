package com.baseblaze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;  
	public TestBase() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sunny Chawla\\eclipse-workspace\\blaze.com\\src\\main\\java\\com\\config\\config.properties");
		prop.load(fis);
	}
	@BeforeMethod
    public static void initilization() {
	 String browsername = prop.getProperty("browser");
	 if (browsername.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny Chawla\\eclipse-workspace\\com.facebook\\target\\chromedriver.exe");
		 driver = new ChromeDriver();
	} 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
	 
	 driver.get(prop.getProperty("url"));
} 
	
	@AfterTest
	public void teardown() {
		
	driver.quit();   
}


}