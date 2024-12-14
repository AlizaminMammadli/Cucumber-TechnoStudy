Feature: Search Functionality

  Background:
    Given Navigate to magento website
    And Click on the Element in Dialog
      | signIn |
    And User send keys in Dialog
      | email    | test34@gmail.com |
      | password | As123456         |
    And Click on the Element in Dialog
      | signInButton |
    Then Login Success Message Should Appear

  Scenario: Wish list

    And Click on the Element in Dialog
      | homePage    |
      | arcProduct1 |
      |wishAddButton|
    Then Wish List has been Added Should Appear
    Then Verify the wishlist should not be empty
    And Navigate to Product and click the Remove button
    Then Wish List has been Removed Should Appear

