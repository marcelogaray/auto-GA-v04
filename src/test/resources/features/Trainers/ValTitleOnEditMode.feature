  # Vanessa Alcocer

  Feature: Validar el título del formulario de edición de Capacitador

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-053 UI >Registro de Equipamiento > Validar el título del formulario de edición de Capacitador
    Scenario: validar el título del formulario de edición de Capacitador
      Given 'Menu principal' estee cargado
      And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
      And presionar en la opcion 'Capacitadores' del sub menu 'ProgramSSO'
      And presionar el boton 'Editar' de Capacitador
      Then validar que el título del formulario de edicion de Capacitadores sea 'Modificar capacitador'