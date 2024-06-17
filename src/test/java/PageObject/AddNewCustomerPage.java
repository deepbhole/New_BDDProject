package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage 
{
	public WebDriver ldriver;
	 
	//constructor
	public AddNewCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		
	}

	//Find Web elements on this web page
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement linkCustomer_menu;
	
	@FindBy(xpath ="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement linkCustomer_menuitem;
	
	@FindBy(xpath ="//a[@class='btn btn-primary']")
	WebElement btnAddnew;
	
	@FindBy(xpath ="//input[@id='Email']")
	WebElement txtEmail;
	
    @FindBy(xpath ="//input[@id='Password']")
    WebElement txtPassword;
    
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement txtFirstName;
    
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement txtLastName;
    
    @FindBy(xpath = "(//input[@role='searchbox'])[2]")
    WebElement txtCustomerRoles;
    
    @FindBy(xpath ="//li[contains(text(),'Administrator')]")
    WebElement listItemAdministrators;
    
    @FindBy(xpath = "//li[contains(text(),'Registered')]")
    WebElement listItemRegistered;
    
    @FindBy(xpath = "//li[contains(text(),'Guests')]")
    WebElement listItemGuests;
    
    @FindBy(xpath = "//li[contains(text(),'Vendors')]")
    WebElement listItemVendors;
    
    
    @FindBy(xpath = "//*[@id='VendorId']")
    WebElement dropdownVendorMgr;
    
    @FindBy(id = "Gender_Male")
    WebElement MaleGender;
    
    @FindBy(id = "Gender_Female")
    WebElement FemaleGender;
    
    @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement txtDob;
    
    @FindBy(xpath = "//input[@id='Company']")
    WebElement txtCpmpanyName;
    
    @FindBy(xpath = "//textarea[@id='AdminComment']")
    WebElement txtAdminComment;
    
    @FindBy(xpath = "//button[@name='save']")
    WebElement btnSave;
    
    //Action Methods for web Elements
    
   
    
    public String getPageTitle()
    {
    	return ldriver.getTitle();
    }
    
    public void clickOnCustomereMenu()
    {
    	linkCustomer_menu.click();
    }
    
    public void clickOnCustomermenuItem()
    {
    	linkCustomer_menuitem.click();
    }
    
    public void clickOnAddnew()
    {
    	btnAddnew.click();
    }
    
    public void enterEmail(String email)
    {
    	txtEmail.sendKeys(email);
    }
    
    public void enterPassword(String password)
    {
    	txtPassword.sendKeys(password);
    }
    
    public void enterFirstName(String firstname)
    {
    	txtFirstName.sendKeys(firstname);
    }
    
    public void enterLastName(String lastName)
    {
    	txtLastName.sendKeys(lastName);
    }
    
    public void enterDob(String dob)
    {
    	txtDob.sendKeys(dob);
    }
    
    public void enterCompanyName(String coName)
    {
    	txtCpmpanyName.sendKeys(coName);
    }
    
    public void enterAdminComment(String comment)
    {
    	txtAdminComment.sendKeys(comment);
    }
	
    public void enterManagerOfVendor(String value)
    {
    	Select drp = new Select(dropdownVendorMgr);
    	drp.selectByVisibleText(value);
    }
    public void enterGender(String gender)
    {
    	if(gender.equals("Male"))
    			{
    		      MaleGender.click();
    			}
    	else if (gender.equals("Female"))
    	        {
    		FemaleGender.click();
    	        }
    	else//Default set Male gender
    	{ 
    		MaleGender.click();
    	}
    }
    
    public void clickOnSave()
    {
    	btnSave.click();
    }

	public void clickOnLoginButton() 
	{
		
		LoginBtn.click();
	} 
    
	public void close_browser()
	{
		ldriver.close();
	}

	public String getTitle() {
		ldriver.getTitle();
		return null;
	}
	
}
