# Login feature review the behavior in thie feature
Feature: ListContract

  Scenario: VERIFY THAT THE LIST OF CONTRACT IS SHOWN WHEN THE "CONTRACT" SUBMENU IS SELECTED
    Given 'SSID' page is loaded
    And set my credentials on SSID 'Login' page
    And list contract on 'Home' page
