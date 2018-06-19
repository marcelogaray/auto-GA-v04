Feature: Programas

  #@bvt
  Scenario: Editar Capacitadores
    Given 'SSI-D' page is loaded
    And set my credentials on 'Login' SSID page
    And Go to Capacitadores
    And click on Modificar button
    And set nombre
    And click on guardar button
