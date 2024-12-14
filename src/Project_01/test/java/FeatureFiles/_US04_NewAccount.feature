Feature: New Account Creation


  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |


  Scenario Outline: New Account Checking and Savings
    And Click on the Element in LeftNav
      | openNewAccount |
    When User select the element from Dialog
      | accountTypeDropdown | <accountType> |
    Then Minimum Account Message Should be Displayed
      |  minimum |
    When Click on the Element New Account
    Then New Account Message Should be Displayed
      |  Opened |
    Examples:
      | accountType|
      | 0          |
      | 1          |