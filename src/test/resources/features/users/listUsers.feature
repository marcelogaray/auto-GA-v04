# User
Feature: List User
  Verificar cabecera de lista de Usuario (UserName, Password, Active, Accion)
  deben ser mostrados correctamente
  
  Scenario: Home page is displayed once set credential in login page
    Given 'Login' page is loaded
    And set my credentials on 'Login' page

  Scenario: List users is displayed once login given access
    Given set my list page is loaded
    When select users menu
