# Listar contratos
@contract
Feature: List Contract

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar lista de Contratos este correctamente cargado
    Given Menu principal este cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Contratos' en menu 'Personal'
    Then Validar que la 'Lista de Contratos' este visible
