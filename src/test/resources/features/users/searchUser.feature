#Search user
Feature: check the users search

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: verificar la busqueda de usuarios
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And seleccionar submenu 'Usuario' en menu 'Personal'
    And insertar los siguientes datos en el cuadro de texto 'Buscar Usuario' en la pagina 'Lista de Usuarios'
      | username |
      | admin    |
      | tom      |
    Then verificar que el resultado coincida con el dato buscado