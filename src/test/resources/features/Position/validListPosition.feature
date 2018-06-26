# Position feature review the behavior in the feature
# RF02-TC-045: UI >Asignación de Funciones > Estructura organizacional >
# Cargos de la empresa >
# Verificar cabecera de lista de Cargos (Nombre cargo, Nivel, Depende de, Acciones) deben ser mostrados correctamente.

Feature: List Position

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar cabecera de lista de Cargos
    Given 'Menu principal' estee cargado
    When seleccionar la opcion 'Estructura organizacional' en el menu principal
    And seleccionar la opcion 'Cargos del personal' en el sub menu de estructura organizacional
    Then Verificar que se cargue el listado de cargos en la pagina 'Cargos de la empresa'
    And verificar que se cargue la cabecera 'Nombre cargo' en la tabla de lista de cargos
    And verificar que se cargue la cabecera 'Nivel' en la tabla de lista de cargos
    And verificar que se cargue la cabecera 'Depende de' en la tabla de lista de cargos
    And verificar que se cargue la cabecera 'Acciones' en la tabla de lista de cargos