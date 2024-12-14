Feature: Information Update Feature

  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |

  Scenario: Info Update

    And Click on the Element in LeftNav and Wait
    And User send keys in Dialog
      | infoFirstName | Ahmet       |
      | infoLastName  | Demir       |
      | infoAddress   | ZeytinBurnu |
      | infoCity      | Istanbul    |
      | infoState     | Istanbul    |
      | infoZipCode   | 00000       |
      | infoPhone     | 05555555555 |
    And Click on the Element in Dialog
      | updateProfileButton |
    Then Contact Update Message Confirmation
    And Click on the Element in LeftNav
      | logout |
    And User send precreated keys in LeftNav
    And Click on the Element in LeftNav
      | loginButton |
    And Click on the Element in LeftNav
      | updateContactInfo |
    Then Second Confirmation of Updated Info

  Scenario: Info Update Negative

    And Click on the Element in LeftNav and Wait
    And User send keys in Dialog
      | infoCity      | Istanbul    |
      | infoState     | Istanbul    |
      | infoZipCode   | 00000       |
      | infoPhone     | 05555555555 |
    And User clear keys in Dialog
    And Click on the Element in Dialog
      | updateProfileButton |
    Then Update Error Confirmation