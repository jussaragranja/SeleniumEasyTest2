Feature: Ajax Form Submit
  Submit ajax form and validate

  Background:
    Given the page Ajax Form Submit is visible

#Ajax Form

  Scenario Outline: Submit the ajax form and validate the success message
    When filling in the name field "<name>"
    And filling in the comment field "<comment>"
    And click submit button
    Then success message should be displayed
    And the submit button must be hidden

    Examples:
      |name       |comment        |
      |Name Test  |Comment Test   |
