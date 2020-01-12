Feature: Customers 

Background: Below are common steps will get executed before all the scenario 
	Given User launch chromebrowser 
	When User opens the url "https://admin-demo.nopcommerce.com/login" 
	And User enters email as "admin@yourstore.com" and password as "admin" 
	And Click on login button 
	Then User can view the dashboard 
	When user clicks on customer menu 
	And click on customers menu item 
	
	
	
@sanity 
Scenario: Add a new customer 


	And Click on Add new button 
	Then User can view add new customer page 
	When user enter customer info 
	And click on save button 
	Then User can view confimation message "The new customer has been added successfully." 
	And Close the browser 
@functionl 
Scenario: Search customer by Email ID 
	And Enter customer email 
	When Click on search button 
	Then user should found email in search table 
	And Close the browser 
@smoke 
Scenario: Search customer by name 


	And Enter customer first name 
	And customer last name 
	When Click on search button 
	Then user should find name in search table 
	And Close the browser 
    