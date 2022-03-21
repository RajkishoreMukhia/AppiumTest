Feature: Check Animaton Feature Reversing

  @rev @smoke
  Scenario: Reversing animation btn check
    Given Open application
    And Click on Animation
    Then Click on Reversing Tab
    When Click on Play Button
    Then The item goes in buttom
    When Click on Revers Button
    Then The item goes same place
    