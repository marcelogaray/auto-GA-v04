# Login feature review the behavior in thie feature
Feature: Personal
    Scenario: Mostrar la lista de personal
      Given 'lpersonal' page is loaded
      And set my credentials on 'lpersonal' page
      Given mostrar personal
