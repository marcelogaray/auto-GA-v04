# Login feature review the behavior in thie feature
Feature: ListEquipment

  Scenario:  Verificar lista de Equipamiento (Datos registrados) deben ser correctamente mostrados
    Given 'SSID' page is loaded
    And set my credentials on SSID 'Login' page
    And click menu Equipment in 'Home' page
    And click subMenu Equipment in 'Home' page
    Then 'Equipment List' page loads DONE
