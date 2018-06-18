# Login feature review the behavior in thie feature
Feature: ListEquipment

  Scenario: VERIFY THAT THE LIST OF EQUIPMENTS IS SHOWN WHEN THE "EQUIPAMENT" SUBMENU IS SELECTED
    Given 'SSID' page is loaded
    And set my credentials on SSID 'Login' page
    And list equipment on 'Home' page
