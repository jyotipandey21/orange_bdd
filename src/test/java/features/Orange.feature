Feature: I am on OrangeHRM site to change 
Scenario: Valid users should be able to login   
	Given a valid user 
	When user goes to the site 
	Then login page should display 
	When user enters valid user name "Username" and password "Password" 
	Then viewLeaveList page should display
	
	@sanity
Scenario: Valid users should be able to land on OranheHRM page   
	When I as user  click on Leave tab  
	Then Leave Form  must display
	When I passed  valid input From date "2020-09-24" and To date "2020-10-10"
	Then Click on search button   