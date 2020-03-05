Feature: Login Page
 As a user I want a login page so that only 
  authentic user can have access
   
Scenario Outline: Valid users should be able to login
Given a valid user
When user goes to techfios site
Then techfios site should display 
When user logs in with valid credentials
Then Dashboard page should be displayed
And username should match
     
     Examples:
     |username               |password  |
     |techfiosdemo@gmail.com |abc123    |
     
     
     
     
Scenario: Invalid users should not be able to login
Given a Invalid user
When user goes to techfios site
Then techfios site should display 
When user logs in with valid credentials
Then Dashboard page should be displayed
And username should match