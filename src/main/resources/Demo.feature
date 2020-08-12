Feature: Login to a website

  Scenario: Login to gmail
    Given User navigate to <http://www.gmail.com>
    When User enters credentials "<username>" and <password>