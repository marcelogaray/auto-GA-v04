# Position feature review the behavior in the feature
# RF02-TC-054 UI > Asignación de Funciones > Estructura organizacional >
# Cargos de la Empresa > Validar que no permita crear un Cargo sin datos obligatorios.

Feature: Validar boton Enviar en creacion de cargos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Validar que no permita crear un Cargo sin datos obligatorios
    Given 'Menu principal' estee cargado
    When seleccionar la opcion 'Estructura organizacional' en el menu principal
    And seleccionar la opcion 'Cargos del personal' en el sub menu de estructura organizacional
    And seleccionar el boton 'Crear nuevo cargo' en la pagina 'Cargos de la empresa'
    Then verificar que exista el boton 'Enviar' en la pagina 'Crear nuevo cargo'
    And verificar que el boton 'Enviar' este deshabilitado en la pagina 'Crear nuevo cargo'