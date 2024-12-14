Feature: Address Addition Functionality

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

    Scenario Outline: Adding and Deleting Address
      And Click on the Element in Dialog
        |customerMenuDropDown|
    Then My account button should be displayed
      And Click on the Element in Dialog
        |myAccountButton     |
      |manageAddressesButton|
      |addNewAddressButton  |
      And User send keys in Dialog
        | telephoneInput | <phone>  |
        | street1Input   | <street> |
        | cityInput      | <city>   |
        | zipInput       | <zip>    |
      And User select state
      And Click on the Element in Dialog
        | defaultBilling    |
        | defaultShipping   |
        | saveAddressButton |
        | deleteButton      |
        | deleteOk          |

      Then User should verify deletion message

      Examples:
        | phone      | street  | city  | zip   |
        | 1112223344 | 123test | test1 | 33433 |
        | 2223336655 | 142test | test2 | 33533 |

