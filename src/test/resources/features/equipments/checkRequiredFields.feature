Feature: Verify mandatory fields in Creation Form

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar componentes del 'formulario de creación de Equipamiento'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
    And hacer Click en el boton 'Crear nuevo Equipamiento'
    When formulario de 'Registro de nuevo Equipamiento' esta cargado
    And activar campo requerido 'Nombre' sin ingresar informacion en 'Formulario de creación de Equipamiento'
    And activar campo requerido 'Descripcion' sin ingresar informacion en 'Formulario de creación de Equipamiento'
    Then verificar mensaje de 'campo requerido' en 'Formulario de creación de Equipamiento' con el campo 'Nombre' vacio
    And verificar mensaje de 'campo requerido' en 'Formulario de creación de Equipamiento' con el campo 'Descripcion' vacio