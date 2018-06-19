# Position feature review the behavior in the feature
Feature: Create Position

  Scenario: Home page is displayed once set credential in login page
    Given 'SSI-D' page is loaded
    And set my credentials on 'Login' page

  Scenario: Position page  of organizational structure and create new position
    Given load necesary objects position
    And select 'Estructura organizacional' menu option
    And select 'Cargos de la empresa' menu option
    And validate list positions page is loaded
    And select 'Crear nuevo cargo' button

  Scenario: Validate Create new position
    Given load necesary objects create position
    And fill data to create a new position in form
    And select a parent position option
    And click on button save position

  Scenario: Validate redirect to Position Page
    Given load necesary objects position
    And review load position page after save position created
    And stop web driver