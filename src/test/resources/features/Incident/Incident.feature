# Incident Feature
Feature: Lista de Incidentes

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar que la cabecera de lista de Incidentes deben ser mostrados correctamente.
    Given 'Menu principal' estee cargado
    And Presionar en la opcion 'Incidentes' del 'Menu Principal'
    Then Verificar que la tabla de incidentes se muestre correctamente

  Scenario: Verificar que el sistema pueda crear incidentes correctamente.
    Given 'Menu principal' estee cargado
    And Presionar en la opcion 'Incidentes' del 'Menu Principal'
    And Verificar que la tabla de incidentes se muestre correctamente
    And hacemos 'click' en el boton 'Incidentes' del 'Menu Principal'
    When Llenamos los 'datos del formulario' dentro del formulario de 'Creacion de Incidentes'
    | Severity | Code   | IncidentType | State     | Area           | ReportedBy | Reincident | Treatment | Description           |
    | Media    | ACC-02 | enfermedad   | entregado | Remodelaciones   | juan       | true       | true     | this is a description |
    And Hacemos clic en el boton de 'Guardar'