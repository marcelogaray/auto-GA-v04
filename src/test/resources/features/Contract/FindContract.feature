# Buscar contratos

Feature: Buscar contratos de la lista general

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Buscar un contrati por su codigo
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And mostrar 'Lista de Contratos'
    And insertar la siguiente informacion para realizar el filtro en la 'lista de contrato'
      | contractCode |
      | 101         |
    Then validar que la 'lista de contratos' se haya filtrado correctamente
