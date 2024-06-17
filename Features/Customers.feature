
Feature: Customer
Background: Steps common for all scenarios
	  Given User launch chrome browser
		When user open URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on login
		Then User can view Dashboard

@regression
Scenario: Add new customer
	  
	  When User click on customer Menu
		And click on customer Menu Item
		And click on Add new button
		Then User can view Add new customer page
		When User enter customer info
		And click on Save button
		Then User can view confirmation message "The new customer has been added successfully."
		And Close browser
		
	
@regression
Scenario: Search Customer by Email
  	
		When User click on customer Menu 
	  And click on customer Menu Item 
		And Enter customer EMail
		When Click on search button
		Then User should found Email in the Search table
		And Close browser 
		

@Sanity
Scenario: Search Customer by Name
  	
		When User click on customer Menu 
	  And click on customer Menu Item 
		And Enter customer FirstName
		And Enter customer LastName
		When Click on search button
		Then User should found Name in the Search table
		And Close browser 		
		