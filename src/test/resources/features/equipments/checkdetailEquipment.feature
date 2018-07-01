Feature: Verify which detail Equipment is correctly displayed

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar que el 'Detalle de un Equipamiento' especifico sea mostrado correctamente
      Given 'Menu principal' estee cargado
      And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
      And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
      And click en el boton 'Ver' de 'Lista de Equipamientos'
      Then verificar titulo de 'Nombre' en el 'Detalle de Equipamiento' este visible
      And verificar titulo de 'Tipo' en el 'Detalle de Equipamiento' este visible
      And verificar contenido de 'Imagen' en el 'Detalle de Equipamiento' este visible