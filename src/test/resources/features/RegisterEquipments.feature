# Login feature review the behavior in thie feature
Feature: RegisterEquipment

  Scenario: VERIFY THAT THE LIST OF EQUIPMENTS IS SHOWN WHEN THE "EQUIPAMENT" SUBMENU IS SELECTED
    Given 'SSID' page is loaded
    And set my credentials on SSID 'Login' page
    And register equipment on 'Equipaments/create' page
