# Marcos Bustos Jimenez
# RF04-TC-126 feature review the display list of resources
Feature: RF04-TC-126

  @marcos
  Scenario: 'Progama SSO' page is displayed
    Given 'SSI G & D' page is loaded
    And set my credentials on 'Login' page 'SSI G & D'
    And click menu 'Programa SSO'
    And click sub menu 'Recursos'
    And cost header 'Costo' is visible
    And detail header 'Detalle' is visible
    And action header 'Accion' is visible
    And stop web driver