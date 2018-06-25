#Show Form for assign equipament
Feature: Verificar si formulario de asignacion se muestra

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la creacion de usuarios desde 'Formulario de Usuario'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Asignacion' en menu 'Personal'
    Then Verificar que el 'Formulario de Asignacion Personal' es visible