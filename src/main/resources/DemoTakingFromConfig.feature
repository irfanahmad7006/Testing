Feature: Login to a website simple ATDD approach

  Scenario: Login to an application
    Given user sets browser and go to url
#    Then User navigates to "https://rediff.com/"
    And User clicks on given element "//a[contains(text(),'Rediffmail')]";
    And User enters user id and password
    And User clicks on given element "/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]";
    And User closes the browser