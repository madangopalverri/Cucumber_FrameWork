Feature: Login

 @Sanity
  Scenario: verify the Login
    Given browser open
    And application is open
    When user data enter
    And click  login button
    Then successfully login
