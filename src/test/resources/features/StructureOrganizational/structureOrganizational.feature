# Structure organizational feature review the behavior in the feature
# RF02-TC-044 UI >Asignación de Funciones
# > Estructura Organizacional > Verificar contenido de estructura organizacional

Feature: Structure Organizational

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar contenido de estructura organizacional
    Given 'Menu principal' estee cargado
    When seleccionar la opcion 'Estructura organizacional' en el menu principal
    And seleccionar la opcion 'Estructura organizacional' en el sub menu de 'Estructura organizacional'
    Then verificar que el boton 'Departamentos' este cargado en la pagina 'Estructura organizacional'
    And verificar que el boton 'Cargos laborales' este cargado en la pagina 'Estructura organizacional'
    And verificar que el boton 'Areas de trabajo' este cargado en la pagina 'Estructura organizacional'
    And verificar que el arbol 'Departamentos' este cargado en la pagina 'Estructura organizacional'
    And verificar que el arbol 'Cargos laborales' este cargado en la pagina 'Estructura organizacional'
    And verificar que el arbol 'Areas de trabajo' este cargado en la pagina 'Estructura organizacional'