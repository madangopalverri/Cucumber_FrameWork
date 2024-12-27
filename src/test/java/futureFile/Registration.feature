Feature: Registration

  @Smoke
  Scenario: verify the Regisration
    Given open the browser
    And open the Application
    When Enter the user Detailes
    And Click on the Register Button
    Then User succesfully register the account
