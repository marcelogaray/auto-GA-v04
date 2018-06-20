# Home feature review the behavior in thie feature
Feature: Home
  Background:
    Given Ingresamos al Sistema
    And Insertamos las credenciales en el formulario de inicio de sesion

  Scenario: Pagina de Inicio cargada
    Given Estoy autenticado a la pagina de inicio
