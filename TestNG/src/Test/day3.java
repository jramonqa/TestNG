package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(timeOut=400)
	public void WebloginCarLoan()
	{
		//Selenium
		System.out.println("WebloginCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLogan ()
	{
		//Appium
		System.out.println("MobileLoginCarLogan");
	}
	
	
	@Parameters({"URL"})
	@BeforeSuite
	public void Bsuite (String urlname)
	{
		System.out.println("I am no 1");
		System.out.println(urlname);
	}
	
	@Test(enabled=false)
	public void mobileX()
	{
		System.out.println("login X");
	}
	
	@Test(dependsOnMethods= {"MobileLoginCarLogan"})
	public void LoginAPICarLoan ()
	{
		//Rest API Automation
		System.out.println("LoginAPICarLoan");
	}

}
