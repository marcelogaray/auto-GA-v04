
Feature: Check Detail Equipment

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar que el 'Detalle de un Equipamiento' especifico sea mostrado correctamente
      Given 'Menu principal' estee cargado
      And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
      And Seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
      And click en boton Ver de 'Lista de Equipamientos'
      When 'detalle de Equipamiento' correctamente cargado
      Then verificar titulo de 'Nombre' en el  'Detalle de Equipamiento' sea mostrado correctamente
      And verificar titulo de 'Tipo' en el  'Detalle de Equipamiento' sea mostrado correctamente
      And verificar contenido de 'Imagen' en el  'Detalle de Equipamiento' sea mostrado correctamente