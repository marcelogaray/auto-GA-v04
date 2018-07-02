# Boton atraz crear contratos

Feature: Validacion de funcionalidad del bonton 'atras' en la pagina de 'creacion de contrato

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: validacion de funcionalidad boton atras
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And visualizacion de la 'Lista de Contratos' en la pagina 'Contratos'
    And seleccionar boton 'Agregar Nuevo Contrato' del 'Area de contratos'
    And click en el boton 'Atras' del formulario 'creacion de contratos'
    Then validar que la 'Lista de Contratos' este visible en la pagina 'Contratos'


