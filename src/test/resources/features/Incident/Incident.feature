# Incident Feature

Feature: Lista de Incidentes

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: RF05-TC-001 - Verificar que la cabecera de lista de Incidentes deben ser mostrados correctamente.
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'Incidentes' del 'Menu Principal'
    Then verificar que la 'tabla de incidentes' este visible en la pagina 'Incidentes'

  Scenario: RF05-TC-002 - Verificar que el sistema pueda crear incidentes correctamente.
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'Incidentes' del 'Menu Principal'
    And verificar que la 'tabla de incidentes' este visible en la pagina 'Incidentes'
    And click en el boton 'Agregar nuevo Incidente' de la pagina 'incidentes'
    When insertamos información valida en el formulario de 'Creacion de Incidentes'
      | Severity | Code   | IncidentType | State     | Area           | ReportedBy | Reincident | Treatment | Description           |
      | Media    | ACC-02 | enfermedad   | entregado | Remodelaciones | jose       | true       | true      | this is a description |
    And click en el boton 'guardar' en el 'formulario creación de incidentes'
    Then verificar que la pagina 'incidentes' es cargada correctamente

  Scenario: RF05-TC-003 - Verificar que el titulo se cargue correctamente
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'Incidentes' del 'Menu Principal'
    And click en el boton 'Agregar nuevo Incidente' de la pagina 'incidentes'
    And verificamos que el titulo de 'Creacion de Incidentes' se muestre correctamente

  Scenario: RF05-TC-006 Validar campos obligatorios en el formulario de creación de Recurso
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'Incidentes' del 'Menu Principal'
    And verificar que la 'tabla de incidentes' este visible en la pagina 'Incidentes'
    And click en el boton 'Agregar nuevo Incidente' de la pagina 'incidentes'
    When llenamos el campo 'code' y el campo 'description' con valores vacios
    Then verificar que el boton de guardado no se deshabilita

  Scenario: RF05-TC-012 - Verificar que el boton 'cancelar' regresa a la 'lista de incidntes'.
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'Incidentes' del 'Menu Principal'
    And verificar que la 'tabla de incidentes' este visible en la pagina 'Incidentes'
    And click en el boton 'Agregar nuevo Incidente' de la pagina 'incidentes'
    When hacemos 'click' en el boton 'cancelar'
    Then verificar que la pagina 'incidentes' es cargada correctamente