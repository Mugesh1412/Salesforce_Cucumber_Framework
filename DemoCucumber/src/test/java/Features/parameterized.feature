Feature: OrangeHrm Application Login module parameterized

  Scenario Outline: verify the application seacrh feature

    Given User should navigate to the OrangeHrm App
    And User should login as "Admin" and "admin123"
    When User should Enter "<Value>" in the search box
    Then the value should same     
 
    Examples:       
      | Value |      
      | Admin |                                                                                              
      | Leave |                   
                                                                                                              
                                                      
                                        
                                                                                                                                                                                                                                                                            