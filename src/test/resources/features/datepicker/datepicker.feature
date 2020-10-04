Feature: Date Pickers
  Bootstrap Date Pickers Example

  Background:
    Given the page Date Pickers is visible

#One Date

  Scenario: Select simple CheckBox and validate displayed message
    When click to select the date
    And click the Today button
    Then the current date must be selected
