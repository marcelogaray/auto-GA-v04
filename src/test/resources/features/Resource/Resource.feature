 # Marcos Bustos Jimenez

 Feature: Recursos

   Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
     Given 'SSI-D' pagina de inicio de sesion es cargada
     And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

   # RF04-TC-126 feature review the display list of resources
   Scenario: RF04-TC-126 - Verificar cabecera de lista de Recursos
     Given 'Menu principal' estee cargado
     And menu 'Programa SSO' este seleccionado de la pagina 'Home'
     And seleccionar sub menu 'Recursos'
     Then validar si columna 'Costo' es visible en la pagina 'Recursos'
     And validar si columna 'Detalle' es visible en la pagina 'Recursos'
     And validar si columna 'Accion' es visible en la pagina 'Recursos'