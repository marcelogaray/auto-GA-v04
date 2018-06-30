# Position feature review the behavior in the feature
# RF02-TC-048 UI > Asignación de Funciones > Estructura organizacional >
# Cargos de la Empresa > Validar componentes del formulario de creación de Cargo
# (Nombre textField, Nivel textField, DEscripcion textField) deben ser mostrados correctamente.

Feature: Validar componentes creacion de cargos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar componentes del formulario de creacion de cargo
    Given 'Menu principal' estee cargado
    When seleccionar la opcion 'Estructura organizacional' en el menu principal
    And seleccionar la opcion 'Cargos del personal' en el sub menu de 'Estructura organizacional'
    And seleccionar el boton 'Crear nuevo cargo' en la pagina 'Cargos de la empresa'
    Then verificar que exista el campo 'Nombre' en el formulario de 'crear cargo'
    And verificar que exista el campo 'Nivel' en el formulario de 'crear cargo'
    And verificar que exista el campo 'Descripcion' en el formulario de 'crear cargo'
    And verificar que exista la lista desplegable 'Cargo padre' en el formulario de 'crear cargo'