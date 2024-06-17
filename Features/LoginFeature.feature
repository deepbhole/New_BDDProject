Feature: Login

@Sanity
Scenario: Successful Login with valid credentials
		Given User launch chrome browser
		When user open URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on login
		Then Page title should be "Dashboard / nopCommers administration"
		When User click on log out link
		Then Page title should be "Your store. Login"
		And Close browser
		

@regression	
Scenario Outline: Successful Login with valid credentials DDT
			Given User launch chrome browser
	 		When user open URL "https://admin-demo.nopcommerce.com/login"
			And User enters Email as "<email>" and Password as "<password>"
			And Click on login
			Then Page title should be "Dashboard / nopCommers administration"
			When User click on log out link
			Then Page title should be "Your store. Login"
			And Close browser
			
Examples:
|email|password|
|admin@yourstore.com|admin|
#|admin1@yourstore.com|Admin|

