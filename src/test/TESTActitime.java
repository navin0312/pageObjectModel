package test;//specially for execution because  it has main method 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMActitimeLoginPage;

public class TESTActitime 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//now i need to perform the main operation
		 POMActitimeLoginPage login=new  POMActitimeLoginPage(driver);
		 login.loginMethod();
		

	}

}
