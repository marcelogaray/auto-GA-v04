  # Vanessa Alcocer

  Feature: Verificar Edición de un Capacitador

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-052 UI >Registrar Capacitaciones > Capacitadores > Verificar Edición de un Capacitador
    Scenario: Verificar Edición de un Capacitador
      Given 'Menu principal' estee cargado
      And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
      And presionar en la opcion 'Capacitadores' del sub menu 'ProgramSSO'
      And presionar el boton 'Editar' de Capacitador
      And editar <nombre> de Capacitador
      And presionar el boton  'guardar' Capacitador
      Then verificar si el boton crear capacitador es visible
      Examples:
      | nombre        |
      | automated test|