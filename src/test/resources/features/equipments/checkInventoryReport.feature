Feature: Chack Inventory report

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar Cabecera de reporte de Inventario: Contenido e imagen
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Inventory' en menu 'Equipamiento'
    Then Verificar Campos de 'Reporte de Inventario' deben mostrarse correctamente