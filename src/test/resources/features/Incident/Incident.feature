# Login feature review the behavior in thie feature
Feature: Incident

  Background:
    Given 'Login' page is loaded
    And set my credentials on 'Login' page
    And 'Home' Page is loaded
    And Click on 'Incident' link

  Scenario: Incident page is displayed once click into 'Incident' link
    Given Incident Page is loaded
    And List of incidents is loaded

  Scenario: Set form to Create new Incident
    Given Incident Page is loaded
    And Click on 'Add new Incident' button
    And CreateIncidentPage is loaded
    And set Incidents form for create