package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeDeleteCustomerPage
{
	 @FindBy(id="username")
	 private WebElement usernameTextField;
	 @FindBy(xpath="//input[@type='password']")
	 private WebElement passwordTextField;
	 @FindBy(id="keepLoggedInLabel")
	 private WebElement keepmeloggedinCheckBox;
	 @FindBy(xpath="//div[text()='Login ']")
	 private WebElement loginButton;
	 @FindBy(id="container_tasks")
	 private WebElement tasksButton;
    /* @FindBy(xpath="(//div[.='harsht']/../..//div[@class='editButton'])[2]")
	 private WebElement clicktoiewcustomersettingButton;

	 */@FindBy(xpath="(//input[@placeholder=\"Start typing name ...\"])[1]")
     private WebElement starttypingnameSearchTextfield;
	// @FindBy(xpath="(//div[contains(text(),'manish')])[2]/..//div[@class='editButton']")
	 @FindBy(xpath="//span[.='manish']")
	 private WebElement manishLink;
	 @FindBy(xpath="(//div[contains(text(),'manish')])[2]/..//div[@class='editButton']")
	 private WebElement clicktoviewcustomersettingButton;
	 @FindBy(xpath="(//div[@class='actionButton'])[7]")
	 private WebElement actionButon;
	 @FindBy(xpath="(//div[contains(text(),'Delete')])[2]")
	 private WebElement deleteButton;
	 @FindBy(xpath="(//div[@class='buttonIcon'])[3]")
	 private WebElement deletepermanentlyButton;
     public POMActitimeDeleteCustomerPage(WebDriver driver)
     {
	// this.driver=driver;
	 PageFactory.initElements(driver, this);//initialization of WebElement get done
    }
  public void loginMethod()//utilization get done 
  {
	 usernameTextField.sendKeys("admin");
	 passwordTextField.sendKeys("manager");
	 keepmeloggedinCheckBox.click();
	 loginButton.click();

  }
  public void deleteCustomer() throws InterruptedException
  {
	  tasksButton.click();
	  Thread.sleep(3000);
	  //clicktoiewcustomersettingButton.click();
	  starttypingnameSearchTextfield.sendKeys("manish");
	  Thread.sleep(3000);
	  manishLink.click();
	  Thread.sleep(3000);
	  clicktoviewcustomersettingButton.click();
	  Thread.sleep(3000);
	  actionButon.click();
	  Thread.sleep(3000);
	  deleteButton.click();
	  Thread.sleep(3000);
	  deletepermanentlyButton.click();
	  System.out.println("customer that was created as manish got permanently deleted successfull ");
  }
	

}  