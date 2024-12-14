Feature: User Registration Functionality

  Background:
    Given Navigate to magento website

    And User navigates to Create Account page

  Scenario: User Registration with Unique Data Entries

    And User enters registration details
      | firstName | lastName | emailAddress                  | registrationPassword | passwordConfirmation |
      | Johnyy    | Does     | john.unique885726@example.com | Passw0rd1            | Passw0rd1            |
      | Janese    | Smithhie | jane.unique986545@example.com | Pass1234             | Pass1234             |
      | Alexy     | Browniee | alex.unique458448@example.com | Password12           | Password12           |



