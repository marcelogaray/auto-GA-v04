# Navegacion de tabla contratos

Feature: Navegacion de tabla contratos con los botones siuiente y anterior

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar funcionalidad de navegacion de lista contratos
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    When click en el boton siguiente de la lista de 'Contratos'
    And click en el boton de anterior de la lista de 'Contratos'
    Then validar que la 'Lista de Contratos' este visible en la pagina 'Contratos'
