# Marcos Bustos Jimenez
# RF04-TC-127 feature review the behavior to create resources
Feature: RF04-TC-127

  @marcos
  Scenario: 'Progama SSO' page is displayed
    Given 'SSI G & D' page is loaded
    And set my credentials on 'Login' page 'SSI G & D'
    And click menu 'Programa SSO'
    And click sub menu 'Recursos'
    And click 'Agregar nuevo recurso'
    And filling inputs resources form
    And stop web driver