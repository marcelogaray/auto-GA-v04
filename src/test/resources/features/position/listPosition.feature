# Position feature review the behavior in the feature
# RF02-TC-071 UI > Asignación de funciones > Estructura organizacional >
# Cargos de la empresa > Verificar la carga del listado de los cargos con un paginador de la lista

@listPosition
Feature: Position

  Scenario: Verificar la carga del listado de los cargos con un paginador de la lista
    Given 'SSI-D' pagina Home fue cargada despues de inicio de sesion
    When Se selecciona la opcion del menu 'Estructura organizacional'
    And Seleccionar la opcion del sub menu 'Cargos del personal'
    And Verificar que se haya cargado la pagina Cargos de la empresa
    Then Validar que exista el listado con los cargos registrados en la base de datos
    And Verificar que el listado contenga paginador de contenido