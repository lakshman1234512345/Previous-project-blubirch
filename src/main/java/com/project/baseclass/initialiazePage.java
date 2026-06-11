package com.project.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.project.Utils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Hello world!
 *
 */
public class initialiazePage 
{
	
	public static WebDriver driver;
	public static Properties prop;
	public static ClassLoader _class;
	
	public initialiazePage(){
		_class = getClass().getClassLoader();
	}
	
	public static void initialization() throws InterruptedException  
	{
		try {
			
			//InputStream is = _class.getResourceAsStream("data.properties");
			FileInputStream is=new FileInputStream("C:\\Users\\Blubirch\\eclipse-workspace\\QA\\src\\main\\resourse\\data.properties");
			prop = new Properties();
			prop.load(is);
			//System.out.println(prop.getProperty("d1"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("Browser");
		if (browserName.equals("chrome")) {
			//ChromeOptions co=new ChromeOptions();
			//co.setBinary("C:\\Users\\Blubirch\\Downloads\\chrome-win32\\chrome-win32");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Blubirch\\eclipse-workspace\\QA\\src\\main\\resourse\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

	  }
     else if (browserName.equals("FF")) {
	 System.setProperty("webdriver.edge.driver","C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\src\\main\\resources\\msedgedriver.exe");
	 driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	}
		
		
		public void failed(String testMethodName) {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				Files.copy(srcFile, new File("C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\Screenshoot"+testMethodName+"_"+".jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}    
}
