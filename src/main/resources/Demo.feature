Feature: Login to a website simple ATDD approach

  Scenario: Login to an application
    Given User sets the driver for "chrome" browser
    Given User navigates to "https://www.gmail.com"
    Given User navigates to "https://www.youtube.com"
    Given User navigates to "https://www.rediffmail.com"
    Then User closes the browser