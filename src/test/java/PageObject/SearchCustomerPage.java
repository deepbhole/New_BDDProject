package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage 
{
	WebDriver ldriver;

	//Constructor
	public SearchCustomerPage(WebDriver rDriver)
	{
		ldriver = rDriver;

		PageFactory.initElements(rDriver,this);

	}

	@FindBy(id = "SearchEmail")
	WebElement emailAdd;

	@FindBy(id = "search-customers")
	WebElement searchBtn;

	@FindBy(xpath = "//table[@id='customers-grid']")
	WebElement searchResult;

	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement>tableRows;

	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td")
	List<WebElement>tableColumns;

	@FindBy(id = "SearchFirstName")
	WebElement FirstName;

	@FindBy(id = "SearchLastName")
	WebElement lastname;



	//Action method for enter email address




	public void enterEmailAdd(String email)
	{
		emailAdd.sendKeys(email);
	}

	//Action method for perform Click action on Search Button 

	public void ClickOnSearchButton()
	{
		searchBtn.click();
	}

	public boolean searchCustomerByEmail(String email)
	{
		boolean found = false;


		int ttlRows = tableRows.size();

		//	int ttlColumns = tableColumns.size();

		for (int i = 1; i<=ttlRows; i++ )
		{
			WebElement webElementEmail = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+ i +"]/td[2]"));

			String actualEmailAdd = webElementEmail.getText();

			if(actualEmailAdd.equals(email))
			{
				found = true;
				break;
			}

		}
		return found;

	}

	////////////////////////////Search Customer By Name////////////////////////////

	//Action method to enter First Name

	public void enterFirstName(String firstNameText)
	{
		FirstName.sendKeys(firstNameText);
	}

	//Action method to enter Last Name

	public void enterLastName(String lastNameText)
	{
		lastname.sendKeys(lastNameText);
	}

	public boolean searchCustomerByName(String name)
	{
		boolean found = false;


		int ttlRows = tableRows.size();

		//	int ttlColumns = tableColumns.size();

		for (int i = 1; i<=ttlRows; i++ )
		{
			WebElement webElementName = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+ i +"]/td[3]"));

			String actualName = webElementName.getText();

			if(actualName.equals(name))
			{
				found = true;
				break;
			}

		}
		return found;


	}
}	
