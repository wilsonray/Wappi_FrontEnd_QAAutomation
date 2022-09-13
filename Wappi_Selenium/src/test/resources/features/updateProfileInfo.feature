Feature: Update Profile
  As QA Automation
  I want to test the login interface
  To validate the Frontend response

  Background: Login Successful
    Given that the user is in the Wappi page
    When he enters the credentials
      |user     |password|
      |wilsonray|password|

    Scenario: Update Profile Information
      When the user clicks the Profile view button
        |name  |lastName  |dateOfBirth|country |sex   |
        |Wilson|Villanueva|12/08/1996 |Colombia|female|
      Then I should see the profile menu