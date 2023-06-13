package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class FindLeads extends BaseMethods {
	      //public static String leadId;
	
            public FindLeads(ChromeDriver driver,ExtentTest node)
	        {
		    this.driver=driver;
		    this.node=node;
	        }
			public FindLeads clickPhoneButton()
			{
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				return this;
			}
			public FindLeads enterPhoneNo(String pnum)
			{
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
				return this;
			}
			public FindLeads clickFindLeads()
			{
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				return this;
			}
			
		    public ViewLeadsPage clickLeadId() throws InterruptedException
		    {
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		    	
		    	return new ViewLeadsPage(driver,node);
		    }	
		    
		    public FindLeads nameAndIdButton()
		    {
		    	driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		    	return this;
		    }
		    
		    public FindLeads leadIdforcheackin()
		    {
		    	driver.findElement(By.name("id")).sendKeys("100865");
		    	return this;
		    }
		    
		    public FindLeads verifyDelete()
			{
				String text = driver.findElement(By.className("x-paging-info")).getText();
				if (text.equals("No records to display")) {
					System.out.println("Leads Deleted");
				} else {
					System.out.println("Leads not Deleted");
				}
				return this;
			}
		  /*  public void enterCompName()
		    {
		    	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
		    }
		    public void submitButton()
		    {
		    	driver.findElement(By.name("submitButton")).click();
		    }
		}*/


}





