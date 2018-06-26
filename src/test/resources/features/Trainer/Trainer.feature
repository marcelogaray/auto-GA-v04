
Feature: Capacitadores

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario:  Verificar lista de Capacitador (Datos registrados) deben ser correctamente mostrados
    Given 'Menu principal' estee cargado
    And Presionar en la opcion 'ProgramSSO' del 'Menu Principal'
    And Presionar en la opcion 'Capacitadores' del 'SubMenu'
    Then  Verificar que la lista de capacitadores sea mostrada