# Position feature review the behavior in the feature
# RF02-TC-071 UI > Asignación de funciones > Estructura organizacional >
# Cargos de la empresa > Verificar la carga del listado de los cargos con un paginador de la lista

@listPosition
Feature: List Position

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la carga del listado de los cargos con un paginador de la lista
    Given Menu principal estee cargado
    When Se selecciona la opcion del menu 'Estructura organizacional'
    And Seleccionar la opcion del sub menu 'Cargos del personal'
    Then Validar que exista el listado con los cargos registrados en la base de datos
    And Verificar que el listado contenga paginador de contenido