Feature: Bill Payment

  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |

  Scenario Outline: Electricity Bill Payment
    And Click on the Element in LeftNav
      | billPay |
    And User send keys in Dialog
      | billName      | <name>    |
      | billAddress   | <rndData> |
      | billCity      | <rndData> |
      | billState     | <rndData> |
      | billZipCode   | <rndData> |
      | billPhoneNum  | <rndData> |
      | billAccNum    | <rndNum>  |
      | billAccNumVrf | <rndNum>  |
      | billAmount    | <amount>  |
    And User select the element from Dialog
      | billSelectAcc | 0 |
    And Click on the Element in Dialog
      | billPaymentButton |
    Then Amount Message Should be Displayed
      | <amount> |
    And Click on the Element in LeftNav
      | accountsOverview |
    And Click on the Element in Dialog
      | accTableFirstAcc |
    Then Bill Payment Message Should be Displayed
      | <name> |

    Examples:
      | name        | rndData | rndNum  | amount |
      | electricity | rndData | 1008020 | 95     |
      | gas         | rndData | 1008020 | 50     |
      | internet    | rndData | 1008020 | 20     |