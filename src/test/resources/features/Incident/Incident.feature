# Login feature review the behavior in thie feature
Feature: Incident

  Background:
    Given 'Login' page is loaded
    And set my credentials on 'Login' page
    And Click on 'Incident' link

  Scenario: Incident page is displayed once click into 'Incident' link
    Given Click on 'Add new Incident' button
    And set Incidents form for create