# Position feature review the behavior in the feature
Feature: Position

  Scenario: Home page is displayed once set credential in login page
    Given 'SSI-D' page is loaded
    And set my credentials on 'Login' page

  Scenario: Position page  of organizational structure
    Given load necesary objects position
    And select 'Estructura organizacional' menu option
    And select 'Cargos de la empresa' menu option
    And validate list positions page is loaded
    And validate table list of positions
    And validate exist paginator of list positions
    And stop web driver