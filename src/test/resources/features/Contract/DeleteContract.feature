# Eliminar contratos

Feature: Eliminar contratos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Eliminacion de contratos almacenados
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And mostrar 'Lista de Contratos'
    And click en el boton 'Eliminar' del primer item lista contratos
    Then validar que la 'Lista de Contratos' este visible sin el item eliminado


