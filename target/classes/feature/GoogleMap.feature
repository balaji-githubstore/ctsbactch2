Feature: GoogleMap 
	In order to connect all cities
	As a google users
	I want connect with google maps 
	
	
Scenario: ConnectCities
Given I have browser with googlemap page 
When I enter multiple cities 
|cities|country|
|chennai|India|
|hyderabad|India2|
|bangalore|Japan|
|delhi|KKKK|
Then I should get the result with all cities connected with km as '895'



