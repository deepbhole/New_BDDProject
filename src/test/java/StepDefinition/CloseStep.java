package StepDefinition;

import io.cucumber.java.en.Then;

public class CloseStep extends BaseClass
{
		
	@Then("Close browser")
	public void Close_browser() 
	{
		
		driver.close();
		log.info("Browser Closed....");
		log.info("....................................................");
		
	}

}
