package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class MyLeadsPage extends BaseMethods {
	public MyLeadsPage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}	
	public CreateLeadPage createLeads()throws InterruptedException
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver,node);
	}
	
	public FindLeads findLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeads(driver,node);
	}
	
	
	

}
