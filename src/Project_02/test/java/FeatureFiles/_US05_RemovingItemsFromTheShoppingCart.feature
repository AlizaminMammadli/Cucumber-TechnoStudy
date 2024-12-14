Feature: Cart Functionality

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

  Scenario Outline:Add to / Remove from cart
    And Click on the Element in Dialog
      | arcProduct1 |
      | arcSize     |
      | arcColor    |
      | arcAdd      |
    Then Cart Success Message Should Appear
    And Click on the Element in Dialog
      | homePage    |
      | arcProduct2 |
      | arcSize     |
      | arcColor    |
      | arcAdd      |
    Then Cart Success Message Should Appear
    And Click on the Element in Dialog
      | arcShowCart |
    Then Check Product Count
    And Click on the Element in Dialog
      | arcEditCart |
    And User send keys in Dialog
      | arcCartQty | <amount> |
    And Click on the Element in Dialog
      | arcUpdate |
    And Verify Quantity Updated
      | <amount> |
    And Click on the Element in Dialog
      | arcShowCart |
      | arcEditCart |
    And Delete All Items from Cart
    And Verify Cart is Empty
    Examples:
      | amount |
      | 10     |
