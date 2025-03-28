@Login
Feature:Login Scenario
	
	Scenario:Login into portal
	 Given Navigate to url
	 When Enter username
	 When Enter password
	 Then Click on Login Button
	 Then Close browser 