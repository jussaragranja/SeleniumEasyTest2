Feature: Select Dropdown List
  Select dropdown with single selection and multiple selection

  Background:
    Given the page Select Dropdown is visible

#Single selection

  Scenario Outline: Select value from list and validate message in dropdown
    When select the day "<day>"
    Then the message with the selected day should be displayed "<day>"

    Examples:
      |day        |
      |Wednesday  |

#Multiple selection

  Scenario Outline: Select states value from list and validate message
    When select the state "<state>"
    And click first selected button
    Then the message with the selected state should be displayed "<state>"

    Examples:
      |state      |
      |New York   |