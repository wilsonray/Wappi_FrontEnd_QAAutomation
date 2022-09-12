Feature: Login
  As QA Automation
  I want to test the login interface
  To validate the Frontend response

  Scenario: Login Successful
    Given that the user is in the Wappi page
    When he enters the credentials
      |user     |password|
      |wilsonray|password|
    Then the user should see the main page