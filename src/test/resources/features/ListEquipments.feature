# Login feature review the behavior in thie feature
Feature: ListEquipment

  Scenario:  Verificar lista de Equipamiento (Datos registrados) deben ser correctamente mostrados
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema
    And click menu Equipment en  pagina 'Home'
    And click subMenu Equipment en  pagina 'Home'
    Then  pagina 'Equipment List' cargada corectamente
