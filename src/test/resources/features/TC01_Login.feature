@Login
Feature:Login Scenario
	
	Scenario Outline:Login into portal
	 Given Navigate to url
	 When Enter username "<userName>"
	 When Enter password "<password>"
	 Then Click on Login Button
	 Then Close browser 
	 Examples: 
      | userName  | password  |
      | student | Password123 |