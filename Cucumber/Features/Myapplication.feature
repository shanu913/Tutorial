
Feature: Test facebook smoke scenario

   Scenario: Test login with valid credentials
   Given Open Chrome and start application
   When I enter valid username and valid password
   Then User should be login sucessfully
   
   Scenario: Test login with invalid credentials
   When I enter valid username and invalid password
   Then User should be mot login sucessfully