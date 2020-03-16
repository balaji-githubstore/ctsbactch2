Feature: LoginMultiple
	In order to create a webpage
	As a e-commerce vendor
	I want to get access to the portal

Scenario: ValidCredentialMultiipleDefn 
	Given I have 'ch' browser with magentopage 
	When I enter username as 'balaji0017@gmail.com' and I enter password as 'welcome@1234' 
	Then I should access to the portal with title as 'My Account' 
