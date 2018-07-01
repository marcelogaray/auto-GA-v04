# Titulo crear contratos

Feature: Titulo crear contratos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar titulo de formulario crear contratos
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    Then validar que la 'Lista de Contratos' este visible
    And seleccionar boton Agregar Nuevo Contrato del Area de contratos
    Then validar que el título del formulario de creación contratos sea 'Nuevo Contrato'

