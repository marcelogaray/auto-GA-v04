Feature: Check fields creation

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar componentes del 'formulario de creación de Equipamiento'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
    And Hacer Click en el boton 'Crear nuevo Equipamiento'
    When Formulario de 'Registro de nuevo Equipamiento' esta cargado
    Then Verificar componente 'Nombre' del 'Formulario de creación de Equipamiento' cargado
    And Verificar componente 'Tipo' del 'Formulario de creación de Equipamiento' cargado
    And Verificar componente 'Descripcion' del 'Formulario de creación de Equipamiento' cargado
    And Verificar componente 'Imagen' del 'Formulario de creación de Equipamiento' cargado