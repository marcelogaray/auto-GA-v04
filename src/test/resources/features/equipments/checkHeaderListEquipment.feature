Feature: Check header of list equipments

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar cabecera de 'Lista de Equipamientos' Nombre Acciones
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
    Then verificar cabecera 'Nombre' de la pagina 'Lista de Equipamientos' esten cargados
    And verificar cabecera 'Acciones' de la pagina 'Lista de Equipamientos' esten cargados