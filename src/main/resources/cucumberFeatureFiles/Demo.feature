Feature: Login to a website simple ATDD approach

  Scenario: Login to an application
    Given User sets the driver for "chrome" browser
    Given User navigates to "https://dev2.filed.com/"
    And User clicks on given element "/html/body/app-root/app-signin/div/div[2]/div[2]/div/form/div[5]/btn01/button/font07-3/div";
    Given User navigates to "https://www.youtube.com"
    Given User navigates to "https://www.rediffmail.com"
    Then User closes the browser