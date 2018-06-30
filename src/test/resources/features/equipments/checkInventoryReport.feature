Feature: Check Inventory report

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario:  Verificar información de Reporte de Inventarios se muestre correctamente
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And seleccionar submenu 'Inventory' en menu 'Equipamiento'
    Then verificar que 'Reporte de Inventario' debe mostrarse correctamente