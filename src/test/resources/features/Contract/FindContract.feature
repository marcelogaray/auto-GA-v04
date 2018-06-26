# Buscar contratos

Feature: Find Contract

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar lista de Contratos este correctamente cargado
    Given menu principal este cargado en pagina de Inicio
    And seleccionar menu 'Personal' para contract en la pagina 'Menu Principal'
    And seleccionar submenu 'Contratos' en menu 'Personal'
    And mostrar 'Lista de Contratos'
    And llenar la opcion filtro de contrato
      | contractCodes |
      | 0028         |
    Then validar que la 'Lista de Contratos' este visible mostrando el filtro ingresado
