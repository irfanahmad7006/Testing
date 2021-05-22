Feature: ScreenShot Test
  Scenario: Screenshot
    Given user sets browser and go to url
    And User clicks on given element "//a[contains(text(),'Rediffmail')]";
    And User enters user id and password
    And User takes the screen shot of the page
    And User closes the browser