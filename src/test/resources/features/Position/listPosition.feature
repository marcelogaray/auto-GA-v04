# Position feature review the behavior in the feature
# RF02-TC-071 UI > Asignación de funciones > Estructura organizacional >
# Cargos de la empresa > Verificar la carga del listado de los cargos con un paginador de la lista

Feature: Listado de cargos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la carga del listado de los cargos del personal
    Given 'Menu principal' estee cargado
    When seleccionar la opcion 'Estructura organizacional' en el menu principal
    And seleccionar la opcion 'Cargos del personal' en el sub menu de estructura organizacional
    Then validar que se cargue el listado de cargos en la pagina 'Cargos de la empresa'
    And validar que 'Paginador' se muestra debajo de la tabla 'Lista de Cargo'