package com.ecomarceproject.com.ecomarce.listeners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.Strings;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.ecomarceproject.com.ecomarce.basepage.Basepagejava;
import com.gargoylesoftware.htmlunit.javascript.host.html.Image;

import freemarker.template.utility.DateUtil.CalendarFieldsToDateConverter;

public class Listener extends Basepagejava implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("Test is skipped:"+arg0.getMethod().getMethodName());
		
	}

	public void onTestStart(ITestResult arg0) {
		Reporter.log("Test start Runing:"+arg0.getMethod().getMethodName());
		
	}
	

	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("Test is success"+arg0.getMethod().getMethodName());
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat simpledate=new SimpleDateFormat("dd_MM_hh_mm_ss");
		String methodname = arg0.getName();
		if(arg0.isSuccess()){
			
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String reportdirectory = (new File (System.getProperty("user.dir")).getAbsolutePath()+
					"/src/main/java/com/ecomarce");
			File targetpath = new File((String)reportdirectory+"/failedScreens/"+methodname+""
					+simpledate.format(cal.getTime())+".png");
			try {
				FileUtils.copyFile(sourcepath, targetpath);
				
			} catch (Exception e) {
				
			}
			Reporter.log("<a href='"+targetpath.getAbsolutePath()+"'>"+"<img src='"
					+targetpath.getAbsolutePath()+"'height='100'/></a>");
		
			
			
		}
		
	}

}
