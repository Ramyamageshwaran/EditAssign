package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class EditLead extends BaseMethods {
	
	public EditLead(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	    
	    
	    public EditLead enterCompName(String cname)
	    {
	    	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	    	return this;
	    }
	    public VerifyEditLead updateButton()
	    {
	    	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    	return new VerifyEditLead(driver,node);
	    }
	    public VerifyViewLead submitButton()
	    {
	    	driver.findElement(By.name("submitButton")).click();
	    	return new VerifyViewLead(driver,node);
	    }
	}



