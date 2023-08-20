Feature: determine how many days you are old.

  Scenario: Calculate age in days
    Given the user provides a birthdate as "15/08/1990"
    When the user calculates the age
    Then the calculated age in days should be 11688
