# Listar usuarios
Feature: List User

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario:
    Given Menu principal estee cargado
    And Menu 'Personal' estee seleccionado
    And Seleccionar SubMenu 'Usuario'
    Then Validar 'Lista de Usuarios'
