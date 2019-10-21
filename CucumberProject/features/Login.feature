@Facebook
Feature: FacebookFeature
  I want to test facebook application

  @LoginTag
  Scenario: Login Scenario
    Given I am a user of facebook application
    When I enter valid username
    And I enter valid Password
    And I click on Login button
    Then user should be able to log in successfully

  @SignUpTag
  Scenario: SignUp Scenario
    Given I am a user of facebook application
    When I enter valid username
    And I enter valid Password
    And I enter first name
