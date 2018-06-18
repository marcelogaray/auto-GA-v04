# Marcos Bustos Jimenez
# RF04-TC-127 feature review the behavior in thie feature
Feature: RF04-TC-127

  Scenario: Home page is displayed once set credential in login page
    Given 'SSI G & D' page is loaded
    And set my credentials on 'Login' page 'SSI G & D'

  Scenario: 'Progama SSO' page is displayed
      Given click menu 'Programa SSO'
      And click sub menu 'Recursos'
      And click 'Agregar nuevo recurso'
      And filling inputs resources form