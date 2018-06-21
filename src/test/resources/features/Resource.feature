 # Marcos Bustos Jimenez

 Feature: Recursos

   # RF04-TC-126 feature review the display list of resources
   @resource
   Scenario: RF04-TC-126 - Verificar cabecera de lista de Recursos
     Given 'SSI-D' pagina de inicio de sesion es cargada
     And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema
     And Menu principal este cargado
     And menu 'Programa SSO' este seleccionado
     And seleccionar sub menu 'Recursos'
     Then validar si columna 'Costo' es visible
     And validar si columna 'Detalle' es visible
     And validar si columna 'Accion' is visible