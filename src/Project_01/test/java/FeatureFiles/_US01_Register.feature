Feature: ParaBank Website Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario: User Registration

    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |


