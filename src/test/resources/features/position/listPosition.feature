


















# Position feature review the behavior in the feature
Feature: Position

  Scenario: Home page is displayed once set credential in login page
    Given 'SSI-D' page is loaded
    And set my credentials on 'Login' page

  Scenario: Position page list all positions of organizational structure
    Given load list positions page is loaded
    When select 'Estructura organizacional/Cardos de la empresa' menu option