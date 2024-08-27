Feature: Salesforce LoginModule

  @smoke
  Scenario: login With Vaild Credentials
    Given User should navigate to the Salesforce Application
    And The User should login as "mugesh.aravinth@cunning-goat-37co4x.com" and "Mugesh1234@"
    Then User should verify the login page logo
    And user shold logout the Application

  Scenario Outline: login With Invaild Credentials
    Given User should navigate to the Salseforce Application
    And The User should login as "<username>" and "<password>"
    Then User should the error Message

    Examples: 
      | username                                | password    |
      | mugesh.aravinth@cunning-goat-37co4x.com | Mugesh581234@ |
