Feature: check the admin usermanagement 
 @loginvalid1
  Scenario Outline: check for the system users information
  Given user enter into the login page
    When user enters the username and password
    And user click on the login button
    Then user check for the correct login page
    Given enter username <name>
    And enter userrole
    And enter employeename <empname>
    And enter status
    When click on the search button
    Then user information should be validated
    
    Examples: 
      | name  |  empname  | 
      | Aravind |    Dominic Chase  | 
      | Daniel |     Daniel Daniel| 
