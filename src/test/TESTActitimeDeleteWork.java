package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMActimeWorkPage;
import pom.POMActitimeDeleteWorkPage;

public class TESTActitimeDeleteWork 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//now i need to perform the main operation
		POMActitimeDeleteWorkPage  deleteWork=new  POMActitimeDeleteWorkPage (driver);
		 deleteWork.loginMethod();
		 deleteWork.deleteWorkMethod();
		 
		
	}

}
