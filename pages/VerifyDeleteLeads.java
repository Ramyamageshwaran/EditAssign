package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class VerifyDeleteLeads extends BaseMethods {
	public VerifyDeleteLeads(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}	
	public ViewLeadsPage selectLeadIdForDelete()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver,node);
	}
	

	public void findLeadToCheck()
	{
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	
	}

