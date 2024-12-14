Feature: Product Order Functionality

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

  Scenario: Order Verification

    And Shopping transaction in Dialog

    And Click on the Element in Dialog
      | shippingMethods |
      | nextButton      |

    Then Purchase Success Message Should Appear










