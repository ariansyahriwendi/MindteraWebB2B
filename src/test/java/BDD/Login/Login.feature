@Login
Feature: Login

  @LoginSuccess
  Scenario: User Want to Login
    Given I am user
    When I want to login
    And I input email "ariansyah@mindtera.com"
    And I input password "examplepassword"
    And I click login
    Then I login successfully

  @LoginLogout
  Scenario: User Want to Login and Logout
    Given I am user
    When I want to login
    And I input email "ariansyah@mindtera.com"
    And I input password "examplepassword"
    And I click login
    And I click logout
    And I click confirm logout
    Then I logout successfully