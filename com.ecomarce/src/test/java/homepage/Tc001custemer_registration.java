package homepage;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ecomarceproject.com.ecomarce.basepage.Basepagejava;

import com.ecomarceproject.com.ecomarce.pageUI.Createloginacount;


public class Tc001custemer_registration extends Basepagejava{
	public static final Logger
	log=Logger.getLogger(Tc001custemer_registration.class.getClass());
	
  @Test
  public void f() throws Exception {
	  log.info("test case runing started");
	  Createloginacount login=new Createloginacount(driver);
	  login.createaccount();
	  log.info("end test case");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  browserlaunch(getdata("browser"),getdata("url"));
	  
  }
  
 
}






