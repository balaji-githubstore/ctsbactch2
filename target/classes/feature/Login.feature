Feature: Login 
	In order to create a webpage
	As a e-commerce vendor
	I want to get access to the portal

#Background:
#Given I have browser with magentopage 	

@valid @high 
Scenario: ValidCredential 
	Given I have browser with magentopage 
	When I enter username as 'balaji0017@gmail.com' and I enter password as 'welcome@1234' 
	Then I should access to the portal with title as 'My Account' 
	
#@high 
#Scenario: InvalidCredential 
#	Given I have browser with magentopage 
#	When I enter username as 'balaji@gmail.com' and I enter password as 'welcome' 
#	Then I should not get access to the portal 
#	
#Scenario Outline: ValidCredentials 
#	Given I have browser with magentopage 
#	When I enter username as '<username>' and I enter password as '<password>' 
#	Then I should access to the portal with title as 'My Account' 
#	Examples: 
#		|username|password|
#		|balaji0017@gmail.com|welcome@1|
#		|balaji0018@gmail.com|welcome@2|
#		|balaji0019@gmail.com|welcome@3|
#		
#		
#Scenario Outline: ValidCredentialsID 
#	Given I have browser with magentopage 
#	When I enter username as '<username>' and I enter password as '<password>' 
#	Then I should access to the portal with id as '<id>' 
#	Examples: 
#		|username|password|id|
#		|balaji0017@gmail.com|welcome@1|465|
#		|balaji0018@gmail.com|welcome@2|898|
#		|balaji0019@gmail.com|welcome@3|7988|
#		
		
		
		
		
		
		
		
		
		
		
