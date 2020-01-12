Feature: Login 

@sanity 
Scenario: Successful login with valid credentials 
	Given User launch chromebrowser 
	When User opens the url "https://admin-demo.nopcommerce.com/login" 
	And User enters email as "admin@yourstore.com" and password as "admin" 
	And Click on login button 
	Then Page title should be "Dashboard / nopCommerce administration" 
	When User clicks on logout link 
	Then Page title should be "Your store. Login" 
	And Close the browser 
	
	
@regression 
Scenario Outline: Login with data driven 
	Given User launch chromebrowser 
	When User opens the url "https://admin-demo.nopcommerce.com/login" 
	And User enters email as "<email>" and password as "<password>" 
	And Click on login button 
	Then Page title should be "Dashboard / nopCommerce administration" 
	When User clicks on logout link 
	Then Page title should be "Your store. Login" 
	And Close the browser 
	Examples: 
		| email | password | 
		| admin@yourstore.com | admin | 
		| admi12n@yourstore.com | admin |
		| admin@yourstore.com | admin |
		
		
		
		
    		