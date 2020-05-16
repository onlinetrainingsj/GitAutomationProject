@Facebook
Feature: Login Feature
  I want to test Login Feature of facebook application

  @LogIn
  Scenario: Login Scenario
    Given I am a user of facebook application.
    When I enter valid username.
    And I enter valid Password.
    And I click on Login button.
    Then user should be able to log in successfully.

  @SignUp
  Scenario Outline: SignUp Scenario
    Given I am a user of facebook application.
    When I enter valid <username>
    And I enter valid Password.
    And I enter first name

    Examples: 
      | username |
      | Shammi   |
