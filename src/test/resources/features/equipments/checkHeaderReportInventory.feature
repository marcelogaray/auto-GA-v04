Feature: Check Inventory Report Header

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar cabecera de 'Reporte de Inventario' contenido e imagen esten visibles
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And seleccionar submenu 'Inventory' en menu 'Equipamiento'
    Then verificar 'Titulo' del 'Reporte de Inventario' este visible
    And verificar 'Imagen' del 'Reporte de Inventario' este visible