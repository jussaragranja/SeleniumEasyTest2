Feature: Simple Form
  Insert data into an input field

  Background:
    Given the page Simple Form is visible

#Single Input Field

  Scenario Outline: Write in the input field and validate click on the button
    When that the "<message>" was entered in the entry field
    And click the Show message button
    Then it should be displayed Your Message: "<message>"

    Examples:
      |message         |
      |Mensagem TESTE  |

#Two Input Fields

  Scenario Outline: Write the numbers in the input fields and validate the sum
    When filling in field A with the value <valueA>
    And filling in field B with the <valueB> value
    And click the Get Total button
    Then it should be displayed Total

    Examples:
      |valueA  |valueB  |
      |2       |2       |