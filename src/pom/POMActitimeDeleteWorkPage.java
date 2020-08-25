package pom;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeDeleteWorkPage 
{   WebDriver driver;
	@FindBy(id="username")
	 private WebElement usernameTextField;
	 @FindBy(xpath="//input[@type='password']")
	 private WebElement passwordTextField;
	 @FindBy(id="keepLoggedInLabel")
	 private WebElement keepmeloggedinCheckBox;
	 @FindBy(xpath="//div[text()='Login ']")
	 private WebElement loginButton;
	 //login get done
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofworkLink;
	@FindBy(xpath="//a[text()='studenttt']/../..//a[@href='javascript:deleteType(21);']")
	private WebElement deleteButton;
	public POMActitimeDeleteWorkPage(WebDriver driver)
	 {
		this.driver=driver;
   	  PageFactory.initElements(driver,this);
	 }
	
	public void loginMethod()
	 {
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
        keepmeloggedinCheckBox.click();
        loginButton.click();
        
   	}
	public void deleteWorkMethod() throws InterruptedException, AWTException
	 {
		settingsButton.click();
		Thread.sleep(3000);
		typeofworkLink.click();
		Thread.sleep(3000);
		deleteButton.click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
	          alt.accept();
System.out.println("type of work that was created already with name of studentt  got deleted sucessfully");

    }
}	
	
