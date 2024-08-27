Feature: Contact and Account Module

  Scenario: Contact creation On Account Section
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    When User should clik on the App luncher Button
    And User should click on the service App
    And User should navigate to the Account Tab
    And User should click on the  New button
    And User should enter the necessary details to create the account- Use Below Cretancials
      | Account Name |
      | cucumber     |
    And User should scroll to the related contacts section
    And User should click on the Related Contact section New button
    And User should enter the necessary details to create the contact- Use Below Cretancials
      | First Name | Last Name |
      | Mr         | Cucumber  |
    Then check the details which are entered during the contact creation on the related section
    And user shold logout the Application
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                