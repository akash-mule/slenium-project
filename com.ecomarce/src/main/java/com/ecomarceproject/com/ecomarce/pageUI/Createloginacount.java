package com.ecomarceproject.com.ecomarce.pageUI;




import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ecomarceproject.com.ecomarce.basepage.Basepagejava;




public class Createloginacount extends Basepagejava {
	public static final Logger
	log=Logger.getLogger(Createloginacount.class.getName());
	//log=Logger.getLogger(Createloginacount.class.getName());
	
	
	@FindBy(linkText="Sign in") WebElement signin;
	@FindBy(id="email_create")WebElement emailid;
	@FindBy(id="SubmitCreate")WebElement submit;
	@FindBy(xpath=".//*[@id='SubmitCreate']")WebElement createAnAcount;
	@FindBy(id="id_gender1")WebElement radiobutton;
	@FindBy(id="customer_firstname")WebElement txtfirstname;
	@FindBy(id="customer_lastname")WebElement txtlastname;
	@FindBy(id="passwd")WebElement txtpassword;
	@FindBy(id="days")WebElement dropdowndays;
	@FindBy(id="months")WebElement dropdownmonth;
	@FindBy(id="years")WebElement dropdownyears;
	@FindBy(id="address1")WebElement txtaddress1;
	@FindBy(id="city")WebElement txtcity;
	@FindBy(id="id_state")WebElement dropdownstate;
	@FindBy(id="postcode")WebElement txtzipcode;
	@FindBy(id="id_country")WebElement dropdowncountry;
	@FindBy(id="phone_mobile")WebElement txtmobileno;
	@FindBy(id="alias")WebElement txtaliasaddress;
	@FindBy(id="submitAccount")WebElement btnregister;
	
	
	
	
	
	
	
	
	
	public void createaccount() throws Exception{
		
		signin.click();
		log.info("clicked on sign in butten");
		emailid.sendKeys(getdata("firstName")+getdata("lastname")+randomnumber()+getdata("domainName"));
		 submit.click();
		 createAnAcount.click();
		 //elementvisible(30, submit);
		 Thread.sleep(5000);
		 radiobutton.click();
		 txtfirstname.sendKeys("Mahesh");
		 txtlastname.sendKeys("D");
		 txtpassword.sendKeys("abc@1234");
		 selectoption(dropdowndays, 3);
		 selectoption(dropdownmonth, 3);
		 selectoption(dropdownyears, 3);
		 txtaddress1.sendKeys(getdata("address1"));
		 txtcity.sendKeys(getdata("city"));
		 selectoption(dropdownstate, 3);
		 txtzipcode.sendKeys("12345");
		 selectoption(dropdowncountry, 1);
		 txtmobileno.sendKeys("1234567890");
		 txtaliasaddress.sendKeys("Vijayawada");
		 btnregister.click();
		// Thread.sleep(5000);
		// assertEquals(arg0, arg1, arg2	
		
	}
	public Createloginacount(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	

	} 


