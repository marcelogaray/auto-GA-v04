# Delete User
Feature: List User
  Verificar si el usuario ha sido elimado de la lista de usuario

  Scenario: Home page is displayed once set credential in login page
    Given 'Login' page is loaded
    And set my credentials on 'Login' page

  Scenario: List users is displayed once login given access
    Given set my list page is loaded
    When select users menu

  Scenario: Delete user once list user displayed
    Given Click on Eliminar Button