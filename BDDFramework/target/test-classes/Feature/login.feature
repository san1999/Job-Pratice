Feature: Login page automation.

  Scenario: checking login is sucessful.
    Given user is in login page.
    When user enters username and password.
    And clicks login button.
    Then user enters to login page.
    And closed browser.
