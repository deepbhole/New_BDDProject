package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	//Constructor
	public LoginPage(WebDriver rDriver)
	{
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver,this);
		
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logOut;
	
	
	public void enterEmail(String emailAdd) 
	{
		email.clear();
		email.sendKeys(emailAdd);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterPassword(String Pass) 
	{
		Password.clear();
		Password.sendKeys(Pass);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnLogOutBtn()
	{
		logOut.click();
	}
}





















