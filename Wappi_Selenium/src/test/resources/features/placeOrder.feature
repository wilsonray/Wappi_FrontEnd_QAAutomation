Feature: Update Profile
  As QA Automation
  I want to test the login interface
  To validate the Frontend response

  Background: Login Successful
    Given that the user is in the Wappi page
    When he enters the credentials
      |user     |password|
      |wilsonray|password|

    #Scenario: Place an order without token
      #When the user clicks the Order button
      #Then the user should see the Confirm Order pop-up
      #When the user clicks My orders button
      #Then the user should see the Product added to the list

    Scenario: Place an order with token
      When the user clicks Obtain Welcome Coupon
      Then the user should see the Coupon pop-up
      When the user copies the Coupon code and clicks the Order button and pastes the Coupon code
      Then the user should see the Confirm Order pop-up
      When the user clicks My orders button (with Token)
      Then the user should see the Product added to the list

