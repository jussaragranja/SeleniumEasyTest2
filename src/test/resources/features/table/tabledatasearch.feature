Feature: Table Data Search
  Filter data

  Background:
    Given the page Table Data Search is visible

#Tasks

  Scenario Outline: filter data by tasks
    When to filter by task "<task>"
    Then the corresponding task should be displayed "<taskcomplete>"

    Examples:
      |task |taskcomplete                             |
      |Bug  |7 Bug fixing Kilgore Trout in progress   |

#Listed Users

  Scenario Outline: activate column filters and filter data by tasks
    When click filter button
    And to filter user by id <id>
    Then the corresponding user should be displayed "<usercomplete>"

    Examples:
      |id |usercomplete               |
      |3  |3 larrypt Brigade Swarroon |