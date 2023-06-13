package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class MyHomePage extends BaseMethods{
	public MyHomePage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	
	public MyLeadsPage createnewLeads()throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver,node);
		}
}
