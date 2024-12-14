Feature: Login Feature

  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |
    And Click on the Element in LeftNav
      | logout |

  Scenario: Login

    And User registers and send random keys in LeftNav
    And Click on the Element in LeftNav
      | loginButton |
    Then Login Message Should be Displayed
      | welcome |

  Scenario: Negative Login

    And User send random keys in LeftNav
    And Click on the Element in LeftNav
      | loginButton |
    Then Error Message Should be Displayed
      | error |
