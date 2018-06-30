
Feature: List Personnel

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la cabecera de lista de Personal
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And click en el submenu 'Personal'
    Then verificar que la tabla lista de 'Personal' este visible
    And verificar que la tabla lista de 'Personal' contenga 'Nombre'
    And verificar que la tabla lista de 'Personal' contenga 'Apellido'
    And verificar que la tabla lista de 'Personal' contenga 'Email'
    And verificar que la tabla lista de 'Personal' contenga 'Direccion'
    And verificar que la tabla lista de 'Personal' contenga 'Telefono'
    And verificar que la tabla lista de 'Personal' contenga 'Accion'
