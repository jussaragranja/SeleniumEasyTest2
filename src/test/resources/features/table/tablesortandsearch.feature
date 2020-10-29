Feature: Table Sort And Search
  Table validate

  Background:
    Given the page Table Sort And Search is visible

  Scenario: print all line table
    When search for "San Francisco"
    Then print all line table

  Scenario: print one column of table line
    When search for "86"
    Then print one column of table line

  Scenario: print all column of table line
    When search for "86"
    Then print all column of table line