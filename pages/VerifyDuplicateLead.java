package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class VerifyDuplicateLead extends BaseMethods {
	public VerifyDuplicateLead(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}	

	public VerifyDuplicateLead verifyDuplicate()
	{
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		return this;
	}

}
