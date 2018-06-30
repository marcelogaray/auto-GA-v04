#Search user
Feature: verificar la busqueda de usuarios

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar lista de Usuarios este correctamente cargado
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And seleccionar submenu 'Usuario' en menu 'Personal'
    And completar campo 'Buscar Usuario' con los siguientes datos
      | username |
      | admin    |
      | tom      |
    Then verificar que el resultado coincida con el dato buscado