Feature: Check fields creation

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar componentes del 'formulario de creación de Equipamiento'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
    And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
    And hacer Click en el boton 'Crear nuevo Equipamiento'
    When formulario de 'Registro de nuevo Equipamiento' esta cargado
    Then verificar componente 'Nombre' del 'Formulario de creación de Equipamiento' cargado
    And verificar componente 'Tipo' del 'Formulario de creación de Equipamiento' cargado
    And verificar componente 'Descripcion' del 'Formulario de creación de Equipamiento' cargado
    And verificar componente 'Imagen' del 'Formulario de creación de Equipamiento' cargado