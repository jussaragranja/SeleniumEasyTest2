Feature: CheckBox
  Select CheckBox as the input value

  Background:
    Given the page CheckBox is visible

#Single Checkbox Demo

  Scenario: Select simple CheckBox and validate displayed message
    When click on the single CheckBox
    Then the success message should be displayed

#Multiple Checkbox Demo

  Scenario: Click on the CheckAll button and validate selection
    When click on the CheckAll button
    Then all CheckBox must be selected

  Scenario: Click on the CheckAll and UnCheckAll button and validate no selection
    When click on the UnCheckAll button
    Then no CheckBox must be selected