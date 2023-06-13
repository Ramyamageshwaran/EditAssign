package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class VerifyEditLead extends BaseMethods{
	public String text;
	public VerifyEditLead(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	
	public VerifyEditLead verifyEditLeads() throws IOException
	{	
		 text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(text);
	     return this;
	}
}


