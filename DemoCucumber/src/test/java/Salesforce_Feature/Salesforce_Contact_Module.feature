Feature: Salesforce contact Module

  Scenario: New Contact Creation
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    When User should clik on the App luncher Button
    And User should click on the service App
    And User should navigate to the Contact Tab
    And User should click on the  Contact New button
    And User should enter the necessary details to create the contact- Use Below Cretancials
      | First Name | Last Name |
      | Mr         | Cucumber  |
    Then check the details which are entered during the contact creation
    And user shold logout the Application

  Scenario: Verify The Validation Eror On Contact
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    When User should clik on the App luncher Button
    And User should click on the service App
    And User should navigate to the Contact Tab
    And User should click on the  Contact New button 
    And User should click on the Contact save button with out entring the necessary details
    Then check the Contact validation error
    And user shold logout the Application
    