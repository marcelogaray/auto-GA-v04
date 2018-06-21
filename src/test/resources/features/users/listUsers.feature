# Listar usuarios
Feature: List User

  Scenario: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema
    Given seleccionar el menu de persona
    When Seleccionar SubMenu Users
