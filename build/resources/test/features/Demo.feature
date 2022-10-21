@Test
Feature: Login user page Demo

  Scenario Outline: SigIn session in the page Demo correctly
    Given the user navigates to https://www.demoblaze.com/index.html
    When click in the Sig in button and open the login modal
    And the user enter your <user> and <password>
    And click in the Sig in button and see the home page
    Then the user close session correctly

    Examples:
      |user|                  |password|
      |test@test.com||test|
      |!"#"!#$||!"#"!#$|