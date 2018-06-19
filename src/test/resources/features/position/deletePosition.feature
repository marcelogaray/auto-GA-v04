



# Position feature review the behavior in the feature
Feature: Delete Position

  Scenario: Home page is displayed once set credential in login page
    Given 'SSI-D' page is loaded
    And set my credentials on 'Login' page

  Scenario: Position page  of organizational structure and create new position
    Given load necesary objects position
    And select 'Estructura organizacional' menu option
    And select 'Cargos de la empresa' menu option
    And validate list positions page is loaded
    And paginate the list positions two pages
    And select 'Delete' button of last position in the list
    And validate if is visible button for delete position
    And stop web driver