# Login feature review the behavior in thie feature
Feature: EditEquipment

  Scenario: VERIFY THAT THE LIST OF EQUIPMENTS IS SHOWN WHEN THE "EQUIPAMENT" SUBMENU IS SELECTED
    Given 'SSID' page is loaded
    And set my credentials on SSID 'Login' page
    And edit equipment on 'Equipaments/update/id' page
