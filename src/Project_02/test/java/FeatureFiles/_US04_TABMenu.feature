Feature: TAB Menu Control

  Background:
    Given Navigate to magento website

  Scenario: User navigates through categories in the TAB menu
    And User hovers over the "women" category in the TAB menu
    Then the "womenTops" and "womenBottoms" subcategories should be visible
    When the user clicks on the "womenTops" subcategory
    Then the user is redirected to a page showing products under the "Tops" subcategory
    When the user clicks on the back button
    And the user hovers over the "men" category in the TAB menu
    Then the "menTops" and "menBottoms" subcategories should be visible
    When the user clicks on the "menBottoms" subcategory
    Then the user is redirected to a page showing products under the "Bottoms" subcategory