package com.ecomarceproject.com.ecomarce.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepagejava {
	public static WebDriver driver;
	public static final String path="./config.properties";
	public String log4jpath="log4j.properties";
	public void browserlaunch(String browser,String url){
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			PropertyConfigurator.configure(log4jpath);
			
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
					+ "//com.ecomarce//browser//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	public String getdata(String key) throws Exception{
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
		
		
	}
	public int randomnumber(){
		Random r=new Random();
		int random=r.nextInt(99999);
		return random;
	}
	public void selectoption(WebElement element,int option){
		Select s=new Select(element);
		s.selectByIndex(option);
		
	}
	public void elementvisible(int time,WebElement element){
		 WebDriverWait wait = new WebDriverWait(driver,time);
		 wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	 

}
