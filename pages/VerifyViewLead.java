package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class VerifyViewLead extends BaseMethods{
	public VerifyViewLead(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}	
	
	public VerifyViewLead viewLeads()throws InterruptedException{
		String View = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(View);
		return this;
	}
	

}
