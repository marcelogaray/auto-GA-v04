# Navegacion de tabla contratos

Feature: Navegacion de tabla contratos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar funcionalidad de navegacion de lista contratos
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    When seleccionar en boton siguiente de la lista
    And seleccionar en boton de anterior de la lista
    Then validar que la 'Lista de Contratos' este visible
