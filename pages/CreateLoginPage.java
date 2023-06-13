package pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseMethods;

public class CreateLoginPage extends BaseMethods {
	public CreateLoginPage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	public CreateLoginPage enterUserName(String uname) throws IOException
	{ 

	         driver.findElement(By.id("username")).sendKeys(uname);
	         return this;
	
	}
    public CreateLoginPage enterPassword(String pwd) throws IOException
    {
    	
    	    driver.findElement(By.id("password")).sendKeys(pwd);
    	    return this;
    	}
    public CreateHomePage clickLogin()throws InterruptedException, IOException
    {
    	Thread.sleep(2000);
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new CreateHomePage(driver,node);
    }
}





