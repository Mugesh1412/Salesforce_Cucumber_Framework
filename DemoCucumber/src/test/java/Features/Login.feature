Feature: OrangeHrm Application Login module

  Scenario: Login should be success
    Given User should navigate to the OrangeHrm Application
    And User enter the username as "Admin"
    And User enter the password as "admin123"
    When User cliks on the login button
    Then User should be navigate to homepage 

    Scenario: Login should be fail
    Given User should navigate to the OrangeHrm Application
    And User enter the username as "Admn"
    And User enter the password as "admin223"
    When User cliks on the login button
    But User should not be navigate to homepage 
                   