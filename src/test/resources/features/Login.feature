@Login
  Feature: Login
    As a user I want to login website instagram

  Scenario Outline: Normal login
#    Given Verify username field
#    And verify password field
    When User input Name Account "<email>>" and Password "<password>"
    Then User already on Home page

    Examples:
      | email                      | password      |
      | kukuh_pradipto@yahoo.co.id | 04021998KUKUH |