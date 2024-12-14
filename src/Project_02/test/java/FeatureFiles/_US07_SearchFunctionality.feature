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

  Scenario: Search Products SKU Number

    And User send keys in Dialog
      | searchInput | "MJ08" |

    And Click on the Element in Dialog
      | searchButton |

    Then Verify Jacket is Available

    And Click on the Elements to Find Jacket and Verify SKU Number

