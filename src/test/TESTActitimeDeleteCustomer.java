package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMActitimeDeleteCustomerPage;

public class TESTActitimeDeleteCustomer
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		POMActitimeDeleteCustomerPage deleteCustomer=new POMActitimeDeleteCustomerPage(driver);
		deleteCustomer.loginMethod();
		deleteCustomer.deleteCustomer();
		
	}

}
