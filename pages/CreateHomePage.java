package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class CreateHomePage extends BaseMethods {
	public CreateHomePage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	public MyHomePage myHomeCreate()throws InterruptedException	{
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,node);
	}
}