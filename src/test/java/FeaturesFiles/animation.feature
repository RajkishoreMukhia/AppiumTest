Feature: Check animation feature Hide Show Button

  @ani @smoke
  Scenario: Animation Hide Btn
    Given Open application
    And Click on Animation
    Then Click on Hide-Show Animations button
    When Click on number buttons
    Then Numbers btn are hide

   @ani @smoke
  Scenario: Animatioon Show Btn
    Given Open application
    And Click on Animation
    Then Click on Hide-Show Animations button
    And Click on number buttons
    When Click on Show Btn
    Then Numbers buttons are Shown
