package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMActitimeLoginPage;
import pom.POMActitmeCustomerPage;

public class TESTActitimeCustomer 
{
	public static void main(String[] args) throws InterruptedException
	
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
			//now i need to perform the main operation
			POMActitmeCustomerPage login=new  POMActitmeCustomerPage(driver);
			login.loginMethod();
		    login.createnewcustomerMethod();
		    //login.deleteCustomerMethod();
				

	   }

}
