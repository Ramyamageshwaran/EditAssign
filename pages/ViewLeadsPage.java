package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class ViewLeadsPage extends BaseMethods {
	
	public ViewLeadsPage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	public EditLead clickEditButton()
    {
    	driver.findElement(By.linkText("Edit")).click();
    	return new EditLead(driver,node);
    }
    public VerifyDuplicateLead clickDuplicateButton()
    {
    	driver.findElement(By.linkText("Duplicate Lead")).click();
    	return new VerifyDuplicateLead(driver,node);
    }
    public FindLeads clickDeleteButton()
    {
    	
    	 driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous'][text()='Delete']")).getText();
    	
    	return new FindLeads(driver,node);
    }

	
}
