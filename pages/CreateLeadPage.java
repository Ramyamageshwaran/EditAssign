package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class CreateLeadPage extends BaseMethods {
	public CreateLeadPage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	public CreateLeadPage entercmpName(String cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
	}
	public CreateLeadPage enterFirstName(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
	}
	public CreateLeadPage enterLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
	}
	public CreateLeadPage enterPhoneName(String phno) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	return this;
	}
	public VerifyViewLead clickSubmit() {
	driver.findElement(By.name("submitButton")).click();
	return new VerifyViewLead(driver,node);
	}
}
