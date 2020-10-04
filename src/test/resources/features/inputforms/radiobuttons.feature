Feature: Radio Buttons
  Click on radiobutton and validate values

  Background:
    Given the page Radio Buttons is visible

#Radio Button Demo Simple

  Scenario Outline: Click on the simple radiobutton and validate selected value
    When click on the radio button "<gender>"
    And click the Get Checked value button
    Then the message with the "<gender>" must be displayed

    Examples:
      |gender |
      |Female |

  Scenario: Click on the simple radiobutton and validate selected value
    When click the Get Checked value button
    Then the message not checked should be displayed

#Group Radio Buttons Demo

  Scenario Outline: Click on RadioButton to get values
    When select gender "<gender>"
    And select age "<age>"
    And click Get values button
    Then the message with the "<gender>" and "<age>" must be displayed

    Examples:
      |gender |age      |
      |Female |15 - 50  |