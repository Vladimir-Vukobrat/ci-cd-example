Feature: determine how many vowels there are in some text.

  Scenario Outline: vowels counting
    Given I enter the text <input>
    When I test given text for vowels count
    Then I should get result <output>

    Examples:
      | input | output |
      | "Hello Friend" | 4 |
      | "1234567890"   | 0 |