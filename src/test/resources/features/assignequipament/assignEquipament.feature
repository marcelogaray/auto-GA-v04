#Show Form for assign equipament
Feature: verificar formulario de asignacion equipamiento a personal

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: verificar formulario de asignacion equipamiento a personal
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And seleccionar submenu 'Asignacion' en menu 'Personal'
    Then verificar que el 'Formulario de Asignacion Personal' es visible