  # Vanessa Alcocer

  Feature: Capacitadores

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
   Given 'SSI-D' pagina de inicio de sesion es cargada
   And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-049 UI >Registrar Capacitaciones > Capacitadores > Validar botón Atrás en modo creación Capacitador
  Scenario: Validar botón Atrás en modo creación Capacitador
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
    And presionar en la opcion 'Capacitadores' del 'SubMenu'
    And presionar el boton 'Crear Nuevo Capacitador'
    And presionar el boton 'Atras' del modo creacion de Capacitador
    Then verificar que la lista de capacitadores sea mostrada







 #Scenario:  Verificar lista de Capacitador (Datos registrados) deben ser correctamente mostrados
  # Given 'Menu principal' estee cargado
  # And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
  # And presionar en la opcion 'Capacitadores' del 'SubMenu'
 #  Then  verificar que la lista de capacitadores sea mostrada

 #Scenario: Validar el botón Atrás en modo edicion Capacitador
 #   Given 'Menu principal' estee cargado
  #  And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
  #  And presionar en la opcion 'Capacitadores' del 'SubMenu'
 #   And presionar el boton 'Editar' de Capacitador
 #   And presionar el boton 'Atras' del modo edicion de Capacitador
 #   Then verificar que la lista de capacitadores sea mostrada


  #  Scenario: Validar el botón Atrás en modo edicion Capacitador
   #  Given 'Menu principal' estee cargado
    #  And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
   #   And presionar en la opcion 'Capacitadores' del 'SubMenu'
   #   And presionar el boton 'Editar' de Capacitador
  #    And editar nombre de Capacitador
   #   And presionar el boton  'guardar' Capacitador
   #   Then verififcar si el boton crear capacitador es visible

    Scenario: validar el título del formulario de edición de Capacitador
      Given 'Menu principal' estee cargado
      And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
      And presionar en la opcion 'Capacitadores' del 'SubMenu'
      And presionar el boton 'Editar' de Capacitador
      Then validar que el título del formulario de edicion de Capacitadores sea 'Modificar capacitador'