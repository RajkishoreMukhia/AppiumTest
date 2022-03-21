Feature: Check Display Feature in App Tab

  @dis @smoke
  Scenario: Display Show Button Option
    Given Open application
    And Click on App Tab
    Then Click on Action Bar Tab
    And Click on Display option Tab
    When Click on DISPLAY_SHOW_HOME button
    Then The File Logo appear in manu bar
    
   @dis @smoke
  Scenario: Display Show Button Option
    Given Open application
    And Click on App Tab
    Then Click on Action Bar Tab
    And Click on Display option Tab
    When Click on DISPLAY_SHOW_TITLE button
    Then The Title appear in manu bar
    
   @dis @smoke
  Scenario: Display Show Button Option
    Given Open application
    And Click on App Tab
    Then Click on Action Bar Tab 
    And Click on Display option Tab
    When Click on DISPLAY_SHOW_CUSTOM button
    Then The Custom View  appear in manu bar
    
    