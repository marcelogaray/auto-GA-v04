  # Vanessa Alcocer

  Feature: AgregarRecursos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
   Given 'SSI-D' pagina de inicio de sesion es cargada
   And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-044 UI >Registrar Capacitaciones > Capacitadores > Validar el título del formulario de creación de Capacitador
 Scenario: Validar el título del formulario de creación de Capacitador
    Given 'Menu principal' estee cargado
    And presionar en la opcion 'ProgramSSO' del 'Menu Principal'
    And presionar en la opcion 'Capacitadores' del 'SubMenu'
    And presionar el boton 'Crear Nuevo Capacitador'
    Then validar que el título del formulario de creación de Capacitadores sea 'Crear capacitador'