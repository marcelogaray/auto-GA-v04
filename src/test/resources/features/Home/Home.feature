# Login feature review the behavior in thie feature
Feature: Home

  Background:
    Given 'Login' page is loaded
    And set my credentials on 'Login' page

  Scenario: Incident page is displayed once click into 'Incident' link
    Given 'Home' Page is loaded
    And Click on 'Incident' link
