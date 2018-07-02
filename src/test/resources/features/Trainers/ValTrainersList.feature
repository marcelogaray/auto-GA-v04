  # Vanessa Alcocer

  Feature: Validar botón Atrás en modo creación Capacitador

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-069 UI >Registrar Capacitaciones > Capacitadores > Validar botón Atrás en modo creación Capacitador
    Scenario:  Verificar lista de Capacitador (Datos registrados) deben ser correctamente mostrados
      Given 'Menu principal' estee cargado
      And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
      And presionar en la opcion 'Capacitadores' del sub menu 'ProgramSSO'
      Then  verificar que la lista de capacitadores sea mostrada en la pagina 'Capacitadores'