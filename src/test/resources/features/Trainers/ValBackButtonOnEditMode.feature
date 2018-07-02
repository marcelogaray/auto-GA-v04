  # Vanessa Alcocer

  Feature: Capacitadores

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-057 UI >Registrar Capacitaciones > Capacitadores > Validar botón Atrás en modo edicion Capacitador
    Scenario: Validar el botón Atrás en modo edicion Capacitador
      Given 'Menu principal' estee cargado
      And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
      And presionar en la opcion 'Capacitadores' del sub menu 'ProgramSSO'
      And presionar el boton 'Editar' de Capacitador
      And presionar el boton 'Atras' del modo edicion de Capacitador
      Then verificar que la lista de capacitadores sea mostrada en la pagina 'Capacitadores'