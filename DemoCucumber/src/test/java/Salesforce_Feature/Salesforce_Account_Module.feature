Feature: Salesforce Account Module

  Scenario: New Account Creation
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    When User should clik on the App luncher Button
    And User should click on the service App
    And User should navigate to the Account Tab
    And User should click on the  New button
    And User should enter the necessary details to create the account- Use Below Cretancials
      | Account Name |
      | cucumber     |
    Then check the details which are entered during the account creation
    And user shold logout the Application

  @account
  Scenario: Verify The Validation Eror On Account
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    When User should clik on the App luncher Button
    And User should click on the service App
    And User should navigate to the Account Tab
    And User should click on the  New button
    And User should click on the save button with out entring the necessary details
    Then check the validation error
    And user shold logout the Application
