Feature: New Account Page
    As a user I want a New Account Page so that accounts can be created .  
    
    
 Scenario: C234 -  Add Account page should display with out error
 Given a user with username "techfiosdemo@gmail.com" and password "abc123"  
 When user navigates to New Account Page
  Then New Account page should display
  
Scenario Outline: C235 - Create a new account 
Given a user with username "<username>" and password "<password>"  
When user navigates to New Account Page 
When user creates a new account using title "<title>" Description "<description>" Amount "<amount>"
Examples:
    |   username                       |title     |  description         |      amount |
    |   "techfiosdemo@gmail.com"       |Calzone   |Two Topping           |        10   |
    |   "techfiosdemo@gmail.com"        |Sandwich| veggi                |       10    |