
Feature: Validate title form to new Personnel

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar el título del formulario de creación de Personal
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And click en el submenu 'Personal'
    Given click en el boton 'Agregar nuevo personal'
    Then verificar el titulo del formulario de creacion 'Nuevo Personal'
