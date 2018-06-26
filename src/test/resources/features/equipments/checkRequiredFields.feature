Feature: Verify mandatory fields in Creation Form

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar componentes del 'formulario de creación de Equipamiento'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
    And Hacer Click en el boton 'Crear nuevo Equipamiento'
    When Formulario de 'Registro de nuevo Equipamiento' esta cargado
    And Activar campos obligatorios de 'Registro de nuevo Equipamiento'
    Then Verificar mensajes de Requerido al intentar 'Registro de nuevo Equipamiento' sin datos obligatorios.