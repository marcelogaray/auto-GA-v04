
Feature: Check Detail Equipment

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar que el 'Detalle de un Equipamiento' especifico sea mostrado correctamente
      Given 'Menu principal' estee cargado
      And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
      And Seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
      And click en boton Ver de 'Lista de Equipamientos'
      When 'Detalle de Equipamiento' correctamente cargado
      Then Verificar que el 'Detalle de Equipamiento' especifico sea mostrado correctamente